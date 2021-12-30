package genelTekrar;

public class faktoryel {

	public static void main(String[] args) {
// Pozitif bir tamsayıyı input kabul edip, faktöryelini hesaplayan 
//		ve ornekte istenen şekilde konsola yazdıran bir METHOD yazınız
//		 Ör: Input : 6
//	     Output: 6!=6*5*4*3*2*1=720
		
		int input = 6;
		faktoryel(input);

	}
	public static void faktoryel(int input) {
		System.out.print(input+"!=");
		int sonuc=1;
		for (int i = input; i >1; i--) {
			sonuc*=i;
		System.out.print(i+"*");	
			
		}
		System.out.println("1=" + sonuc);
		
	}

}
