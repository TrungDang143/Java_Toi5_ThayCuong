/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b9_tiendien;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class Date {
    public byte ngay;
    public byte thang;
    public int nam;
    Date(){
        ngay = 0;
        thang = 0;
        nam = 0;
    }
    
    public boolean checkDate(){
        
        // Kiểm tra năm nhuận
        boolean nhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);

        // Kiểm tra tháng
        if (thang < 1 || thang > 12) {
            return false;
        }

        // Kiểm tra ngày tương ứng với tháng
        if (ngay < 1 || (thang == 2 && (nhuan ? ngay > 29 : ngay > 28)) ||
                ((thang == 4 || thang == 6 || thang == 9 || thang == 11) && ngay > 30) ||
                ngay > 31) {
            return false;
        }

        return true;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do{
            String s = sc.nextLine();
            String[] input = s.split("/");
            
            if(input.length == 3)
            {
                try{
                    ngay = Byte.parseByte(input[0]);
                    thang = Byte.parseByte(input[1]);
                    nam = Integer.parseInt(input[2]);
                    if (checkDate())
                        break;
                }catch(NumberFormatException e){
                    
                }
            }
            System.out.print("Vui long nhap lai: ");
        }while(true);
        
    }

    
    @Override
    public String toString() {
        return String.format("%d/%d/%d", ngay, thang, nam);
    }

    public byte getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }
    
}
