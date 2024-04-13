/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b12.quan.ly.kho;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class Kho {
    private static HangTP[] khoTP;
    private static HangDM[] khoDM;
    private static HangSS[] khoSS;
    private static int nTP = 0, nDM = 0, nSS = 0;

    public Kho() {
        khoTP = new HangTP[nTP];
        khoDM = new HangDM[nDM];
        khoSS = new HangSS[nSS];
    }

    public Kho(HangTP[] khoTP, HangDM[] khoDM, HangSS[] khoSS, int nTP, int nDM, int nSS) {
        this.khoTP = khoTP;
        this.khoDM = khoDM;
        this.khoSS = khoSS;
        this.nTP = nTP;
        this.nDM = nDM;
        this.nSS = nSS;
    }
    
    public void randomDATA(){
        Random rand = new Random();
        nTP = rand.nextInt(20)+1;
        nDM = rand.nextInt(20)+1;
        nSS = rand.nextInt(20)+1;
        
        khoTP = new HangTP[nTP];
        khoDM = new HangDM[nDM];
        khoSS = new HangSS[nSS];
        
        for(int i = 0; i<nTP; i++){           
            HangTP newHang = new HangTP();
            do{
                newHang.randomDATA();            
            }while(checkTonTai(newHang.getMaHang(), "HangTP"));
            khoTP[i] = new HangTP();
            khoTP[i] = newHang;
        }
        for(int i = 0; i<nDM; i++){
            HangDM newHang = new HangDM();
            do{
                newHang.randomDATA();            
            }while(checkTonTai(newHang.getMaHang(), "HangDM"));
            khoDM[i] = new HangDM();
            khoDM[i] = newHang;
        }
        for(int i = 0; i<nSS; i++){
            HangSS newHang = new HangSS();
            do{
                newHang.randomDATA();            
            }while(checkTonTai(newHang.getMaHang(), "HangSS"));
            khoSS[i] = new HangSS();
            khoSS[i] = newHang;
        }
    }
    
    public void menu(){
        while (true) {            
            System.out.println("======================== MENU ========================");
            System.out.println("\t\t1. Nhap hang");
            System.out.println("\t\t2. Xuat danh sach");
            System.out.println("\t\t3. Thoat");
            System.out.print("\t\t --> Nhap lua chon: ");
            
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    System.out.println("--> Thoat");
                    return;
            }
        }
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        int lc = 0;
        while(!(lc == 1 || lc == 2 || lc == 3)){
            System.out.println(" --> Lua chon loai hang:");
            System.out.println("\t\t1. Hang thuc pham");
            System.out.println("\t\t2. Hang dien may");
            System.out.println("\t\t3. Hang sanh su");
            System.out.print("\t\t --> Nhap lua chon: ");
            
            lc = sc.nextInt();
        }
        System.out.print(" - Nhap so luong mat hang: ");
        if(lc == 1){
            nTP = sc.nextInt();
            khoTP = new HangTP[nTP];
            for(int i = 0; i<nTP; i++){
                System.out.println(" --> Nhap thong tin mat hang thu "+(i+1));
                khoTP[i] = new HangTP();
                khoTP[i].nhap();
            }
        }
        else if (lc == 2){
            nDM = sc.nextInt();
            khoDM = new HangDM[nDM];
            for(int i = 0; i<nDM; i++){
                System.out.println(" --> Nhap thong tin mat hang thu "+(i+1));
                khoDM[i] = new HangDM();
                khoDM[i].nhap();
            }
        }
        else{
            nSS = sc.nextInt();
            khoSS = new HangSS[nSS];
            for(int i = 0; i<nSS; i++){
                System.out.println(" --> Nhap thong tin mat hang thu "+(i+1));
                khoSS[i] = new HangSS();
                khoSS[i].nhap();
            }
        }
        
    }
        
    public static boolean checkTonTai(String ma, String loai){
        int sl = 0;
        HangHoa hh[] = new HangHoa[sl];
        if(ma.isEmpty())
            return false;
        if(loai.compareTo("HangTP") == 0)
        {
            sl = nTP;
            hh = new HangTP[sl];
            hh = khoTP;
        }    
        else if(loai.compareTo("HangDM") == 0)
        {
            sl = nDM;
            hh = new HangDM[sl];
            hh = khoDM;
        }
        else if(loai.compareTo("HangSS") == 0)
        {
            sl = nSS;
            hh = new HangSS[sl];
            hh = khoSS;
        }
        for (int i = 0; i<sl; i++) {
            if(hh[i] == null)
                return false;
            if(hh[i].getMaHang().isEmpty() == true)
                return false;
            if(ma.compareTo(hh[i].getMaHang()) == 0)
                return true;
        }
        return false;
    }
    
    public void xuat(){
        System.out.println("\n\t\t\t\t======================== QUAN LY KHO ========================");
        xuatDATA(khoTP, nTP, 1);
        xuatDATA(khoDM, nDM, 2);
        xuatDATA(khoSS, nSS, 3);
        
    }
    public void xuatTD(int loai){
        if(loai == 1)
            System.out.printf("\n ** %s **\n%-10s %-15s %8s %10s  %10s %15s %15s %20s %15s\n", "Hang Thuc Pham", "Ma hang", "Ten hang", "SL ton", "Don gia", "VAT", "NSX", "HSD", "NCC", "Danh gia");
        else if(loai == 2)
            System.out.printf("\n ** %s **\n%-10s %-15s %8s %10s  %10s %18s %21s %15s\n", "Hang Dien May", "Ma hang", "Ten hang", "SL ton", "Don gia", "VAT", "kW", "TGBH", "Danh gia");
        else
            System.out.printf("\n ** %s **\n%-10s %-15s %8s %10s  %10s %15s %20s %15s\n", "Hang Sanh Su", "Ma hang", "Ten hang", "SL ton", "Don gia", "VAT", "Ngay nhap", "NSX", "Danh gia");
    }
    public void xuatDATA(HangHoa[] ds, int n, int loai){
        xuatTD(loai);
        for(int i = 0; i<n; i++){
            System.out.println(ds[i].toString());
        }
    }
    
}
