/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.XeDAL;
import Entities.Xe;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author admin
 */
public class XeBLL {
    public static TableModel show(){
        
        ArrayList<Xe> list= XeDAL.show();
        String[] columnNames = {"Mã xe","Biển số","Loại xe"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(Xe c : list){
            data[row][0] = c.getMaXe();
            data[row][1] = c.getBienSo();
            data[row][2] = c.getLoaiXe();
            
            row++;
        }
        
        DefaultTableModel table = new DefaultTableModel(data,columnNames){
            @Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 1:return String.class;
                    case 2:return String.class;
                    default:return String.class;
                }
            };
            
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            };
        };
        
       return table;
        
    }
    
    public static Object[] showControlWithCombobox(String cbbValue){
        ArrayList<Xe> list = XeDAL.show();
        Object[] obj = new Object[3];
        for(Xe k :list){
            if(cbbValue.equals(k.getMaXe())){
                  obj[0]  = k.getMaXe();
                  obj[1]  = k.getBienSo();
                  obj[2]  = k.getLoaiXe();
            }
        }
        return obj;
    }
    
    public static ComboBoxModel cbb_show(){
        
        StringBuilder items = new StringBuilder();
        
        for(int i = 0;i<XeDAL.show().size();i++){
            items.append(XeDAL.show().get(i).getMaXe());
            items.append("#");
        }
        
        return new DefaultComboBoxModel(items.toString().split("#"));
    }
}
