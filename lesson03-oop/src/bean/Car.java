package bean;

public class Car {
    // atribute
    // Sẽ được cấp phát, gán giá trị khi tạo ra đối tượng mới
    // mỗi đối tượng sẽ lưu trữ thông tin  riêng của các thuộc tính

    // oop : thì mỗi đối tượng() sẽ quản lý thông tin thuộc tính của riêng nó
    // accessmodifier : private
    private String id;
    private String model;
    private String color;
    private double salesPrice;

    public Car() {
    }

    // Construcsture wiith full parameter
    public Car(String id, String model, String color, double salesPrice) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.salesPrice = salesPrice;
    }

    // getter, setter
    // để các class bên ngoài có thể truy cập, thay đổi thuộc tính private  bên ngoài

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // to String

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", salesPrice=" + salesPrice +
                '}';
    }
}
