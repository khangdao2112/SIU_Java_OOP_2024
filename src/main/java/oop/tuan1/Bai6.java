package oop.tuan1;

public class Bai6 {
    public static void main(String[] args) {
        //In binh phuong so 1-10
        System.out.println("Binh phuong cac so tu 1 den 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "^2" + " : " + (int)(Math.pow(i,2)));
        }

        //In lap phuong so 1-10
        System.out.println("\nLap phuong cac so tu 1 den 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "^3" + " : " + (int)(Math.pow(i,3)));
        }
    }
}
