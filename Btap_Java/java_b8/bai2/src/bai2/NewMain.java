/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

import java.util.Random;

/**
 *
 * @author ddtru
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DSHinhTron ds = new DSHinhTron();
        Random rand = new Random();
        int n = rand.nextInt(10)+5;

        System.out.println("\nXuat thong tin: ");
        
        for(int i = 0; i<n; i++){
            double r = rand.nextDouble()*10;
            HinhTron a = new HinhTron(r);
            
            ds.themHinhTron(a);
            System.out.println(a.toString());
        }
        
        System.out.println("--> Tong S = "+ds.tongDT());
        
        HinhTron maxHT = ds.layHinhTron(ds.vtMax(true));
        HinhTron minHT = ds.layHinhTron(ds.vtMax(false));
        System.out.println("--> Dien tich lon nhat: " + maxHT.toString());
        System.out.println("--> Dien tich nho nhat: " + minHT.toString());
    }
}
