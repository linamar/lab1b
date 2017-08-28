/**
 * 
 */
package addressbook.app;
import lib.Address;

/**
 * @author 1310158
 *
 */
public class application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Address myAddress = new Address("3040","Sherbrooke");
		System.out.println(myAddress.getAddress());

	}

}
