package genelTekrar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListeYazdirma {

	public static void main(String[] args) {
//		2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
//		Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
//		   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

		String input[][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
		printList(input);

	}
	public static void printList(String input[][]) {
		List<String> list = new ArrayList<>();
		for(int i=0;i<input.length;i++) {
            for(int j=0;j<input[i].length;j++) {
                list.add(input[i][j]);
                
            }   
        }
		Collections.sort(list);
        System.out.println(list);
	}

}
