package day10_list;

public class Q07 {

	public static void main(String[] args) {
        /*
        ayna check sorusu:
         input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
         output : verilen array simetriktir
         */
        int arr[] = { 1, 2, 3, 4,5, 4, 3, 2, 1 };
        boolean simetrik=false;
        for (int i=0; i<arr.length; i++) {
           
        	
        	if (arr[i] == arr[arr.length-1-i]&&i!=arr.length/2+0.5) {
                simetrik=true;
            }
            else {simetrik=false;
            break;}
        }
        System.out.println(simetrik);
    }
}