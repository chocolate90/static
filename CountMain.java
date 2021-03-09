package static_.field;

public class CountMain {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		
		c1.a++;
		c1.b++;
		System.out.println("일반멤버변수:" + c1.a);
		System.out.println("정적멤버변수:" + c1.b);
		
		Count c2 = new Count();
		
		c2.a++;
		c2.b++;
		
		System.out.println("일반멤버변수:" + c2.a);
		System.out.println("정적멤버변수:" + c2.b);
		
		Count c3 = new Count();
		
		c3.a++;
		c3.b++;
		
		System.out.println("일반멤버변수:" + c3.a);
		System.out.println("정적멤버변수:" + c3.b);
		
		/*
		 *  static은 클래스 외부에 1개 생성된다의 의미를 갖는다.
		 *  그래서 static변수는 객체와 상관없기 때문에
		 *  
		 *  클래스이름.변수명으로 사용한다.
		 */
		
		Count.b++; // 아주 중요!
		Count.b = 100;
		c2.b++;
		
		// 그러면 현재 c3.b는 몇?
		
		System.out.println(c3.b);
		
		
	}
}
