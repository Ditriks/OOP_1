public class lesson {
    public static void main(String[] args) { 
        Car car = new Car("Mazda", 5, 20.2, "red", 3);
        car.getInfo();
        car.road("Магадан");
        car.powerCare();
        car.road("Магадан");
        car.shop();
        car.freetrunk();
        car.shop();

    }
}
