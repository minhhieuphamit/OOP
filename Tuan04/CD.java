package Tuan04;

import java.util.Scanner;

public class CD {
    private int maCD, soBaiHat;
    private String tenCD, caSi;
    private float giaThanh;

    public CD() {
    }

    public CD(int maCD, String tenCD, String caSi, int soBaiHat, float giaThanh) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.caSi = caSi;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma CD: ");
        maCD = sc.nextInt();
        System.out.print("Nhap ten CD: ");
        tenCD = sc.nextLine();
        tenCD = sc.nextLine();
        System.out.print("Nhap ten ca si: ");
        caSi = sc.nextLine();
        System.out.print("Nhap so bai hat: ");
        soBaiHat = sc.nextInt();
        System.out.print("Nhap gia thanh: ");
        giaThanh = sc.nextFloat();
    }

    public void xuat(){
        System.out.printf("%-10d%-20s%-20s%-10d%-10.2f\n", maCD, tenCD, caSi, soBaiHat, giaThanh);
    }

    public String toString(){
        return String.format("%-10d%-20s%-20s%-10d%-10.2f\n", maCD, tenCD, caSi, soBaiHat, giaThanh);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CD) {
            CD cd = (CD) obj;
            return this.maCD == cd.maCD;
        }
        return false;
    }
}
