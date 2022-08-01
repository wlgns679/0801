import java.util.Scanner;

public class ArrayDemo7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 몇 명? : ");
		int count = sc.nextInt();		// 몇 명
		sc.nextLine();
		
		Student [] array = new Student[count];
		for(Student std : array) {
			std = new Student();
			System.out.print("Name :");		std.name = sc.nextLine();
			System.out.print("Hakbun :");		std.hakbun = sc.nextLine();
			System.out.print("Korea :");		std.kor = sc.nextInt();
			System.out.print("English :");		std.eng = sc.nextInt();
			System.out.print("Math :");		std.mat = sc.nextInt();
			sc.nextLine();
			
			std.calcTot(); 			std.calcAvg(); 			std.calcGrade();
			std.display();
		}
	}
}
