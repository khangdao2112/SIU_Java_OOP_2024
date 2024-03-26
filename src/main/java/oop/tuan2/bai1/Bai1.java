package oop.tuan2.bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        //init object
        HocSinh hs1 = new HocSinh();

        //input output
        hs1.input();
        hs1.output();
        hs1.rank();

        //doi ten hoc sinh tu ban phim
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        System.out.println("Nhap ten moi: ");
        String newName = sc.next();
        sc.nextLine();
        hs1.setHoTen(newName);
        hs1.output();

        //nhap them hoc sinh
        HocSinh hs2 = new HocSinh();
        hs2.input();
        hs2.output();

        //In ra ten hoc sinh co diem trung binh lon hon
        if (hs1.getDiemTB() > hs2.getDiemTB()) {
            System.out.println(hs1.getHoTen() + " co diem trung binh lon hon");
        } else if (hs1.getDiemTB() < hs2.getDiemTB()) {
            System.out.println(hs2.getHoTen() + " co diem trung binh lon hon");
        } else
            System.out.println("Ca 2 co diem trung binh bang nhau");
    }
}
