package pro.akvel.test.noclassdeffound;

import pro.akvel.test.noclassdeffound.second.Test3;

/**
 * ��������� ��� ����� ���� � ������ � �������� ����� ����� �������������� ���� � ������
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
