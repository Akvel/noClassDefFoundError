package pro.akvel.test.noclassdeffound;

import pro.akvel.test.noclassdeffound.second.Test6;


/**
 * private static ThreadLocal<TestThirdClass> t = new ThreadLocal<TestThirdClass>();
 * 
 * п.с. Все генерики используются только при компиляции
 *
 */
public class MainClass6 {

	public static void main(String[] args) {
		try {
			System.out.println("Step 1:" + new Test6().passed());
		}catch (Throwable e) {e.printStackTrace();}
		
		System.out.println("Step 2:" + new Test6().passed());
	}

}
