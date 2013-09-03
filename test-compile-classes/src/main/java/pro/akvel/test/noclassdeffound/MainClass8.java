package pro.akvel.test.noclassdeffound;

import pro.akvel.test.noclassdeffound.second.Test8;


/**
 * Ошибка инициализации класса
 *
 */
public class MainClass8 {

	public static void main(String[] args) {
		try {
			System.out.println("Step 1:" + new Test8().passed());
		}catch (Throwable e) {e.printStackTrace();}
		
		System.out.println("Step 2:" + new Test8().passed());
	}

}
