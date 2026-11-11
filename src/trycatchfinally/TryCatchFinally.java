package trycatchfinally;

public class TryCatchFinally {

	public static void main(String[] args){
		
		// 1. try-catch 실행 중에 예외가 발생했을 때 프로그램이 강제 종료되지 않도록, 그 예외를 대신 처리할 코드를 실행하게 해 주는 문법.
		try {
			System.out.println(3/0); // 실행 예외는 실행해 봐야하는 오류 (ArithmeticException)
			System.out.println("프로그램 종료");
		}catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
			System.out.println("프로그램 종료");
		}
		
		// 2. try-catch-finally
		
		try {
			System.out.println(3/0);
		}catch(ArithmeticException e) { // 실행 전까지는 오류를 알수 없다.
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("프로그램 종료");
		}
	}

}
