package project;
import com.sun.istack.internal.logging.Logger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author JUN
 */
public class JTable extends javax.swing.JFrame{
    float price = 0;
    float vtotal, vtothar;
    float vrevenue;
    float vprice, vpay, vchange;
    float vtotal2 = 0;
    
    /**
     * Creates new form JTable
     */
    public JTable() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProductCode = new javax.swing.JTextField();
        ProductName = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        submit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        reset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("华文隶书", 1, 36)); // NOI18N
        jLabel1.setText("Vehicle Sales Record");

        jLabel2.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        jLabel2.setText("Code");

        jLabel3.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        jLabel3.setText("Quantity");

        jLabel4.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        jLabel4.setText("Product Name");

        jLabel5.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        jLabel5.setText("Price");

        ProductCode.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        ProductCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductCodeActionPerformed(evt);
            }
        });

        ProductName.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        ProductName.setEnabled(false);

        Quantity.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });

        Price.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        Price.setEnabled(false);
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("微软雅黑", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product Name", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(1);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(2).setMinWidth(1);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(3).setMinWidth(1);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(1);
        }

        submit.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        submit.setText("SUBMIT CODE AND QUANTITY");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        clear.setText("CLEAR CODE & QTY");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("等线 Light", 1, 20)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Code   Car Types                                    RM\n1        Audi A1 1.4 TFSI                          150000\n2        Audi A3 Sedan 1.4 TFSI               200000\n3        BMW 740Le xDrive                      175000\n4        BMW M850i xDrive Coupe           220000\n5        Honda HR-V 1.8 CVT S               180000\n6        Honda Civic Type R                     120000\n7        Mazda Biante 2.0 SkyActiv-G      145000\n8        Mazda CX-9 2.5 SkyActiv-G        128000");
        jTextArea1.setEnabled(false);
        jScrollPane3.setViewportView(jTextArea1);

        reset.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        reset.setText("RESET ALL SALES");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        jButton1.setText("EXIT THE APP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        jButton2.setText("EXPORT SALES TO FILE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        jButton3.setText("IMPORT SALES FROM FILE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        jLabel6.setText("*Please click \"Enter\" after insert code");

        jLabel7.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        jLabel7.setText("*Please click \"Enter\" after insert quantity");

        jLabel8.setFont(new java.awt.Font("等线 Light", 1, 18)); // NOI18N
        jLabel8.setText("*Please click \"Submit\" to show the sales in table");

        jLabel9.setFont(new java.awt.Font("微软雅黑", 1, 18)); // NOI18N
        jLabel9.setText("*You can edit the sales in the file and import again in table (Example - Delete any row in file and save the file)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(submit))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3)
                                    .addComponent(clear)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(96, 96, 96))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset)
                            .addComponent(jButton1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>                        

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
    }                                     

    private void ProductCodeActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Integer code;
        code = Integer.parseInt(ProductCode.getText());
        
        if(code == 1){
           ProductName.setText("Audi_A1_1.4_TFSI");
           price = 150000;
           Price.setText(String.valueOf(price));
        }
        else if(code == 2){
           ProductName.setText("Audi_A3_Sedan_1.4_TFSI");
           price = 200000;
           Price.setText(String.valueOf(price));
        }
        else if(code == 3){
           ProductName.setText("BMW_740_Le_xDrive");
           price = 175000;
           Price.setText(String.valueOf(price));
        }
        else if(code == 4){
           ProductName.setText("BMW_M850i_xDrive_Coupe");
           price = 220000;
           Price.setText(String.valueOf(price));
        }
        else if(code == 5){
           ProductName.setText("Honda_HR-V_1.8_CVT_S");
           price = 180000;
           Price.setText(String.valueOf(price));
        }
        else if(code == 6){
           ProductName.setText("Honda_Civic_Type_R");
           price = 120000;
           Price.setText(String.valueOf(price));
        }
        else if(code == 7){
           ProductName.setText("Mazda_Biante_2.0_Sky_Activ-G");
           price = 145000;
           Price.setText(String.valueOf(price));
        }
        else if(code == 8){
           ProductName.setText("Mazda_CX-9_2.5_Sky_Activ-G");
           price = 128000;
           Price.setText(String.valueOf(price));
        }
    }                                           

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {                                         
        float total;
        total = Float.parseFloat(Quantity.getText());
        
        vtotal = total * price;
        Price.setText(String.valueOf(vtotal));
    }                                        

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {                                    
        
    }                                   

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {                                       
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object [] {ProductCode.getText(), ProductName.getText(), Quantity.getText(), "RM" + Price.getText()});
         vtotal = Float.parseFloat(Price.getText());
        vtotal2 += vtotal;
    }                                      

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {                                      
        ProductCode.setText("");
        ProductName.setText("");
        Quantity.setText("1");
        price = 0;
        vtotal2 = 0;
        Price.setText(String.valueOf(0));
    }                                     

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {                                      
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        while(model.getRowCount()>0){
            for(int i = 0; i < model.getRowCount(); i++){
                model.removeRow(i);
                }
        }
        
                 
              
        
    }                                     

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String filePath = "VehicleSalesList.txt";
        File file = new File(filePath);
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0 ; i < jTable1.getRowCount() ; i++){
                for(int j = 0 ; j < jTable1.getColumnCount() ; j++){
                    bw.write(jTable1.getValueAt(i, j).toString() + " ");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        }catch(IOException ex){
               java.util.logging.Logger.getLogger(JTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String filePath = "VehicleSalesList.txt";
        File file = new File(filePath);
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            Object[] lines = br.lines().toArray();
            
            for(int i = 0 ; i < lines.length ; i++){
                String[] row = lines[i].toString().split(" ");
                model.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

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
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField Price;
    private javax.swing.JTextField ProductCode;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton clear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    // End of variables declaration                   
}