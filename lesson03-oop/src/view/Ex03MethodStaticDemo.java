package view;

import bean.Tuple;

public class Ex03MethodStaticDemo {
    /*
    * [static] vs [non-static]
    * +atribute : Nếu 1 giá trị dùng chung cho tất cả các đối tượng class thì ==> static
    * khng phụ thuộc vào đối tượng đang gọi nó
    * => Thuộc tính mà mỗi đối tượng lưu trữ / quản lý riêng một vùng nhớ thì dùng non-static
    * Phụ thuoocj vào đối tượng đang gọi nó
    * VD : Car: id, model(static)  tùy bài toán
    *
    *
    * + method :
    *  => sử dụng tạo ra static method khi nó không phụ thuộc vào đối tượng đang gọi
    *
    * => nếu phụ thuộc vào đối tượng đang gọi thì dùng non-static
    * */

    public static void main(String[] args) {
        int m = 6;
        int n = 8;

//        Ex03MethodStaticDemo ms1 = new Ex03MethodStaticDemo();
        System.out.println("ms1 - > " + Ex03MethodStaticDemo.sum(m, n));

//        Ex03MethodStaticDemo ms2 = new Ex03MethodStaticDemo();
        System.out.println("ms2 - > " + Ex03MethodStaticDemo.sum(m, n));

        Tuple tuple1 = new Tuple(3, 2);
        System.out.println("tuple1 " + tuple1.sum());

        Tuple tuple2 = new Tuple(6, 7);
        System.out.println("tuple2 " + tuple2.sum());
    }

    // Hàm sum này nó chỉ phụ thuộc vào tham số truyền vào a, b
    // Không phụ thuộc vào đối tượng đang hỏi
    private static int sum( int a, int b) {
        return a + b;
    }

    // Bài toán tìm tổng 2 số
    // biến hàm Sum thành non-static method
}
