/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIUBER;

import UberCarManagement.UberCar;
import UberCarManagement.CarDetails;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sreyoshighosh
 */
public class DisplayJpanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJpanel
     */
    private JPanel UserProc;
    private CarDetails Info;
    private int manufactureyr;
    private ArrayList<CarDetails> totalavailable;
    
    DisplayJpanel(JPanel proessuser, CarDetails infolistcar) {
        initComponents();
        lbltimestamp.setText(UpdateJPanel.Time);
        this.UserProc=proessuser;
        this.Info=infolistcar;       
        populateTable();          
        totalAvailable();      
    }    
    
    private void totalAvailable(){
        ArrayList<UberCar> totalavailable = new ArrayList<>();
        totalavailable = Info.gettotavail();        
        ArrayList<UberCar> totalUnavailable = new ArrayList<>();
        totalUnavailable = Info.gettotunavail();
        int total = totalavailable.size();        
        String S = Integer.toString(total);        
        int totalN = totalUnavailable.size();        
        String SS = Integer.toString(totalN);     
       txttotalavail.setText(S);
       txttotunavail.setText(SS);
    }    
    
     private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tbldisplay.getModel(); 
        dtm.setRowCount(0);
        for (UberCar car : Info.getSelectcar()){
            Object[] row = new Object[10];
            row[0] = car;
            row[1]=car.getModnumber();            
            row[2]= car.getMinseats();
            row[3]= car.getMaxseats();
            row[4]=car.getSrnumber();
            row[5] = car.getManufacture();
            row[6]=car.getCityAvailable();
            row[7]=car.isMaintcert();
            row[8]=car.isAvailable();
            row[9]=car.getUpdatedOn();
            dtm.addRow(row);            
    }
    }    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maintBtnGrp = new javax.swing.ButtonGroup();
        avaiBtnGrp = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        btngoback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldisplay = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnrefresh = new javax.swing.JButton();
        pnlforcolor = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlforcolor2 = new javax.swing.JPanel();
        lblservices = new javax.swing.JLabel();
        lblcarstatus = new javax.swing.JLabel();
        lbllastupdatedon = new javax.swing.JLabel();
        pnlavlcars = new javax.swing.JPanel();
        lblavailcars = new javax.swing.JLabel();
        lblunavailcars = new javax.swing.JLabel();
        txttotunavail = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btncustomsearch = new javax.swing.JButton();
        btnfirstavailpassengercar = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        txttotalavail = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lbltimestamp = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setBackground(new java.awt.Color(204, 204, 255));
        setEnabled(false);

        btngoback.setBackground(new java.awt.Color(204, 204, 0));
        btngoback.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btngoback.setText("<< GO BACK");
        btngoback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngobackActionPerformed(evt);
            }
        });

        tbldisplay.setBackground(new java.awt.Color(204, 255, 204));
        tbldisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Model No", "Min Seat", "Max Seat", "Serial Number", "Manufacture Year", "Available in City", "Maintainance Cert", "Available for Uber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbldisplay);

        btnrefresh.setBackground(new java.awt.Color(204, 204, 0));
        btnrefresh.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnrefresh.setText("REFRESH");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        pnlforcolor.setBackground(new java.awt.Color(153, 0, 255));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("  DISPLAY CARS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlforcolorLayout = new javax.swing.GroupLayout(pnlforcolor);
        pnlforcolor.setLayout(pnlforcolorLayout);
        pnlforcolorLayout.setHorizontalGroup(
            pnlforcolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlforcolorLayout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        pnlforcolorLayout.setVerticalGroup(
            pnlforcolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforcolorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlforcolor2.setBackground(new java.awt.Color(102, 0, 204));

        lblservices.setBackground(new java.awt.Color(0, 255, 0));
        lblservices.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblservices.setForeground(new java.awt.Color(0, 255, 0));
        lblservices.setText("Services:");

        lblcarstatus.setBackground(new java.awt.Color(0, 255, 0));
        lblcarstatus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblcarstatus.setForeground(new java.awt.Color(0, 255, 0));
        lblcarstatus.setText("Car Status:");

        lbllastupdatedon.setBackground(new java.awt.Color(0, 255, 0));
        lbllastupdatedon.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbllastupdatedon.setForeground(new java.awt.Color(0, 255, 0));
        lbllastupdatedon.setText("Last Updated On:");

        javax.swing.GroupLayout pnlforcolor2Layout = new javax.swing.GroupLayout(pnlforcolor2);
        pnlforcolor2.setLayout(pnlforcolor2Layout);
        pnlforcolor2Layout.setHorizontalGroup(
            pnlforcolor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforcolor2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforcolor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbllastupdatedon)
                    .addComponent(lblcarstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblservices, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlforcolor2Layout.setVerticalGroup(
            pnlforcolor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforcolor2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblservices, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lblcarstatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(lbllastupdatedon)
                .addGap(24, 24, 24))
        );

        pnlavlcars.setBackground(new java.awt.Color(102, 0, 204));

        lblavailcars.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblavailcars.setText("Total no. of Available Cars");

        lblunavailcars.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblunavailcars.setText("Total no of Unavailable Cars");

        txttotunavail.setEnabled(false);
        txttotunavail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotunavailActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 0, 204));

        btncustomsearch.setBackground(new java.awt.Color(255, 255, 153));
        btncustomsearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btncustomsearch.setText("Custom Search");
        btncustomsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomsearchActionPerformed(evt);
            }
        });

        btnfirstavailpassengercar.setBackground(new java.awt.Color(255, 255, 153));
        btnfirstavailpassengercar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnfirstavailpassengercar.setText("First Available Passenger Car");
        btnfirstavailpassengercar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstavailpassengercarActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(255, 255, 153));
        btndelete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btncustomsearch)
                .addGap(3, 3, 3)
                .addComponent(btnfirstavailpassengercar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndelete)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncustomsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnfirstavailpassengercar)
                    .addComponent(btndelete))
                .addContainerGap())
        );

        txttotalavail.setEnabled(false);
        txttotalavail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalavailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlavlcarsLayout = new javax.swing.GroupLayout(pnlavlcars);
        pnlavlcars.setLayout(pnlavlcarsLayout);
        pnlavlcarsLayout.setHorizontalGroup(
            pnlavlcarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlavlcarsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlavlcarsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblavailcars)
                .addGap(42, 42, 42)
                .addComponent(lblunavailcars)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlavlcarsLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txttotalavail, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txttotunavail, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        pnlavlcarsLayout.setVerticalGroup(
            pnlavlcarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlavlcarsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlavlcarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblavailcars)
                    .addComponent(lblunavailcars))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlavlcarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttotunavail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotalavail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 0, 204));

        lbltimestamp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbltimestamp.setForeground(new java.awt.Color(255, 255, 255));
        lbltimestamp.setText("  ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltimestamp, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltimestamp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlforcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlforcolor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(320, 320, 320)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btngoback)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnrefresh)))
                                    .addComponent(pnlavlcars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlforcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlavlcars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btngoback, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlforcolor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btngobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngobackActionPerformed
           UserProc.remove(this);
           CardLayout layout = (CardLayout) UserProc.getLayout();
           layout.previous(UserProc);
    }//GEN-LAST:event_btngobackActionPerformed

    private void btncustomsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomsearchActionPerformed
       SearchJPanel panel = new SearchJPanel(UserProc,Info);
       UserProc.add("SearchJPanel", panel);
        CardLayout layout = (CardLayout) UserProc.getLayout();
        layout.next(UserProc);
       
    }//GEN-LAST:event_btncustomsearchActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbldisplay.getSelectedRow();
        if(selectedRow>=0){
         int dialogButton = JOptionPane.YES_NO_OPTION;
            int selectedDialog = JOptionPane.showConfirmDialog(null, "Are you sure??", "Warning", dialogButton);
            if (selectedDialog == JOptionPane.YES_OPTION){
                UberCar car = (UberCar) tbldisplay.getValueAt(selectedRow, 0);
                Info.deletecar(car);
                populateTable();                
            }
        }        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txttotalavailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalavailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalavailActionPerformed

    private void txttotunavailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotunavailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotunavailActionPerformed

    private void btnfirstavailpassengercarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstavailpassengercarActionPerformed
        // TODO add your handling code here:
        
        ArrayList<UberCar> resultNew = Info.getfirstavail();
        if (resultNew==null){
            JOptionPane.showMessageDialog(null, "Value is incorrect");
        }
