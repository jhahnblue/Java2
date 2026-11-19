package throwsexception3;

class A{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object"); // ClassNotFoundException
			Thread.sleep(1000); //InterruptedException
		}catch(InterruptedException | ClassNotFoundException e){
			//예외 처리 구문
			// InterruptedException 기다리는 중에 방해받았을 때 -> 아무도 안깨워서 오류안남
			// ClassNotFoundException 해당 클래스 이름을 찾지 못했을 때
		}
	}
}

// 2.예외를 호출 메서드로 전가할 때
class B{
	void abc() {
		try {
			bcd(); // InterruptedException
		}catch(InterruptedException | ClassNotFoundException e) {
			//에외 처리 구문
		}
	}
	void bcd() throws InterruptedException, ClassNotFoundException{
		Class cls = Class.forName("java.lang.Object"); // ClassNotFoundException
		Thread.sleep(1000); // InterruptedException
	}
}

public class throwsexception3 {
	public static void main(String[] args) {
	}
}
