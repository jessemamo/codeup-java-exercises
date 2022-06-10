package oop;

public class DishTools {

    final static int AVG_COST_OF_DISH_IN_CENTS = 13000;


    public static void shoutDishName(Dish dish) {
        System.out.println(dish.getNameOfDish().toUpperCase());
    }

    public static void analyseDishCost(Dish dish) {
        String prefix = "Less";

        if(AVG_COST_OF_DISH_IN_CENTS < dish.getCostInCents()) {
            prefix = "More";
        }

        System.out.println(prefix + " expensive than average");

    }

    public static void flipRecommendation(Dish dish) {
        dish.setWouldRecommend(!dish.isWouldRecommend());
    }

}

