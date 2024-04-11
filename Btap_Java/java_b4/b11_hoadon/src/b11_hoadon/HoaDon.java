/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b11_hoadon;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class HoaDon {
    private int maHD;
    private Date ngayBan = new Date();
    private KhachHang kh = new KhachHang();
    private int sl = 0;
    private DonHang[] ds;

    public HoaDon() {
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Nhap ma hoa don: ");
        maHD = sc.nextInt();
        
        System.out.print(" - Nhap ngay mua (dd/mm/yyyy): ");
        ngayBan.nhap();
        
        kh.nhap();
        
        System.out.print(" - Nhap so luong mat hang: ");
        sl = sc.nextInt();
        
        ds = new DonHang[sl];
        for(int i = 0; i< sl; i++)
        {
            System.out.println(" --> Nhao thong tin don hang thu "+(i+1));
            ds[i] = new DonHang();
            ds[i].nhap();
        }
    }
    
    public void input(){   
        Random rand = new Random();
        maHD = rand.nextInt(100);
        ngayBan.input();
        kh.input();
        
        sl = rand.nextInt(100);
        ds = new DonHang[sl];
        for(int i = 0; i<sl; i++)
        { 
            ds[i] = new DonHang();
            ds[i].input();
        }
    }
    
    public void xuat(){
        mergeSort(ds, 0, sl-1);
        int tongSL = 0;
        double tongTien = 0;
        
        System.out.printf("\n\t\t%-15s %35s","Ma HD: "+maHD, "Ngay ban: " + ngayBan.toString());
        System.out.printf("\n\t\t%-15s %35s","Khach hang: "+kh.getHoTen(), "Dia chi: " + kh.getDiaChi());
        System.out.printf("\n%-15s %11s %11s %15s\n", "Ten hang", "Don gia", "So luong", "Thanh tien");
        
        for(int i = 0; i<sl; i++){
            System.out.println(ds[i].toString());
            tongSL += ds[i].getSL();
            tongTien += ds[i].tong();
        }
        System.out.printf("\n%-15s %11s %11d %15.2f", "Tong tien", "", tongSL, tongTien);
    }   

    private void mergeSort(DonHang[] ds, int l, int r) {
        if(r>l){
            int m = (l+r)/2;
            mergeSort(ds, l, m);
            mergeSort(ds, m+1, r);
            
            DonHang[] t = new DonHang[r+1];
            for(int i=m; i>=l;i--)
            {
                t[i] = ds[i];
            }
            for(int i = m+1; i<=r; i++){
                t[m+r+1-i] = ds[i];
            }
            
            int i = l, j =r;
            for(int k = l; k<=r; k++){
                if(t[i].getTenHang().compareToIgnoreCase(t[j].getTenHang()) > 0){
                    ds[k] = t[j];
                    j--;
                }
                else if(t[i].getTenHang().compareToIgnoreCase(t[j].getTenHang()) < 0){
                    ds[k] = t[i];
                    i++;
                }else{
                    if(t[i].tong() > t[j].tong()){
                        ds[k] = t[j];
                        j--;
                    }else{
                        ds[k] = t[i];
                        i++;
                    }
                }
            }
        }
    }
    
}
