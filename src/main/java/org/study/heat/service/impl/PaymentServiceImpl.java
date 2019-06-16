/**  
 * @Title: PaymentServiceImpl.java
 * @Package org.study.heat.service.impl
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.service.impl;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import com.beust.jcommander.internal.Lists;
import org.springframework.stereotype.Service;
import org.study.heat.base.BaseService;
import org.study.heat.dao.PaymentMapper;
import org.study.heat.dao.TicketMapper;
import org.study.heat.dao.UserMapper;
import org.study.heat.dto.PaymentQueryDto;
import org.study.heat.dto.TicketQueryDto;
import org.study.heat.pojo.Payment;
import org.study.heat.pojo.PaymentDetail;
import org.study.heat.pojo.Ticket;
import org.study.heat.pojo.User;
import org.study.heat.service.PaymentService;
import org.study.heat.service.RoomService;
import org.study.heat.utils.PublicUtil;
import org.study.heat.vo.PaymentVo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.study.heat.vo.RoomVo;

/**
 * ClassName: PaymentServiceImpl 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Service
public class PaymentServiceImpl extends BaseService<Payment> implements PaymentService {

	@Resource
	private UserMapper userDao;

	@Resource
	private RoomService roomService;

	@Resource
	private PaymentMapper paymentDao;
	
	@Resource
	private TicketMapper ticketDao;
	
	/* (non-Javadoc)
	 * @see org.study.heat.service.PaymentService#savePayment(org.study.heat.pojo.Payment)
	 */
	@Override
	public Integer savePayment(Payment payment, User user) {
		// TODO Auto-generated method stub
		User userQuery = userDao.selectByPrimaryKey(payment.getUserId());
		if (PublicUtil.isEmpty(userQuery)) {
			throw new RuntimeException("该用户不存在.");
		}

		Random random = new Random();
		DecimalFormat df = new DecimalFormat("00");
		String paymentNo = new SimpleDateFormat("yyyyMMddHHmmss")
				.format(new Date()) + df.format(random.nextInt(100));;

		// 根据用户Id查询所有房子信息
		List<RoomVo> roomVoList = roomService.queryUserRoomListByUserId(payment.getUserId());
		List<PaymentDetail> paymentDetailList = Lists.newArrayList();
		for (RoomVo r : roomVoList) {
			if (r.getHeatType().equals(1)
					|| r.getHeatType().equals(4)) {
				PaymentDetail paymentDetail = new PaymentDetail();
				paymentDetail.setPaymentNo(paymentNo);
				paymentDetail.setAcreage(r.getAcreage());
				paymentDetail.setPrice(r.getPrice());
				paymentDetail.setRoomId(r.getId());
				paymentDetail.setRoomType(r.getRoomType());
				paymentDetail.setRoomName(r.getAreaName() + r.getBuildingName()
						+ r.getUnitNo() + "单元" + r.getRoomName());
				//paymentDetail.setUpdateInfo(get);
				paymentDetail.setFee(r.getPrice().multiply(new BigDecimal(r.getAcreage())).setScale(2));
			}
		}


		return null;
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.PaymentService#queryPaymentListWithPage(org.study.heat.dto.PaymentQueryDto)
	 */
	@Override
	public PageInfo queryPaymentListWithPage(PaymentQueryDto paymentQueryDto) {
		// TODO Auto-generated method stub
		
		PageHelper.startPage(paymentQueryDto.getPageNum(), paymentQueryDto.getPageSize());
		
		List<PaymentVo> paymentVoList = paymentDao.queryPaymentListWithPage(paymentQueryDto);
		
		return new PageInfo<>(paymentVoList);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.PaymentService#queryTicketListWithPage(org.study.heat.dto.TicketQueryDto)
	 */
	@Override
	public PageInfo queryTicketListWithPage(TicketQueryDto ticketQueryDto) {
		// TODO Auto-generated method stub
		PageHelper.startPage(ticketQueryDto.getPageNum(), ticketQueryDto.getPageSize());
		
		List<Ticket> ticketList = ticketDao.queryTicketListWithPage(ticketQueryDto);
		
		return new PageInfo<>(ticketList);
	}

}
