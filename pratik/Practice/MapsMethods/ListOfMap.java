package Practice.MapsMethods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class  ListOfMap {
    public static void main(String[] args) {
        //MAplarde bir keye karşılık birden fazla value olabilir mi?

			/*  meyveler	--> elma
								armut
								çilek
				sebzeler	--> kabak
								patlıcan
								marul
								ıspanak

				vitaminler		a
								b
								c
								d

								*/

        HashMap<String, List<String>> karisik =new HashMap<>();

			/*
			List<String>meyveler=new ArrayList();
			meyveler.add("elma");
			meyveler.add("armut");
			meyveler.add("çilek");
			System.out.println(meyveler);
			*/

        List<String> meyveler= Arrays.asList("elma","armut","çilek");
        karisik.put("meyveler",meyveler );

        List<String> sebzeler=Arrays.asList("kabak","patlıcan","marul","ıspanak");
        karisik.put("sebzeler", sebzeler);

        List<String> vitaminler=Arrays.asList("a","b","c","d");
        karisik.put("vitaminler", vitaminler);
        System.out.println(karisik);
        // {sebzeler=[kabak, patlıcan, marul, ıspanak], meyveler=[elma, armut, çilek], vitaminler=[a, b, c, d]}

        System.out.println(karisik.get("sebzeler").get(1)); // patlican

    }

}