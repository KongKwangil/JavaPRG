/**
 * 2023.03.14
 * 세 개의 값을 입력 받아 첫 번재 같은 문장려, 두 번째 같은 정수값
 * 세 번째 값은 실수로 출력하는 프로그램
 */
package chp2;

import java.util.Scanner;
public class keyboardinput {

	public static void main(String[] args) {
	   Scanner stdin = new Scanner(System.in);
	   System.out.print("이름과 나이, 몸무게를 공관(space)으로 구분하여 입력:");
       String name = stdin.next();//이름 문자열로 입력
       int i = stdin.nextInt();//나이 정수로 입력
       double d=stdin.nextDouble();//몸무게 실수로 입력
       System.out.println(name+"씨의 나이는"+i+"세이고");
       System.out.println("몸무게는"+d+"kg입니다");
       
	}

}
;