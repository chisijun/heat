/**  
 * @Title: CheckStatEnum.java
 * @Package org.study.heat.enums
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
package org.study.heat.enums;

/**
 * ClassName: CheckStatEnum 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月10日
 */
public enum CheckStatEnum {

	/**
	 * 入住
	 */
	CHECK_IN(1, "入住"),
	
	/**
	 * 迁出
	 */
	CHECK_OUT(2, "迁出");

	/**
	 * The Type.
	 */
	Integer key;
	/**
	 * The Name.
	 */
	String value;

	CheckStatEnum(Integer key, String value) {
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
		for (CheckStatEnum ele : CheckStatEnum.values()) {
			if (key.equals(ele.getValue())) {
				return ele.getValue();
			}
		}
		return null;
	}
	
}
