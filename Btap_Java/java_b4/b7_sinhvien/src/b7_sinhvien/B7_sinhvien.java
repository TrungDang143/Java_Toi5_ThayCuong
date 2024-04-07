/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b7_sinhvien;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class B7_sinhvien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        
        SinhVien[] ds = new SinhVien[n];
        for (int i = 0; i< n;i++)
        {
            ds[i] = new SinhVien();
            System.out.println("Nhap thong tin nhan vien thu "+(i+1));
            ds[i].nhap();
        }

        tieude("THONG TIN NHAN VIEN");
        for (int i = 0; i< n;i++)
        {
            System.out.println(ds[i].toString());
        }
        
        mergeSort(ds, 0, n-1);
        tieude("THONG TIN NHAN VIEN SAP XEP");
        for (int i = 0; i< n;i++)
        {
            System.out.println(ds[i].toString());
        }
        
        
        sc.close();
    }
    
    public static void tieude(String s){
        //%7d %15s %-7.2f %-7.2f %-7.2f %10s
        System.out.printf("\n\t\t%s\n%-7s %-20s %10s %10s %10s %10s\n", s, "Ma sv", "Ho ten", "Diem LT", "Diem TH", "Diem TB", "Xep loai");
    }
    public static void mergeSort(SinhVien[] ds, int l, int r)
    {
        if (r > l)
        {
            int m = (l+r)/2;
            mergeSort(ds, l, m);
            mergeSort(ds, m+1, r);
            
            SinhVien[] b = new SinhVien[r+1];
            for (int i = l; i<=m;i++)
            {
                b[i] = new SinhVien();
                b[i] = ds[i];
            }
            for (int i = m+1; i<=r;i++)
            {
                int index = m+r+1-i;
                b[index] = new SinhVien();
                b[index] = ds[i];
            }
            int i = l, j = r;
            for (int k = l; k<=r; k++)
            {
                if(b[i].getName().compareToIgnoreCase(b[j].getName()) > 0)
                {
                    ds[k] = b[j];
                    j--;
                }
                else if(b[i].getName().equals(b[j].getName()))
                {
                    if(b[i].getDlt() > b[j].getDlt())
                    {
                        ds[k] = b[j];
                        j--;
                    }
                    else{
                        ds[k] = b[i];
                        i++;
                    }
                }
                else{
                    ds[k] = b[i];
                    i++;
                }
            }
        }
    }
    
}
