package view;

import bean.Car;

public class Ex01CarDemo {
    public static void main(String[] args) {
        // Tạo n đối tượng car
        Car car1 = new Car();
        car1.setId("C1");
        car1.setModel("MG5");
        car1.setColor("Red");
        car1.setSalesPrice(550d);


        Car car2 = new Car("C2","Toyota Cross","Black",800d);

        Car car3 = new Car("C3","HondaCRV","White",808d);

        Car car4 = new Car("C4","HuynhDai Creta","Red",620d);

        // Phân biệt khi nào dùng constructor, getter và setter

        // Tại sao phải khai báo thuộc tính của class là private, rồi sau đó dùng getter và setter để truy cập mà không khai báo thẳng thuộc tính là public để code cho ngawns gọn

        System.out.println("C1 ---> " + car1);

        System.out.println("C2 ---> " + car2);

        System.out.println("C3 ---> " + car3);

        System.out.println("C4 ---> " + car4);
    }
}
