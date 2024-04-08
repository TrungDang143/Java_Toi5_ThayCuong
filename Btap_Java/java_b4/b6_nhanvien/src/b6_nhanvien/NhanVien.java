/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b6_nhanvien;

/**
 *
 * @author ddtru
 */
public class NhanVien {
    private String maNV;
    private int soSP;
    
    public NhanVien(){
        maNV = "";
        soSP = 0;
    }
    public NhanVien(String ma, int sp){
        maNV = ma;
        soSP = sp;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if(soSP > 0) 
            this.soSP = soSP;
    }
    
    public boolean coVuotChuan(){
        return soSP > 500? true:false;
    }
    public String getTongKet(){
        return coVuotChuan()?"Vượt":"";
    }
    public double getLuong(){
        double luong = 0;
        if (!coVuotChuan())
            luong = soSP*20000;
        else{
            luong = 500*20000 + (soSP-500)*30000;
        }
        return luong;
    }

    @Override
    public String toString() {
        return String.format("%-10s %10d %15d %8s", maNV, soSP, getLuong(), getTongKet());
    }
    
}
