package static_.singleton;

public class SingleTon {

	// 싱글톤 패턴 - 클래스가 여러번 호출 되더라도 객체를 1번만 생성하도록 디자인 하는 방법.
	
	
	// 1. 접근 제어자를 private으로 선언하고 스스로 객체를 단 1개 생성
	private static SingleTon instance = new SingleTon();
	
	// 2. 접근 제어자를 이용해서 외부에서 객체를 생성 못하도록 생성자를 private로 설정
	private SingleTon () {
		
	}
	
	// 3. 외부에서 객체를 요구할 경우 1번에서 만들어둔 단 한개의 객체를 반환
	
	public static SingleTon getInstance() {
		return instance;
	}
	
	// 멤버변수 or 메서드 
	
	private String s = "홍길동";
	
	public String getS() {
		return s;
	}
	
	public void setS(String s) {
		this.s = s;
	}
}
