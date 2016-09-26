package hw;
import java.util.Scanner;
public class hw01_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入媽媽給了小明多少錢");
		int money=scn.nextInt();
		System.out.println("請輸入要買幾顆蘋果");
		int a1 = scn.nextInt();
		System.out.println("請輸入要買幾顆柳丁");
		int a2 = scn.nextInt();
		System.out.println("請輸入要買幾顆桃子");
		int a3 = scn.nextInt();
		int tel=a1+a2+a3;
		int fif=0,five=0,one=0;
		if(tel>money){
			System.out.println("0");
		}
		else{
			money=money-a1*15-a2*20-a3*30;
//			System.out.println(money);
			while(money>=50){
				fif++;
				money-=50;
			}
			while(money>=5){
				five++;
				money-=5;
			}
			while(money>=1){
				one++;
				money-=1;
			}
			System.out.print("1元:" + one + "個  ");
			System.out.print("5元:" + five + "個  ");
			System.out.print("50元:" + fif + "個");
		}
	}

}
