package pro.akvel.test.noclassdeffound;

import pro.akvel.test.noclassdeffound.second.Test4;

/**
 * ��� ����� ���� � ������� ������ �� ����� ������ ��� ����
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
