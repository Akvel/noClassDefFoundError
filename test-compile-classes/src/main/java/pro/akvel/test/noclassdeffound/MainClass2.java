package pro.akvel.test.noclassdeffound;

import pro.akvel.test.noclassdeffound.second.Test2;

/**
 * Проверяем что будет если изменить наследование у класса
 *
 */
public class MainClass2 {

	public static void main(String[] args) {
		try {
			System.out.println("Step 1:" + new Test2().passed());
		}catch (Throwable e) {e.printStackTrace();}
		
		System.out.println("Step 2:" + new Test2().passed());
	}

}
