package at.mes.basic.oop.examples.cars;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {

        Engine engine = new Engine(150, Engine.TYPE.Benzin);
        Engine engine2 = new Engine(200, Engine.TYPE.Diesel);

        Car car = new Car("Red", 25000, 200, 20000, 4, engine);
        Car car2 = new Car("Black", 2000, 300, 80000, 4, engine2);

        ArrayList<Car> carsArrayList = new ArrayList<>();
        carsArrayList.add(car);
        carsArrayList.add(car2);

        Producer producer = new Producer("Beer", "Austria", 10, carsArrayList);

        car.rPrice(producer);

        car.information(producer);

        System.out.println("Car 1: ");
        System.out.println("Basispreis: " + car.getBasisprice());
        System.out.println("Basisverbrauch: " + car.getBasisverbrauch());
        System.out.println("Farbe: " + car.getColor());
        System.out.println("Distanz: " + car.getDistance());
        System.out.println("Max speed: " + car.getMaxspeed());
        System.out.println("Horsepower: " + car.getEngine().getHorsepower());
    }
}
