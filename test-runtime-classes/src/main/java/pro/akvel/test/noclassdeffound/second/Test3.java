package pro.akvel.test.noclassdeffound.second;

/**
 * with added method passed2
 *
 */
public class Test3{
	
	@SuppressWarnings("unused")
	private int testField = 123;
	@SuppressWarnings("unused")
	private Long testObjFiled = 321L;
	
	public boolean passed() {
		return true;
	}
	
	public boolean passed2() {
		return true;
	}
	
}
