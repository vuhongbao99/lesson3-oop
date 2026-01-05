package view;

import bean.Car;

public class Ex02CarStaticDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setId("C1");
        car1.setModel("Audi");
        car1.setColor("Red");
        car1.setSalesPrice(550d);


        Car car2 = new Car("C2","Audi","Black",800d);

        Car car3 = new Car("C3","Audi","White",808d);

        Car car4 = new Car("C4","Audi","Red",620d);


        System.out.println("C1 ---> " + car1);

        System.out.println("C2 ---> " + car2);

        System.out.println("C3 ---> " + car3);

        System.out.println("C4 ---> " + car4);
    }
}
