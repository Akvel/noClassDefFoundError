package pro.akvel.test.noclassdeffound;

import pro.akvel.test.noclassdeffound.second.Test1;

/**
 * Проверяем отсутствие метода
 *
 */
public class MainClass1 {

	public static void main(String[] args) {
		try {
			System.out.println("Step 1:" + new Test1().passed());
		}catch (Throwable e) {e.printStackTrace();}
		
		System.out.println("Step 2:" + new Test1().passed());
	}

}
