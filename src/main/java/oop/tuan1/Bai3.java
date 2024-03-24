package oop.tuan1;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        //Tao scanner
        Scanner sc = new Scanner(System.in);

        //Tao bien mang so nguyen
        int[] arr;

        //Nhap so luong phan tu
        System.out.println("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        arr = new int[n];

        //Nhap gia tri tung phan tu
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
            System.out.println();
        }

        //Xuat phan tu
        System.out.println("Mang vua nhap: " + Arrays.toString(arr));
    }
}