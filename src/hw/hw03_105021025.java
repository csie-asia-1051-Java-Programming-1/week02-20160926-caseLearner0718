package hw;
import java.util.Scanner;
public class hw03_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入年份:");
		int val=scn.nextInt();
		if(val%400==0){
			System.out.print("閏年");
		}
		else if(val%100==0){
			System.out.print("平年");
		}
		else if(val%4==0){
			System.out.print("閏年");
		}
	}

}
