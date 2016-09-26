package ex;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex01_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入本月時數");
		int val = scn.nextInt();
		double sel1=0.9,sel2=0.79;
		if(val>=600 && val<=1200){
			val*=sel1*0.5;
		}
		else if(val>1200){
			val*=sel2*0.5;
		}
		System.out.println("本月的話費為：" + val);
	}

}