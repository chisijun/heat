/**  
 * @Title: UserServiceImpl.java
 * @Package org.study.heat.service.impl
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月16日
 */
package org.study.heat.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.study.heat.base.BaseService;
import org.study.heat.dao.UserMapper;
import org.study.heat.dto.ModifyPwdDto;
import org.study.heat.dto.UserQueryDto;
import org.study.heat.dto.UserRoomDto;
import org.study.heat.enums.CheckStatEnum;
import org.study.heat.enums.UserTypeEnum;
import org.study.heat.pojo.HisRoom;
import org.study.heat.pojo.Room;
import org.study.heat.pojo.User;
import org.study.heat.service.HisRoomService;
import org.study.heat.service.RoomService;
import org.study.heat.service.UserService;
import org.study.heat.utils.MD5;
import org.study.heat.utils.PublicUtil;
import org.study.heat.vo.UserVo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName: UserServiceImpl 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月16日
 */
@Service("userService")
public class UserServiceImpl extends BaseService<User> implements UserService {

	@Resource
	private UserMapper userDao;
	
	@Resource
	private RoomService roomService;
	
	@Resource
	private HisRoomService hisRoomService;
	
	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#selectUserById(java.lang.Integer)
	 */
	@Override
	public User selectUserById(Long userId) {
		// TODO Auto-generated method stub
		
		return userDao.selectByPrimaryKey(userId);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public User login(String loginName, String password) throws Exception {
		// TODO Auto-generated method stub
		if (loginName == null || password == null) {
            throw new RuntimeException("参数传递异常");
        }

        if (StringUtils.isBlank(loginName)) {
            throw new RuntimeException("请输入用户名！");
        }

        if (StringUtils.isBlank(password)) {
            throw new RuntimeException("请输入密码！");
        }

        // 密码加密 
        /** 
         * 通过手机号码校验 
         * */
        password = MD5.getMd5().getMD5ofStr(password);
        User user = userDao.selectByLoginName(loginName);

        if (user== null) {
            throw new RuntimeException("用户名不存在.");
        }
        
        System.out.println("user = " + user);
        
        System.out.println("password = " + password);
        System.out.println("pwd = " + user.getLoginPwd());
        if (!password.equals(user.getLoginPwd())) {
        	throw new RuntimeException("密码错误.");
        }
        
        return user;
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#saveUser(org.study.heat.pojo.User)
	 */
	@Override
	public Integer saveUser(User user, User login) {
		// TODO Auto-generated method stub
		
		user.setUpdateInfo(login);
		
		if (user.isNew()) {
			String password = MD5.getMd5().getMD5ofStr("123456");
			user.setType(UserTypeEnum.USER.getType());
			user.setLoginPwd(password);
			
			return userDao.insertSelective(user);
		} else {
			
			return userDao.updateByPrimaryKeySelective(user);
		}
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#queryUserListWithPage(org.study.heat.dto.UserQueryDto)
	 */
	@Override
	public PageInfo queryUserListWithPage(UserQueryDto userQueryDto) {
		// TODO Auto-generated method stub
		userQueryDto.setType(UserTypeEnum.USER.getType());
		
		PageHelper.startPage(userQueryDto.getPageNum(), userQueryDto.getPageSize());
		List<UserVo> userList = userDao.queryUserListWithPage(userQueryDto);
		
		return new PageInfo<>(userList);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#deleteUserById(java.lang.Long)
	 */
	@Override
	public Integer deleteUserById(Long id) {
		// TODO Auto-generated method stub
		// 校验用户是否可以删除
		Room room = new Room();
		room.setUserId(id);
		int count = roomService.selectCount(room);
		if (count > 0) {
			throw new RuntimeException("用户已经入住,无法删除");
		}
				
		return userDao.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#modifyPwd(org.study.heat.dto.ModifyPwdDto)
	 */
	@Override
	public Integer modifyPwd(ModifyPwdDto modifyPwdDto, User login) {
		// TODO Auto-generated method stub
		User user = userDao.selectByPrimaryKey(modifyPwdDto.getId());
		if (PublicUtil.isEmpty(user)) {
			throw new RuntimeException("用户不存在");
		}
		
		if (!modifyPwdDto.getPassword().equals(modifyPwdDto.getConfirmPwd())) {
			throw new RuntimeException("两次密码不一致");
		}
		
		String password = MD5.getMd5().getMD5ofStr(modifyPwdDto.getPassword());
		
		user = new User();
		user.setUpdateInfo(login);
		user.setId(modifyPwdDto.getId());
		user.setLoginPwd(password);
		
		return userDao.updateByPrimaryKeySelective(user);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#checkIn(org.study.heat.dto.UserRoomDto, org.study.heat.pojo.User)
	 */
	@Override
	public Integer checkIn(UserRoomDto userRoomDto, User login) {
		// TODO Auto-generated method stub
		// 校验用户是否存在
		User user = userDao.selectByPrimaryKey(userRoomDto.getUserId());
		if (PublicUtil.isEmpty(user)) {
			throw new RuntimeException("用户不存在");
		}
		
		// 校验房间是否存在
		Room room = roomService.selectByKey(userRoomDto.getRoomId());
		if (PublicUtil.isEmpty(room)) {
			throw new RuntimeException("房间不存在");
		}
		
		// 校验房子是否已经入住
		if (PublicUtil.isNotEmpty(room.getUserId())) {
			throw new RuntimeException("房间已经入住");
		}
		
		// 历史入住记录
		HisRoom hisRoom = new HisRoom();
		hisRoom.setUpdateInfo(login);
		if (PublicUtil.isEmpty(userRoomDto.getCheckIn())) {
			userRoomDto.setCheckIn(new Date());
		}
		hisRoom.setCheckIn(userRoomDto.getCheckIn());
		hisRoom.setStat(CheckStatEnum.CHECK_IN.getKey());
		hisRoom.setUserId(userRoomDto.getUserId());
		hisRoom.setRoomId(userRoomDto.getRoomId());
		int ret = hisRoomService.save(hisRoom);
		if (ret < 1) {
			throw new RuntimeException("房间入住失败");
		}
		
		room = new Room();
		room.setId(userRoomDto.getRoomId());
		room.setUserId(userRoomDto.getUserId());
		room.setUpdateInfo(login);
		
		return roomService.update(room);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#checkOut(org.study.heat.dto.UserRoomDto, org.study.heat.pojo.User)
	 */
	@Override
	public Integer checkOut(UserRoomDto userRoomDto, User login) {
		// TODO Auto-generated method stub
		
		// 校验用户是否存在
		User user = userDao.selectByPrimaryKey(userRoomDto.getUserId());
		if (PublicUtil.isEmpty(user)) {
			throw new RuntimeException("用户不存在");
		}
		
		// 校验房间是否存在
		Room room = roomService.selectByKey(userRoomDto.getRoomId());
		if (PublicUtil.isEmpty(room)) {
			throw new RuntimeException("房间不存在");
		}
		
		// 校验房子是否已经入住
		if (PublicUtil.isEmpty(room.getUserId())) {
			throw new RuntimeException("房间尚未入住");
		}
		
		// 历史入住记录
		HisRoom hisRoom = new HisRoom();
		hisRoom.setStat(CheckStatEnum.CHECK_IN.getKey());
		hisRoom.setUserId(userRoomDto.getUserId());
		hisRoom.setRoomId(userRoomDto.getRoomId());
		
		hisRoom = hisRoomService.selectOne(hisRoom);
		if (PublicUtil.isEmpty(hisRoom)) {
			throw new RuntimeException("房间尚无入住记录");
		}
		hisRoom.setStat(CheckStatEnum.CHECK_OUT.getKey());
		if (PublicUtil.isEmpty(userRoomDto.getCheckOut())) {
			userRoomDto.setCheckOut(new Date());
		}
		hisRoom.setCheckOut(userRoomDto.getCheckOut());
		hisRoom.setUpdateInfo(login);
		int ret = hisRoomService.update(hisRoom);
		if (ret < 1) {
			throw new RuntimeException("房间迁出失败");
		}
		
		room.setUpdateInfo(login);
		
		return roomService.checkOut(room);
	}

}
