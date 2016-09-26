package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex03_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int h1 = scn.nextInt();
		int m1 = scn.nextInt();
		int h2 = scn.nextInt();
		int m2 = scn.nextInt();
		int all,tel,money=0;
		all=(h2-h1)*2;
		tel=m2-m1;
		if(tel>0&&tel<=30){
			all++;
		}
		else if(tel>30){
			all=all+2;
		}
		else if(tel<0 && tel>=-30){
			all--;
		}
		else if(tel>-30){
			all=all-2;
		}
		if(all>8){
			money=money+(all-8)*60+120+160;
		}
		else if(all<=8){
			money=money+(all-4)*40+120;
		}
		else if(all<=4){
			money=money+all*40;
		}
		System.out.println(money);
	}
}

