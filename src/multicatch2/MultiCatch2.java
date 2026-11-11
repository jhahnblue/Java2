package multicatch2;

public class MultiCatch2 {
	public static void main(String[] args) {
		try {
			System.out.println(3/1); //3
			int num = Integer.parseInt("10A"); // 예외 발생
		}catch(NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다"); //여기서 끝
		}catch(Exception e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다");
		}finally {
			System.out.println("프로그램 종료"); //파이널은 무조건 나옴
		}
	}

}
