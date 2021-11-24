package day09_Arrays;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {
        //bir int Array elemanlarinin isaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6
 int arr[]= {1,2,-3,4,-5,-6};
 int arr1[]=new int [arr.length];
 for (int i = 0; i < arr.length; i++) {
	arr1[i]=arr[i];
	 arr[i]=-1*arr[i];
}
System.out.println("Ilk Array : "+Arrays.toString(arr1));
System.out.println("Son array : "+Arrays.toString(arr));
    	
    	
    	
    	
    	
    }


}
