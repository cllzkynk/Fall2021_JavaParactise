package day05_StringManipulation_10112021;

public class Q11 {
    public static void main(String[] args) {
	/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // 1.yol
        System.out.println("istenilen str= " + pickName.charAt(0) + " "
                + pickName.substring(11,12) + " " + pickName.toLowerCase().substring(8,9));

        // 2 .yol

        int A=pickName.indexOf("A");
        int L=pickName.indexOf("L");
        int I=pickName.indexOf("I");
        char A1=pickName.charAt(A);
        char L1=pickName.charAt(L);
        char I1=pickName.toLowerCase().charAt(I);
        System.out.println(A1+" "+L1+ " "+I1);
        System.out.println(""+A1+L1+I1);
    }

}
