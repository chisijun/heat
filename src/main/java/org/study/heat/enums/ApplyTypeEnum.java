/**  
 * @Title: ApplyStatEnum.java
 * @Package org.study.heat.enums
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月17日
 */
package org.study.heat.enums;

/**
 * ClassName: ApplyStatEnum 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月17日
 */
public enum ApplyTypeEnum {
	
	/**
	 * 报停
	 */
	STOP(0, "报停"),
	
	/**
	 * 强停
	 */
	STRONG(1, "强停"),
	
	/**
	 * 复热
	 */
	START(2, "复热");

	/**
	 * The Type.
	 */
	Integer key;
	/**
	 * The Name.
	 */
	String value;

	ApplyTypeEnum(Integer key, String value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * Gets type.
	 *
	 * @return the type
	 */
	public Integer getKey() {
		return key;
	}

	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	public String getValue() {
		return value;
	}


	/**
	 * Gets name.
	 *
	 * @param type the type
	 *
	 * @return the name
	 */
	public static String getValue(Integer key) {
		for (ApplyTypeEnum ele : ApplyTypeEnum.values()) {
			if (key.equals(ele.getValue())) {
				return ele.getValue();
			}
		}
		return null;
	}
}
