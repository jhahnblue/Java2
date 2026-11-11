package uncheckedException;

class A{}
class B extends A{}


public class UncheckedExcpetion {

	public static void main(String[] args) {
		
		// UncheckedException = RuntimeException(실행예외)
		
		// 1. ArithmeticException
		System.out.print(3 / 0);
		
		// 2. ClassCastException
		A a = new A();
		B b = (B)a;
		
		// 3. ArrayIndexOutOfBoundsException
		int[] array = {1, 2, 3};
		System.out.print(array[3]);
		
		// 4. NumberFromatException
		int num = Integer.parseInt("10!");
		
		// 5. NullPointerEception
		String str = null;
		System.out.println(str.charAt(2));
		
	}

}
