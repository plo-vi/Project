import model.Kotik;

import static model.Kotik.numb;

public class Application {
    public static void main(String[] args) {
        Kotik firstCat = new Kotik(50, "Sam", 3, "Meow meow");

        Kotik secondCat = new Kotik();
        secondCat.setPrettiness(80);
        secondCat.setName("Tom");
        secondCat.setWeight(2);
        secondCat.setMeow("Meeeoooow!");
        Kotik.liveAnotherDay();

        System.out.println("My name is " + secondCat.getName() + ", my weight is " + secondCat.getWeight() + "kg");
        System.out.println(secondCat.getMeow() == firstCat.getMeow());
        System.out.println("There are " + numb + " cats!");
    }
}
