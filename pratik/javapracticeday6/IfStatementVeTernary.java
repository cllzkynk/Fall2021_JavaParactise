package javapracticeday6;
import java.util.Scanner;
public class IfStatementVeTernary {
    
    public static void main(String[] args) {
        
        /*
        Kullanicidan 2 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk olarak 
        konsola yazdiriniz
        int num1 
        int num2 
*/
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen iki numara giriniz");
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        /*
        if(num1 >= num2) {
            System.out.println(num1+" en buyuk numaradir");
            System.out.println(num2+" en kucuk rakamdir");
        }else {
            System.out.println(num2+" en buyuk rakamdir");
            System.out.println(num1 + " en kucuk rakamdir");
            
        }*/
        
        //ayni soruyu ternary ile yapalim
        
        // 23 >= 34  = 
        
        
        String result = num1 >= num2 ? num1+ " en buyuk sayidir \n"+ num2+" en kucuk sayidir":
            num2+" en buyuk sayidir \n"+num1+" en kucuk sayidir";
        System.out.println(result);
    }
}























