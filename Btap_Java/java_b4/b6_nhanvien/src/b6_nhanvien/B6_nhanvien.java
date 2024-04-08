/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b6_nhanvien;


import java.util.Scanner;


/**
 *
 * @author ddtru
 */
public class B6_nhanvien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        
        NhanVien[] ds = new NhanVien[n];
        
        for(int i = 0; i<n; i++)
        {
            System.out.println(" - Nhap thong tin nhan vien " + (i+1));
            
            System.out.print("Nhap ma nhan vien: ");
            String manv = sc.nextLine();
            
            int sosp = 0;
            do{
                System.out.print("Nhap so san pham (sosp > 0): ");
                sosp = sc.nextInt();
            }while(sosp <= 0);
            
            ds[i] = new NhanVien();
            ds[i].setMaNV(manv);
            ds[i].setSoSP(sosp);
            
        }
        xuatTieuDe("THONG TIN NHAN VIEN");
        inDS(ds, n, false);
        
        xuatTieuDe("THONG TIN NHAN VIEN VUOT CHUAN");
        inDS(ds, n, true);
    }
    public static void xuatTieuDe(String s){
        System.out.printf("%\t\ts\n%-10s %10d %15d %8s\n",s, "Ma NV", "So SP", "Luong", "Tong ket");
    }
    public static void inDS(NhanVien[] ds, int n, boolean vuotChuan){
        for(int i = 0; i<n; i++)
        {
            String s = "";
            if (!vuotChuan)
                s = ds[i].toString();
            else if(ds[i].coVuotChuan()) 
                s = ds[i].toString();

            System.out.println(s);
        }
    }
}
