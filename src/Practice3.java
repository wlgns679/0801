import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Money 입력 : ");
		int money = sc.nextInt();
		
		int [] array = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
/*		System.out.println(array[0] + "원권 : " + (money/array[0]));
		for(int i=1; i< array.length; i++) {	
			System.out.println(array[i] + "원권 : " + (money%array[i-1])/array[i]);
		}	*/
		
		for(int i=0; i< array.length; i++) {	
			int mok = money / array[i];	// 몫
			int na = money % array[i];	// 나머지
			System.out.println(array[i] + "원권 : " +mok);
			money = na;
		}		
	}
}
