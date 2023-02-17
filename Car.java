public class Car {

    String model;
    int year;
    double price;
    String color;
    int power;
    boolean status;
    boolean trunk;

    Car(String model, int year, double price, String color, int power) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.status = false;
        this.trunk = true;
    }

    public void getInfo() {
        System.out.println(model + " " + year + " " + price + " " + color + " " + power);
    }

    public void powerCare() {
        this.status = true;
        System.out.println("Автомобиль заведен");
    }

    public void stopCare() {
        this.status = false;
        System.out.println("Автомобиль не заведен");
    }

    public void road(String address) {
        if (status == false) {
            System.out.println("Автомобиль не заведен, мы не можем ехать");
        }
        else {
            System.out.println("Мы едем по адресу: " + address);
        }
    }

    public void shop() {
        if (trunk == true) {
            System.out.println("В магазин не получится заехать, в багажнике нет места!");
        }
        else {
            System.out.println("Заедем в магазин за фруктами");
        }
    }

    public void freetrunk() {
        this.trunk = false;
        System.out.println("Освобождаем багажник для поездки в магазин");
    }
}