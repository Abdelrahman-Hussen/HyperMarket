package hypermarket;

import java.awt.TextField;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Employee extends Create {

    protected String password;
    protected int RoleID;

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int RoleID) {
        this.RoleID = RoleID;
    }

    public Employee() {

    }

    public Employee(int emp_id, int roleID, String emp_name, String emp_pass) {
        this.setId(emp_id);
        this.setRoleID(roleID);
        this.setName(emp_name);
        this.setPassword(emp_pass);

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    database db = new database();

    public void forgetPassword(JTextField id, JTextField username, int role) {
        boolean isEmp = false;
        database db = new database();
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select * from dbo.users";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if ((rs.getInt("user_id") == Integer.parseInt(id.getText())) && (rs.getString("user_name").compareTo(username.getText()) == 0) && (rs.getInt("roleID") == role)) {
                    isEmp = true;
                    JOptionPane.showMessageDialog(null, "Your Password is " + rs.getString("user_password"), "Your Password", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!isEmp) {
            JOptionPane.showMessageDialog(null, "Please Contact With Your Admin", "Block", JOptionPane.ERROR_MESSAGE);
        }
        id.setText("");
        username.setText("");
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

    public void expireDateReport(JTable table) {
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("Product_Id");
        dtm.addColumn("Product_Name");
        dtm.addColumn("Product_EX_Date");
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select prod_id,prod_name,prod_ex_date from dbo.product order by prod_price";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString("prod_id"), rs.getString("prod_name"), rs.getString("prod_ex_date")});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
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

    public void ifID(JTextField id, JTextField name, JTextField pass) {
        boolean trueID = false;
        database db = new database();
        regestration r = new regestration();
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select * from users";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getInt("user_id") == Integer.parseInt(r.getReturnID()) && Integer.parseInt(r.getReturnID()) == Integer.parseInt(id.getText())) {
                    name.setEditable(true);
                    pass.setEditable(true);
                    name.setText(rs.getString("user_name"));
                    pass.setText(rs.getString("user_password"));
                    trueID = true;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQLException me", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!trueID) {
            JOptionPane.showMessageDialog(null, "It's not your ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void UpdateEmpInfo(JTextField name, JTextField pass) {
        database db = new database();
        regestration r = new regestration();
        try {
            Statement st = db.getCon().createStatement();
            String sql = "update users set user_name = '" + name.getText() + "' , user_password = '" + pass.getText() + "' where user_id = " + r.getReturnID();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Congratulations", "Mabrooook", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL exception", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setTableTitle(JTable table) {
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("Product_Id");
        dtm.addColumn("Product_Name");
        dtm.addColumn("Product_Price");
        dtm.addColumn("Product_Quantity");
        dtm.addColumn("Product_EX_date");
        dtm.addColumn("Inventory employee ID");

    }
}
