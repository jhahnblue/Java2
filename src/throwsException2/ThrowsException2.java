package throwsException2;

public class ThrowsException2 {
	public static void main(String[] args) throws ClassNotFoundException { // main은 최상위 메서드 → 예외가 나면 JVM으로 넘어가 프로그램 종료
		Class cls = Class.forName("java.lang.Obeject2"); // 이름으로 클래스를 찾는 구문. 없는 클래스라 ClassNotFoundException 발생
		// main에 throws ClassNotFoundException을 붙여서 컴파일 오류 없이 실행은 됐다.
		// 그런데 java.lang.Obeject2라는 클래스가 존재하지 않아서 Class.forName()에서 ClassNotFoundException이 발생했다.
		// main은 최상위 메서드라 예외를 처리하지 않고 넘기면 JVM이 받게 되는데, JVM은 예외를 처리하지 않고 오류 메시지를 출력한 뒤 프로그램을 종료시킨다.
	}

}
	