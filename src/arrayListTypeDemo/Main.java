package arrayListTypeDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Kayseri");
        sehirler.add("Ankara");
        sehirler.add("Zonguldak");
        sehirler.add("Adana");

        sehirler.remove("Ankara");
        Collections.sort(sehirler);//sıralama

        for (String sehir : sehirler) {
            System.out.println(sehir);
        }
    }
}
