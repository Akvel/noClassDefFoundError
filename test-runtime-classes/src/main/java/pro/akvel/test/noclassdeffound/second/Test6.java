package pro.akvel.test.noclassdeffound.second;

public class Test6 {
	private static ThreadLocal<String> t = new ThreadLocal<String>();
	
	public boolean passed() {
		t.get();
		return true;
	}
}
