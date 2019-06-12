/**  
 * @Title: HisRoomVo.java
 * @Package org.study.heat.vo
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.vo;

import java.util.Date;

import lombok.Data;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * ClassName: HisRoomVo 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Data
public class HisRoomVo extends RoomVo {
	
	/**
	 * 用户姓名
	 */
	private String userName;
	
	/**
	 * 房间Id
	 */
	private Long roomId;
	
	/**
	 * 入住时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date checkIn;
	
	/**
	 * 迁出时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date checkOut;
	
	/**
	 * 入住状态 1-入住 2-迁出
	 */
	private Integer stat;
	
}
