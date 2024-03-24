package oop.tuan1;

public class Bai5 {
    public static void main(String[] args) {
        //In bang cuu chuong tu 2 den 9
        for (int i = 2; i <= 9; i++) {
            System.out.println("Bang cuu chuong " + i + ": ");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
