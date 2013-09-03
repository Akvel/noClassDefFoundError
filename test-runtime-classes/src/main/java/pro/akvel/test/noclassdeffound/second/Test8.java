package pro.akvel.test.noclassdeffound.second;

public class Test8 {
	
	static {
		if (true)
			throw new RuntimeException("O_o");
	}
	
	public boolean passed() {
		return false;
	}
}
