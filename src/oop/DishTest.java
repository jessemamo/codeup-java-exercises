package oop;

public class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish();

        dish1.setNameOfDish("Fried Chicken");
        dish1.setCostInCents(1000);
        dish1.setWouldRecommend(true);

        dish1.printSummary();


        Dish dish2 = new Dish(1000,"Cat food",false);


        dish2.printSummary();


        DishTools.shoutDishName(dish2);

        DishTools.analyseDishCost(dish2);

        Dish dish3 = new Dish(15000, "Dog food", false);

        DishTools.analyseDishCost(dish3);

        DishTools.flipRecommendation(dish3);

        dish3.printSummary();



    }
}
