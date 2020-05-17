public class Main {
    public static void main(String[] args) {
        Car car1=CarInfoFactory.getCar (Car.BENZ);
        Car car2=CarInfoFactory.getCar (Car.BMW);
        Car car3=CarInfoFactory.getCar (Car.FERRARI);
        Car car4=CarInfoFactory.getCar (Car.TOYOTA);

        System.out.println("Benz");
        car1.information();
        System.out.println("\n\rBmw");
        car2.information();
        System.out.println("\n\rFerrari");
        car3.information();
        System.out.println("\n\rToyota");
        car4.information();
    }
}
