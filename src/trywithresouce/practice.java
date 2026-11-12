package trywithresouce;

import java.io.IOException; 
import java.io.InputStreamReader; // 입력을 문자로 읽어주는 도구

public class practice {

	public static void main(String[] args){
		// 2.리소스 수동 해제
				InputStreamReader isr2 = null; // 아직 객체 없음. finally에서 쓰려고 try 밖에 선언
				try {
					isr2 = new InputStreamReader(System.in);
					char input = (char)isr2.read();
					System.out.println("입력글자 =" + input);
				}catch(IOException e) {
					e.printStackTrace();
				}finally {
					
					//리소스 해제 구문
					if(isr2!=null) { //방어적 프로그램 위에서 null값이 나올 일이 없지만 혹시 몰라서 써놓음.
						try { //리소스 해제
							isr2.close();
						}catch(IOException e) {
							e.printStackTrace();
						}
					}
				}
		
		// TODO Auto-generated constructor stub
	}

}
