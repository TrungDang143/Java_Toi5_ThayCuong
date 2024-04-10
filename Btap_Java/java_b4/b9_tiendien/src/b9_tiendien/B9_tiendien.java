/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b9_tiendien;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class B9_tiendien {

    /**
     * @param args the command line arguments
     */
    static boolean tontai = false;
    static KhachHang[] ds = new KhachHang[100];
    static int n = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        while (true) {
            System.out.println("\n************************************");
            System.out.println("\t\tMENU");
            System.out.println("1. Nhap danh sach khach hang");
            System.out.println("2. Xuat danh sach khach hang");
            System.out.println("3. Hoa don trong thang 9/2023");
            System.out.println("4. Thoat");
            System.out.print("--> Nhap lua chon cua ban: ");
            
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    nhapDS();
                    break;
                case 2:
                    xuatDS("DANH SACH HOA DON");
                    break;
                case 3:
                    xuatDSthang9("DANH SACH HOA DON THANG 9");
                    break;
                case 4:
                    System.out.println("--> Thoat");
                    return;
            }
        }
    }
    
    public static void inTieuDe(String s) {
        System.out.printf("\n\t\t%s\n%-10s %-25s %-15s %15s %15s %10s %10s %10s %20s\n", s, "Ma KH", "Ho ten", "Ngay lap", "Quoc tich", "Doi tuong", "So luong", "Don gia", "Dinh muc", "Thanh tien");
    }

    public static void xuatDS(String s)
    {
        if(tontai == false)
        {
            System.out.println("--> Chua co danh sach. Quay lai MENU");
            return;
        }
        inTieuDe(s);
        double tong1 = 0, tong2 = 0, tt = 0;
        int khnn = 0;
        for (int i = 0; i<n; i++)
        {
            System.out.println(ds[i].toString());
            if(ds[i] instanceof KhachHangNgoai)
            {
                khnn++;
                tt += ds[i].thanhtien;
            }
        }

        System.out.printf("\n - Tong so kW cua khach noi: %.2f", tong1);
        System.out.printf("\n - Tong so kW cua khach ngoai: %.2f", tong2);
        System.out.printf("\n - Trung binh thanh tien khach nuoc ngoai: %.2f", tt/khnn);
    }

    public static void xuatDSthang9(String s)
    {
        if(tontai == false)
        {
            System.out.println("--> Chua co danh sach. Quay lai MENU");
            return;
        }
        inTieuDe("DANH SACH HOA DON THANG 9/2023");
        double tong1 = 0, tong2 = 0, tt = 0;
        int khnn = 0;
        boolean check = false;
        for (int i = 0; i<n; i++)
        {
            if(ds[i].ngayDate.getNam() == 2023 && ds[i].ngayDate.getThang() == 9)
            {
                System.out.println(ds[i].toString());
                khnn++;
                tt += ds[i].thanhtien;
                check = true;
            }
        }
        if(!check){
            System.out.println("\n --> KHONG CO THONG TIN");
        }
        else{
            System.out.printf("\n - Tong so kW cua khach noi: %.2f", tong1);
            System.out.printf("\n - Tong so kW cua khach ngoai: %.2f", tong2);
            System.out.printf("\n - Trung binh thanh tien khach nuoc ngoai: %.2f", tt/khnn);
        }
    }

    public static void nhapDS()
    {
        Scanner sc = new Scanner(System.in);
        if (tontai == true)
        {
            while(true){
               System.out.print("--> Danh sach da ton tai, nhap danh sach moi? (Y/N): ");
               String input = sc.next();

               input = input.toUpperCase();

               if (input.equals("N")) {
                   System.out.println("--> Quay lai MENU");
                   return;
               } else if (input.equals("Y")) 
                   break;   
            }
        }
        
        tontai = true;
        System.out.println("--> Nhap so luong khach: ");
        n = sc.nextInt();

        for(int i = 0; i<n; i++)
        {
            System.out.println(" --> Nhap thong tin khach thu "+(i+1));
            byte lc;
            while (true) {                
                System.out.print("\tKhach hang:\n\t1. Trong nuoc\n\t2. Ngoai quoc\n\t--> Nhap lua chon: ");            
                try{
                    lc = sc.nextByte();
                    break;
                }
                catch(Exception e){
                    System.out.println("--> Nhap lua chon 1 hoac 2");
                }
            }
            
            if(lc==1)
            {
                ds[i] = new KhachHangNoi();
            }
            else{
                ds[i] = new KhachHangNgoai();
            }
            ds[i].nhap();
        }
    }  
    
}
