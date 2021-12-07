package Practice.Practice_12_Encapsule02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciMain {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Ogrenci obj1=new Ogrenci();
		
	List<String> list=new ArrayList<>();
	
	
	for (int i = 0; i<3; i++) {
		
		System.out.print("Lutfen bir ad giriniz : ");
		String ad=scan.nextLine();
		
		System.out.print("Lutfen bir tel giriniz : ");
		String tel=scan.nextLine();
		
		System.out.print("Lutfen bir no giriniz : ");
		int no=scan.nextInt();
		scan.nextLine();
		
		obj1.setAd(ad);
		obj1.setTel(tel);
		obj1.setNo(no);
		
		String eklenecek=obj1.getAd()+" "+obj1.getNo()+" "+obj1.getTel();
		
		list.add(eklenecek);
		
		System.out.println(list);
	}
	  

	}

}
