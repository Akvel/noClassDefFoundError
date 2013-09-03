package pro.akvel.test.noclassdeffound.second;

import pro.akvel.test.noclassdeffound.third.TestThirdClass;

public class Test5 {
	@SuppressWarnings("unused")
	private static ThreadLocal<TestThirdClass> t = new ThreadLocal<TestThirdClass>();
	
	public boolean passed() {
		return true;
	}
}
