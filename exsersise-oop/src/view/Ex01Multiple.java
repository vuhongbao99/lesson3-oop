package view;

import java.util.Scanner;

public class Ex01Multiple {
    public static void main(String[] args) {
        //Nhaapjp N là số nguyên dương được nhập từ bàn phím
        // bắt buộc nhập lại nếu N không hợp lệ (tối đa 5 lần )

        Scanner ip = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        String text = ip.nextLine();

        int wrongTime = 0;
        final int maxWrongTime = 5;


        while (true){
            if (isNumber(text)){
                break;
            }
            wrongTime++;
            if (wrongTime == maxWrongTime){
                System.out.println("Chương trình bị khóa");
                return;
            }
            System.out.println("please enter a valid number( "+ wrongTime + ") : ");
            text = ip.nextLine();
        }

        int number = Integer.parseInt(text);
        System.out.println("number --> : " +number);
    }

    private static boolean isNumber(String text){
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if(!Character.isDigit(letter)){
                return false;
            }
        }
        return Integer.parseInt(text) > 0;
    }

}
