package oop.tuan1;

import java.util.Arrays;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        //Tao mang
        int[] arr;

        //Nhap so phan tu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = sc.nextInt();
        arr = new int[n];

        //Nhap phan tu
        System.out.println("Nhap phan tu dang char: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: ");
            char c = sc.next().charAt(0);
            arr[i] = (int) c;
        }

        //Xuat phan tu gom ma cua ki tu
        System.out.println("Mang vua nhap chua ma cua cac ki tu vua nhap: " + Arrays.toString(arr));
    }
}
