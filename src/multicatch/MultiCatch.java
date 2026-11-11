package multicatch;

public class MultiCatch {
	public static void main(String[] args){
		
		
		// 1. 단일 try-catch
		try {
			System.out.println(3/0);
		}catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다."); // 정수를 0으로 나눌 때 나오는 예외
		}finally {
			System.out.println("프로그램 종료");
		}
		
		try {
			int num = Integer.parseInt("10A");
		}catch(NumberFormatException e) { // NumberFormatException 문자열을 숫자로 바꿀 때, 숫자가 아닌게 들어오면 발생하는 예외
			System.out.println("숫자로 바꿀 수 없습니다");
		}finally {
			System.out.println("프로그램 종료");
		}
		System.out.println();
		
		// 2. 다중 try-catch
		
		try {
			System.out.println(3/0); //이미 위에서 예외 처리가 발생하여 밑에 있는걸 무시하고 catch로 넘어감
			int num = Integer.parseInt("10A"); 
		}catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다.");
		}finally {
			System.out.println("프로그램 종료");
		}
		
	}

}
