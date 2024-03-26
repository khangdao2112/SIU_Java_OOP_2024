package oop.tuan2.bai2;

import java.util.Arrays;
import java.util.Scanner;

public class Mang {
    //attributes
    private int soPhanTu;
    private int[] arr;
    private int size;

    //setters
    public void setSoPhanTu(int soPhanTu) {
        this.soPhanTu = soPhanTu;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public void setSize(int size) {
        this.size = size;
    }

    //getters
    public int getSoPhanTu() {
        return soPhanTu;
    }
    public int[] getArr() {
        return arr;
    }
    public int getSize() {
        return size;
    }

    //methods
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        this.soPhanTu = sc.nextInt();
        this.arr = new int[this.soPhanTu];
        System.out.println("Nhap cac phan tu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }

    public void output() {
        System.out.println("Mang: " + Arrays.toString(arr));
    }

    public float averageOddNumbers() {
        float sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
                count++;
            }
        }
        return sum / count;
    }

    public int maxValue() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                max = arr[i];
            }
        }
        return max;
    }

    public void sortAscending() {
        Arrays.sort(arr);
    }
}
