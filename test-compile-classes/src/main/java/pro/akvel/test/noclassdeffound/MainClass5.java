package pro.akvel.test.noclassdeffound;

import pro.akvel.test.noclassdeffound.second.Test5;

/**
 * ThreadLocal<TestThirdClass> 
 *
 */
public class MainClass5 {

	public static void main(String[] args) {
		try {
			System.out.println("Step 1:" + new Test5().passed());
		}catch (Throwable e) {e.printStackTrace();}
		
		System.out.println("Step 2:" + new Test5().passed());
	}

}
