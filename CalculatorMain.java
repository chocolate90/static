package static_.basic;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		/*
		 *  1. 계산기 두개를 만들고 각각 색상을 지정.
		 *  2. 계산기 색상을 확인 하세요.
		 *  3. result 값을 받환받는 getResult()를 생성
		 *  4. pi와 circle() 메서드를 이용해서 원의 넓이를 구하시오.
		 */
		
		Calculator c = new Calculator();
		Calculator c1 = new Calculator();
		
		c.setColor("하늘색");
		System.out.println("c 계산기의 색상:" + c.getColor());
		
		c1.setColor("흰색");
		System.out.println("c1 계산기의 색상:" + c1.getColor());
		
		c.add(5);
		System.out.println(c.getResult());
		c.add(10);
		System.out.println(c.getResult());

		System.out.println("원의 넓이:" + Calculator.pi * 4 * 4);
		System.out.println("원의 넓이:" + Calculator.areaCircle(5));
		
		
		// 
		
		int[] arr = {1, 2, 3};
		System.out.println(ArrayPrint.printArray(arr));
		
		Arrays.toString(arr); 
		
		
		
	}
}
