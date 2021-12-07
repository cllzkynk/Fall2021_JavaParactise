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
		iller.add("Karab�k");
		iller.add("�stanbul");
		System.out.println (iller.get(0)); //ilk eklenen eleman� �a��r�yoruz.
		System.out.println (iller.get(3));
		System.out.println (iller.get(5));
		
		System.out.println ();
		//foreach d�ng�s�yle t�m elemanlar� �a��rma  
		for(String d : iller ){
		System.out.println(d);
		}

		System.out.println();
		
		//size dizinin eleman say�s�n� verir.
		System.out.println("Dizi Uzunlu�u : " + iller.size());
		
		//indexof arraylist i�indeki isme bakarak index numaras�n� d�nd�r�r.
		System.out.println("�stanbul eleman�n index numaras� : " + iller.indexOf("�stanbul"));	
		
		System.out.println();
		
		 //sort arraylisti s�ralamaya yarar
		Collections.sort(iller);

		System.out.println("Harf s�ras�na g�re iller : " + iller);
		
		System.out.println();
		
		
		//remove index e yada eleman ismine g�re silme i�lemini ger�ekle�tirir
		iller.remove(2);
		iller.remove("Ankara");

		System.out.println();
		
		for(String d : iller ){
			System.out.println(d);
			}

			System.out.println();

			//Clear Arraylistteki t�m elemanlar� siler.
			iller.clear();
			System.out.println(iller); //bo� g�stericektir
		
		
		 /* Java List Methodlar�
		
Method	Tan�m�
void add(int index, E element)			    			Belirtilen ��eyi listede belirtilen konuma eklemek i�in kullan�l�r.
boolean add(E e)                        				Belirtilen ��eyi listenin sonuna eklemek i�in kullan�l�r.
boolean addAll(Collection<? extends E> c)				Belirtilen ��eleri listenin sonuna eklemek i�in kullan�l�r.
boolean addAll(int index, Collection<? extends E> c)	Belirtilen ��eleri listenin belirtilen konumuna eklemek i�in kullan�l�r.
void clear()											Listedeki t�m elemanlar� silmek i�in kullan�l�r.
boolean equals(Object o)								Belirtilen nesneyi bir listenin ��eleriyle kar��la�t�rmak i�in kullan�l�r.
int hashcode()											listenin hash kodunu d�nd�r�r.
E get(int index)										Belirtilen konumdaki e�le�en ��eyi getirir.
boolean isEmpty()										Liste bo�sa true, di�er durumda false d�nd�r�r.
int lastIndexOf(Object o)								Belirtilen ��enin son tekrarland��� durumun bu listesindeki dizini veya liste bu ��eyi i�ermiyorsa -1�i d�nd�rmek i�in kullan�l�r.
Object[] toArray()										Bu listedeki t�m ��eleri i�eren bir diziyi do�ru s�rayla d�nd�rmek i�in kullan�l�r.
<T> T[] toArray(T[] a)									Bu listedeki t�m ��eleri i�eren bir diziyi do�ru s�rayla d�nd�rmek i�in kullan�l�r.
boolean contains(Object o)								Liste belirtilen ��eyi i�eriyorsa true de�erini d�nd�r�r
boolean containsAll(Collection<?> c)					Liste belirtilen t�m ��eleri i�eriyorsa true de�erini d�nd�r�r
int indexOf(Object o)									Belirtilen ��enin ilk olu�umunun bu listesindeki dizini veya Liste bu ��eyi i�ermiyorsa -1�i d�nd�rmek i�in kullan�l�r.
E remove(int index)										Listede belirtilen konumda bulunan eleman� ��karmak i�in kullan�l�r.
boolean remove(Object o)								Belirtilen ��e ile e�le�en ilk eleman� kald�rmak i�in kullan�lr.
boolean removeAll(Collection<?> c)						Listedeki t�m elemanlar� kald�rmak i�in kullan�l�r.
void replaceAll(UnaryOperator<E> operator)				Listedeki t�m ��eleri belirtilen ��eyle de�i�tirmek i�in kullan�l�r.
void retainAll(Collection<?> c)							Listedeki belirtilen koleksiyonda bulunan t�m ��eleri tutmak i�in kullan�l�r.
E set(int index, E element)								Listede, belirtilen konumda bulunan belirtilen ��eyi de�i�tirmek i�in kullan�l�r.
void sort(Comparator<? super E> c)						Listedeki ��eleri belirtilen kar��la�t�r�c�ya g�re s�ralamak i�in kullan�l�r.
Spliterator<E> spliterator()							Listedeki ��eler �zerinde ay�r�c� olu�turmak i�in kullan�l�r.		
List<E> subList(int fromIndex, int toIndex)				Verilen aral�ktaki t�m unsurlar� getirmek i�in kullan�l�r.
int size()												Verilen aral�ktaki t�m unsurlar� getirmek i�in kullan�l�r�.		
		
		
		
		
		
		
		
		
		
		
		
		
	*/	
	}

}
