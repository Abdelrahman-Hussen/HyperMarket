/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypermarket;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class SellEmpFrame extends javax.swing.JFrame {

    /**
     * Creates new form SellEmpFrame
     */
     Seller s = new Seller();
     Products p = new Products();
    
    DefaultTableModel dtm = new DefaultTableModel();
    public SellEmpFrame() {
        initComponents();
        s.list(jTable2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListProductSell = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BackBTN = new javax.swing.JButton();
        EditProfileBTN = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        BTNpnl = new javax.swing.JPanel();
        AddBTN = new javax.swing.JButton();
        DelBTN = new javax.swing.JButton();
        UpdateBTN1 = new javax.swing.JButton();
        Container = new javax.swing.JTabbedPane();
        MakeOrder = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AddTxtField = new javax.swing.JTextField();
        ProductInfo = new javax.swing.JTextField();
        AddPrice = new javax.swing.JTextField();
        SubmitAdd = new javax.swing.JButton();
        AddDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        SearchOrder = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchProd = new javax.swing.JTable();
        Search = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        SearchProID = new javax.swing.JTextField();
        ListPnl = new javax.swing.JPanel();
        ViewTable = new javax.swing.JScrollPane();
        list_pro_seller = new javax.swing.JTable();
        ExDateRadio = new javax.swing.JRadioButton();
        PriceRadio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(875, 475));
        setMinimumSize(new java.awt.Dimension(875, 475));
        setName("Seller"); // NOI18N
        setPreferredSize(new java.awt.Dimension(875, 475));
        setResizable(false);
        setSize(new java.awt.Dimension(875, 475));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(29, 119, 117));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 500));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hyper Market");

        BackBTN.setBackground(new java.awt.Color(33, 141, 138));
        BackBTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackBTN.setForeground(new java.awt.Color(255, 255, 255));
        BackBTN.setText("Home");
        BackBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
            }
        });

        EditProfileBTN.setBackground(new java.awt.Color(33, 141, 138));
        EditProfileBTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EditProfileBTN.setForeground(new java.awt.Color(255, 255, 255));
        EditProfileBTN.setText("Edit Profile");
        EditProfileBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditProfileBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileBTNActionPerformed(evt);
            }
        });

        BTNpnl.setBackground(new java.awt.Color(29, 119, 117));

        AddBTN.setBackground(new java.awt.Color(33, 141, 138));
        AddBTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddBTN.setForeground(new java.awt.Color(255, 255, 255));
        AddBTN.setText("Make Order");
        AddBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBTNActionPerformed(evt);
            }
        });

        DelBTN.setBackground(new java.awt.Color(33, 141, 138));
        DelBTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DelBTN.setForeground(new java.awt.Color(255, 255, 255));
        DelBTN.setText("Search");
        DelBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBTNActionPerformed(evt);
            }
        });

        UpdateBTN1.setBackground(new java.awt.Color(33, 141, 138));
        UpdateBTN1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UpdateBTN1.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBTN1.setText("List");
        UpdateBTN1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UpdateBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBTN1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BTNpnlLayout = new javax.swing.GroupLayout(BTNpnl);
        BTNpnl.setLayout(BTNpnlLayout);
        BTNpnlLayout.setHorizontalGroup(
            BTNpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTNpnlLayout.createSequentialGroup()
                .addComponent(AddBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(DelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(UpdateBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BTNpnlLayout.setVerticalGroup(
            BTNpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTNpnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BTNpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Container.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        MakeOrder.setBackground(new java.awt.Color(29, 119, 117));
        MakeOrder.setName("MakeOrder"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Order Quantity:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price:");

        AddPrice.setEditable(false);

        SubmitAdd.setBackground(new java.awt.Color(33, 141, 138));
        SubmitAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SubmitAdd.setForeground(new java.awt.Color(255, 255, 255));
        SubmitAdd.setText("Submit Order");
        SubmitAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SubmitAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitAddActionPerformed(evt);
            }
        });

        AddDate.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout MakeOrderLayout = new javax.swing.GroupLayout(MakeOrder);
        MakeOrder.setLayout(MakeOrderLayout);
        MakeOrderLayout.setHorizontalGroup(
            MakeOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MakeOrderLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(MakeOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MakeOrderLayout.createSequentialGroup()
                        .addGroup(MakeOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(MakeOrderLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(MakeOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MakeOrderLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(AddDate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AddTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MakeOrderLayout.createSequentialGroup()
                        .addComponent(SubmitAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MakeOrderLayout.setVerticalGroup(
            MakeOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MakeOrderLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(MakeOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(MakeOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(ProductInfo))
                .addGap(30, 30, 30)
                .addGroup(MakeOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SubmitAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MakeOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
        );

        Container.addTab("Order", MakeOrder);

        SearchOrder.setBackground(new java.awt.Color(29, 119, 117));
        SearchOrder.setName("DelPnl"); // NOI18N

        jScrollPane1.setMaximumSize(new java.awt.Dimension(700, 200));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(700, 200));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(700, 200));

        searchProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        searchProd.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        searchProd.setMinimumSize(new java.awt.Dimension(60, 200));
        searchProd.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jScrollPane1.setViewportView(searchProd);

        Search.setBackground(new java.awt.Color(33, 141, 138));
        Search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID to Search:");

        javax.swing.GroupLayout SearchOrderLayout = new javax.swing.GroupLayout(SearchOrder);
        SearchOrder.setLayout(SearchOrderLayout);
        SearchOrderLayout.setHorizontalGroup(
            SearchOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
            .addGroup(SearchOrderLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(SearchProID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SearchOrderLayout.setVerticalGroup(
            SearchOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchProID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Container.addTab("Search", SearchOrder);

        ListPnl.setBackground(new java.awt.Color(29, 119, 117));
        ListPnl.setName("ListPnl"); // NOI18N

        ViewTable.setBackground(new java.awt.Color(29, 119, 117));

        list_pro_seller.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        list_pro_seller.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        list_pro_seller.setMinimumSize(new java.awt.Dimension(60, 200));
        list_pro_seller.setPreferredSize(new java.awt.Dimension(300, 200));
        list_pro_seller.setSelectionBackground(new java.awt.Color(0, 153, 153));
        ViewTable.setViewportView(list_pro_seller);
        list_pro_seller.getAccessibleContext().setAccessibleParent(jScrollPane1);

        ExDateRadio.setBackground(new java.awt.Color(29, 119, 117));
        ListProductSell.add(ExDateRadio);
        ExDateRadio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ExDateRadio.setForeground(new java.awt.Color(255, 255, 255));
        ExDateRadio.setText("Expire date");
        ExDateRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExDateRadioActionPerformed(evt);
            }
        });

        PriceRadio.setBackground(new java.awt.Color(29, 119, 117));
        ListProductSell.add(PriceRadio);
        PriceRadio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PriceRadio.setForeground(new java.awt.Color(255, 255, 255));
        PriceRadio.setText("Price");
        PriceRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ListPnlLayout = new javax.swing.GroupLayout(ListPnl);
        ListPnl.setLayout(ListPnlLayout);
        ListPnlLayout.setHorizontalGroup(
            ListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPnlLayout.createSequentialGroup()
                .addComponent(ViewTable, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ListPnlLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(ExDateRadio)
                .addGap(98, 98, 98)
                .addComponent(PriceRadio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ListPnlLayout.setVerticalGroup(
            ListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPnlLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ListPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExDateRadio)
                    .addComponent(PriceRadio))
                .addGap(18, 18, 18)
                .addComponent(ViewTable, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );

        Container.addTab("List", ListPnl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditProfileBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BackBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(BTNpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BackBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditProfileBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        Regestier view = new Regestier();
        view.setLocation(200, 200);
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBTNActionPerformed

    private void EditProfileBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProfileBTNActionPerformed
        EditProfile view = new EditProfile();
        view.setLocation(150, 100);
        view.setVisible(true);
    }//GEN-LAST:event_EditProfileBTNActionPerformed

    private void AddBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBTNActionPerformed
        Container.setSelectedIndex(0);
    }//GEN-LAST:event_AddBTNActionPerformed

    private void DelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBTNActionPerformed
        Container.setSelectedIndex(1);
        s.setTableTitle(searchProd);
    }//GEN-LAST:event_DelBTNActionPerformed

    private void UpdateBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBTN1ActionPerformed
        Container.setSelectedIndex(2);
        s.view(list_pro_seller);
    }//GEN-LAST:event_UpdateBTN1ActionPerformed

    private void SubmitAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitAddActionPerformed
        p.setId(Integer.parseInt(AddTxtField.getText()));
        p.setQuantity(Integer.parseInt(ProductInfo.getText()));
        s.Make_oreder(p);
        AddPrice.setText(Double.toString(s.getPrice()));
        AddDate.setText(s.today());
        s.list(jTable2);
    }//GEN-LAST:event_SubmitAddActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        s. search(SearchProID, searchProd);
    }//GEN-LAST:event_SearchActionPerformed

    private void ExDateRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExDateRadioActionPerformed
        s.expireDateReport(list_pro_seller);
    }//GEN-LAST:event_ExDateRadioActionPerformed

    private void PriceRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceRadioActionPerformed
        s.list_Price(list_pro_seller);
    }//GEN-LAST:event_PriceRadioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SellEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellEmpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBTN;
    private javax.swing.JTextField AddDate;
    private javax.swing.JTextField AddPrice;
    private javax.swing.JTextField AddTxtField;
    private javax.swing.JPanel BTNpnl;
    private javax.swing.JButton BackBTN;
    private javax.swing.JTabbedPane Container;
    private javax.swing.JButton DelBTN;
    private javax.swing.JButton EditProfileBTN;
    private javax.swing.JRadioButton ExDateRadio;
    private javax.swing.JPanel ListPnl;
    private javax.swing.ButtonGroup ListProductSell;
    private javax.swing.JPanel MakeOrder;
    private javax.swing.JRadioButton PriceRadio;
    private javax.swing.JTextField ProductInfo;
    private javax.swing.JButton Search;
    private javax.swing.JPanel SearchOrder;
    private javax.swing.JTextField SearchProID;
    private javax.swing.JButton SubmitAdd;
    private javax.swing.JButton UpdateBTN1;
    private javax.swing.JScrollPane ViewTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable list_pro_seller;
    private javax.swing.JTable searchProd;
    // End of variables declaration//GEN-END:variables
}
