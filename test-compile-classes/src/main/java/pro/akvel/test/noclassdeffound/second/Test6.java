package pro.akvel.test.noclassdeffound.second;

import pro.akvel.test.noclassdeffound.third.TestThirdClass;

public class Test6 {
	private static ThreadLocal<TestThirdClass> t = new ThreadLocal<TestThirdClass>();
	
	public boolean passed() {
		t.get();
		return true;
	}
}
