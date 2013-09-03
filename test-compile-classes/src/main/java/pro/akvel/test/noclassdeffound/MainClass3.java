package pro.akvel.test.noclassdeffound;

import pro.akvel.test.noclassdeffound.second.Test3;

/**
 * ѕровер€ем что будет если у класса в рантайме будут новые дополнительные пол€ и методы
 *
 */
public class MainClass3 {

	public static void main(String[] args) {
		try {
			System.out.println("Step 1:" + new Test3().passed());
		}catch (Throwable e) {e.printStackTrace();}
		
		System.out.println("Step 2:" + new Test3().passed());
	}

}
