package Practice.MapsMethods;

import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {

        HashMap<Integer,String> hm1=new HashMap<>();
        hm1.put(101, "Ali Han"); // Eleman eklemek için kullanılır.
        hm1.put(102, "veli Can");
        hm1.put(103, "Ayşe Tan");

        System.out.println("Hahmap in ilk hali : " + hm1);
        // Hahmap in ilk hali : {101=Ali Han, 102=veli Can, 103=Ayşe Tan}

        hm1.put(101, "Kemal Yıldız"); // Aynı key kullanıldığında eski kaydın üzerine yazar.
        System.out.println(hm1);
        // {101=Kemal Yıldız, 102=veli Can, 103=Ayşe Tan}

        hm1.put(104, "veli Can"); // Tekrarlı key e izin vermez ancak tekrarlı value ye izin verir.
        System.out.println(hm1);
        // {101=Kemal Yıldız, 102=veli Can, 103=Ayşe Tan, 104=veli Can}

        hm1.put(null, "merve aslan");
        System.out.println(hm1);
        // {null=merve aslan, 101=Kemal Yıldız, 102=veli Can, 103=Ayşe Tan, 104=veli Can}

        hm1.put(null,"hakan inal"); // null olan merve aslan ile degistirir...
        System.out.println(hm1);
        // {null=hakan inal, 101=Kemal Yıldız, 102=veli Can, 103=Ayşe Tan, 104=veli Can}

        hm1.put(105,null); // value de 1 den fazla alabilir...
        System.out.println(hm1);
        // {null=hakan inal, 101=Kemal Yıldız, 102=veli Can, 103=Ayşe Tan, 104=veli Can, 105=null}

        hm1.put(106,null); // value de 1 den fazla alabilir...
        System.out.println(hm1);
        // {null=hakan inal, 101=Kemal Yıldız, 102=veli Can, 103=Ayşe Tan, 104=veli Can, 105=null, 106=null}

        System.out.println(hm1.get(103)); // Ayşe Tan

        System.out.println(hm1.values()); // key haric value leri verir
        // [hakan inal, Kemal Yıldız, veli Can, Ayşe Tan, veli Can, null, null]

        System.out.println(hm1.keySet()); // value ler haric tum keyleri getirir..
        // [null, 101, 102, 103, 104, 105, 106]

        hm1.putIfAbsent(104, "kubilay tuncel"); // Belirtilen key e ait key ve value oldugu icin eklemedi. Yoksa ekle...
        System.out.println(hm1);
        // {null=hakan inal, 101=Kemal Yıldız, 102=veli Can, 103=Ayşe Tan, 104=veli Can, 105=null, 106=null}

        System.out.println(hm1.putIfAbsent(107, "hakan tetik")); // null
        System.out.println(hm1);
        // {null=hakan inal, 101=Kemal Yıldız, 102=veli Can, 103=Ayşe Tan, 104=veli Can, 105=null, 106=null, 107=hakan tetik}

        hm1.putIfAbsent(105, "faruk efehan");
        System.out.println(hm1); // {null=hakan inal, 101=Kemal Yıldız, 102=veli Can, 103=Ayşe Tan, 104=veli Can, 105=faruk efehan, 106=null, 107=hakan tetik}

        System.out.println("1. mapin eleman sayısı :"+hm1.size()); // 1. mapin eleman sayısı :8

        HashMap<Integer,String>hm2=new HashMap<>();
        hm2.put(107, "elma");
        hm2.put(106, "Armut");
        hm2.put(200, "mandalina");

        System.out.println("2. mapin eleman sayısı :"+hm2.size()); // 2. mapin eleman sayısı :3

        hm1.putAll(hm2);

        System.out.println(hm1);
        // {null=hakan inal, 101=Kemal Yıldız, 102=veli Can, 103=Ayşe Tan, 104=veli Can, 200=mandalina, 105=faruk efehan, 106=Armut, 107=elma}

        System.out.println("1. mapin eleman sayısı :"+hm1.size()); // 1. mapin eleman sayısı :9
        //hm2.putAll(hm1);

        System.out.println(hm2);
        // {200=mandalina, 106=Armut, 107=elma}




    }

}

