/**  
 * @Title: HisRoomService.java
 * @Package org.study.heat.service
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.service;

import org.study.heat.base.IService;
import org.study.heat.dto.HisRoomQueryDto;
import org.study.heat.pojo.HisRoom;

import com.github.pagehelper.PageInfo;

/**
 * ClassName: HisRoomService 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
public interface HisRoomService extends IService<HisRoom> {

	/**
	 * @Description: TODO
	 * @param @param hisRoomQueryDto
	 * @param @return   
	 * @return PageInfo  
	 * @throws
	 * @author chisj chisj@foxmail.com
	 * @date 2019年6月10日
	 */
	PageInfo queryHisCheckInListWithPage(HisRoomQueryDto hisRoomQueryDto);

}
