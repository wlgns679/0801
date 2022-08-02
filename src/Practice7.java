import java.util.Scanner;

public class Practice7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.print("First Number : ");		int first = sc.nextInt();
				System.out.print("Second Number : ");		int second = sc.nextInt();
				int gcm = 0;
				for(int i = 2; i < first; i++) {
					if(first % i == 0 && second % i == 0) gcm = i;
				}
				int lcm = (first / gcm) * (second / gcm) * gcm;
				System.out.printf("%d와 %d의 GCM = %d, LCM = %d\n", first, second, gcm, lcm);
	}
}
