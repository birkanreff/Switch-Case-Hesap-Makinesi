import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		
		int sayi1, sayi2, secim;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz :");
		sayi1=input.nextInt();
		System.out.print("İkinci sayıyı giriniz :");
		sayi2=input.nextInt();
		
		System.out.println("Toplama işlemi için 1'e \n Çıkarma işlemi için 2'ye \n Çarpma işlemi için 3'e \n Bölme işlemi için 4'e basınız");
		secim=input.nextInt();
		
		switch(secim) {
			
			case 1:
				System.out.print("Sayıların toplamı = " + (sayi1+sayi2));
				break;
			case 2:
				System.out.print("Sayıların farkı = " + (sayi1 - sayi2));
				break;
			case 3:
				System.out.print("Sayıların çarpımı = " + (sayi1 * sayi2));
				break;
			case 4:
				System.out.print("Sayıların bölümü = " + (sayi1/sayi2));
				break;
				
		
		
		

	}

	
		
	}

}
