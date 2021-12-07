package Practice.hashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		
		List<String> list2=new ArrayList<>();
		
        list2.add("ALI");
        list2.add("veli");
        list2.add("Ayse");
        list2.add("fatma");
        
        System.out.println(list2); // [ALI, veli, Ayse, fatma]
        
        //for each kullanarak listedeki tum elemanlarin isimlerini buyuk harf yapalim ve ekranda yazdiralim..
        
        for (String w : list2) {
                        
            System.out.println("For each : " + w.toUpperCase()); // ALI VELI AYSE FATMA
        }
        
        System.out.println(list2); // [ALI, veli, Ayse, fatma]
        
        System.out.println("--------------------------------");
        
        for (int i=0; i<list2.size(); i++) {
        	
        	list2.set(i, list2.get(i).toUpperCase()); 
        }
        
        System.out.println("for ile : " + list2); // for ile : [ALI, VELI, AYSE, FATMA]
        
        System.out.println("--------------------------------");
        
        ListIterator <String> itr=list2.listIterator();
        
        while (itr.hasNext()) {
        	
        String gecici=itr.next();	
        itr.set(gecici.toLowerCase());
        	
        }
        System.out.println(list2); // [ali, veli, ayse, fatma]
        
        

	}
	
	
	

}