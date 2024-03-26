package oop.tuan1;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr;

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

        System.out.println("Nhap hang thu k can tinh tong: ");
        int k = sc.nextInt();
        System.out.print("Tong hang thu " + k + " = ");
        int sum = 0;
        for (int i = 0; i < m; i++) {
            System.out.print(arr[k-1][i] + " + ");
            sum += arr[k-1][i];
        }
        System.out.println(" = " + sum);
    }
}
