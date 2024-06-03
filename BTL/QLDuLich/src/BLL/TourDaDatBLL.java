/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.TourDaDatDAL;
import DAL.VeDAL;
import Entities.TourDaDat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author admin
 */
public class TourDaDatBLL {
    public static TableModel show(String maTaiKhoan){
        
        ArrayList<TourDaDat> list= TourDaDatDAL.show(maTaiKhoan);
        Object[][] data;
        String[] columnNames = {"Mã tour","Tên tour","Thời gian","Địa điểm","Giá vé","Tên du khách"};
        data = new Object[(list.size()==0)?1:list.size()][columnNames.length];
        int row = 0;
        for(TourDaDat c : list){
            data[row][0] = c.getTourDaChon().getMaTour();
            data[row][1] = c.getTourDaChon().getTenTour();
            data[row][2] = c.getTourDaChon().getThoiGian();
            data[row][3] = c.getTourDaChon().getMaTour();
            data[row][4] = VeDAL.GetGiaVe(c.getTourDaChon().getMaTour());
            data[row][5] = c.getTenDK();
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
                    case 4: return double.class;
                    default: return String.class;
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
}
