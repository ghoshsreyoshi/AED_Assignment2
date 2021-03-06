/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIUBER;

import UberCarManagement.UberCar;
import UberCarManagement.CarDetails;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sreyoshighosh
 */
public class CreateJPanel extends javax.swing.JPanel {

    
   private JPanel usrcontain;
   private CarDetails carlistinfo;

    CreateJPanel(JPanel usrprocontain, CarDetails listcar) {
       initComponents();
       this.usrcontain=usrprocontain;
       this.carlistinfo=listcar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        txtmanufactureyear = new javax.swing.JTextField();
        txtbrand = new javax.swing.JTextField();
        txtmaxseat = new javax.swing.JTextField();
        txtserialnum = new javax.swing.JTextField();
        txtminseat = new javax.swing.JTextField();
        txtmodelno = new javax.swing.JTextField();
        txtavialablecity = new javax.swing.JTextField();
        rbYesMC = new javax.swing.JRadioButton();
        rbNoMC = new javax.swing.JRadioButton();
        rbYesAvailability = new javax.swing.JRadioButton();
        rbNoAvailability = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblcreatecardetails = new javax.swing.JLabel();
        pnlforattributecolors = new javax.swing.JPanel();
        lblbrand = new javax.swing.JLabel();
        lblminseat = new javax.swing.JLabel();
        lblmaxseat = new javax.swing.JLabel();
        lblmodelno = new javax.swing.JLabel();
        lblserialnum = new javax.swing.JLabel();
        lblyearmanufacture = new javax.swing.JLabel();
        lblavailablecity = new javax.swing.JLabel();
        lblMC = new javax.swing.JLabel();
        lblavailableinuber = new javax.swing.JLabel();
        pnlforbuttons = new javax.swing.JPanel();
        CreateCar = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        txtmanufactureyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmanufactureyearActionPerformed(evt);
            }
        });

        txtmaxseat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaxseatActionPerformed(evt);
            }
        });

        txtminseat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtminseatActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbYesMC);
        rbYesMC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbYesMC.setForeground(new java.awt.Color(51, 0, 255));
        rbYesMC.setText("Yes");
        rbYesMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbYesMCActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbNoMC);
        rbNoMC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbNoMC.setForeground(new java.awt.Color(0, 0, 255));
        rbNoMC.setText("No");

        buttonGroup1.add(rbYesAvailability);
        rbYesAvailability.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbYesAvailability.setForeground(new java.awt.Color(51, 51, 255));
        rbYesAvailability.setText("Yes");

        buttonGroup1.add(rbNoAvailability);
        rbNoAvailability.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbNoAvailability.setForeground(new java.awt.Color(51, 0, 255));
        rbNoAvailability.setText("No");
        rbNoAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoAvailabilityActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lblcreatecardetails.setBackground(new java.awt.Color(255, 255, 102));
        lblcreatecardetails.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblcreatecardetails.setForeground(new java.awt.Color(255, 0, 51));
        lblcreatecardetails.setText("CREATE CAR DETAILS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(lblcreatecardetails)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblcreatecardetails)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlforattributecolors.setBackground(new java.awt.Color(102, 0, 204));

        lblbrand.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblbrand.setForeground(new java.awt.Color(255, 255, 255));
        lblbrand.setText("Brand:");

        lblminseat.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblminseat.setForeground(new java.awt.Color(255, 255, 255));
        lblminseat.setText("Minimum Seat:");

        lblmaxseat.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblmaxseat.setForeground(new java.awt.Color(255, 255, 255));
        lblmaxseat.setText("Maximum Seat:");

        lblmodelno.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblmodelno.setForeground(new java.awt.Color(255, 255, 255));
        lblmodelno.setText("Model No:");

        lblserialnum.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblserialnum.setForeground(new java.awt.Color(255, 255, 255));
        lblserialnum.setText("Serial Number:");

        lblyearmanufacture.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblyearmanufacture.setForeground(new java.awt.Color(255, 255, 255));
        lblyearmanufacture.setText("Year of Manufacture:");

        lblavailablecity.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblavailablecity.setForeground(new java.awt.Color(255, 255, 255));
        lblavailablecity.setText("Available in City:");

        lblMC.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblMC.setForeground(new java.awt.Color(255, 255, 255));
        lblMC.setText("Maintainance Certificate:");

        lblavailableinuber.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblavailableinuber.setForeground(new java.awt.Color(255, 255, 255));
        lblavailableinuber.setText("Availability for UBER:");

        javax.swing.GroupLayout pnlforattributecolorsLayout = new javax.swing.GroupLayout(pnlforattributecolors);
        pnlforattributecolors.setLayout(pnlforattributecolorsLayout);
        pnlforattributecolorsLayout.setHorizontalGroup(
            pnlforattributecolorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforattributecolorsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlforattributecolorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblavailableinuber)
                    .addComponent(lblminseat)
                    .addComponent(lblmodelno)
                    .addComponent(lblmaxseat)
                    .addComponent(lblserialnum)
                    .addComponent(lblbrand)
                    .addComponent(lblyearmanufacture)
                    .addComponent(lblavailablecity)
                    .addComponent(lblMC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlforattributecolorsLayout.setVerticalGroup(
            pnlforattributecolorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforattributecolorsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblbrand)
                .addGap(18, 18, 18)
                .addComponent(lblmodelno)
                .addGap(18, 18, 18)
                .addComponent(lblminseat)
                .addGap(18, 18, 18)
                .addComponent(lblmaxseat)
                .addGap(26, 26, 26)
                .addComponent(lblserialnum)
                .addGap(27, 27, 27)
                .addComponent(lblyearmanufacture)
                .addGap(27, 27, 27)
                .addComponent(lblavailablecity)
                .addGap(18, 18, 18)
                .addComponent(lblMC)
                .addGap(28, 28, 28)
                .addComponent(lblavailableinuber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlforbuttons.setBackground(new java.awt.Color(102, 0, 204));

        CreateCar.setBackground(new java.awt.Color(255, 255, 153));
        CreateCar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CreateCar.setText("SAVE");
        CreateCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCarActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(255, 255, 153));
        Back.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Back.setText("<<GO BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlforbuttonsLayout = new javax.swing.GroupLayout(pnlforbuttons);
        pnlforbuttons.setLayout(pnlforbuttonsLayout);
        pnlforbuttonsLayout.setHorizontalGroup(
            pnlforbuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforbuttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlforbuttonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CreateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        pnlforbuttonsLayout.setVerticalGroup(
            pnlforbuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforbuttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Back)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlforattributecolors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmanufactureyear, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmaxseat, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtserialnum, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmodelno, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtminseat, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtavialablecity, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(rbYesAvailability)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNoAvailability))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(rbYesMC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNoMC)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlforbuttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(pnlforbuttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(txtbrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtmodelno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtminseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtmaxseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtserialnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtmanufactureyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txtavialablecity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbYesMC)
                            .addComponent(rbNoMC))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbYesAvailability)
                            .addComponent(rbNoAvailability)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlforattributecolors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
           usrcontain.remove(this);
           CardLayout layout = (CardLayout) usrcontain.getLayout();
           layout.previous(usrcontain);
    }//GEN-LAST:event_BackActionPerformed

    private void CreateCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCarActionPerformed
        String brandcar = "";
        String modenum="";
        String avbcity="";
                    
            if(txtbrand.getText().equals("") || txtmodelno.getText().equals("") || txtavialablecity.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Enter all the fileds");            
            }
            else{
                 brandcar = txtbrand.getText();
                 modenum = txtmodelno.getText();
                 avbcity=txtavialablecity.getText();
            }
        try{    
        int manufactyr = (Integer.parseInt(txtmanufactureyear.getText()));
        int mnseat = Integer.parseInt(txtminseat.getText());
        int mxseat = Integer.parseInt(txtmaxseat.getText());
        int serlnum = Integer.parseInt(txtserialnum.getText());   
        
            if (!(mnseat > 0)) {
                JOptionPane.showMessageDialog(null, "Min Seat has to be more than 0");
return;
            }

            if (mxseat > 20) {
                JOptionPane.showMessageDialog(null, "Max Seat has to be less than 20");
return;
            }
////if (mnseat>mxseat){
////JOptionPane.showMessageDialog(null, "Min can not be greater than max");
////return;
//}

           if (manufactyr > 2023) {
                JOptionPane.showMessageDialog(null, "Enter validate Manufacturing Year");
return;
            }
                            
       if(buttonGroup2.getSelection()==null || buttonGroup1.getSelection()==null)
       { 
        JOptionPane.showMessageDialog(null, "All fields are required!!");
       }
       else {
        UberCar car = carlistinfo.addcar();
        car.setBrand(brandcar);
        car.setModnumber(modenum);
        car.setMinseats(mnseat);
        car.setMaxseats(mxseat);
        car.setSrnumber(serlnum);
        car.setManufacture(manufactyr);
        car.setCityAvailable(avbcity);

         if(rbYesAvailability.isSelected()){
            car.setAvailable(true);
        }else if(rbNoAvailability.isSelected()){
            car.setAvailable(false);
                }         
         if(rbYesMC.isSelected()){
            car.setMaintcert (true);
        }else if(rbNoMC.isSelected()){
            car.setMaintcert(false);
        }

        JOptionPane.showMessageDialog(null, "Details of cars are Added Successfully");
                
        txtbrand.setText("");
        txtavialablecity.setText("");
        txtmaxseat.setText("");
        txtminseat.setText("");
        txtmodelno.setText("");
        txtserialnum.setText("");
        txtmanufactureyear.setText("");
        }
        }
 catch(NumberFormatException c){ JOptionPane.showMessageDialog(null, "Enter the Input Correctly");}        
    }//GEN-LAST:event_CreateCarActionPerformed

    private void txtminseatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtminseatActionPerformed
