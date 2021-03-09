package static_.method;

import static_.field.Count;

public class Count01 {

	public int a;
	public static int b;
	
	// 일반 메서드 - 일반 멤버변수, 정적 멤버변수 모두 사용 가능
	public int method1() {
		a = 10;
		return ++b;
	}
	
	// 정적 메서드 - static이 붙은 변수나 메서드만 사용이 가능
	
	public static int method2() {
//		a = 10; 일반 멤버변수는 사용 불가
		
		// 단 객체 생성을 통해서 일반 멤버변수도 사용이 가능
		Count c = new Count();
		
		c.a = 10;
		
		return ++b;
	}
}
