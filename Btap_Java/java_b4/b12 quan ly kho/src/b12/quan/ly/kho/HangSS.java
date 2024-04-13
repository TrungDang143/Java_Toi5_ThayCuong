/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b12.quan.ly.kho;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class HangSS extends HangHoa{
    private LocalDate NgayNhapKho; 
    private String NSX;

    public HangSS() {
        super();
        this.NgayNhapKho = LocalDate.now();
        setVAT(10);
    }

    public HangSS(LocalDate NgayNhapKho, String NSX, String maHang, String tenHang, int slt, double donGia) {
        super(maHang, tenHang, slt, donGia);
        this.NgayNhapKho = NgayNhapKho;
        NSX = NSX;
    }
    
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Nhap ngay nhap kho (dd/MM/yyyy): ");
        String nxs = sc.nextLine();
        NgayNhapKho = LocalDate.parse(nxs, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        System.out.print(" - Nhap nha san xuat: ");
        NSX = sc.nextLine();
    }
    
    public void randomDATA(){
        super.randomDATA();
        Random rand = new Random();
        do {   
            try{
                NgayNhapKho = LocalDate.of(rand.nextInt(25)+2000,rand.nextInt(12)+1,rand.nextInt(31)+1);
            }catch(Exception e){
                
            }
        }while(NgayNhapKho.isAfter(LocalDate.now()));
        
        NSX = "NhaSanXuat"+rand.nextInt(15);
    }
    
    public String danhGia(){
        return (getSlt()>50) && (ChronoUnit.DAYS.between(NgayNhapKho, LocalDate.now())>10)?"Ban cham":"";
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return super.toString() + String.format(" %15s %20s %15s", NgayNhapKho.format(formatter), NSX, danhGia());
    }
    
    
}
