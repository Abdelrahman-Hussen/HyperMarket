package hypermarket;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Inventory extends Employee {

    database db = new database();
    Products p = new Products();
    String notif;
    boolean oldID = false;
    
    public Inventory(){
    }
    
    public Inventory(int id, String name, String pass){
                this.setId(id);
                this.setName(name);
                this.setPassword(pass);
    }
    
    public void ViewProd(Products p , Object id) {
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select * from product where prod_id = " + id;
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                p.setId(rs.getInt("prod_id"));
                p.setName(rs.getString("prod_name"));
                p.setPrice(rs.getDouble("prod_price"));
                p.setQuantity(rs.getInt("prod_quant"));
                p.setMinquant(rs.getInt("prod_min_quant"));
                p.setEX_date(rs.getString("prod_ex_date"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQLException Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void UpdatePro(Products p) {
        try {
            Statement st = db.getCon().createStatement();
            String sql = "update product set prod_name = '"+p.getName()+"', prod_price = '"+p.getPrice()+"', prod_quant = '"+p.getQuantity()+"', prod_ex_date = '"+p.getEX_date()+"', prod_min_quant = '"+p.getMinquant()+"' where prod_id = '"+p.getId()+"'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Updated Successfully", "Update", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void check(int id) {
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select * from dbo.product";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getInt("prod_id") == id) {
                    oldID = true;
                    JOptionPane.showMessageDialog(null, "This id used before", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Exception", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AddNew(Products p){
        check(p.getId());
        regestration r = new regestration();
        try {
            Statement st = db.getCon().createStatement();
            String sql = "insert into product(prod_id,prod_name,prod_price,prod_quant,prod_ex_date,inv_emp_id,prod_min_quant) "
                    + "values(" + p.getId() + ",'" + p.getName() + "'," + p.getPrice() + "," + p.getQuantity() +  ",'" + p.getEX_date() + "',"+ r.getReturnID() +"," + p.getMinquant() + " )";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Added Successfully", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            if (!oldID) {
                JOptionPane.showMessageDialog(null,ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void list_Price(JTable table) {
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("Product_Id");
        dtm.addColumn("Product_Name");
        dtm.addColumn("Product_Price");
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select prod_id,prod_name,prod_price from dbo.product order by prod_price";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString("prod_id"), rs.getString("prod_name"), rs.getString("prod_price")});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void list_Quant(JTable table) {
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("Product_Id");
        dtm.addColumn("Product_Name");
        dtm.addColumn("Product_Quantity");

        try {
            Statement st = db.getCon().createStatement();
            String sql = "select prod_id,prod_name,prod_quant from dbo.product order by prod_quant";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString("prod_id"), rs.getString("prod_name"), rs.getString("prod_quant")});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void delete_Product(JTable table) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        if (table.getSelectedRowCount() == 1) {
            Object id = table.getValueAt(table.getSelectedRow(), 0);
            try {
                Statement st = db.getCon().createStatement();
                String sql = "delete from product where prod_id = " + id + "";
                st.executeUpdate(sql);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
            dtm.removeRow(table.getSelectedRow());
        } else {
            if (table.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty!", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Please select single row for delete.", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void search(JTextField idField, JTable table) {
        boolean found = false;
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("Product_Id");
        dtm.addColumn("Product_Name");
        dtm.addColumn("Product_Price");
        dtm.addColumn("Product_Quantity");
        dtm.addColumn("Product_EX_date");
        dtm.addColumn("Inventory employee ID");
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select * from dbo.product";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (Integer.parseInt(idField.getText()) == rs.getInt("prod_id")) {
                    found = true;
                    dtm.addRow(new Object[]{rs.getString("prod_id"), rs.getString("prod_name"), rs.getString("prod_price"), rs.getString("prod_quant"), rs.getString("prod_ex_date"), rs.getString("inv_emp_id")});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "this id not found!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }



    public void view(JTable table) {
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("Product_Id");
        dtm.addColumn("Product_Name");
        dtm.addColumn("Product_Price");
        dtm.addColumn("Product_Quantity");
        dtm.addColumn("Product_EX_date");
        dtm.addColumn("Inventory employee ID");
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select * from dbo.product";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString("prod_id"), rs.getString("prod_name"), rs.getString("prod_price"), rs.getString("prod_quant"), rs.getString("prod_ex_date"), rs.getString("inv_emp_id")});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

public void viewNot(JTable table) {
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
        
        dtm.addColumn("Message");

        try {
            Statement st = db.getCon().createStatement();
            String sql = "select * from dbo.notification";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{ rs.getString("notf")});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
