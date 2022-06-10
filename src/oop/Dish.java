package oop;

public class Dish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public Dish() {};

    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary() {
        System.out.printf("%n Cost: %d %n Name: %s %n Recommended: %b %n",costInCents, nameOfDish, wouldRecommend);
    }

    public int getCostInCents() {
        return costInCents;
    }

    public Dish setCostInCents(int costInCents) {
        this.costInCents = costInCents;
        return this;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public Dish setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
        return this;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public Dish setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
        return this;
    }
}
