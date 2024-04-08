/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8_hinhphang;

/**
 *
 * @author ddtru
 */
public abstract class Hinh {
    abstract double tinhCV();
    abstract double tinhDT();

    @Override
    public String toString() {
        return String.format("\n- Chu vi = %.2f\n- Dien tich = %.2f", tinhCV(), tinhDT());
    }
    
}
