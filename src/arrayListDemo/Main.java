package arrayListDemo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("kayseri");
        //System.out.println(sayilar.size());

        // sayilar.set(1,100);
        // System.out.println(sayilar.get(1));
        sayilar.remove(2);
        System.out.println(sayilar.get(2));

        sayilar.clear(); //diziyi tamamen temizler
        System.out.println(sayilar.get(0));


    }
}
