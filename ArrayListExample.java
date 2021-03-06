import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> smartphoneBrand = new ArrayList<>();
        smartphoneBrand.add("Walton");
        smartphoneBrand.add("Nokia");
        smartphoneBrand.add("Samsung");
        smartphoneBrand.add("Symphony");
         
        System.out.println(smartphoneBrand); //  [Walton, Nokia, Samsung]

        smartphoneBrand.add(2, "Lava");

        System.out.println(smartphoneBrand); // [Walton, Nokia, Lava, Samsung, Symphony]
        
        String tmp = smartphoneBrand.get(1);
        System.out.println(tmp); // Nokia
        
        int arraysize = smartphoneBrand.size();
        System.out.println(arraysize); // 5
        
        smartphoneBrand.remove(0); 
        System.out.println(smartphoneBrand); // [Nokia, Lava, Samsung, Symphony]
        
        
        System.out.println( smartphoneBrand.contains("Nokia") ); // true
        
        System.out.println( smartphoneBrand.contains("nokia") ); // false
        
        Collections.sort(smartphoneBrand);
        System.out.println(smartphoneBrand); // [Lava, Nokia, Samsung, Symphony]
        
        smartphoneBrand.clear();
        System.out.println(smartphoneBrand); // []
    }
}
