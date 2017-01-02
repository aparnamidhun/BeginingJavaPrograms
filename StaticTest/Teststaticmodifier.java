
package lesson4;
import lesson3.StaticModifier;
public class TestStaticModifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StaticModifier s1 = new StaticModifier();
		System.out.println("num1 value for s1 is"+StaticModifier.num1);
		System.out.println("num1 value for s1 is"+s1.num2);
		
		StaticModifier s2 = new StaticModifier();
		System.out.println("num1 value for s2 is"+StaticModifier.num1);
		System.out.println("num1 value for s2 is"+s2.num2);
		
	}

}
Contact GitHub API Training Shop Blog About
© 2017 GitHub, Inc. Terms Privacy Security Status Help
