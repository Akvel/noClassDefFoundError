package pro.akvel.test.noclassdeffound;

import pro.akvel.test.noclassdeffound.second.Test7;


/**
 * Импорт пакета, которого нет в рантайме
 *
 */
public class MainClass7 {

	public static void main(String[] args) {
		try {
			System.out.println("Step 1:" + new Test7().passed());
		}catch (Throwable e) {e.printStackTrace();}
		
		System.out.println("Step 2:" + new Test7().passed());
	}

}
