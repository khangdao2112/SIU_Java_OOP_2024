package oop.tuan1;

import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        //Tao mang 10 phan tu
        int[] arr = new int[10];

        //Nhap phan tu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 10 phan tu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]:");
            arr[i] = sc.nextInt();
        }

        //In mang vua nhap
        System.out.println("Mang vua nhap la: " + Arrays.toString(arr));

        //Sort mang
        Arrays.sort(arr);

        //In mang vua sort
        System.out.println("Mang sau khi da sort: " + Arrays.toString(arr));
    }
}
