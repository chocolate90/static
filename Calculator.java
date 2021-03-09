package static_.basic;

public class Calculator {

	/*
	 * 계산기마다 색깔이나 결과값은 다르기 떄문에 일반 멤버변수가 된다.
	 * 반면에
	 * 계산기마다 원주율은 동일하기 때문에 static으로 선언하는게 좋다.  
	 */
	
	private int result;
	private String color;
	
	public static double pi = 3.14; // 어디서나 굳이 객체를 만들지 않고 사용할 수 있는 장점이 있다.
	
	/*
	 * 일반 멤버변수를 참조하고 있는 메서드는 static으로 선언하면 안된다. 
	 */
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	// result에 누적하는 add() 
	
	public void add(int a) {
		result += a;
	}
	
	public int getResult() {
		return result;
	}
	
	/*
	 *  메서드 내부에서 일반 멤버변수를 쓰지 않고,
	 *  범용성 있게 사용하는 메서드는 static 키워드를 쓰는 편이 좋다.
	 */
	
	public static double areaCircle(int r) {
		return pi * r * r;
	}
	
	public static double areaRect(int side) {
		return side * side;
	}

	
}
