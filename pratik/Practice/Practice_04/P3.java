package Practice.Practice_04;

public class P3 {

	public static void main(String[] args) {
		   
	    String b = "Haluk 1453 ?!@$_";
	    
	    
	    System.out.println("orjinal metin ---> "+b);
	    
		System.out.println();
	    
	    // \\d ifadesi tum rakamlari(digit) temsil eder.
	System.out.println("Tum rakamlarin * hali ---> "+b.replaceAll("\\d","*"));
	// ===>  \\D rakamlar disindaki hersey
			System.out.println("Tum rakam hariclerin * hali ---> "+b.replaceAll("\\D","*"));
	
	System.out.println();
	
	
	//==> \\S space disindaki hersey
	System.out.println("Tum space hariclerin * hali ---> "+b.replaceAll("\\S","*"));
	
	//==> \\s space ifadesidir.
	System.out.println("Tum space'nin * hali ---> "+b.replaceAll("\\s","*"));
	
	// replace ile yapma
	System.out.println("replace ile Tum space'nin * hali ---> "+b.replace(" ","*"));
	
	System.out.println();
	
	//==>  \\w ifadesi (word->kelime ve hadf) a-z A-Z 0-9 _  bunlari kapsar
	System.out.println("Tum harf ve rakamlarun * hali ---> "+b.replaceAll("\\w","*"));
	
	//==>  \\W ifadesi a-z A-Z 0-9 ve  _ disindakileri kapsar
	
	System.out.println("Tum harf ve rakam  hariclerin * hali ---> "+b.replaceAll("\\W","*"));
	
	
	
	
	
	
	        
}

}