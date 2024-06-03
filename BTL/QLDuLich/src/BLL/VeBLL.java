/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.VeDAL;
import Entities.Ve;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author admin
 */
public class VeBLL {
    public static TableModel show(){
        
        ArrayList<Ve> list= VeDAL.show();
        String[] columnNames = {"Mã vé","Người đặt","Mã tour","Mã nhân viên","Thời gian","Giá vé"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(Ve c : list){
            data[row][0] = c.getMaVe();
            data[row][1] = c.getTenUser();
            data[row][2] = c.getMaTour();
            data[row][3] = c.getMaNV();
            data[row][4] = c.getThoiGian();
            data[row][5] = c.getGiaVe();
            row++;
        }
        
        DefaultTableModel table = new DefaultTableModel(data,columnNames){
            @Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 0:return String.class;
                    case 1:return String.class;
                    case 2: return String.class;
                    case 3: return String.class;
                    case 4: return String.class;
                    default: return double.class;
                }
            };
            
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        
       return table;
        
    }
    
    //Tính tổng doanh thu
    public static int TongSoLuong(){
        ArrayList<Ve> list= VeDAL.show();
        int t = 0;
        for(Ve item:list){
            t++;
        }
        return t;
    }
    public static float TongDoanhThu(){
        ArrayList<Ve> list= VeDAL.show();
        float t = 0;
        for(Ve item:list){
            t += item.getGiaVe();
        }
        return t;
    }
}
