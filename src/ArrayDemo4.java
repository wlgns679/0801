
public class ArrayDemo4 {
	public static void main(String[] args) {
/*		Product pencil = new Product();
		pencil.name = "연필";
		pencil.price = 200;
		pencil.color ="black";
		
		Product mouse = new Product();
		mouse.name = "마우스";
		mouse.price = 50000;
		mouse.color ="silver";	*/
		
		Product[] array = new Product[3];
		for(int i=0; i<array.length; i++) {
			array[i] = new Product();
		}
		for(int i=0; i<array.length; i++) {
			array[0].name = "연필";			array[0].price = 200;			array[0].color = "black";
			array[1].name = "마우스";			array[1].price = 50000;			array[1].color = "silver";
			array[2].name = "키보드";			array[2].price = 10000;			array[2].color = "white";
		}
		for(int i=0; i<array.length; i++) {
		System.out.println((i+1) + "번째 상품 설명");
		System.out.println("이름 : " + array[i].name );
		System.out.println("가격 : " + array[i].price );
		System.out.println("색상 : " + array[i].color );
			}	
	}
}
