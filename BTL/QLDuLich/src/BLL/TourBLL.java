/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.TourDAL;
import Entities.Tour;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author admin
 */
public class TourBLL {
    public static TableModel show(){
        
        ArrayList<Tour> list= TourDAL.show();
        String[] columnNames = {"Mã tour","Tên tour","Thời gian","Địa điểm","Mã xe","Mã khách sạn"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(Tour c : list){
            data[row][0] = c.getMaTour();
            data[row][1] = c.getTenTour();
            data[row][2] = c.getThoiGian();
            data[row][3] = c.getDiaDiem();
            data[row][4] = c.getMaXe();
            data[row][5] = c.getMaKS();
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
    
    public static Object[] showControlWithCombobox(String cbbValue){
        ArrayList<Tour> list = TourDAL.show();
        Object[] obj = new Object[6];
        for(Tour k :list){
            if(cbbValue.equals(k.getMaTour())){
                  obj[0]  = k.getMaTour();
                  obj[1]  = k.getTenTour();
                  obj[2]  = k.getThoiGian();
                  obj[3]  = k.getDiaDiem();
                  obj[4]  = k.getMaXe();
                  obj[5]  = k.getMaKS();
            }
        }
        return obj;
    }
    
    public static ComboBoxModel cbb_show(){
        
        StringBuilder items = new StringBuilder();
        
        for(int i = 0;i<TourDAL.show().size();i++){
            items.append(TourDAL.show().get(i).getMaTour());
            items.append("#");
        }
        
        return new DefaultComboBoxModel(items.toString().split("#"));
    }
}
