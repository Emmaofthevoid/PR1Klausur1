package at.campus02.iwi.cookathome;

import java.util.Arrays;

public class CookApp {
    public static void main(String[] args) {
        CookSubscription box1 = new CookSubscription();
        CookSubscription box2 = new CookSubscription();
        CookSubscription box3 = new CookSubscription();

        System.out.println(box1.firstBox(25,true,false,4));
        System.out.println( box2.firstBox(56,false,false,5));
        System.out.println( box3.firstBox(30,false,true,7));

        System.out.println(Arrays.toString(box1.suggestPrice("Vegan",30)));
        System.out.println(Arrays.toString(box2.suggestPrice("Veggie", 46)));
        System.out.println(Arrays.toString(box3.suggestPrice("Fish",15)));
    }
}
