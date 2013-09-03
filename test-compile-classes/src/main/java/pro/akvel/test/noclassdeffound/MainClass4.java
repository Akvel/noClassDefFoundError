package pro.akvel.test.noclassdeffound;

import pro.akvel.test.noclassdeffound.second.Test4;

/**
 * Что будет если у рантайм класса не будет класса для поля
 *
 */
public class MainClass4 {

	public static void main(String[] args) {
		try {
			System.out.println("Step 1:" + new Test4().passed());
		}catch (Throwable e) {e.printStackTrace();}
		
		System.out.println("Step 2:" + new Test4().passed());
	}

}
