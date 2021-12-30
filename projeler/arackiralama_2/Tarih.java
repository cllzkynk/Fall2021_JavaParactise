package arackiralama_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Tarih {
	//static long hesaplama;
	static  long gun; //bu clas icinde kullanilmasi icin static yaptik
	
	public	static long findDifference(String start_date,//String gg-aa-yyy +" " + saat
                   String end_date)//String gg-aa-yyy +" " + saat
    {
  // tarih ve saat bilgilerini istediğimiz formatta görüntülemek için 
		//SimpleDateFormat sınıfı oldukça kullanışlıdır.
        // SimpleDateFormat converts the string format to date object
		//SimpleDateFormat string olarak gelen metni tarih formatine ceviriyor
		//bunun icin SimpleDateFormat clas'indan bir obje olusturuyoruz 
        SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");//String gg-aa-yyy +" " + saat
  
        // Try Block
       try {
  //parse methodu bir String'den gelen metinsel degerden  tarihi üretmek icin kullanılır           
 // parse method is used to parse the text from a string to produce the date
    	   
            java.util.Date d1 = sdf.parse(start_date);
            java.util.Date d2 = sdf.parse(end_date);
            System.out.println("d1 objesi start_date : " + start_date);
            System.out.println("d2 objesi end_date : " + end_date);
  
// Calculate time difference
// in milliseconds
            //millisecond saniyenin binde biridir
 long difference_In_Time = d2.getTime() - d1.getTime();
  
            // Calculate time difference in
            // seconds, minutes, hours, years,
            // and days
 //millisecond saniyenin binde biri oldugundan bine boluyoruz ve modulus 60 yapiyoruz
long difference_In_Seconds= (difference_In_Time / 1000) % 60;
  
long difference_In_Minutes= (difference_In_Time/ (1000 * 60))% 60;
  
 long difference_In_Hours = (difference_In_Time/ (1000 * 60 * 60)) % 24;
  
            long difference_In_Years
                = (difference_In_Time
                   / (1000l * 60 * 60 * 24 * 365));
  
         long difference_In_Days
                = (difference_In_Time
                   / (1000 * 60 * 60 * 24))
                  % 365;
  
         gun=difference_In_Days;
            // Print the date difference in
            // years, in days, in hours, in
            // minutes, and in seconds
/*
            System.out.print(
                "Difference "
                + "between two dates is: ");
  
            System.out.println(
                difference_In_Years
                + " years, "
                + difference_In_Days
                + " days, "
                + difference_In_Hours
                + " hours, "
                + difference_In_Minutes
                + " minutes, "
                + difference_In_Seconds
                + " seconds");
                */
            
      }
 
      //  Catch the Exception
        catch (ParseException e) {
            e.printStackTrace();//Java'daki printStackTrace() yöntemi, istisnaları ve hataları işlemek için kullanılan bir araçtır.
//Bu, Java'nın throwable clas'inin, throwable olan satır numarası ve exception'in gerçekleştiği class adı gibi
 //diğer ayrıntılarla birlikte yazdıran bir yöntemidir.
        }
       
		return gun;
		
    }
}