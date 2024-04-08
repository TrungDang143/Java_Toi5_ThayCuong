/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b8_hinhphang;

/**
 *
 * @author ddtru
 */
public class B8_hinhphang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HinhTron ht = new HinhTron(5);
        HinhVuong hv = new HinhVuong();
        HCN hcn = new HCN();
        hcn.nhap();

        System.out.println(ht.toString());
        System.out.println(hv.toString());
        System.out.println(hcn.toString());
    }
    
}
