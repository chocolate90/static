package static_.singleton;

public class SingleTonMain {

	public static void main(String[] args) {
		
//		SingleTon s1 = new SingleTon();
		
		// 싱글톤의 호출
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		
		System.out.println(s1 == s2);
		
		s1.setS("이순신");
		System.out.println(s2.getS());
		
	}
}
