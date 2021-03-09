package static_.method;

import java.util.Arrays;

import static_.field.Count;

public class Count01Main {

	public static void main(String[] args) {
		
		Count01 c = new Count01();
		
		c.a = 10;
		
		c.method1();
		Count01.b++;
		
		// static 메서드의 사용
		Count01.method2();
		
		// b?
		System.out.println(Count01.b);
		
		
		// 왜 static이 중요할까?
//		Math m = new Math(); 생성자가 private 이기 때문에 사용 불가.
		
		System.out.println(Math.abs(-5));
		System.out.println(Arrays.toString(new int[10]));
		System.out.println(Integer.parseInt("1"));
		
//		test();
		
		Count01Main t = new Count01Main();
		
		t.test();
		
	}
	
	public void test () {
		
	}
}
