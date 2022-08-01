import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
/*		int [] array = new int[4];
		Scanner sc = new Scanner(System.in);


//		System.out.print("첫번째 숫자 : "); sc.nextLine();
		for(int i = 0; i < 4; i++) {
			System.out.print(i + "번째 방의 값 : " );
			array[i] = sc.nextInt();
			}
//		System.out.println(array);
		for(int i = 0; i < 4; i++) {
			System.out.printf("array[%d] = % d\t", i, array[i] );
			}
*/
		Student [] array = new Student[2];
		for(int i = 0; i < 2; i++) {
			System.out.printf("array[" + i + "] =" + array[i] + "\t\t");
			}
		array[0] = new Student();
		array[1] = new Student();
		System.out.println();
/*		for(int i = 0; i < 2; i++) {
			System.out.printf("array[" + i + "] =" + array[i] + "\t\t");
		}	*/
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 2; i++) {
			System.out.print(i + "번째 학생의 이름 : ");		array[i].name = sc.nextLine();
			System.out.print(i + "번째 학생의 나이 : ");		array[i].age = sc.nextInt();
			sc.nextLine();
		}
		for(int j = 0; j < 2; j++) {
			System.out.print("array[" + j + "]의 이름 :  " + array[j].name + "\t");
			System.out.println("array[" + j + "]의 나이 :  " + array[j].age + "\t");
		}
	}
}
