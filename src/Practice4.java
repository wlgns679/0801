
public class Practice4 {
	public static void main(String[] args) {
		int [] array = {10, 50, 44, 56, 29, 30, 9, 48, 84, 92};
		int [] original = array;		// 배열의 주요복사
		
		System.out.print("원본 = ");
		for(int su : original) {
			System.out.print(su + "\t");
		}
		System.out.println();
		int sum = 0, max = array[0],  min = array[0];
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
			if(max < array[i])	max =array[i];
			if(min > array[i])		min = array[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum/array.length);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
