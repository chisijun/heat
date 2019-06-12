/**  
 * @Title: UserRoomDto.java
 * @Package org.study.heat.dto
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * ClassName: UserRoomDto 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
@Data
public class UserRoomDto {

	/**
	 * 用户Id
	 */
	private Long userId;
	
	/**
	 * 房子id
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
	 * 是否供热
	 */
	private Integer heatType;
}
