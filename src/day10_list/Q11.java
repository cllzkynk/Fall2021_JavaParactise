package day10_list;

import java.util.ArrayList;
import java.util.Collections;

public class Q11 {

	public static void main(String[] args) {
		ArrayList <String> iller = new ArrayList <String> ();
		iller.add("Ankara");
		iller.add("Sakarya");
		iller.add("Kocaeli");
		iller.add("Edirne");
		iller.add("Karabük");
		iller.add("Ýstanbul");
		System.out.println (iller.get(0)); //ilk eklenen elemaný çaðýrýyoruz.
		System.out.println (iller.get(3));
		System.out.println (iller.get(5));
		
		System.out.println ();
		//foreach döngüsüyle tüm elemanlarý çaðýrma  
		for(String d : iller ){
		System.out.println(d);
		}

		System.out.println();
		
		//size dizinin eleman sayýsýný verir.
		System.out.println("Dizi Uzunluðu : " + iller.size());
		
		//indexof arraylist içindeki isme bakarak index numarasýný döndürür.
		System.out.println("Ýstanbul elemanýn index numarasý : " + iller.indexOf("Ýstanbul"));	
		
		System.out.println();
		
		 //sort arraylisti sýralamaya yarar
		Collections.sort(iller);

		System.out.println("Harf sýrasýna göre iller : " + iller);
		
		System.out.println();
		
		
		//remove index e yada eleman ismine göre silme iþlemini gerçekleþtirir
		iller.remove(2);
		iller.remove("Ankara");

		System.out.println();
		
		for(String d : iller ){
			System.out.println(d);
			}

			System.out.println();

			//Clear Arraylistteki tüm elemanlarý siler.
			iller.clear();
			System.out.println(iller); //boþ göstericektir
		
		
		 /* Java List Methodlarý
		
Method	Tanýmý
void add(int index, E element)			    			Belirtilen öðeyi listede belirtilen konuma eklemek için kullanýlýr.
boolean add(E e)                        				Belirtilen öðeyi listenin sonuna eklemek için kullanýlýr.
boolean addAll(Collection<? extends E> c)				Belirtilen öðeleri listenin sonuna eklemek için kullanýlýr.
boolean addAll(int index, Collection<? extends E> c)	Belirtilen öðeleri listenin belirtilen konumuna eklemek için kullanýlýr.
void clear()											Listedeki tüm elemanlarý silmek için kullanýlýr.
boolean equals(Object o)								Belirtilen nesneyi bir listenin öðeleriyle karþýlaþtýrmak için kullanýlýr.
int hashcode()											listenin hash kodunu döndürür.
E get(int index)										Belirtilen konumdaki eþleþen öðeyi getirir.
boolean isEmpty()										Liste boþsa true, diðer durumda false döndürür.
int lastIndexOf(Object o)								Belirtilen öðenin son tekrarlandýðý durumun bu listesindeki dizini veya liste bu öðeyi içermiyorsa -1’i döndürmek için kullanýlýr.
Object[] toArray()										Bu listedeki tüm öðeleri içeren bir diziyi doðru sýrayla döndürmek için kullanýlýr.
<T> T[] toArray(T[] a)									Bu listedeki tüm öðeleri içeren bir diziyi doðru sýrayla döndürmek için kullanýlýr.
boolean contains(Object o)								Liste belirtilen öðeyi içeriyorsa true deðerini döndürür
boolean containsAll(Collection<?> c)					Liste belirtilen tüm öðeleri içeriyorsa true deðerini döndürür
int indexOf(Object o)									Belirtilen öðenin ilk oluþumunun bu listesindeki dizini veya Liste bu öðeyi içermiyorsa -1’i döndürmek için kullanýlýr.
E remove(int index)										Listede belirtilen konumda bulunan elemaný çýkarmak için kullanýlýr.
boolean remove(Object o)								Belirtilen öðe ile eþleþen ilk elemaný kaldýrmak için kullanýlr.
boolean removeAll(Collection<?> c)						Listedeki tüm elemanlarý kaldýrmak için kullanýlýr.
void replaceAll(UnaryOperator<E> operator)				Listedeki tüm öðeleri belirtilen öðeyle deðiþtirmek için kullanýlýr.
void retainAll(Collection<?> c)							Listedeki belirtilen koleksiyonda bulunan tüm öðeleri tutmak için kullanýlýr.
E set(int index, E element)								Listede, belirtilen konumda bulunan belirtilen öðeyi deðiþtirmek için kullanýlýr.
void sort(Comparator<? super E> c)						Listedeki öðeleri belirtilen karþýlaþtýrýcýya göre sýralamak için kullanýlýr.
Spliterator<E> spliterator()							Listedeki öðeler üzerinde ayýrýcý oluþturmak için kullanýlýr.		
List<E> subList(int fromIndex, int toIndex)				Verilen aralýktaki tüm unsurlarý getirmek için kullanýlýr.
int size()												Verilen aralýktaki tüm unsurlarý getirmek için kullanýlýr….		
		
		
		
		
		
		
		
		
		
		
		
		
	*/	
	}

}