//else if (resultNew.size() == 0){
//            JOptionPane.showMessageDialog(null, "Car not available");
//        }
        else {
      DefaultTableModel dtm = (DefaultTableModel) tbldisplay.getModel();
       dtm.setRowCount(0);
       for(UberCar car : resultNew){
           Object[] row = new Object[10];
           row[0] = car;
            row[1]=car.getModnumber();            
            row[2]= car.getMinseats();
            row[3]= car.getMaxseats();
            row[4]=car.getSrnumber();
            row[5] = car.getManufacture();
            row[6]=car.getCityAvailable();
            row[7]=car.isMaintcert();
            row[8]=car.isAvailable();            
            row[9]=car.getUpdatedOn();
            dtm.addRow(row);
     }
    }                 
    }//GEN-LAST:event_btnfirstavailpassengercarActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnrefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup avaiBtnGrp;
    private javax.swing.JButton btncustomsearch;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnfirstavailpassengercar;
    private javax.swing.JButton btngoback;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblavailcars;
    private javax.swing.JLabel lblcarstatus;
    private javax.swing.JLabel lbllastupdatedon;
    private javax.swing.JLabel lblservices;
    private javax.swing.JLabel lbltimestamp;
    private javax.swing.JLabel lblunavailcars;
    private javax.swing.ButtonGroup maintBtnGrp;
    private javax.swing.JPanel pnlavlcars;
    private javax.swing.JPanel pnlforcolor;
    private javax.swing.JPanel pnlforcolor2;
    private javax.swing.JTable tbldisplay;
    private javax.swing.JTextField txttotalavail;
    private javax.swing.JTextField txttotunavail;
    // End of variables declaration//GEN-END:variables
}
