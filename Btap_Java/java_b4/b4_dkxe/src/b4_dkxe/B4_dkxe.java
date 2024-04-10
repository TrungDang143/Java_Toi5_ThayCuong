/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b4_dkxe;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class B4_dkxe {

    /**
     * @param args the command line arguments
     */
    private static boolean tontai = false;
    private static  Xe[] ds = new Xe[100];
    private static int n;
    private static Scanner sc = new Scanner(System.in);
    
    public static void nhapDS()
    {
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

        System.out.print("\nNhap so luong xe: ");
        n = sc.nextInt();
        ds = new Xe[n];
        for (int i = 0; i<n; i++)
        {
            System.out.println("\n- Nhap thong tin xe "+(i+1));
            ds[i] = new Xe();
            ds[i].nhap();
        }
        tontai = true;
    }
    
    public static void inDS()
    {
        if(tontai == false)
        {
            System.out.println("--> Chua co danh sach xe. Quay lai MENU");
            return;
        }
        //"%25s %10s %-10d %-15.2f %-15.2f", chuxe, loaixe, dungtich, gt, thue());
        System.out.printf("\n%-20s %-15s %10s %15s %15s\n", "Ten chu xe", "Loai xe", "Dung tich", "Gia tri", "Thue");
        System.out.println("*******************************************************************************");

        for (int i = 0; i<n; i++)
        {
            System.out.println(ds[i].toString());
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
   
        while (true) {
            System.out.println("\n************************************");
            System.out.println("\t\tMENU");
            System.out.println("1. Nhap danh sach xe");
            System.out.println("2. Xuat danh sach xe");
            System.out.println("3. Thoat");
            System.out.print("--> Nhap lua chon cua ban: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    nhapDS();
                    break;
                case 2:
                    inDS();
                    break;
                case 3:
                    System.out.println("--> Thoat");
                    return;
            }
        }
    }
    
}
