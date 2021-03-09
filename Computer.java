package static_.init;

public class Computer {

	static String model;
	static String company;
	int price = 1000000;
	
	// 일반 멤버변수만 생성자에서 초기화
	Computer() {
		System.out.println("일반 생성자가 호출됨");
	}
	
	// 특징 - 클래스가 호출될 때 단 한번만 실행된다.(static변수의 초기화)
	static {
		System.out.println("static초기화자가 실행됨");
		model = "gram";
		company = "LG";
	}
}
