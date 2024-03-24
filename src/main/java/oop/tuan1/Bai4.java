package oop.tuan1;

import java.lang.Math;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        //Tao mang 2 chieu
        int[][] arr;

        //Tao scanner
        Scanner sc = new Scanner(System.in);

        //Nhap so dong va cot
        System.out.println("Nhap so dong: ");
        int n = sc.nextInt();
        System.out.println("Nhap so cot: ");
        int m = sc.nextInt();
        arr = new int[n][m];

        //Nhap gia tri ngau nhien
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int)(Math.random() * 100);
            }
        }

        //Xuat mang
        System.out.println("\nMang duoc khoi tao: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
