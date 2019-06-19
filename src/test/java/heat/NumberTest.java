/**  
 * @Title: NumberTest.java
 * @Package heat
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月19日
 */
package heat;

import java.text.DecimalFormat;

import org.junit.Test;

/**
 * ClassName: NumberTest 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年6月19日
 */
public class NumberTest {

	@Test
	public void main() {
		
		int str1=1;
		DecimalFormat df=new DecimalFormat("0000");
		String str2=df.format(str1);
		System.out.println(str2);
		
		//String str = String.format("%06",12);
		
		//System.out.println("str = " + str);
	}
	
}
