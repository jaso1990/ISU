
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class GroceryStore extends javax.swing.JFrame {

    
    
    ArrayList <Item> list;
    
    int quant; //used to count quant from txtfields
    String size; //needed for size of clothing
    int inch; //used for eletronics
    String err = "Error. Invalid Quantity Entered"; //error code for incorrect inputs
    
    Item i; //will be used to create food items
    Cash c; //payment for cash
    Debit d; //payment for debit
    Clothing cloth; //creates clothing
    Electronic e; //creates electronics
    
    public GroceryStore() {
        initComponents();
        list = new ArrayList();
        Scanner s = new Scanner (System.in);
        
        //disable both payment options until an item is added to cart
        mnucash.setEnabled(false);
        mnudebit.setEnabled(false);  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        box = new javax.swing.JPanel();
        txtkimono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnkim = new javax.swing.JButton();
        txtsom = new javax.swing.JPanel();
        txtsombrero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnsomb = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        txtparka = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnparka = new javax.swing.JButton();
        box2 = new javax.swing.JPanel();
        txtspeedo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnspeedo = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        txtsandals = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnsand = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        txtdress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnsun = new javax.swing.JButton();
        txtsom1 = new javax.swing.JPanel();
        txtsize = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        txtsword = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnsword = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        txtshark = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btnshark = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        txtrattle = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        btnrattle = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        txtrhino = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btnrhino = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        txtcomputer = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btncom = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        txttv = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btntv = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        txt4dtv = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btn4dtv = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        txtlaptop = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        btnlap = new javax.swing.JButton();
        txtsom2 = new javax.swing.JPanel();
        txtinch = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        txtdurian = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btndur = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        txtban = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnban = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        txtpine = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnpine = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        txtmango = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnman = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        txtcoco = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btncoc = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        txtdrag = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btndrag = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuretail = new javax.swing.JMenu();
        mnucat = new javax.swing.JMenuItem();
        mnulist = new javax.swing.JMenu();
        mnuseeall = new javax.swing.JMenuItem();
        mnuclear = new javax.swing.JMenuItem();
        mnucheckout = new javax.swing.JMenu();
        mnucash = new javax.swing.JMenuItem();
        mnudebit = new javax.swing.JMenuItem();
        mnucustom = new javax.swing.JMenu();
        mnucust = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        jButton6.setText("ADD");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLOTHING");

        box.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Kimono:");

        btnkim.setText("ADD");
        btnkim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout boxLayout = new javax.swing.GroupLayout(box);
        box.setLayout(boxLayout);
        boxLayout.setHorizontalGroup(
            boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtkimono, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnkim)
                .addContainerGap())
        );
        boxLayout.setVerticalGroup(
            boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtkimono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkim))
                .addGap(25, 25, 25))
        );

        txtsom.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Sombrero:");

        btnsomb.setText("ADD");
        btnsomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsombActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtsomLayout = new javax.swing.GroupLayout(txtsom);
        txtsom.setLayout(txtsomLayout);
        txtsomLayout.setHorizontalGroup(
            txtsomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtsomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtsombrero, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsomb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        txtsomLayout.setVerticalGroup(
            txtsomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtsomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(txtsomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtsombrero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsomb))
                .addGap(25, 25, 25))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Parka:");

        btnparka.setText("ADD");
        btnparka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnparkaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtparka, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnparka)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtparka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnparka))
                .addGap(25, 25, 25))
        );

        box2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Speedo:");

        btnspeedo.setText("ADD");
        btnspeedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnspeedoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout box2Layout = new javax.swing.GroupLayout(box2);
        box2.setLayout(box2Layout);
        box2Layout.setHorizontalGroup(
            box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, box2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txtspeedo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnspeedo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        box2Layout.setVerticalGroup(
            box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, box2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtspeedo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnspeedo))
                .addGap(25, 25, 25))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtsandals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsandalsActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Sandals:");

        btnsand.setText("ADD");
        btnsand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsandals, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsand)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtsandals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsand))
                .addGap(25, 25, 25))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Sun Dress:");

        btnsun.setText("ADD");
        btnsun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtdress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnsun)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsun))
                .addGap(25, 25, 25))
        );

        txtsom1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Select Size (S, M, L, XL):");

        javax.swing.GroupLayout txtsom1Layout = new javax.swing.GroupLayout(txtsom1);
        txtsom1.setLayout(txtsom1Layout);
        txtsom1Layout.setHorizontalGroup(
            txtsom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtsom1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtsize, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        txtsom1Layout.setVerticalGroup(
            txtsom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtsom1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(txtsom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtsom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(box2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(txtsom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsom1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DELI");

        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("SwordFish:");

        btnsword.setText("ADD");
        btnsword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsword)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtsword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsword))
                .addGap(25, 25, 25))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Shark:");

        btnshark.setText("ADD");
        btnshark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsharkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(txtshark, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnshark)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtshark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnshark))
                .addGap(25, 25, 25))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Rattlesnake:");

        btnrattle.setText("ADD");
        btnrattle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrattleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtrattle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnrattle)
                .addGap(9, 9, 9))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtrattle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrattle))
                .addGap(25, 25, 25))
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Rhino Jerky:");

        btnrhino.setText("ADD");
        btnrhino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrhinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtrhino, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnrhino)
                .addGap(6, 6, 6))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtrhino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrhino))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ELECTRONICS");

        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Computer:");

        btncom.setText("ADD");
        btncom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcomputer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncom)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtcomputer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncom))
                .addGap(25, 25, 25))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Television:");

        btntv.setText("ADD");
        btntv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttv, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btntv)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txttv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntv))
                .addGap(25, 25, 25))
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("4D Television: ");

        btn4dtv.setText("ADD");
        btn4dtv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4dtvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt4dtv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn4dtv)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txt4dtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4dtv))
                .addGap(25, 25, 25))
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Laptop:");

        btnlap.setText("ADD");
        btnlap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtlaptop, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtlaptop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlap))
                .addGap(25, 25, 25))
        );

        txtsom2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtinch.setText("0");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Desired Size (30-100 inches): ");

        javax.swing.GroupLayout txtsom2Layout = new javax.swing.GroupLayout(txtsom2);
        txtsom2.setLayout(txtsom2Layout);
        txtsom2Layout.setHorizontalGroup(
            txtsom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtsom2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtinch, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        txtsom2Layout.setVerticalGroup(
            txtsom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtsom2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(txtsom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtinch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtsom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtsom2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HOWELL EXOTIC MARKETS");

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PRODUCE");

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Durian:");

        btndur.setText("ADD");
        btndur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdurian, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndur)
                .addGap(2, 2, 2))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtdurian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndur))
                .addGap(25, 25, 25))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Banannas:");

        btnban.setText("ADD");
        btnban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtban, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnban)
                .addGap(23, 23, 23))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnban))
                .addGap(25, 25, 25))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Pineapples:");

        btnpine.setText("ADD");
        btnpine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpine)
                .addGap(18, 18, 18)
                .addComponent(btnpine)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtpine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpine))
                .addGap(25, 25, 25))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Mango:");

        btnman.setText("ADD");
        btnman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmango, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnman)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtmango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnman))
                .addGap(25, 25, 25))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Coconuts:");

        btncoc.setText("ADD");
        btncoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcoco, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncoc)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtcoco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncoc))
                .addGap(25, 25, 25))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Dragon Fruit:");

        btndrag.setText("ADD");
        btndrag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndragActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdrag)
                .addGap(12, 12, 12)
                .addComponent(btndrag)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtdrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndrag))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuretail.setText("CATALOGUE");

        mnucat.setText("View Catalogue");
        mnucat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucatActionPerformed(evt);
            }
        });
        mnuretail.add(mnucat);

        jMenuBar1.add(mnuretail);

        mnulist.setText("SHOPPING LIST");

        mnuseeall.setText("See All");
        mnuseeall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuseeallActionPerformed(evt);
            }
        });
        mnulist.add(mnuseeall);

        mnuclear.setText("Clear List");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        mnulist.add(mnuclear);

        jMenuBar1.add(mnulist);

        mnucheckout.setText("CHECKOUT");

        mnucash.setText("Pay Cash");
        mnucash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucashActionPerformed(evt);
            }
        });
        mnucheckout.add(mnucash);

        mnudebit.setText("Pay Debit");
        mnudebit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudebitActionPerformed(evt);
            }
        });
        mnucheckout.add(mnudebit);

        jMenuBar1.add(mnucheckout);

        mnucustom.setText("ADD CUSTOM ITEM");

        mnucust.setText("Custom");
        mnucust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucustActionPerformed(evt);
            }
        });
        mnucustom.add(mnucust);

        jMenuBar1.add(mnucustom);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuseeallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuseeallActionPerformed
        ListPopUp form = new ListPopUp(this, true);
        form.setForm(list); //will send list into setForm method in ListPopUp
        form.setModal(true); //gives control to popup until dismissed
        form.setLocationRelativeTo(this); //pop up right over the form
        form.setVisible(true);
        
    }//GEN-LAST:event_mnuseeallActionPerformed

    private void mnudebitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudebitActionPerformed
        double total = 0; 
        //gets total from each item in list and adds it to total
        for (Item item : list) {
            total += item.total();
        }
        d = new Debit (total); //create debit
        while (true){
            String pin = JOptionPane.showInputDialog(this, "Enter 4 Digit PIN: "); //enter 4 digit pin
            if (d.validatePIN(pin)){ //if pin is valid
                if (d.randomDecline() ==  true){ //will decline 1 in 5 times
                    JOptionPane.showMessageDialog(this, "Error. Card Declined. Please try new payment method.");
                    break;
                }
                else{ //if card doesnt decline, payment is complete
                   JOptionPane.showMessageDialog(this, "Payment Complete!"); 
                   //once payment is complete, empty list and disable payment
                   list.clear();    
                   total = 0;
                   mnucash.setEnabled(false);
                   mnudebit.setEnabled(false);
                   break;                 
                }
            }
            else //if pin is incorrect, jumps to an error message
                JOptionPane.showMessageDialog(this, "Error: Please enter correct 4 digit PIN.");
        } 
    }//GEN-LAST:event_mnudebitActionPerformed

    private void txtsandalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsandalsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsandalsActionPerformed

    private void btnbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbanActionPerformed
        while (true){
            quant = Integer.parseInt(txtban.getText()); //reads in quantity
            i = new Produce ("Bannana"); //creates item, no cost or type& needed since produce has a final cost
            if (i.validateQuant(quant)){ //item only added to shopping list if the quantity is valid
                i.total(); //sets total
                list.add(i); //adds to list
                //as long as one item is in the bag, payment becomes true
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, i.getName() + " Successfully Added!"); //pop up to confirm 
                break;
            }
                else{ //else, the quantity inputted was invalid
                    JOptionPane.showMessageDialog(this, err);
                    txtban.setText("0"); //reset quant box
                    break;
                }
            }
    }//GEN-LAST:event_btnbanActionPerformed

    private void btndurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndurActionPerformed
         while (true){ //performs the same as banana
            quant = Integer.parseInt(txtdurian.getText());
            i = new Produce ("Durian"); //creates item, no cost needed since produce has a final cost
            if (i.validateQuant(quant)){ //item only added to shopping list if the quantity is valid
                i.total(); //must calculate the subtotal before adding to list
                list.add(i);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, i.getName() + " Successfully Added!");
                break;
            }
                else{
                    JOptionPane.showMessageDialog(this, err);
                    txtdurian.setText("0");
                    break;
                }
            }
    }//GEN-LAST:event_btndurActionPerformed

    private void btnmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanActionPerformed
         while (true){
            quant = Integer.parseInt(txtmango.getText());
            Produce i = new Produce ("Mango"); //creates item, no cost needed since produce has a final cost
            if (i.validateQuant(quant)){ //item only added to shopping list if the quantity is valid
                i.total();    
                list.add(i);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, i.getName() + " Successfully Added!");
                break;
                }
                else{
                    JOptionPane.showMessageDialog(this, err);
                    txtmango.setText("0");
                    break;
                }
            }
    }//GEN-LAST:event_btnmanActionPerformed

    private void btnpineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpineActionPerformed
         while (true){
            quant = Integer.parseInt(txtpine.getText());
            i = new Produce ("Pineapple"); //creates item, no cost needed since produce has a final cost
            if (i.validateQuant(quant)){ //item only added to shopping list if the quantity is valid
                i.total();    
                list.add(i);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, i.getName() + " Successfully Added!");
                break;
                }
                else{
                    JOptionPane.showMessageDialog(this, err);
                    txtpine.setText("0");
                    break;
                }
            }
    }//GEN-LAST:event_btnpineActionPerformed

    private void btncocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncocActionPerformed
         while (true){
            quant = Integer.parseInt(txtcoco.getText());
            i = new Produce ("Coconut"); //creates item, no cost needed since produce has a final cost
            if (i.validateQuant(quant)){ //item only added to shopping list if the quantity is valid
                i.total();    
                list.add(i);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, i.getName() + " Successfully Added!");
                break;
                }
                else{
                    JOptionPane.showMessageDialog(this, err);
                    txtcoco.setText("0");
                    break;
                }
            }
    }//GEN-LAST:event_btncocActionPerformed

    private void btndragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndragActionPerformed
         while (true){
            quant = Integer.parseInt(txtdrag.getText());
            i = new Produce ("Durian"); //creates item, no cost needed since produce has a final cost
            if (i.validateQuant(quant)){ //item only added to shopping list if the quantity is valid
                i.total();
                list.add(i);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, i.getName() + " Successfully Added!");
                break;
                }
                else{
                    JOptionPane.showMessageDialog(this, err);
                    txtdrag.setText("0");
                    break;
                }
            }
    }//GEN-LAST:event_btndragActionPerformed

    private void btnswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnswordActionPerformed
         while (true){ //deli performs same as produce
            quant = Integer.parseInt(txtsword.getText());
            i = new Deli ("SwordFish"); //creates item, no cost needed since produce has a final cost
            if (i.validateQuant(quant)){ //item only added to shopping list if the quantity is valid
                i.total();    
                list.add(i);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, i.getName() + " Successfully Added!");
                break;
                }
                else{
                    JOptionPane.showMessageDialog(this, err);
                    txtsword.setText("0");
                    break;
                }
            }
    }//GEN-LAST:event_btnswordActionPerformed

    private void btnsharkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsharkActionPerformed
        while (true){
            quant = Integer.parseInt(txtshark.getText());
            i = new Deli ("Shark"); //creates item, no cost needed since produce has a final cost
            if (i.validateQuant(quant)){ //item only added to shopping list if the quantity is valid
                i.total();    
                list.add(i);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, i.getName() + " Successfully Added!");
                break;
                }
                else{
                    JOptionPane.showMessageDialog(this, err);
                    txtshark.setText("0");
                    break;
                }
            }
    }//GEN-LAST:event_btnsharkActionPerformed

    private void btnrhinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrhinoActionPerformed
        while (true){
            quant = Integer.parseInt(txtrhino.getText());
            i = new Deli ("Rhino Jerky"); //creates item, no cost needed since produce has a final cost
            if (i.validateQuant(quant)){ //item only added to shopping list if the quantity is valid
                i.total();    
                list.add(i);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, i.getName() + " Successfully Added!");
                break;
                }
                else{
                    JOptionPane.showMessageDialog(this, err);
                    txtrhino.setText("0");
                    break;
                }
            }
    }//GEN-LAST:event_btnrhinoActionPerformed

    private void btnrattleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrattleActionPerformed
        while (true){
            quant = Integer.parseInt(txtrattle.getText());
            i = new Deli ("Rattle Snake"); //creates item, no cost needed since produce has a final cost
            if (i.validateQuant(quant)){ //item only added to shopping list if the quantity is valid
                i.total();    
                list.add(i);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, i.getName() + " Successfully Added!");
                break;
                }
                else{
                    JOptionPane.showMessageDialog(this, err);
                    txtrattle.setText("0"); //reset input to zero 
                    break;
                }
            }
    }//GEN-LAST:event_btnrattleActionPerformed

    private void mnucashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucashActionPerformed
        double total = 0; //start total at 0
        //for each item in list, add total
        for (Item item : list) {
            total += item.total();
        }
        c = new Cash(total); //creates cash payment
        while (true){ //displays a user input for cash tendered
            double tender = Integer.parseInt(JOptionPane.showInputDialog(this, "Total is: $" + total + ". Please Tender Cash"));
            if (c.validateTender(tender) == true){ //if cash is enough, set the change you are owed
                c.setChange(total, tender);
                break;
            }
            else //will run if payment is less than total
                JOptionPane.showMessageDialog(this, "Error. Tendered Cash must be greater than payment.");    
            }
        //once payment goes through, loop breaks to here
        JOptionPane.showMessageDialog(this, "Payment Complete. Your Change is: $" + c.getChange()); //show change
        list.clear(); //remove all items from list
        mnucash.setEnabled(false); //disable payments until new item is added to list
        mnudebit.setEnabled(false);
        total = 0; //reset total to 0
            
        
    }//GEN-LAST:event_mnucashActionPerformed

    private void btnsombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsombActionPerformed
        while (true) {
            quant = Integer.parseInt(txtsombrero.getText()); //get size from txt
            size = txtsize.getText(); //get size from txt
            cloth = new Clothing("Sombrero", 20.00, "Clothing"); //creates item
            if (cloth.validateSize(size) && cloth.validateQuant(quant)) { //if size is ok, move on to next step
                cloth.total(); //sets total
                list.add(cloth); //add to list
                mnucash.setEnabled(true); //enable payment options
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, cloth.getName() + " Successfully Added!");
                break;
            } 
            //runs this code if size is OK but quantity is invalid
            else if (cloth.validateSize(size) && cloth.validateQuant(quant)==false){
                JOptionPane.showMessageDialog(this, err);
                txtsombrero.setText("0");
                break;
            }
            //runs this code if size is OK but quantity is invalid
            else if (cloth.validateSize(size) == false  && cloth.validateQuant(quant)){
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size."); 
                txtsize.setText("");
                break;
            }
            //runs this code if size and quantity are invalid
            else{ 
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size & Quantity.");  
                txtsize.setText("");
                txtsombrero.setText("0");
                break;
            }
        }
   
    }//GEN-LAST:event_btnsombActionPerformed

    private void btnkimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkimActionPerformed
        while (true) { //runs same as other clothing
            quant = Integer.parseInt(txtkimono.getText());
            size = txtsize.getText();
            cloth = new Clothing("Kimono", 50.00, "Clothing"); //creates item, each item has its own price
            
            if (cloth.validateSize(size) && cloth.validateQuant(quant)) { //if size is ok, move on to next step
                cloth.total();
                list.add(cloth);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, cloth.getName() + " Successfully Added!");
                break;
            } 
            else if (cloth.validateSize(size) && cloth.validateQuant(quant)==false){
                JOptionPane.showMessageDialog(this, err);
                txtkimono.setText("0");
                break;
            }
            
            else if (cloth.validateSize(size) == false  && cloth.validateQuant(quant)){
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size."); 
                txtsize.setText("");
                break;
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size & Quantity.");  
                txtsize.setText("");
                txtkimono.setText("0");
                break;
            }
        }                             
    }//GEN-LAST:event_btnkimActionPerformed

    private void btnspeedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnspeedoActionPerformed
        while (true) { //runs same as other clothing
            quant = Integer.parseInt(txtspeedo.getText());
            size = txtsize.getText();
            cloth = new Clothing("Speedo", 20.00, "Clothing"); //creates item
            
            if (cloth.validateSize(size) && cloth.validateQuant(quant)) { //if size is ok, move on to next step
                cloth.total();
                list.add(cloth);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, cloth.getName() + " Successfully Added!");
                break;
            } 
            else if (cloth.validateSize(size) && cloth.validateQuant(quant)==false){
                JOptionPane.showMessageDialog(this, err);
                txtspeedo.setText("0");
                break;
            }
            
            else if (cloth.validateSize(size) == false  && cloth.validateQuant(quant)){
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size."); 
                txtsize.setText("");
                break;
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size & Quantity.");  
                txtsize.setText("");
                txtspeedo.setText("0");
                break;
            }
        }                              
    }//GEN-LAST:event_btnspeedoActionPerformed

    private void btnparkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnparkaActionPerformed
        while (true) { //same as other clothing
            quant = Integer.parseInt(txtparka.getText());
            size = txtsize.getText();
            cloth = new Clothing("Parka", 100.00, "Clothing"); //creates item
            
            if (cloth.validateSize(size) && cloth.validateQuant(quant)) { //if size is ok, move on to next step
                cloth.total();
                list.add(cloth);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, cloth.getName() + " Successfully Added!");
                break;
            } 
            else if (cloth.validateSize(size) && cloth.validateQuant(quant)==false){
                JOptionPane.showMessageDialog(this, err);
                txtparka.setText("0");
                break;
            }
            
            else if (cloth.validateSize(size) == false  && cloth.validateQuant(quant)){
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size."); 
                txtsize.setText("");
                break;
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size & Quantity.");  
                txtsize.setText("");
                txtparka.setText("0");
                break;
            }
        }                              
    }//GEN-LAST:event_btnparkaActionPerformed

    private void btnsandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsandActionPerformed
        while (true) { //same as other clothing
            quant = Integer.parseInt(txtsandals.getText());
            size = txtsize.getText();
            cloth = new Clothing("Sandals", 20.00, "Clothing"); //creates item
            
            if (cloth.validateSize(size) && cloth.validateQuant(quant)) { //if size is ok, move on to next step
                cloth.total();
                list.add(cloth);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, cloth.getName() + " Successfully Added!");
                break;
            } 
            else if (cloth.validateSize(size) && cloth.validateQuant(quant)==false){
                JOptionPane.showMessageDialog(this, err);
                txtsandals.setText("");
                break;
            }
            
            else if (cloth.validateSize(size) == false  && cloth.validateQuant(quant)){
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size."); 
                txtsize.setText("");
                break;
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size & Quantity.");  
                txtsize.setText("");
                txtsandals.setText("");
                break;
            }
        }                             
    }//GEN-LAST:event_btnsandActionPerformed

    private void btnsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsunActionPerformed
        while (true) {
            quant = Integer.parseInt(txtdress.getText());
            size = txtsize.getText();
            cloth = new Clothing("Kimono", 50.00, "Clothing"); //creates item
            
            if (cloth.validateSize(size) && cloth.validateQuant(quant)) { //if size is ok, move on to next step
                cloth.total();
                list.add(cloth);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, cloth.getName() + " Successfully Added!");
                break;
            } 
            else if (cloth.validateSize(size) && cloth.validateQuant(quant)==false){
                JOptionPane.showMessageDialog(this, err);
                txtdress.setText("0");
                break;
            }
            
            else if (cloth.validateSize(size) == false  && cloth.validateQuant(quant)){
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size."); 
                txtsize.setText("");
                break;
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size & Quantity.");  
                txtsize.setText("");
                txtdress.setText("0");
                break;
            }
        }                             
    }//GEN-LAST:event_btnsunActionPerformed

    private void btncomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomActionPerformed
        quant = Integer.parseInt(txtcomputer.getText()); //gets quantity
        inch = Integer.parseInt(txtinch.getText()); //gets inches
        e = new Electronic ("Computer", "Electronic"); //creates item
        while (true) {            
            if (e.validateInch(inch) && e.validateQuant(quant)) { //if size is ok, move on to next step
                e.total(); //sets subtotal
                list.add(e); //add to list
                mnucash.setEnabled(true); //enable payments
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, e.getName() + " Successfully Added!");
                break;
            } //if inch is ok, but quant is invalid
            else if (e.validateInch(inch) && e.validateQuant(quant)==false){
                JOptionPane.showMessageDialog(this, err);
                txtcomputer.setText("0"); //reset quant to 0
                break;
            }
            //if quant is ok, but size is invalid
            else if (e.validateInch(inch) == false  && e.validateQuant(quant)){
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size."); 
                txtinch.setText("0"); //reset inch to 0
                break;
            }
            //if inch and quant are invalid
            else{
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size & Quantity.");  
                txtinch.setText("0"); //reset both txts
                txtcomputer.setText("0");
                break;
            }
        }                             
    }//GEN-LAST:event_btncomActionPerformed

    private void btnlapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlapActionPerformed
        //runs the same as computer
        quant = Integer.parseInt(txtlaptop.getText());
        inch = Integer.parseInt(txtinch.getText());
        e = new Electronic ("Laptop", "Electronic"); //creates item
        while (true) {
            if (e.validateInch(inch) && e.validateQuant(quant)) { //if size is ok, move on to next step
                e.total();
                list.add(e);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, e.getName() + " Successfully Added!");
                break;
            } 
            else if (e.validateInch(inch) && e.validateQuant(quant)==false){
                JOptionPane.showMessageDialog(this, err);
                txtlaptop.setText("0");
                break;
            }
            
            else if (e.validateInch(inch) == false  && e.validateQuant(quant)){
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size."); 
                txtinch.setText("0");
                break;
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size & Quantity.");  
                txtinch.setText("0");
                txtlaptop.setText("0");
                break;
            }
        }                             
    }//GEN-LAST:event_btnlapActionPerformed

    private void btntvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntvActionPerformed
        //runs same as other electronics
        quant = Integer.parseInt(txttv.getText());
        inch = Integer.parseInt(txtinch.getText());
        e = new Electronic ("Television", "Electronic"); //creates item
        while (true) {
            if (e.validateInch(inch) && e.validateQuant(quant)) { //if size is ok, move on to next step
                e.total();
                list.add(e);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, e.getName() + " Successfully Added!");
                break;
            } 
            else if (e.validateInch(inch) && e.validateQuant(quant)==false){
                JOptionPane.showMessageDialog(this, err);
                txttv.setText("0");
                break;
            }
            
            else if (e.validateInch(inch) == false  && e.validateQuant(quant)){
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size."); 
                txtinch.setText("0");
                break;
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size & Quantity.");  
                txtinch.setText("0");
                txttv.setText("0");
                break;
            }
        }                             
    }//GEN-LAST:event_btntvActionPerformed

    private void btn4dtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4dtvActionPerformed
        //runs same as other electronics
        quant = Integer.parseInt(txt4dtv.getText());
        inch = Integer.parseInt(txtinch.getText());
        e = new Electronic ("4D Television", "Electronic"); //creates item
        while (true) {
            
            if (e.validateInch(inch) && e.validateQuant(quant)) { //if size is ok, move on to next step
                e.total();
                list.add(e);
                mnucash.setEnabled(true);
                mnudebit.setEnabled(true);
                JOptionPane.showMessageDialog(this, e.getName() + " Successfully Added!");
                break;
            } 
            else if (e.validateInch(inch) && e.validateQuant(quant)==false){
                JOptionPane.showMessageDialog(this, err);
                txt4dtv.setText("0");
                break;
            }
            
            else if (e.validateInch(inch) == false  && e.validateQuant(quant)){
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size."); 
                txtinch.setText("0");
                break;
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Error. Please Enter a Valid Size & Quantity.");  
                txtinch.setText("0");
                txt4dtv.setText("");
                break;
            }
        }                             
    }//GEN-LAST:event_btn4dtvActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        list.clear(); //empties list
        //since no items in bag, cant pay
        mnucash.setEnabled(false);
        mnudebit.setEnabled(false);
        
    }//GEN-LAST:event_mnuclearActionPerformed

    private void mnucatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucatActionPerformed
        //popup window containing catalogue that tells user about prices and items
        Catalogue cat  = new Catalogue (this, true);
        cat.setModal(true); //gives control to popup until dismissed
        cat.setLocationRelativeTo(this); //pop up right over the form
        cat.setVisible(true);
    }//GEN-LAST:event_mnucatActionPerformed

    private void mnucustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucustActionPerformed
        //pop up menu for adding a custom item
        CustomPopUp popup = new CustomPopUp (this, true);
        popup.setModal(true); //gives control to popup until dismissed
        popup.setLocationRelativeTo(this); //pop up right over the form
        popup.setVisible(true);
        
        i = popup.getItem(); //gets item from pop up
        i.total(); //sets total
        list.add(i); //adds it to list
        mnucash.setEnabled(true); //enable payment options
        mnudebit.setEnabled(true);
    }//GEN-LAST:event_mnucustActionPerformed

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
            java.util.logging.Logger.getLogger(GroceryStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroceryStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroceryStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroceryStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroceryStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel box;
    private javax.swing.JPanel box2;
    private javax.swing.JButton btn4dtv;
    private javax.swing.JButton btnban;
    private javax.swing.JButton btncoc;
    private javax.swing.JButton btncom;
    private javax.swing.JButton btndrag;
    private javax.swing.JButton btndur;
    private javax.swing.JButton btnkim;
    private javax.swing.JButton btnlap;
    private javax.swing.JButton btnman;
    private javax.swing.JButton btnparka;
    private javax.swing.JButton btnpine;
    private javax.swing.JButton btnrattle;
    private javax.swing.JButton btnrhino;
    private javax.swing.JButton btnsand;
    private javax.swing.JButton btnshark;
    private javax.swing.JButton btnsomb;
    private javax.swing.JButton btnspeedo;
    private javax.swing.JButton btnsun;
    private javax.swing.JButton btnsword;
    private javax.swing.JButton btntv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JMenuItem mnucash;
    private javax.swing.JMenuItem mnucat;
    private javax.swing.JMenu mnucheckout;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnucust;
    private javax.swing.JMenu mnucustom;
    private javax.swing.JMenuItem mnudebit;
    private javax.swing.JMenu mnulist;
    private javax.swing.JMenu mnuretail;
    private javax.swing.JMenuItem mnuseeall;
    private javax.swing.JTextField txt4dtv;
    private javax.swing.JTextField txtban;
    private javax.swing.JTextField txtcoco;
    private javax.swing.JTextField txtcomputer;
    private javax.swing.JTextField txtdrag;
    private javax.swing.JTextField txtdress;
    private javax.swing.JTextField txtdurian;
    private javax.swing.JTextField txtinch;
    private javax.swing.JTextField txtkimono;
    private javax.swing.JTextField txtlaptop;
    private javax.swing.JTextField txtmango;
    private javax.swing.JTextField txtparka;
    private javax.swing.JTextField txtpine;
    private javax.swing.JTextField txtrattle;
    private javax.swing.JTextField txtrhino;
    private javax.swing.JTextField txtsandals;
    private javax.swing.JTextField txtshark;
    private javax.swing.JTextField txtsize;
    private javax.swing.JPanel txtsom;
    private javax.swing.JPanel txtsom1;
    private javax.swing.JPanel txtsom2;
    private javax.swing.JTextField txtsombrero;
    private javax.swing.JTextField txtspeedo;
    private javax.swing.JTextField txtsword;
    private javax.swing.JTextField txttv;
    // End of variables declaration//GEN-END:variables
}
