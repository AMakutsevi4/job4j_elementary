package ru.job4j.oop;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Марка", "Модель");
        Car.Transmission transmission = car.new Transmission();
        Car.Brakes brakes = car.new Brakes();
        Car.TripComputer tripComputer = car.new TripComputer();
        car.startEngine();
        transmission.accelerate();
        brakes.brake();
        tripComputer.getInfo();
    }
}
