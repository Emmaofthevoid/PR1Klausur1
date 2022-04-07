package at.campus02.iwi.cookathome;

public class CookSubscription {
    String firstBox(int age, boolean vegan, boolean veggie, int activePerWeek) {
        if (vegan) {
            return "Vegan";
        } else if (veggie) {
            return "Veggie";
        } else if (activePerWeek >= 4 && age <= 60) {
            return "Fish";
        } else if (age <= 20 || age > 60) {
            return "Veggie";
        } else {
            return "Vegan";
        }
    }

    double[] suggestPrice(String box, int age) {

        double[] price = new double[2];

        if (box.equals("Fish")) {
            if (age <= 25)
                price[0] = 39.90;
            else {
                price[0] = 49.90;
            }
            price[1] = 80;
        }
        if (box.equals("Veggie")) {
            if (age <= 25 || age > 60) {
                price[0] = 19.90;
            } else {
                price[0] = 29.90;
            }
            price[1] = 42;
        }
        if (box.equals("Vegan")) {
            if (age < 30) {
                price[1] = 45;
            } else {
                price[1] = 49.90;
            }
            price[0] = 15;
        }
        return price;
    }

}
