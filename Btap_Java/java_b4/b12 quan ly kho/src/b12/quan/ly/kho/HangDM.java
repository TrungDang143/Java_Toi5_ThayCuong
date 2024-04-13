/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b12.quan.ly.kho;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class HangDM extends HangHoa{
    private int TGBH;
    private int kW;

    public HangDM() {
        super();
        setVAT(10);
    }

    public HangDM(int TGBH, int kW, String maHang, String tenHang, int slt, double donGia) {
        super(maHang, tenHang, slt, donGia);
        this.TGBH = TGBH;
        this.kW = kW;
    }
    
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Nhap thoi gian bao hanh (thang): ");
        TGBH = sc.nextInt();
        
        System.out.print(" - Nhap muc tieu thu (kW): ");
        kW = sc.nextInt();
    }
    
    public void randomDATA(){
        super.randomDATA();
        Random rand = new Random();
        TGBH = rand.nextInt(18)+1;
        kW = rand.nextInt(100);
    }
    
    public String danhGia(){
        return (getSlt()<3)?"Kho ban":"";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %15d kW %15d thang %15s",kW, TGBH, danhGia());
    }
    
    
}
