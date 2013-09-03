package pro.akvel.test.noclassdeffound.second;

import java.util.HashMap;

/**
 * with added "extends HashMap<Object, Void> implements Cloneable" and serialVersionUID
 *
 */
public class Test2 extends HashMap<Object, Void> implements Cloneable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7242157374854718634L;

	public boolean passed() {
		return true;
	}
	
}
