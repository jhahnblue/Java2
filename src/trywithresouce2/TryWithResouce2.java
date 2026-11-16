package trywithresouce2;

// implemnts는 뒤에 오는 인터페이스를 구현하겠다
// 인터페이스: 이 기능들을 반드시 갖춰라 
class A implements AutoCloseable{ // A클래스를 만들고 AutoCloseable인터페이스를 구현한다
	String resource; // 글자를 담을 변수 필드를 선언 값이 없어서 null <- 필드
	A(String resouce){ // 생성자 (타입 이름)
		this.resource = resouce; // 전달 받을값 resouce를 필드 resource에 저장
	}
	@Override // 실수확인           
	// 오버라이드(Override): 이미 정해진 메서드를 내 방식으로 다시 구현하는 것
	// 오버로딩(Overloading): 같은 이름의 메서드를 여러 개 만드는 것 (괄호 안 매개변수를 다르게)
	public void close() throws Exception{ // throws Exception	실행하다가 오류가 날 수 있어요
		if(resource!=null) {
			resource=null;
			System.out.println("리소스가 해제됐습니다");
		}
	}
}


public class TryWithResouce2 {

	public static void main(String[] args) {
		
		
		// 1. 리소스를 사용하고 finally에서 리소스 수동 해제하기
		A a1 = null; // A타입의 a1변수 생성
		try {
			a1 = new A("특정 파일"); // A라는 클래스 객체를 하나만들고 a1이라는 변수에 담아 둔다
		}catch(Exception e) { // 오류가 나오면 예외 처리라는 문구가 나오게
			System.out.println("예외 처리");
		}finally { // 무조건 나오는거
			// 리소스 수동 해제
			if(a1.resource!=null) { // 만약 a1의 resource가 null값이 아니면
				try { 
					a1.close(); // a1을 닫아
				}catch(Exception e) {} //예외라면 실행결과 없음
			}
			
			// 2. 리소스 자동 해제   try괄호 안에 넣지않으면 자동으로 안됨
			try(A a2 = new A("특정파일");){ // A라는 클래스를 a2라는 변수에 넣어라
			}catch(Exception e) {
				System.out.println("예외 처리");
			}
		}

	}

}
