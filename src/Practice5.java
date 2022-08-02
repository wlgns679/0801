import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int su = sc.nextInt();
		int count =0;
		System.out.print(1 + " \t");		count++;
		
		for(int i=2; i<su; i++) {
			if(su % i==0) {
			System.out.print(i+"\t");
			count++;
			if(count % 3 == 0) System.out.println();
		}
	}	System.out.println(su);
}
}
