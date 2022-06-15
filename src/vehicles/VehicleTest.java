package vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        car.setName("GTO");
        System.out.print(car.getName() + " goes ");

        car.breakingDownNoise();

        CopCar helicopter = new CopCar();
        helicopter.setName("Cop Car");
        System.out.print(helicopter.getName() + " goes ");
        helicopter.makeNoise();
    }
}