//try {
//            if (txtminseat.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Seat no. is needed");
//                return;
//            } else {
//                int minseats = Integer.parseInt(txtminseat.getText());
//                if (txtminseat.getText().length() == 1) {
//                    JOptionPane.showMessageDialog(this, "Min seat has to be 2"); 
//                    return;
//                }
//                UberCar.setMinseats(txtminseat);
//            }
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(this, "Correct The format of Seat number");
//            return;
//        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtminseatActionPerformed

    private void rbYesMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbYesMCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbYesMCActionPerformed

    private void rbNoAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNoAvailabilityActionPerformed

    private void txtmaxseatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaxseatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaxseatActionPerformed

    private void txtmanufactureyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmanufactureyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmanufactureyearActionPerformed
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton CreateCar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMC;
    private javax.swing.JLabel lblavailablecity;
    private javax.swing.JLabel lblavailableinuber;
    private javax.swing.JLabel lblbrand;
    private javax.swing.JLabel lblcreatecardetails;
    private javax.swing.JLabel lblmaxseat;
    private javax.swing.JLabel lblminseat;
    private javax.swing.JLabel lblmodelno;
    private javax.swing.JLabel lblserialnum;
    private javax.swing.JLabel lblyearmanufacture;
    private javax.swing.JPanel pnlforattributecolors;
    private javax.swing.JPanel pnlforbuttons;
    private javax.swing.JRadioButton rbNoAvailability;
    private javax.swing.JRadioButton rbNoMC;
    private javax.swing.JRadioButton rbYesAvailability;
    private javax.swing.JRadioButton rbYesMC;
    private javax.swing.JTextField txtavialablecity;
    private javax.swing.JTextField txtbrand;
    private javax.swing.JTextField txtmanufactureyear;
    private javax.swing.JTextField txtmaxseat;
    private javax.swing.JTextField txtminseat;
    private javax.swing.JTextField txtmodelno;
    private javax.swing.JTextField txtserialnum;
    // End of variables declaration//GEN-END:variables
}
