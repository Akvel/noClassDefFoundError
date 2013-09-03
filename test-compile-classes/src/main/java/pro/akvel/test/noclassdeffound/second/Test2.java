package pro.akvel.test.noclassdeffound.second;

import java.util.ArrayList;

@SuppressWarnings({ "rawtypes", "serial" })
public class Test2 extends ArrayList implements Comparable<String> {
	
	public boolean passed() {
		return true;
	}

	public int compareTo(String o) {
		return 0;
	}
	
}
