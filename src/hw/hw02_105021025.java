package hw;
import java.util.Scanner;
public class hw02_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請問輸入性別  男:1   女:2");
		int a=scn.nextInt();
		System.out.print("身高:");
		int b=scn.nextInt();
		if(a==1){
			System.out.println("標準體重為:" + (b-80)*0.7);
		}
		if(a==2){
			System.out.println("標準體重為:" + (b-70)*0.6);
		}
	}

}
