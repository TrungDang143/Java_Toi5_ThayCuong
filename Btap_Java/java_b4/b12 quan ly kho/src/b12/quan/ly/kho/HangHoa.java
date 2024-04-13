/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b12.quan.ly.kho;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public abstract class HangHoa {
    private String maHang;
    private String tenHang;
    private int slt;
    private double donGia;
    private double VAT;
    private String nameChild;

    public HangHoa() {
        maHang = "";
        tenHang = "";
        slt = -1;
        donGia = 0;
        nameChild = getClass().getSimpleName();
    }

    public HangHoa(String maHang, String tenHang, int slt, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.slt = slt;
        this.donGia = donGia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public int getSlt() {
        return slt;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getVAT() {
        return VAT;
    }
    
    
    public abstract String danhGia();

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        String ma = "";
        do{
            System.out.print(" - Nhap ma hang: ");
            ma = sc.nextLine();

        }while(Kho.checkTonTai(ma, nameChild));
        maHang = ma;
        
        while(tenHang.isBlank()){
            System.out.print(" - Nhap ten hang: ");
            tenHang = sc.nextLine();
        }
        
        while(slt < 0){
            System.out.print(" - Nhap so luong ton: ");
            slt = sc.nextInt();
        }
        while(donGia == 0){
            System.out.print(" - Nhap don gia: ");
            donGia = sc.nextDouble();   
        }
    }
    
    public void randomDATA(){
        Random rand = new Random();
        maHang = "mah"+(rand.nextInt(20)+1);
        tenHang = "hanghoa"+rand.nextInt(100);
        slt = rand.nextInt(100);
        donGia = (rand.nextDouble()+1)*100;
    }
    
    public boolean checkTonTai(HangHoa[] dshh, int n){
        for (int i = 0; i<n; i++) {
            if(dshh[i].getMaHang().compareTo(getMaHang()) == 0)
                return false;
        }
        return true;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HangHoa other = (HangHoa) obj;
        return Objects.equals(this.maHang, other.maHang);
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %8d %10.2f %10.2f%%", maHang, tenHang, slt, donGia, VAT);
    }
    
    
    
}
