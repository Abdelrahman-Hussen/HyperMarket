package hypermarket;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Admin {

    database db = new database();

    private String user_name, password;

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    boolean oldID = false;

    public void check(int id) {
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select * from dbo.users";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getInt("user_id") == id) {
                    oldID = true;
                    JOptionPane.showMessageDialog(null, "This id used before", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Exception", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void add(String name, String pass, int id, int rule) {
        switch (rule) {
            case 2 -> {
                Inventory inv = new Inventory(id,name,pass);
                check(inv.getId());

                try {
                    Statement st = db.getCon().createStatement();
                    String sql = "insert into dbo.users(user_id,user_name,user_password,roleID) values('" + inv.getId() + "','" + inv.getName() + "','" + inv.getPassword() + "','" + 2 + "')";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Added Successfully", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    if (!oldID) {
                        JOptionPane.showMessageDialog(null, "SQLException_Error", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            case 3 -> {
                Market mar = new Market(id, name, pass);

                check(mar.getId());

                try {
                    Statement st = db.getCon().createStatement();
                    String sql = "insert into dbo.users(user_id,user_name,user_password,roleID) values('" + mar.getId() + "','" + mar.getName() + "','" + mar.getPassword() + "','" + 3 + "')";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Added Successfully", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    if (!oldID) {
                        JOptionPane.showMessageDialog(null, "SQLException_Error", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            case 4 -> {
                Seller sell = new Seller(id, name,pass);

                check(sell.getId());

                try {
                    Statement st = db.getCon().createStatement();
                    String sql = "insert into dbo.users(user_id,user_name,user_password,roleID) values('" + sell.getId() + "','" + sell.getName() + "','" + sell.getPassword() + "','" + 4 + "')";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Added Successfully", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    if (!oldID) {
                        JOptionPane.showMessageDialog(null, "SQLException_Error", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            default -> {
                JOptionPane.showMessageDialog(null, "Select role of employee", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }

    public void search(int id, JTable table) {
        boolean found = false;
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("Id");
        dtm.addColumn("Name");
        dtm.addColumn("Password");
        dtm.addColumn("roleID");
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select * from dbo.users";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (id == rs.getInt("user_ID")) {
                    found = true;
                    dtm.addRow(new Object[]{rs.getString("user_id"), rs.getString("user_name"), rs.getString("user_password"), rs.getString("roleID")});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "this id not found!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void delet(JTable table) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        if (table.getSelectedRowCount() == 1) {
            Object id = table.getValueAt(table.getSelectedRow(), 0);
            try {
                Statement st = db.getCon().createStatement();
                String sql = "delete from users where user_id = " + id + "";
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

    public void List(int i, JTable table) {
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("Id");
        dtm.addColumn("Name");
        dtm.addColumn("Password");
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select * from dbo.users";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (i == rs.getInt("roleID")) {
                    dtm.addRow(new Object[]{rs.getString("user_id"), rs.getString("user_name"), rs.getString("user_password")});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void view(JTable table) {
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("Id");
        dtm.addColumn("Name");
        dtm.addColumn("Password");
        dtm.addColumn("Role_ID");
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select * from dbo.users";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString("user_id"), rs.getString("user_name"), rs.getString("user_password"), rs.getString("roleID")});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Admin edit profile methods
        public void UpdateAdminInfo(JTextField id,JTextField name, JTextField pass){
        database db = new database();
        regestration r = new regestration();
        try {
            Statement st = db.getCon().createStatement();
            String sql = "update users set user_name = '"+ name.getText() +"' , user_password = '"+ pass.getText() +"' where user_id = " + r.getReturnID();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Congratulations" , "Mabrooook" , JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL exception", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        
    public void ifID(JTextField id, JTextField name, JTextField pass) {
        boolean trueID = false ;
        database db = new database();
        regestration r = new regestration();
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select * from users";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getInt("user_id") ==  Integer.parseInt(r.getReturnID()) && Integer.parseInt(r.getReturnID()) == Integer.parseInt(id.getText())){
                    name.setEditable(true);
                    pass.setEditable(true);
                    name.setText(rs.getString("user_name"));
                    pass.setText(rs.getString("user_password"));
                    trueID = true ;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQLException me", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if(!trueID) {
            JOptionPane.showMessageDialog(null, "It's not your ID" , "Error" , JOptionPane.ERROR_MESSAGE);
        }
    }
     //update employee data methods 
    public void ViewEmp(Employee e, Object id) {
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select * from users where user_id = " + id;
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                e.setId(rs.getInt("user_id"));
                e.setRoleID(rs.getInt("roleID"));
                e.setName(rs.getString("user_name"));
                e.setPassword(rs.getString("user_password"));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQLException Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
        

    }
      public void UpdatePro(Employee e) {
        try {
            Statement st = db.getCon().createStatement();
            String sql = "update users set user_name = '"+e.getName()+"', roleID = '"+e.getRoleID()+"', "+ "user_password = '"+e.getPassword()+"' where user_id = '"+e.getId()+"'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Updated Successfully", "Update", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
            

}
