/**  
 * @Title: CouponVo.java
 * @Package org.study.heat.vo
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
package org.study.heat.vo;

import javax.persistence.Column;

import lombok.Data;

import org.study.heat.base.BaseVo;

/**
 * ClassName: CouponVo 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月28日
 */
@Data
public class CouponVo extends BaseVo {

	/**
     * 有效期开始
     */
    private String periodStart;

    /**
     * 有效期结束
     */
    private String periodEnd;

    /**
     * 减免比例
     */
    private Integer discount;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;
	
}
