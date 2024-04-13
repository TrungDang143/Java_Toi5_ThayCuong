/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b12.quan.ly.kho;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ddtru
 */
public class HangTP extends HangHoa{
    private LocalDate NSX;
    private LocalDate HSD;   
    private String NCC;
    
    public HangTP(){
        super();
        this.NSX = LocalDate.now();
        this.HSD = LocalDate.now();
        setVAT(5);
    };

    public HangTP(LocalDate NSX, String NCC, String maHang, String tenHang, int slt, double donGia) {
        super(maHang, tenHang, slt, donGia);
        this.NSX = NSX;
        this.NCC = NCC;
    }

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.print(" - Nhap NSX (dd/MM/yyyy): ");
            String nxs = sc.nextLine();
            NSX = LocalDate.parse(nxs, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print(" - Nhap HSD (dd/MM/yyyy): ");
            String hsd = sc.nextLine();
            HSD = LocalDate.parse(hsd, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            
            if(NSX.isEqual(HSD)||NSX.isBefore(HSD))
                break;
        }
        
        System.out.print(" - Nhap ten nha cung cap: ");
        NCC = sc.nextLine();
    }
    
    public void randomDATA(){
        super.randomDATA();
        Random rand = new Random();
        do {   
            try{
                HSD = LocalDate.of(rand.nextInt(25)+2010,rand.nextInt(12)+1,rand.nextInt(31)+1);
                NSX = LocalDate.of(rand.nextInt(25)+2000,rand.nextInt(12)+1,rand.nextInt(31)+1);
            }catch(Exception e){
                
            }
        }while(HSD.compareTo(NSX) <= 0);
        
        NCC = "NhaCungCap"+rand.nextInt(15);
    }
    
    public String danhGia(){
        LocalDate today = LocalDate.now();
        return ((getSlt()>0) && (HSD.compareTo(today)<0))?"Kho ban":"";
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return super.toString() + String.format(" %15s %15s %20s %15s", NSX.format(formatter), HSD.format(formatter), NCC, danhGia());
    }
    
    
    
}
