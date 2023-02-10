package hypermarket;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Market extends Employee {

    private int offer_id;
    private String offer_date;
    private int offer_disc;
    
    public Market(){
    
    }
    public Market(int id, String name, String pass){
                this.setId(id);
                this.setName(name);
                this.setPassword(pass);
    }

    public void setOffer_id(int offer_id) {
        this.offer_id = offer_id;
    }

    public void setOffer_date(String offer_date) {
        this.offer_date = offer_date;
    }

    public void setOffer_disc(int offer_disc) {
        this.offer_disc = offer_disc;
    }

    public int getOffer_id() {
        return offer_id;
    }

    public String getOffer_date() {
        return offer_date;
    }

    public int getOffer_disc() {
        return offer_disc;
    }

    public Market(int id, String date, int disc) {
        this.setOffer_id(id);
        this.setOffer_date(date);
        this.setOffer_disc(disc);
    }

    database db = new database();

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

    public void viewOffers(JTable table) {
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("Offer Id");
        dtm.addColumn("Offer Date");
        dtm.addColumn("Discount percentage");
        try {
            Statement st = db.getCon().createStatement();
            String sql = "select * from dbo.offers";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt("offer_id"), rs.getString("offer_date"), rs.getFloat("offer_discount")});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void addOffer(Market m) {
        try {
            Statement st = db.getCon().createStatement();
            String sql = "insert into dbo.offers(offer_id,offer_date,offer_discount) values('" + m.getOffer_id() + "','" + m.getOffer_date() + "','" + m.getOffer_disc() + "')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Added Successfully", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
