
package Page;

import FormUntukLogin.FormAdmin;
import FormUntukLogin.FormUser;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import table.TableCustom;
import connecction.connect;
import java.awt.event.KeyEvent;
import passwordfield.MD5;



/**
 *
 * @author ALYA
 */
public class PageAP extends javax.swing.JFrame {
    String IDTawar, NamaBarang, tanggal, HargaAwal, Desc; //ini untuk barang
    String idLelang, idBarang, idMasyarakat, idPetugas, opsi, hargaTawar; //untuk lelang
    String idHistory, idBarangHistory, idLelangHistory; //untuk history lelang
    ResultSet SearchBarang=null;
    String IDBarang, IDuser, HargaAkhir, IDUser;
    
   // variabel untuk petugas
    String IDPetugas, namaPetugas, usernamePetugas, passwordPetugas; 
    // Variabel untuk Masyarakat
    String InputidMasyarakat, InputNamaMasyarakat, InputUsernameMasyarakat, InputPsswordMasyarakat, InputNoMasyarakat;
    
    PreparedStatement pst;
    ResultSet set; 

   DefaultTableModel tabmode;
    
    
    
    public PageAP() {
         
        
        
        
        initComponents();
        autoNumberBarang();
        autoNumberPenawaran();
        autoNumberHistory();
        autoNumberLelang();
        autoNumberPetugas();
        AutoNumberID();
        showDataBarang();
        ShowDataLelang();
        showDataMasyrakat();
        showDataPetugas();
        ShowDataHistoryLelang();
        showData();
        idBarang();
        idUser();
        idBarang();
        idBarangHistory();
        idLelangHistory();
        idMasyarakatHistory();
        idBarangLelang();
        idMasyarakatLelang();
        idPetugasLelang();
        showfullDataHistoryLelang();
        this.setExtendedState(MAXIMIZED_BOTH);
   
        
    }
    
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound_11 = new LoginPage.PanelRound_1();
        panelRound_12 = new LoginPage.PanelRound_1();
        ButtonDaftarBarang = new button.Button();
        ButtonDataPetugas = new button.Button();
        ButtonDataUser = new button.Button();
        ButtonDaftarLelang = new button.Button();
        panelRound_13 = new LoginPage.PanelRound_1();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button5 = new button.Button();
        button6 = new button.Button();
        button7 = new button.Button();
        button8 = new button.Button();
        button13 = new button.Button();
        ButtonHistoryLelang = new button.Button();
        button1 = new button.Button();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        HalamanDataMasyarakat = new javax.swing.JPanel();
        panelRound_20 = new LoginPage.PanelRound_1();
        panelRound_21 = new LoginPage.PanelRound_1();
        panelRound_111 = new LoginPage.PanelRound_1();
        ScrollPaneMasyarakat = new javax.swing.JScrollPane();
        TableMasyarakat = new javax.swing.JTable();
        FieldCariDataMasyarakat = new textfield.TextField_1();
        button12 = new button.Button();
        jLabel4 = new javax.swing.JLabel();
        panelRound_24 = new LoginPage.PanelRound_1();
        jLabel10 = new javax.swing.JLabel();
        FieldIDMasyarakat = new textfield.TextField();
        FieldNamaMasyarakat = new textfield.TextField();
        FieldUsernameMasyarakat = new textfield.TextField();
        FieldPasswordMasyarakat = new textfield.TextField();
        FieldNoTelp = new textfield.TextField();
        ButtonSimpanAkun1 = new button.Button();
        labelError1 = new javax.swing.JLabel();
        ButtonHapusAkunUser = new button.Button();
        buttonEditAkunUser = new button.Button();
        ButtonClearDataUser = new button.Button();
        HalamanDataPetugas = new javax.swing.JPanel();
        panelRound_18 = new LoginPage.PanelRound_1();
        panelRound_19 = new LoginPage.PanelRound_1();
        panelRound_110 = new LoginPage.PanelRound_1();
        ScrollPanePetugas = new javax.swing.JScrollPane();
        tablePetugas = new javax.swing.JTable();
        FieldCariDataPetugas = new textfield.TextField_1();
        button11 = new button.Button();
        jLabel5 = new javax.swing.JLabel();
        panelRound_23 = new LoginPage.PanelRound_1();
        jLabel9 = new javax.swing.JLabel();
        fieldIDPetugas = new textfield.TextField();
        fieldNamaPetugas = new textfield.TextField();
        fieldUsernamePetugas = new textfield.TextField();
        fieldPasswordPetugas = new textfield.TextField();
        ButtonSimpanAkun = new button.Button();
        labelError = new javax.swing.JLabel();
        buttonEditAkun = new button.Button();
        ButtonHapusAkun = new button.Button();
        ButtonClearData = new button.Button();
        HalamanDataLelang = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        panelRound_15 = new LoginPage.PanelRound_1();
        panelRound_16 = new LoginPage.PanelRound_1();
        jLabel6 = new javax.swing.JLabel();
        panelRound_17 = new LoginPage.PanelRound_1();
        CbIDBarang = new combobox.Combobox();
        TanggalDataLelang = new com.toedter.calendar.JDateChooser();
        CbIDMasyarakat = new combobox.Combobox();
        CbIDPetugas = new combobox.Combobox();
        buttonSimpanLelang = new button.Button();
        FieldIDLelang = new textfield.TextField_1();
        FieldHargaTawarLelang = new textfield.TextField_1();
        CbDataStatus = new combobox.Combobox();
        buttonEditLelang = new button.Button();
        buttonHapusLelang = new button.Button();
        buttonClear = new button.Button();
        ScrollPaneLelang = new javax.swing.JScrollPane();
        tableLelang = new javax.swing.JTable();
        FieldCariDataLelang = new textfield.TextField_1();
        button9 = new button.Button();
        FieldNamaDataLelang = new textfield.TextField_1();
        ScrollPanePenawaran1 = new javax.swing.JScrollPane();
        tableUser1 = new javax.swing.JTable();
        button17 = new button.Button();
        FieldCariDataMasyarakat2 = new textfield.TextField_1();
        HalamanDataBarang = new javax.swing.JPanel();
        panelRound_14 = new LoginPage.PanelRound_1();
        FieldIDBarang = new textfield.TextField_1();
        FieldNamaBarang = new textfield.TextField_1();
        TanggalDataBarang = new com.toedter.calendar.JDateChooser();
        FieldHargaAwalBarang = new textfield.TextField_1();
        ButtonSave = new button.Button();
        ButtonEdit = new button.Button();
        ButtonDelete = new button.Button();
        ButtonClear = new button.Button();
        ScrollPaneBarang = new javax.swing.JScrollPane();
        TableDataBarang = new javax.swing.JTable();
        FieldCariDataBarang = new textfield.TextField_1();
        button10 = new button.Button();
        panelRound_114 = new LoginPage.PanelRound_1();
        panelRound_115 = new LoginPage.PanelRound_1();
        textAreaScroll1 = new textarea.TextAreaScroll();
        DeskripsiDataBarang = new textarea.TextArea();
        jLabel7 = new javax.swing.JLabel();
        HalamanDataHistoryLelang = new javax.swing.JPanel();
        panelRound_112 = new LoginPage.PanelRound_1();
        panelRound_113 = new LoginPage.PanelRound_1();
        cbIDLelangHistory = new combobox.Combobox();
        FieldIDHistory = new textfield.TextField_1();
        cbIDBarangHistory = new combobox.Combobox();
        cbIDMasyarakatHistory = new combobox.Combobox();
        FieldHargaTawarHistory = new textfield.TextField_1();
        ButtonSimpanHistory = new button.Button();
        ScrollPanelHistoryLelang = new javax.swing.JScrollPane();
        TableHistoryLelang = new javax.swing.JTable();
        buttonEditHistory = new button.Button();
        buttonHapusHistory = new button.Button();
        buttonResetHistory = new button.Button();
        jLabel3 = new javax.swing.JLabel();
        button15 = new button.Button();
        FieldCariDataHistory = new textfield.TextField_1();
        FieldNamaBarangHistor = new textfield.TextField_1();
        FieldNamaUserHistory = new textfield.TextField_1();
        FrameDataPenawaran = new javax.swing.JPanel();
        panelRound_22 = new LoginPage.PanelRound_1();
        FieldTawar = new textfield.TextField_1();
        FieldHL = new textfield.TextField_1();
        FieldNB = new textfield.TextField_1();
        CbUser = new combobox.Combobox();
        FieldNU = new textfield.TextField_1();
        ButtonSave1 = new button.Button();
        ScrollPanePenawaran = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        ButtonEdit1 = new button.Button();
        ButtonDelete1 = new button.Button();
        ButtonClear1 = new button.Button();
        FieldHB = new textfield.TextField_1();
        CbBarang = new combobox.Combobox();
        button16 = new button.Button();
        FieldCariDataMasyarakat1 = new textfield.TextField_1();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound_11.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound_12.setBackground(new java.awt.Color(51, 153, 255));
        panelRound_12.setRoundBottomRight(30);
        panelRound_12.setRoundTopRight(30);

        ButtonDaftarBarang.setBackground(new java.awt.Color(255, 204, 0));
        ButtonDaftarBarang.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDaftarBarang.setText("<html>DAFTAR BARANG</html>");
        ButtonDaftarBarang.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ButtonDaftarBarang.setShadowColor(new java.awt.Color(51, 51, 51));
        ButtonDaftarBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDaftarBarangActionPerformed(evt);
            }
        });

        ButtonDataPetugas.setBackground(new java.awt.Color(255, 204, 0));
        ButtonDataPetugas.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDataPetugas.setText("<html>DATA PETUGAS</html>");
        ButtonDataPetugas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ButtonDataPetugas.setShadowColor(new java.awt.Color(51, 51, 51));
        ButtonDataPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDataPetugasActionPerformed(evt);
            }
        });

        ButtonDataUser.setBackground(new java.awt.Color(255, 204, 0));
        ButtonDataUser.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDataUser.setText("<html>DATA USER</html>");
        ButtonDataUser.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ButtonDataUser.setShadowColor(new java.awt.Color(51, 51, 51));
        ButtonDataUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDataUserActionPerformed(evt);
            }
        });

        ButtonDaftarLelang.setBackground(new java.awt.Color(255, 204, 0));
        ButtonDaftarLelang.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDaftarLelang.setText("<html>DAFTAR LELANG</html>");
        ButtonDaftarLelang.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ButtonDaftarLelang.setShadowColor(new java.awt.Color(51, 51, 51));
        ButtonDaftarLelang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDaftarLelangActionPerformed(evt);
            }
        });

        panelRound_13.setBackground(new java.awt.Color(255, 204, 0));
        panelRound_13.setRoundBottomLeft(30);
        panelRound_13.setRoundBottomRight(30);
        panelRound_13.setRoundTopLeft(30);
        panelRound_13.setRoundTopRight(200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginPage/woman.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html>HALAMAN ADMIN</html>");

        javax.swing.GroupLayout panelRound_13Layout = new javax.swing.GroupLayout(panelRound_13);
        panelRound_13.setLayout(panelRound_13Layout);
        panelRound_13Layout.setHorizontalGroup(
            panelRound_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRound_13Layout.setVerticalGroup(
            panelRound_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        button5.setBackground(new java.awt.Color(255, 204, 0));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/shopping-cart.png"))); // NOI18N
        button5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        button5.setShadowColor(new java.awt.Color(51, 51, 51));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(255, 204, 0));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/clipboard.png"))); // NOI18N
        button6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        button6.setShadowColor(new java.awt.Color(51, 51, 51));

        button7.setBackground(new java.awt.Color(255, 204, 0));
        button7.setForeground(new java.awt.Color(255, 255, 255));
        button7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/circle-heart.png"))); // NOI18N
        button7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        button7.setShadowColor(new java.awt.Color(51, 51, 51));

        button8.setBackground(new java.awt.Color(255, 204, 0));
        button8.setForeground(new java.awt.Color(255, 255, 255));
        button8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/history.png"))); // NOI18N
        button8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        button8.setShadowColor(new java.awt.Color(51, 51, 51));

        button13.setBackground(new java.awt.Color(255, 204, 0));
        button13.setForeground(new java.awt.Color(255, 255, 255));
        button13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/history.png"))); // NOI18N
        button13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        button13.setShadowColor(new java.awt.Color(51, 51, 51));
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });

        ButtonHistoryLelang.setBackground(new java.awt.Color(255, 204, 0));
        ButtonHistoryLelang.setForeground(new java.awt.Color(255, 255, 255));
        ButtonHistoryLelang.setText("<html>HISTORY LELANG</html>");
        ButtonHistoryLelang.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ButtonHistoryLelang.setShadowColor(new java.awt.Color(51, 51, 51));
        ButtonHistoryLelang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHistoryLelangActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(255, 204, 0));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/logout.png"))); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound_12Layout = new javax.swing.GroupLayout(panelRound_12);
        panelRound_12.setLayout(panelRound_12Layout);
        panelRound_12Layout.setHorizontalGroup(
            panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_12Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelRound_12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_12Layout.createSequentialGroup()
                        .addComponent(panelRound_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRound_12Layout.createSequentialGroup()
                        .addGroup(panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(button13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonDaftarLelang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(ButtonDataUser, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(ButtonDataPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(ButtonDaftarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(ButtonHistoryLelang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
        );
        panelRound_12Layout.setVerticalGroup(
            panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_12Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(panelRound_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonDataPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonDataUser, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonDaftarLelang, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonDaftarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonHistoryLelang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        panelRound_11.add(panelRound_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 320, 900));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        panelRound_20.setBackground(new java.awt.Color(255, 255, 255));

        panelRound_21.setBackground(new java.awt.Color(255, 204, 0));
        panelRound_21.setRoundBottomLeft(10);
        panelRound_21.setRoundBottomRight(10);
        panelRound_21.setRoundTopLeft(50);
        panelRound_21.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound_21Layout = new javax.swing.GroupLayout(panelRound_21);
        panelRound_21.setLayout(panelRound_21Layout);
        panelRound_21Layout.setHorizontalGroup(
            panelRound_21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1412, Short.MAX_VALUE)
        );
        panelRound_21Layout.setVerticalGroup(
            panelRound_21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        panelRound_111.setBackground(new java.awt.Color(255, 204, 0));
        panelRound_111.setRoundBottomLeft(50);
        panelRound_111.setRoundBottomRight(50);
        panelRound_111.setRoundTopLeft(10);
        panelRound_111.setRoundTopRight(10);

        javax.swing.GroupLayout panelRound_111Layout = new javax.swing.GroupLayout(panelRound_111);
        panelRound_111.setLayout(panelRound_111Layout);
        panelRound_111Layout.setHorizontalGroup(
            panelRound_111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1412, Short.MAX_VALUE)
        );
        panelRound_111Layout.setVerticalGroup(
            panelRound_111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        TableMasyarakat.setModel(new javax.swing.table.DefaultTableModel(
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
        TableMasyarakat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMasyarakatMouseClicked(evt);
            }
        });
        ScrollPaneMasyarakat.setViewportView(TableMasyarakat);

        FieldCariDataMasyarakat.setLabelText("SILAHKAN CARI");
        FieldCariDataMasyarakat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCariDataMasyarakatKeyReleased(evt);
            }
        });

        button12.setBackground(new java.awt.Color(0, 153, 255));
        button12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/search (1).png"))); // NOI18N
        button12.setShadowColor(new java.awt.Color(0, 153, 255));
        button12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button12MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("DATA MASYARAKAT.");

        panelRound_24.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_24.setRoundBottomLeft(50);
        panelRound_24.setRoundBottomRight(50);
        panelRound_24.setRoundTopLeft(50);
        panelRound_24.setRoundTopRight(50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FormUntukLogin/profile-user.png"))); // NOI18N

        FieldIDMasyarakat.setLabelText("ID");
        FieldIDMasyarakat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldIDMasyarakatKeyReleased(evt);
            }
        });

        FieldNamaMasyarakat.setLabelText("Nama Anda");
        FieldNamaMasyarakat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNamaMasyarakatActionPerformed(evt);
            }
        });
        FieldNamaMasyarakat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FieldNamaMasyarakatKeyPressed(evt);
            }
        });

        FieldUsernameMasyarakat.setLabelText("Username");
        FieldUsernameMasyarakat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUsernameMasyarakatActionPerformed(evt);
            }
        });
        FieldUsernameMasyarakat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FieldUsernameMasyarakatKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldUsernameMasyarakatKeyReleased(evt);
            }
        });

        FieldPasswordMasyarakat.setLabelText("Password");
        FieldPasswordMasyarakat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FieldPasswordMasyarakatKeyPressed(evt);
            }
        });

        FieldNoTelp.setLabelText("Nomor Telepon");
        FieldNoTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNoTelpActionPerformed(evt);
            }
        });
        FieldNoTelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FieldNoTelpKeyPressed(evt);
            }
        });

        ButtonSimpanAkun1.setBackground(new java.awt.Color(0, 51, 255));
        ButtonSimpanAkun1.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSimpanAkun1.setText("Buat Akun");
        ButtonSimpanAkun1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimpanAkun1ActionPerformed(evt);
            }
        });

        ButtonHapusAkunUser.setBackground(new java.awt.Color(255, 0, 102));
        ButtonHapusAkunUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/trash-bin.png"))); // NOI18N
        ButtonHapusAkunUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapusAkunUserActionPerformed(evt);
            }
        });

        buttonEditAkunUser.setBackground(new java.awt.Color(255, 0, 102));
        buttonEditAkunUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/edit.png"))); // NOI18N
        buttonEditAkunUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditAkunUserActionPerformed(evt);
            }
        });

        ButtonClearDataUser.setBackground(new java.awt.Color(255, 0, 102));
        ButtonClearDataUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/clean.png"))); // NOI18N
        ButtonClearDataUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearDataUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound_24Layout = new javax.swing.GroupLayout(panelRound_24);
        panelRound_24.setLayout(panelRound_24Layout);
        panelRound_24Layout.setHorizontalGroup(
            panelRound_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_24Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(196, 196, 196))
            .addGroup(panelRound_24Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelRound_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(FieldPasswordMasyarakat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FieldNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(FieldIDMasyarakat, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                        .addComponent(FieldNamaMasyarakat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FieldUsernameMasyarakat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelError1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_24Layout.createSequentialGroup()
                        .addComponent(ButtonSimpanAkun1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_24Layout.createSequentialGroup()
                        .addComponent(buttonEditAkunUser, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonHapusAkunUser, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonClearDataUser, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))))
        );
        panelRound_24Layout.setVerticalGroup(
            panelRound_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_24Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FieldIDMasyarakat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(FieldNamaMasyarakat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(FieldUsernameMasyarakat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelError1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldPasswordMasyarakat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(FieldNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonSimpanAkun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEditAkunUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonHapusAkunUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonClearDataUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRound_20Layout = new javax.swing.GroupLayout(panelRound_20);
        panelRound_20.setLayout(panelRound_20Layout);
        panelRound_20Layout.setHorizontalGroup(
            panelRound_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_20Layout.createSequentialGroup()
                .addContainerGap(928, Short.MAX_VALUE)
                .addGroup(panelRound_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound_111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_20Layout.createSequentialGroup()
                        .addComponent(panelRound_24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(ScrollPaneMasyarakat, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_20Layout.createSequentialGroup()
                        .addComponent(FieldCariDataMasyarakat, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(366, 366, 366))
                    .addComponent(panelRound_21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_20Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(458, 458, 458)))
                .addContainerGap())
        );
        panelRound_20Layout.setVerticalGroup(
            panelRound_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FieldCariDataMasyarakat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound_20Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelRound_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_20Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRound_24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound_20Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(ScrollPaneMasyarakat, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound_111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout HalamanDataMasyarakatLayout = new javax.swing.GroupLayout(HalamanDataMasyarakat);
        HalamanDataMasyarakat.setLayout(HalamanDataMasyarakatLayout);
        HalamanDataMasyarakatLayout.setHorizontalGroup(
            HalamanDataMasyarakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound_20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HalamanDataMasyarakatLayout.setVerticalGroup(
            HalamanDataMasyarakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound_20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", HalamanDataMasyarakat);

        panelRound_18.setBackground(new java.awt.Color(255, 255, 255));

        panelRound_19.setBackground(new java.awt.Color(255, 204, 51));
        panelRound_19.setRoundBottomLeft(10);
        panelRound_19.setRoundBottomRight(10);
        panelRound_19.setRoundTopLeft(50);
        panelRound_19.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound_19Layout = new javax.swing.GroupLayout(panelRound_19);
        panelRound_19.setLayout(panelRound_19Layout);
        panelRound_19Layout.setHorizontalGroup(
            panelRound_19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1412, Short.MAX_VALUE)
        );
        panelRound_19Layout.setVerticalGroup(
            panelRound_19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        panelRound_110.setBackground(new java.awt.Color(255, 204, 0));
        panelRound_110.setRoundBottomLeft(50);
        panelRound_110.setRoundBottomRight(50);
        panelRound_110.setRoundTopLeft(10);
        panelRound_110.setRoundTopRight(10);

        javax.swing.GroupLayout panelRound_110Layout = new javax.swing.GroupLayout(panelRound_110);
        panelRound_110.setLayout(panelRound_110Layout);
        panelRound_110Layout.setHorizontalGroup(
            panelRound_110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1412, Short.MAX_VALUE)
        );
        panelRound_110Layout.setVerticalGroup(
            panelRound_110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        tablePetugas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePetugasMouseClicked(evt);
            }
        });
        ScrollPanePetugas.setViewportView(tablePetugas);

        FieldCariDataPetugas.setLabelText("SILAHKAN CARI");
        FieldCariDataPetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCariDataPetugasKeyReleased(evt);
            }
        });

        button11.setBackground(new java.awt.Color(51, 153, 255));
        button11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/search (1).png"))); // NOI18N
        button11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button11MouseClicked(evt);
            }
        });
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("DATA PETUGAS.");

        panelRound_23.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_23.setRoundBottomLeft(50);
        panelRound_23.setRoundBottomRight(50);
        panelRound_23.setRoundTopLeft(50);
        panelRound_23.setRoundTopRight(50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FormUntukLogin/profile-user.png"))); // NOI18N

        fieldIDPetugas.setLabelText("ID Petugas");
        fieldIDPetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldIDPetugasKeyReleased(evt);
            }
        });

        fieldNamaPetugas.setLabelText("Nama Anda");
        fieldNamaPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaPetugasActionPerformed(evt);
            }
        });
        fieldNamaPetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldNamaPetugasKeyPressed(evt);
            }
        });

        fieldUsernamePetugas.setLabelText("Username");
        fieldUsernamePetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsernamePetugasActionPerformed(evt);
            }
        });
        fieldUsernamePetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldUsernamePetugasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldUsernamePetugasKeyReleased(evt);
            }
        });

        fieldPasswordPetugas.setLabelText("Password");
        fieldPasswordPetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldPasswordPetugasKeyPressed(evt);
            }
        });

        ButtonSimpanAkun.setBackground(new java.awt.Color(0, 51, 255));
        ButtonSimpanAkun.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSimpanAkun.setText("Buat Akun");
        ButtonSimpanAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimpanAkunActionPerformed(evt);
            }
        });

        buttonEditAkun.setBackground(new java.awt.Color(255, 0, 102));
        buttonEditAkun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/edit.png"))); // NOI18N
        buttonEditAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditAkunActionPerformed(evt);
            }
        });

        ButtonHapusAkun.setBackground(new java.awt.Color(255, 0, 102));
        ButtonHapusAkun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/trash-bin.png"))); // NOI18N
        ButtonHapusAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapusAkunActionPerformed(evt);
            }
        });

        ButtonClearData.setBackground(new java.awt.Color(255, 0, 102));
        ButtonClearData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/clean.png"))); // NOI18N
        ButtonClearData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound_23Layout = new javax.swing.GroupLayout(panelRound_23);
        panelRound_23.setLayout(panelRound_23Layout);
        panelRound_23Layout.setHorizontalGroup(
            panelRound_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_23Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(panelRound_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_23Layout.createSequentialGroup()
                        .addGroup(panelRound_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldPasswordPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fieldIDPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldNamaPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldUsernamePetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound_23Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(buttonEditAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonHapusAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonClearData, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_23Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(208, 208, 208))))
            .addGroup(panelRound_23Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(ButtonSimpanAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRound_23Layout.setVerticalGroup(
            panelRound_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(fieldIDPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(fieldNamaPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(fieldUsernamePetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPasswordPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonSimpanAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEditAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonHapusAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonClearData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout panelRound_18Layout = new javax.swing.GroupLayout(panelRound_18);
        panelRound_18.setLayout(panelRound_18Layout);
        panelRound_18Layout.setHorizontalGroup(
            panelRound_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_18Layout.createSequentialGroup()
                .addGroup(panelRound_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound_110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelRound_18Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(panelRound_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelRound_18Layout.createSequentialGroup()
                            .addGap(609, 609, 609)
                            .addComponent(jLabel5))
                        .addGroup(panelRound_18Layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(panelRound_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(84, 84, 84)
                            .addComponent(ScrollPanePetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelRound_18Layout.createSequentialGroup()
                            .addGap(514, 514, 514)
                            .addComponent(FieldCariDataPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        panelRound_18Layout.setVerticalGroup(
            panelRound_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_18Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(panelRound_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(panelRound_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FieldCariDataPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelRound_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_18Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(ScrollPanePetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(panelRound_18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound_23, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound_110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout HalamanDataPetugasLayout = new javax.swing.GroupLayout(HalamanDataPetugas);
        HalamanDataPetugas.setLayout(HalamanDataPetugasLayout);
        HalamanDataPetugasLayout.setHorizontalGroup(
            HalamanDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound_18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HalamanDataPetugasLayout.setVerticalGroup(
            HalamanDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound_18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", HalamanDataPetugas);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound_15.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound_16.setBackground(new java.awt.Color(255, 208, 0));
        panelRound_16.setRoundBottomLeft(10);
        panelRound_16.setRoundBottomRight(10);
        panelRound_16.setRoundTopLeft(50);
        panelRound_16.setRoundTopRight(50);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("FORM DATA LELANG.");

        javax.swing.GroupLayout panelRound_16Layout = new javax.swing.GroupLayout(panelRound_16);
        panelRound_16.setLayout(panelRound_16Layout);
        panelRound_16Layout.setHorizontalGroup(
            panelRound_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_16Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel6)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelRound_16Layout.setVerticalGroup(
            panelRound_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        panelRound_15.add(panelRound_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 520, -1));

        panelRound_17.setBackground(new java.awt.Color(255, 208, 0));
        panelRound_17.setRoundBottomLeft(50);
        panelRound_17.setRoundBottomRight(50);
        panelRound_17.setRoundTopLeft(10);
        panelRound_17.setRoundTopRight(10);

        javax.swing.GroupLayout panelRound_17Layout = new javax.swing.GroupLayout(panelRound_17);
        panelRound_17.setLayout(panelRound_17Layout);
        panelRound_17Layout.setHorizontalGroup(
            panelRound_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        panelRound_17Layout.setVerticalGroup(
            panelRound_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        panelRound_15.add(panelRound_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 890, 570, -1));

        CbIDBarang.setLabeText("ID DATA BARANG");
        CbIDBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbIDBarangActionPerformed(evt);
            }
        });
        panelRound_15.add(CbIDBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 530, -1));
        panelRound_15.add(TanggalDataLelang, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 530, 46));

        CbIDMasyarakat.setLabeText("ID DATA MASYARAKAT");
        CbIDMasyarakat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbIDMasyarakatActionPerformed(evt);
            }
        });
        panelRound_15.add(CbIDMasyarakat, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 530, -1));

        CbIDPetugas.setLabeText("ID PETUGAS");
        CbIDPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbIDPetugasActionPerformed(evt);
            }
        });
        panelRound_15.add(CbIDPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 530, -1));

        buttonSimpanLelang.setBackground(new java.awt.Color(51, 153, 255));
        buttonSimpanLelang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/clipboard (1).png"))); // NOI18N
        buttonSimpanLelang.setShadowColor(new java.awt.Color(0, 153, 255));
        buttonSimpanLelang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanLelangActionPerformed(evt);
            }
        });
        panelRound_15.add(buttonSimpanLelang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 790, 87, 74));

        FieldIDLelang.setLabelText("ISI ID LELANG");
        panelRound_15.add(FieldIDLelang, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 530, -1));

        FieldHargaTawarLelang.setLabelText("HARGA TAWAR");
        panelRound_15.add(FieldHargaTawarLelang, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 530, -1));

        CbDataStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "dibuka", "ditutup" }));
        CbDataStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbDataStatusActionPerformed(evt);
            }
        });
        panelRound_15.add(CbDataStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 670, 530, -1));

        buttonEditLelang.setBackground(new java.awt.Color(51, 153, 255));
        buttonEditLelang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/edit.png"))); // NOI18N
        buttonEditLelang.setShadowColor(new java.awt.Color(0, 153, 255));
        buttonEditLelang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditLelangActionPerformed(evt);
            }
        });
        panelRound_15.add(buttonEditLelang, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 790, 83, 74));

        buttonHapusLelang.setBackground(new java.awt.Color(51, 153, 255));
        buttonHapusLelang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/trash-bin.png"))); // NOI18N
        buttonHapusLelang.setShadowColor(new java.awt.Color(0, 153, 255));
        buttonHapusLelang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusLelangActionPerformed(evt);
            }
        });
        panelRound_15.add(buttonHapusLelang, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 790, 83, 74));

        buttonClear.setBackground(new java.awt.Color(51, 153, 255));
        buttonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/clean.png"))); // NOI18N
        buttonClear.setShadowColor(new java.awt.Color(0, 153, 255));
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        panelRound_15.add(buttonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 790, 79, 74));

        tableLelang.setModel(new javax.swing.table.DefaultTableModel(
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
        tableLelang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLelangMouseClicked(evt);
            }
        });
        ScrollPaneLelang.setViewportView(tableLelang);

        panelRound_15.add(ScrollPaneLelang, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 830, 360));

        FieldCariDataLelang.setLabelText("SILAHKAN CARI");
        FieldCariDataLelang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCariDataLelangActionPerformed(evt);
            }
        });
        FieldCariDataLelang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCariDataLelangKeyReleased(evt);
            }
        });
        panelRound_15.add(FieldCariDataLelang, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 500, -1));

        button9.setBackground(new java.awt.Color(51, 153, 255));
        button9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/search (1).png"))); // NOI18N
        button9.setShadowColor(new java.awt.Color(51, 153, 255));
        button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button9MouseClicked(evt);
            }
        });
        panelRound_15.add(button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 40, 80, -1));

        FieldNamaDataLelang.setLabelText("NAMA");
        panelRound_15.add(FieldNamaDataLelang, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 530, -1));

        tableUser1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "HARGA TAWAR", "ID BARANG", "ID USER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUser1MouseClicked(evt);
            }
        });
        ScrollPanePenawaran1.setViewportView(tableUser1);

        panelRound_15.add(ScrollPanePenawaran1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 587, 830, 350));

        button17.setBackground(new java.awt.Color(126, 203, 87));
        button17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/search (1).png"))); // NOI18N
        button17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button17MouseClicked(evt);
            }
        });
        button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button17ActionPerformed(evt);
            }
        });
        panelRound_15.add(button17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 490, 80, -1));

        FieldCariDataMasyarakat2.setLabelText("SILAHKAN CARI");
        FieldCariDataMasyarakat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCariDataMasyarakat2ActionPerformed(evt);
            }
        });
        FieldCariDataMasyarakat2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCariDataMasyarakat2KeyReleased(evt);
            }
        });
        panelRound_15.add(FieldCariDataMasyarakat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 490, -1));

        jPanel5.add(panelRound_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 16, 2360, 1010));

        javax.swing.GroupLayout HalamanDataLelangLayout = new javax.swing.GroupLayout(HalamanDataLelang);
        HalamanDataLelang.setLayout(HalamanDataLelangLayout);
        HalamanDataLelangLayout.setHorizontalGroup(
            HalamanDataLelangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2446, Short.MAX_VALUE)
            .addGroup(HalamanDataLelangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HalamanDataLelangLayout.setVerticalGroup(
            HalamanDataLelangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1028, Short.MAX_VALUE)
            .addGroup(HalamanDataLelangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", HalamanDataLelang);

        HalamanDataBarang.setBackground(new java.awt.Color(255, 255, 255));

        panelRound_14.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_14.setRoundBottomLeft(50);
        panelRound_14.setRoundBottomRight(50);
        panelRound_14.setRoundTopLeft(50);
        panelRound_14.setRoundTopRight(50);

        FieldIDBarang.setLabelText("ISI ID");
        FieldIDBarang.setLineColor(new java.awt.Color(255, 204, 0));
        FieldIDBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldIDBarangActionPerformed(evt);
            }
        });

        FieldNamaBarang.setLabelText("NAMA BARANG");
        FieldNamaBarang.setLineColor(new java.awt.Color(255, 204, 0));

        TanggalDataBarang.setDateFormatString("yyyy-MM-dd");
        TanggalDataBarang.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N

        FieldHargaAwalBarang.setLabelText("HARGA AWAL");
        FieldHargaAwalBarang.setLineColor(new java.awt.Color(255, 204, 0));
        FieldHargaAwalBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldHargaAwalBarangActionPerformed(evt);
            }
        });

        ButtonSave.setBackground(new java.awt.Color(51, 153, 255));
        ButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/clipboard (1).png"))); // NOI18N
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        ButtonEdit.setBackground(new java.awt.Color(51, 153, 255));
        ButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/edit.png"))); // NOI18N
        ButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditActionPerformed(evt);
            }
        });

        ButtonDelete.setBackground(new java.awt.Color(51, 153, 255));
        ButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/trash-bin.png"))); // NOI18N
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });

        ButtonClear.setBackground(new java.awt.Color(51, 153, 255));
        ButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/clean.png"))); // NOI18N
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });

        TableDataBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAMA BARANG", "TANGGAL", "HARGA AWAL", "DESKRIPSI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableDataBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDataBarangMouseClicked(evt);
            }
        });
        ScrollPaneBarang.setViewportView(TableDataBarang);
        if (TableDataBarang.getColumnModel().getColumnCount() > 0) {
            TableDataBarang.getColumnModel().getColumn(0).setPreferredWidth(90);
            TableDataBarang.getColumnModel().getColumn(1).setPreferredWidth(250);
            TableDataBarang.getColumnModel().getColumn(2).setPreferredWidth(90);
            TableDataBarang.getColumnModel().getColumn(3).setPreferredWidth(100);
            TableDataBarang.getColumnModel().getColumn(4).setPreferredWidth(250);
        }

        FieldCariDataBarang.setLabelText("SILAHKAN CARI");
        FieldCariDataBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCariDataBarangKeyReleased(evt);
            }
        });

        button10.setBackground(new java.awt.Color(51, 153, 255));
        button10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/search (1).png"))); // NOI18N
        button10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button10MouseClicked(evt);
            }
        });

        panelRound_114.setBackground(new java.awt.Color(255, 204, 0));
        panelRound_114.setRoundBottomLeft(10);
        panelRound_114.setRoundBottomRight(10);
        panelRound_114.setRoundTopLeft(50);
        panelRound_114.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound_114Layout = new javax.swing.GroupLayout(panelRound_114);
        panelRound_114.setLayout(panelRound_114Layout);
        panelRound_114Layout.setHorizontalGroup(
            panelRound_114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelRound_114Layout.setVerticalGroup(
            panelRound_114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        panelRound_115.setBackground(new java.awt.Color(255, 204, 0));
        panelRound_115.setRoundBottomLeft(50);
        panelRound_115.setRoundBottomRight(50);
        panelRound_115.setRoundTopLeft(10);
        panelRound_115.setRoundTopRight(10);

        javax.swing.GroupLayout panelRound_115Layout = new javax.swing.GroupLayout(panelRound_115);
        panelRound_115.setLayout(panelRound_115Layout);
        panelRound_115Layout.setHorizontalGroup(
            panelRound_115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );
        panelRound_115Layout.setVerticalGroup(
            panelRound_115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        DeskripsiDataBarang.setColumns(20);
        DeskripsiDataBarang.setRows(5);
        textAreaScroll1.setViewportView(DeskripsiDataBarang);

        javax.swing.GroupLayout panelRound_14Layout = new javax.swing.GroupLayout(panelRound_14);
        panelRound_14.setLayout(panelRound_14Layout);
        panelRound_14Layout.setHorizontalGroup(
            panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_14Layout.createSequentialGroup()
                .addGroup(panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_14Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelRound_115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panelRound_114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FieldIDBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FieldHargaAwalBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TanggalDataBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                                .addComponent(FieldNamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textAreaScroll1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelRound_14Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound_14Layout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addComponent(ButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ScrollPaneBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99))
                    .addGroup(panelRound_14Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(FieldCariDataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelRound_14Layout.setVerticalGroup(
            panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_14Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound_14Layout.createSequentialGroup()
                        .addGroup(panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldCariDataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(ScrollPaneBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound_14Layout.createSequentialGroup()
                        .addComponent(panelRound_114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(FieldIDBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FieldNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(TanggalDataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(FieldHargaAwalBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(textAreaScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_14Layout.createSequentialGroup()
                        .addGroup(panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_14Layout.createSequentialGroup()
                        .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addComponent(panelRound_115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("FORM DATA BARANG.");

        javax.swing.GroupLayout HalamanDataBarangLayout = new javax.swing.GroupLayout(HalamanDataBarang);
        HalamanDataBarang.setLayout(HalamanDataBarangLayout);
        HalamanDataBarangLayout.setHorizontalGroup(
            HalamanDataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HalamanDataBarangLayout.createSequentialGroup()
                .addGroup(HalamanDataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HalamanDataBarangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelRound_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HalamanDataBarangLayout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(jLabel7)))
                .addContainerGap(801, Short.MAX_VALUE))
        );
        HalamanDataBarangLayout.setVerticalGroup(
            HalamanDataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HalamanDataBarangLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", HalamanDataBarang);

        HalamanDataHistoryLelang.setBackground(new java.awt.Color(255, 255, 255));

        panelRound_112.setBackground(new java.awt.Color(255, 204, 0));
        panelRound_112.setRoundBottomLeft(10);
        panelRound_112.setRoundBottomRight(10);
        panelRound_112.setRoundTopLeft(50);
        panelRound_112.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound_112Layout = new javax.swing.GroupLayout(panelRound_112);
        panelRound_112.setLayout(panelRound_112Layout);
        panelRound_112Layout.setHorizontalGroup(
            panelRound_112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelRound_112Layout.setVerticalGroup(
            panelRound_112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        panelRound_113.setBackground(new java.awt.Color(255, 204, 0));
        panelRound_113.setRoundBottomLeft(50);
        panelRound_113.setRoundBottomRight(50);
        panelRound_113.setRoundTopLeft(10);
        panelRound_113.setRoundTopRight(10);

        javax.swing.GroupLayout panelRound_113Layout = new javax.swing.GroupLayout(panelRound_113);
        panelRound_113.setLayout(panelRound_113Layout);
        panelRound_113Layout.setHorizontalGroup(
            panelRound_113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelRound_113Layout.setVerticalGroup(
            panelRound_113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        cbIDLelangHistory.setLabeText("ID LELANG");
        cbIDLelangHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIDLelangHistoryActionPerformed(evt);
            }
        });

        FieldIDHistory.setLabelText("ISI ID HISTORY");

        cbIDBarangHistory.setLabeText("ID BARANG");
        cbIDBarangHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIDBarangHistoryActionPerformed(evt);
            }
        });

        cbIDMasyarakatHistory.setLabeText("ID MASYARAKAT");
        cbIDMasyarakatHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIDMasyarakatHistoryActionPerformed(evt);
            }
        });

        FieldHargaTawarHistory.setLabelText("HARGA TAWAR");

        ButtonSimpanHistory.setBackground(new java.awt.Color(0, 153, 255));
        ButtonSimpanHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/clipboard (1).png"))); // NOI18N
        ButtonSimpanHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimpanHistoryActionPerformed(evt);
            }
        });

        TableHistoryLelang.setModel(new javax.swing.table.DefaultTableModel(
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
        TableHistoryLelang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableHistoryLelangMouseClicked(evt);
            }
        });
        ScrollPanelHistoryLelang.setViewportView(TableHistoryLelang);

        buttonEditHistory.setBackground(new java.awt.Color(0, 153, 255));
        buttonEditHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/edit.png"))); // NOI18N
        buttonEditHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditHistoryActionPerformed(evt);
            }
        });

        buttonHapusHistory.setBackground(new java.awt.Color(0, 153, 255));
        buttonHapusHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/trash-bin.png"))); // NOI18N

        buttonResetHistory.setBackground(new java.awt.Color(0, 153, 255));
        buttonResetHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/clean.png"))); // NOI18N
        buttonResetHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetHistoryActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("FORM HISTORY LELANG.");

        button15.setBackground(new java.awt.Color(51, 153, 255));
        button15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/search (1).png"))); // NOI18N
        button15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button15MouseClicked(evt);
            }
        });

        FieldCariDataHistory.setLabelText("SILAHKAN CARI");
        FieldCariDataHistory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCariDataHistoryKeyReleased(evt);
            }
        });

        FieldNamaBarangHistor.setLabelText(" NAMA BARANG");

        FieldNamaUserHistory.setLabelText("NAMA MASYARAKAT");

        javax.swing.GroupLayout HalamanDataHistoryLelangLayout = new javax.swing.GroupLayout(HalamanDataHistoryLelang);
        HalamanDataHistoryLelang.setLayout(HalamanDataHistoryLelangLayout);
        HalamanDataHistoryLelangLayout.setHorizontalGroup(
            HalamanDataHistoryLelangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HalamanDataHistoryLelangLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(HalamanDataHistoryLelangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HalamanDataHistoryLelangLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(ButtonSimpanHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEditHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonHapusHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonResetHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282))
                    .addGroup(HalamanDataHistoryLelangLayout.createSequentialGroup()
                        .addGroup(HalamanDataHistoryLelangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelRound_112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound_113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FieldHargaTawarHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbIDMasyarakatHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                            .addComponent(cbIDBarangHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbIDLelangHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FieldIDHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FieldNamaBarangHistor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FieldNamaUserHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(HalamanDataHistoryLelangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HalamanDataHistoryLelangLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(ScrollPanelHistoryLelang, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(872, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HalamanDataHistoryLelangLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FieldCariDataHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131))))))
            .addGroup(HalamanDataHistoryLelangLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HalamanDataHistoryLelangLayout.setVerticalGroup(
            HalamanDataHistoryLelangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HalamanDataHistoryLelangLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(panelRound_112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(HalamanDataHistoryLelangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HalamanDataHistoryLelangLayout.createSequentialGroup()
                        .addGroup(HalamanDataHistoryLelangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(HalamanDataHistoryLelangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FieldCariDataHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FieldIDHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ScrollPanelHistoryLelang, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(HalamanDataHistoryLelangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonEditHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonHapusHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonResetHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(HalamanDataHistoryLelangLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(cbIDLelangHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(cbIDBarangHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(FieldNamaBarangHistor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cbIDMasyarakatHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(FieldNamaUserHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(FieldHargaTawarHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(ButtonSimpanHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(panelRound_113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("tab5", HalamanDataHistoryLelang);

        FrameDataPenawaran.setBackground(new java.awt.Color(255, 255, 255));

        panelRound_22.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_22.setRoundBottomLeft(70);
        panelRound_22.setRoundBottomRight(70);
        panelRound_22.setRoundTopLeft(70);
        panelRound_22.setRoundTopRight(70);

        FieldTawar.setLabelText("ID PENAWARAN");
        FieldTawar.setLineColor(new java.awt.Color(126, 203, 87));

        FieldHL.setLabelText("HARGA LELANG");
        FieldHL.setLineColor(new java.awt.Color(126, 203, 87));

        FieldNB.setLabelText("NAMA BARANG");
        FieldNB.setLineColor(new java.awt.Color(126, 203, 87));

        CbUser.setLineColor(new java.awt.Color(126, 203, 87));
        CbUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbUserActionPerformed(evt);
            }
        });

        FieldNU.setLabelText("NAMA ANDA");
        FieldNU.setLineColor(new java.awt.Color(126, 203, 87));

        ButtonSave1.setBackground(new java.awt.Color(126, 203, 87));
        ButtonSave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/clipboard (1).png"))); // NOI18N
        ButtonSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSave1ActionPerformed(evt);
            }
        });

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "HARGA TAWAR", "ID BARANG", "ID USER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        ScrollPanePenawaran.setViewportView(tableUser);

        ButtonEdit1.setBackground(new java.awt.Color(126, 203, 87));
        ButtonEdit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/edit.png"))); // NOI18N
        ButtonEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEdit1ActionPerformed(evt);
            }
        });

        ButtonDelete1.setBackground(new java.awt.Color(126, 203, 87));
        ButtonDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/trash-bin.png"))); // NOI18N
        ButtonDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDelete1ActionPerformed(evt);
            }
        });

        ButtonClear1.setBackground(new java.awt.Color(126, 203, 87));
        ButtonClear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/clean.png"))); // NOI18N
        ButtonClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClear1ActionPerformed(evt);
            }
        });

        FieldHB.setLabelText("HARGA AWAL");
        FieldHB.setLineColor(new java.awt.Color(126, 203, 87));

        CbBarang.setLineColor(new java.awt.Color(126, 203, 87));
        CbBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbBarangActionPerformed(evt);
            }
        });

        button16.setBackground(new java.awt.Color(126, 203, 87));
        button16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page/search (1).png"))); // NOI18N
        button16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button16MouseClicked(evt);
            }
        });
        button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button16ActionPerformed(evt);
            }
        });

        FieldCariDataMasyarakat1.setLabelText("SILAHKAN CARI");
        FieldCariDataMasyarakat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCariDataMasyarakat1ActionPerformed(evt);
            }
        });
        FieldCariDataMasyarakat1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCariDataMasyarakat1KeyReleased(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(126, 203, 87));
        jLabel8.setText("<html>PENGAJUAN HARGA MASYARAKAT.</html>");

        javax.swing.GroupLayout panelRound_22Layout = new javax.swing.GroupLayout(panelRound_22);
        panelRound_22.setLayout(panelRound_22Layout);
        panelRound_22Layout.setHorizontalGroup(
            panelRound_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_22Layout.createSequentialGroup()
                .addGroup(panelRound_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_22Layout.createSequentialGroup()
                        .addGroup(panelRound_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound_22Layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(ButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelRound_22Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelRound_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CbUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                                    .addComponent(FieldHL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FieldTawar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FieldNU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FieldHB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FieldNB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CbBarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_22Layout.createSequentialGroup()
                        .addGap(0, 55, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255)))
                .addGroup(panelRound_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_22Layout.createSequentialGroup()
                        .addComponent(FieldCariDataMasyarakat1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(panelRound_22Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(ScrollPanePenawaran, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_22Layout.createSequentialGroup()
                        .addComponent(ButtonEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(273, 273, 273))))
        );
        panelRound_22Layout.setVerticalGroup(
            panelRound_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_22Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_22Layout.createSequentialGroup()
                        .addGroup(panelRound_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldCariDataMasyarakat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addGroup(panelRound_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_22Layout.createSequentialGroup()
                        .addComponent(FieldTawar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(CbBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(FieldNB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(FieldHB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(FieldHL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(CbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(FieldNU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_22Layout.createSequentialGroup()
                        .addComponent(ScrollPanePenawaran, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelRound_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ButtonEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ButtonDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))))
        );

        javax.swing.GroupLayout FrameDataPenawaranLayout = new javax.swing.GroupLayout(FrameDataPenawaran);
        FrameDataPenawaran.setLayout(FrameDataPenawaranLayout);
        FrameDataPenawaranLayout.setHorizontalGroup(
            FrameDataPenawaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameDataPenawaranLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panelRound_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(835, Short.MAX_VALUE))
        );
        FrameDataPenawaranLayout.setVerticalGroup(
            FrameDataPenawaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameDataPenawaranLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelRound_22, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", FrameDataPenawaran);

        panelRound_11.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, -36, 1600, 1050));

        getContentPane().add(panelRound_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2090, 1060));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_button5ActionPerformed

    private void ButtonDaftarBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDaftarBarangActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_ButtonDaftarBarangActionPerformed

    private void ButtonDataPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDataPetugasActionPerformed
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_ButtonDataPetugasActionPerformed

    private void ButtonDataUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDataUserActionPerformed
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_ButtonDataUserActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void ButtonDaftarLelangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDaftarLelangActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
        idMasyarakatHistory();
    }//GEN-LAST:event_ButtonDaftarLelangActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button13ActionPerformed

    private void ButtonHistoryLelangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHistoryLelangActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_ButtonHistoryLelangActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:'
        this.setVisible(true);
        new FormAdmin().setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

    private void FieldCariDataHistoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCariDataHistoryKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCariDataHistoryKeyReleased

    private void button15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button15MouseClicked
        // TODO add your handling code here:
        searchDataHistory();
    }//GEN-LAST:event_button15MouseClicked

    private void buttonResetHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetHistoryActionPerformed
        // TODO add your handling code here:
        ResetDataHistoryLelang();
    }//GEN-LAST:event_buttonResetHistoryActionPerformed

    private void buttonEditHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditHistoryActionPerformed
        // TODO add your handling code here:
        idHistory = FieldIDHistory.getText();
        idLelangHistory = (String) cbIDLelangHistory.getSelectedItem();
        idBarangHistory = (String) CbIDBarang.getSelectedItem();
        hargaTawar = FieldHargaTawarHistory.getText();
        idMasyarakat = (String) cbIDMasyarakatHistory.getSelectedItem();

        

        try{

            String sql = "update history_lelang set id_lelang=?, id_barang=?, id=?, harga_tawar=? where id_history=?";

            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1, idLelangHistory);
            this.pst.setString(2, idBarangHistory);
            this.pst.setString(3, idMasyarakat);
            this.pst.setNString(4, hargaTawar);
            this.pst.setString(5, idHistory);
            this.pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "berhasil update");

            showfullDataHistoryLelang();

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_buttonEditHistoryActionPerformed

    private void TableHistoryLelangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableHistoryLelangMouseClicked
        // TODO add your handling code here:
        tableClickHistoryLelang();
    }//GEN-LAST:event_TableHistoryLelangMouseClicked

    private void ButtonSimpanHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimpanHistoryActionPerformed
        // TODO add your handling code here:

        idHistory = FieldIDHistory.getText();
        idLelangHistory = (String) cbIDLelangHistory.getSelectedItem();
        idBarangHistory = (String) CbIDBarang.getSelectedItem();
        hargaTawar = FieldHargaTawarHistory.getText();
        idMasyarakat = (String) cbIDMasyarakatHistory.getSelectedItem();

        try{

            String sql = "insert into history_lelang (id_history, id_lelang, id_barang, id, harga_tawar) values (?, ?, ?, ?, ?)";

            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1, idHistory);
            this.pst.setString(2, idLelangHistory);
            this.pst.setString(3, idBarangHistory);
            this.pst.setNString(4, idMasyarakat);
            this.pst.setString(5, hargaTawar);
            this.pst.execute();

            JOptionPane.showMessageDialog(null, "DATA HISTORY LELANG BERHASIL DI SIMPAN!", "Sukses", JOptionPane.INFORMATION_MESSAGE);

            showfullDataHistoryLelang();
            autoNumberHistory();

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_ButtonSimpanHistoryActionPerformed

    private void cbIDMasyarakatHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIDMasyarakatHistoryActionPerformed
        // TODO add your handling code here:
        try{
            String Click = cbIDMasyarakatHistory.getSelectedItem().toString();
            String sql = "select * from tb_masyarakat join penawaran on tb_masyarakat.id = penawaran.id where tb_masyarakat.id=?";
            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1, Click);
            this.set = pst.executeQuery();

            if(set.next()){
                FieldNamaUserHistory.setText(set.getString("nama"));
                FieldHargaTawarHistory.setText(set.getString("penawaran.harga_tawar"));
                //

            }
        } catch (Exception e){

        }
    }//GEN-LAST:event_cbIDMasyarakatHistoryActionPerformed

    private void cbIDBarangHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIDBarangHistoryActionPerformed
        // TODO add your handling code here:
        try{
            String Click = cbIDBarangHistory.getSelectedItem().toString();
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet sql = st.executeQuery("select * from tb_barang where id_barang = '"+Click+"'");

            if(sql.next()){
                String add1 = sql.getString("nama_barang");
                FieldNamaBarangHistor.setText(add1);

            }
        } catch (Exception e){

        }
    }//GEN-LAST:event_cbIDBarangHistoryActionPerformed

    private void cbIDLelangHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIDLelangHistoryActionPerformed
        // TODO add your handling code here:
        try{
            String Click = cbIDLelangHistory.getSelectedItem().toString();
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet sql = st.executeQuery("select * from tb_lelang where id_lelang = '"+Click+"'");

        } catch (Exception e){

        }
    }//GEN-LAST:event_cbIDLelangHistoryActionPerformed

    private void button10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button10MouseClicked
        // TODO add your handling code here:
        searchDataBarang();
    }//GEN-LAST:event_button10MouseClicked

    private void FieldCariDataBarangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCariDataBarangKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCariDataBarangKeyReleased

    private void TableDataBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDataBarangMouseClicked
        // TODO add your handling code here:
        tableClickBarang();
    }//GEN-LAST:event_TableDataBarangMouseClicked

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        // TODO add your handling code here:
        ResetDataBarang();
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        // TODO add your handling code here:
        try{

            idBarang = FieldIDBarang.getText();

            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            String sql = "delete from tb_barang where id_barang ='"+idBarang+"'";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            int input = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Untuk Menghapusnya?", "Silahkan Pilih ", JOptionPane.YES_NO_OPTION);
        } catch (Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        showDataBarang();
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void ButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditActionPerformed
        // TODO add your handling code here:
        delete();
        try{

            idBarang =  FieldIDBarang.getText();
            NamaBarang =  FieldNamaBarang.getText();
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            tanggal = String.valueOf(format.format(TanggalDataBarang.getDate()));
            HargaAwal =  FieldHargaAwalBarang.getText();
            Desc = DeskripsiDataBarang.getText();

            String sql = "updte tb_barang set nama_barang=?, tanggal=?, harga_awal=?, desc_barang=? where id_barang=?";
            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1, NamaBarang);
            this.pst.setString(2, tanggal);
            this.pst.setString(3, HargaAwal);
            this.pst.setString(4, Desc);
            this.pst.setString(5, idBarang);
            this.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate");

            showDataBarang();

        } catch (Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }//GEN-LAST:event_ButtonEditActionPerformed

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        // TODO add your handling code here:
        try{

            IDTawar = FieldIDBarang.getText();
            NamaBarang = FieldNamaBarang.getText();
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            tanggal = String.valueOf(format.format(TanggalDataBarang.getDate()));
            HargaAwal = FieldHargaAwalBarang.getText();
            Desc = DeskripsiDataBarang.getText();

            String sql = "insert into tb_barang values ('"+ IDTawar+
            "','"+NamaBarang+
            "','"+tanggal+
            "','"+HargaAwal+
            "','"+Desc+"')";
            java.sql.Connection conn =(java.sql.Connection) connect.connectDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            showDataBarang();
            autoNumberBarang();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void FieldHargaAwalBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldHargaAwalBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldHargaAwalBarangActionPerformed

    private void FieldIDBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldIDBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldIDBarangActionPerformed

    private void FieldCariDataMasyarakat2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCariDataMasyarakat2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCariDataMasyarakat2KeyReleased

    private void FieldCariDataMasyarakat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCariDataMasyarakat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCariDataMasyarakat2ActionPerformed

    private void button17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button17ActionPerformed

    private void button17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button17MouseClicked
        // TODO add your handling code here:
        SearchDataPenawaran();
    }//GEN-LAST:event_button17MouseClicked

    private void tableUser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUser1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableUser1MouseClicked

    private void button9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseClicked
        // TODO add your handling code here:
        searchDataLelang();
    }//GEN-LAST:event_button9MouseClicked

    private void FieldCariDataLelangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCariDataLelangKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCariDataLelangKeyReleased

    private void FieldCariDataLelangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCariDataLelangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCariDataLelangActionPerformed

    private void tableLelangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLelangMouseClicked
        // TODO add your handling code here:
        tableClickLelang();
    }//GEN-LAST:event_tableLelangMouseClicked

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        // TODO add your handling code here:
        ResetDataLelang();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonHapusLelangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusLelangActionPerformed
        int konfirmasi = JOptionPane.showConfirmDialog(null, "yakin ingin menghapus data?");
        System.out.println(konfirmasi);
        if(konfirmasi==0){
            try{

                idLelang = FieldIDLelang.getText();

                java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
                String sql = "delete from tb_lelang where id_lelang ='"+idLelang+"'";
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                int input = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Untuk Menghapusnya?", "Silahkan Pilih ", JOptionPane.YES_NO_OPTION);
            } catch (Exception e){
                JOptionPane.showConfirmDialog(null, e);
            }

        }
        //
        ShowDataLelang();
    }//GEN-LAST:event_buttonHapusLelangActionPerformed

    private void buttonEditLelangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditLelangActionPerformed
        idLelang = FieldIDLelang.getText();
        idBarang = (String) CbIDBarang.getSelectedItem();
        Date tanggal = TanggalDataLelang.getDate();
        String pattern = "YYYY-MM-dd";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String tanggal1 = format.format(tanggal);
        hargaTawar = FieldHargaTawarLelang.getText();
        idMasyarakat = (String) CbIDMasyarakat.getSelectedItem();
        idPetugas = (String) CbIDPetugas.getSelectedItem();
        opsi = (String)CbDataStatus.getSelectedItem();

        try{

            String sql = "update tb_lelang set id_barang=?, tanggal_barang=?, harga_tawar=?, id=?, id_petugas=?, status=? where id_lelang=?";

            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1, idBarang);
            this.pst.setString(2, tanggal1);
            this.pst.setString(3, hargaTawar);
            this.pst.setNString(4, idMasyarakat);
            this.pst.setString(5, idPetugas);
            this.pst.setNString(6, opsi);
            this.pst.setString(7, idLelang);
            this.pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "berhasil update");
            ShowDataLelang();

        } catch (Exception e){

        }
    }//GEN-LAST:event_buttonEditLelangActionPerformed

    private void CbDataStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbDataStatusActionPerformed
        // TODO add your handling code here:
        try{
            String Click = CbIDBarang.getSelectedItem().toString();
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet sql = st.executeQuery("select * from tb_level where id_level = '"+Click+"'");

        } catch (Exception e){

        }
    }//GEN-LAST:event_CbDataStatusActionPerformed

    private void buttonSimpanLelangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanLelangActionPerformed
        idLelang = FieldIDLelang.getText();
        idBarang = (String) CbIDBarang.getSelectedItem();
        Date tanggal = TanggalDataLelang.getDate();
        String pattern = "YYYY-MM-dd";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String tanggal1 = format.format(tanggal);
        hargaTawar = FieldHargaTawarLelang.getText();
        idMasyarakat = (String) CbIDMasyarakat.getSelectedItem();
        idPetugas = (String) CbIDPetugas.getSelectedItem();
        opsi = (String)CbDataStatus.getSelectedItem();

        try{

            String sql = "insert into tb_lelang values (?, ?, ?, ?, ?, ?, ?)";

            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1, idLelang);
            this.pst.setString(2, idBarang);
            this.pst.setString(3, tanggal1);
            this.pst.setNString(4, hargaTawar);
            this.pst.setString(5, idMasyarakat);
            this.pst.setNString(6, idPetugas);
            this.pst.setString(7, opsi);
            this.pst.execute();

            JOptionPane.showMessageDialog(null, "DATA LELANG BERHASIL DI SIMPAN!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            ShowDataLelang();
            autoNumberLelang();

        } catch (Exception e){

        }
    }//GEN-LAST:event_buttonSimpanLelangActionPerformed

    private void CbIDPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbIDPetugasActionPerformed
        // TODO add your handling code here:
        try{
            String Click = CbIDBarang.getSelectedItem().toString();
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet sql = st.executeQuery("select * from tb_petugas where id_petugas = '"+Click+"'");

        } catch (Exception e){

        }
    }//GEN-LAST:event_CbIDPetugasActionPerformed

    private void CbIDMasyarakatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbIDMasyarakatActionPerformed
        // TODO add your handling code here:
        try{
            String Click = CbIDMasyarakat.getSelectedItem().toString();
            String sql = "select * from tb_masyarakat join penawaran on tb_masyarakat.id = penawaran.id where tb_masyarakat.id=?";
            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1, Click);
            this.set = pst.executeQuery();

            if(set.next()){
                FieldNamaDataLelang.setText(set.getString("tb_masyarakat.nama"));
                FieldHargaTawarLelang.setText(set.getString("penawaran.harga_tawar"));
                //

            }
        } catch (Exception e){

        }
    }//GEN-LAST:event_CbIDMasyarakatActionPerformed

    private void CbIDBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbIDBarangActionPerformed
        // TODO add your handling code here:
        try{
            String Click = CbIDBarang.getSelectedItem().toString();
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet sql = st.executeQuery("select * from tb_barang where id_barang = '"+Click+"'");

        } catch (Exception e){

        }
    }//GEN-LAST:event_CbIDBarangActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button11ActionPerformed

    private void button11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button11MouseClicked
        // TODO add your handling code here:
        searchDataPetugas();
    }//GEN-LAST:event_button11MouseClicked

    private void FieldCariDataPetugasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCariDataPetugasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCariDataPetugasKeyReleased

    private void button12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button12MouseClicked
        searchDataPengguna();
    }//GEN-LAST:event_button12MouseClicked

    private void FieldCariDataMasyarakatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCariDataMasyarakatKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCariDataMasyarakatKeyReleased

    private void FieldCariDataMasyarakat1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCariDataMasyarakat1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCariDataMasyarakat1KeyReleased

    private void FieldCariDataMasyarakat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCariDataMasyarakat1ActionPerformed
        // TODO add your handling code here:
        SearchDataPenawaran();
    }//GEN-LAST:event_FieldCariDataMasyarakat1ActionPerformed

    private void button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button16ActionPerformed

    private void button16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button16MouseClicked
        // TODO add your handling code here:
        SearchDataPenawaran();
    }//GEN-LAST:event_button16MouseClicked

    private void CbBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbBarangActionPerformed
        // TODO add your handling code here:
        try{
            String Click = CbBarang.getSelectedItem().toString();
            java.sql.Connection conn = (java.sql.Connection)connect.connectDB();
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet sql = st.executeQuery("select * from tb_barang where id_barang = '"+Click+"'");

            if(sql.next()){
                String add1 = sql.getString("nama_barang");
                FieldNB.setText(add1);
                String add2 = sql.getString("harga_awal");
                FieldHB.setText(add2);

            }
        } catch (Exception e){

        }
    }//GEN-LAST:event_CbBarangActionPerformed

    private void ButtonClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClear1ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_ButtonClear1ActionPerformed

    private void ButtonDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDelete1ActionPerformed
        // TODO add your handling code here:
        try{

            IDTawar = FieldTawar.getText();

            java.sql.Connection conn = (java.sql.Connection)connect.connectDB();
            String sql = "delete from penawaran where id_penawaran ='"+IDTawar+"'";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            int input = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Untuk Menghapusnya?", "Silahkan Pilih ", JOptionPane.YES_NO_OPTION);
        } catch (Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        showData();
    }//GEN-LAST:event_ButtonDelete1ActionPerformed

    private void ButtonEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEdit1ActionPerformed
        // TODO add your handling code here:
        IDBarang =  (String)  CbBarang.getSelectedItem();
        IDUser = (String)CbUser.getSelectedItem();
        IDTawar = FieldTawar.getText();
        HargaAkhir = FieldHL.getText();

        try{

            String sql = "update penawaran set harga_tawar=?, id_barang=?, id=? where id_penawaran=?";

            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1, HargaAkhir);
            this.pst.setString(2, IDBarang);
            this.pst.setString(3, IDUser);
            this.pst.setNString(4, IDTawar);
            this.pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "berhasil update");
            showData();

        } catch (Exception e){

        }
    }//GEN-LAST:event_ButtonEdit1ActionPerformed

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        // TODO add your handling code here:
        mouseClickPaket();
    }//GEN-LAST:event_tableUserMouseClicked

    private void ButtonSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSave1ActionPerformed
        // TODO add your handling code here:
        try{
            IDBarang =  (String)  CbBarang.getSelectedItem();
            IDUser = (String)CbUser.getSelectedItem();
            IDTawar = FieldTawar.getText();
            HargaAkhir = FieldHL.getText();

            Connection con = connect.connectDB();
            Statement st = con.createStatement();
            String sql = "insert into penawaran values ('"+ IDTawar+
            "','"+HargaAkhir+
            "','"+IDBarang+
            "','"+IDUser+"')";
            st.execute(sql);
            showData();
            autoNumberPenawaran();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ButtonSave1ActionPerformed

    private void CbUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbUserActionPerformed
        // TODO add your handling code here:
        try{
            String Click = CbUser.getSelectedItem().toString();
            java.sql.Connection conn = (java.sql.Connection)connect.connectDB();
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet sql = st.executeQuery("select * from tb_masyarakat where id = '"+Click+"'");

            if(sql.next()){
                String add1 = sql.getString("nama");
                FieldNU.setText(add1);

            }
        } catch (Exception e){

        }
    }//GEN-LAST:event_CbUserActionPerformed

    private void fieldNamaPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNamaPetugasActionPerformed

    private void fieldNamaPetugasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNamaPetugasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fieldUsernamePetugas.requestFocus();
        }
    }//GEN-LAST:event_fieldNamaPetugasKeyPressed

    private void fieldUsernamePetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsernamePetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUsernamePetugasActionPerformed

    private void fieldUsernamePetugasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldUsernamePetugasKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){

            fieldPasswordPetugas.requestFocus();
        }
    }//GEN-LAST:event_fieldUsernamePetugasKeyPressed

    private void fieldUsernamePetugasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldUsernamePetugasKeyReleased
        // TODO add your handling code here:
        komponenPetugas();
        try {
            String sql = "select username from tb_petugas where username=?";
            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1,  usernamePetugas);
            this.set = pst.executeQuery();
            if(set.next()){
                fieldPasswordPetugas.setVisible(false);
                
                labelError.setVisible(true);
                labelError.setForeground(Color.RED);
                labelError.setText("Username " + usernamePetugas + " telah digunakan");

                fieldPasswordPetugas.setEditable(false);
               

            }else if(usernamePetugas.equals("")){
                labelError.setVisible(false);

            }else  if(set.next() == false){
                fieldPasswordPetugas.setVisible(true);
                labelError.setVisible(true);
                fieldPasswordPetugas.setEditable(true);
                labelError.setText("Username " + usernamePetugas + " dapat digunakan!");
                labelError.setForeground(Color.GREEN);

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_fieldUsernamePetugasKeyReleased

    private void fieldPasswordPetugasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPasswordPetugasKeyPressed
        
    }//GEN-LAST:event_fieldPasswordPetugasKeyPressed

    private void ButtonSimpanAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimpanAkunActionPerformed
           
        buatAkunPetugas();
      
    }//GEN-LAST:event_ButtonSimpanAkunActionPerformed

    private void fieldIDPetugasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIDPetugasKeyReleased
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            fieldNamaPetugas.requestFocus();
        }
    }//GEN-LAST:event_fieldIDPetugasKeyReleased

    private void FieldIDMasyarakatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldIDMasyarakatKeyReleased
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            FieldNamaMasyarakat.requestFocus();
        }
    }//GEN-LAST:event_FieldIDMasyarakatKeyReleased

    private void FieldNamaMasyarakatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNamaMasyarakatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNamaMasyarakatActionPerformed

    private void FieldNamaMasyarakatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldNamaMasyarakatKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            FieldUsernameMasyarakat.requestFocus();
        }

    }//GEN-LAST:event_FieldNamaMasyarakatKeyPressed

    private void FieldUsernameMasyarakatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUsernameMasyarakatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldUsernameMasyarakatActionPerformed

    private void FieldUsernameMasyarakatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldUsernameMasyarakatKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){

            FieldPasswordMasyarakat.requestFocus();
        }
    }//GEN-LAST:event_FieldUsernameMasyarakatKeyPressed

    private void FieldUsernameMasyarakatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldUsernameMasyarakatKeyReleased
        // TODO add your handling code here:
        komponen();
        try {
            String sql = "select username from tb_masyarakat where username=?";
            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1, InputUsernameMasyarakat);
            this.set = pst.executeQuery();
            if(set.next()){
                FieldPasswordMasyarakat.setVisible(false);
                FieldNoTelp.setVisible(false);
                labelError.setVisible(true);
                labelError.setForeground(Color.RED);
                labelError.setText("Username " + InputUsernameMasyarakat + " telah digunakan");

                FieldPasswordMasyarakat.setEditable(false);
                FieldNoTelp.setEditable(false);

            }else if(InputUsernameMasyarakat.equals("")){
                labelError.setVisible(false);

            }else  if(set.next() == false){
                FieldPasswordMasyarakat.setVisible(true);
                FieldNoTelp.setVisible(true);
                labelError.setVisible(true);
                FieldPasswordMasyarakat.setEditable(true);
                FieldNoTelp.setEditable(true);
                labelError.setText("Username " + InputUsernameMasyarakat + " dapat digunakan!");
                labelError.setForeground(Color.GREEN);

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_FieldUsernameMasyarakatKeyReleased

    private void FieldPasswordMasyarakatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldPasswordMasyarakatKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            FieldNoTelp.requestFocus();
        }

    }//GEN-LAST:event_FieldPasswordMasyarakatKeyPressed

    private void FieldNoTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNoTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNoTelpActionPerformed

    private void FieldNoTelpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldNoTelpKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            komponen();
            int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Anda Sudah Yakin?");

            if (konfirmasi == 0) {

                try {
                    String sql = "INSERT INTO tb_masyarakat values (?, ?, ?, ?, ?)";
                    this.pst = connect.connectDB().prepareStatement(sql);
                    this.pst.setString(1, InputidMasyarakat);
                    this.pst.setString(2, InputNamaMasyarakat);
                    this.pst.setString(3, InputUsernameMasyarakat);
                    this.pst.setString(4, InputPsswordMasyarakat);
                    this.pst.setString(5, InputNoMasyarakat);
                    this.pst.execute();

                    int input = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Untuk Menyimpannya?", "Silahkan Pilih ", JOptionPane.YES_NO_OPTION);
                    showDataMasyrakat();
                    AutoNumberID();

                } catch (Exception e) {
                    JOptionPane.showConfirmDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_FieldNoTelpKeyPressed

    private void ButtonSimpanAkun1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimpanAkun1ActionPerformed

        komponen();
        int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Anda Sudah Yakin?");

        if (konfirmasi == 0) {

            try {
                String sql = "INSERT INTO tb_masyarakat values (?, ?, ?, ?, ?)";
                this.pst = connect.connectDB().prepareStatement(sql);
                this.pst.setString(1, InputidMasyarakat);
                this.pst.setString(2, InputNamaMasyarakat);
                this.pst.setString(3, InputUsernameMasyarakat);
                this.pst.setString(4, InputPsswordMasyarakat);
                this.pst.setString(5, InputNoMasyarakat);
                this.pst.execute();

                int input = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Untuk Menyimpannya?", "Silahkan Pilih ", JOptionPane.YES_NO_OPTION);
                showDataMasyrakat();
                AutoNumberID();

            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
        }

    }//GEN-LAST:event_ButtonSimpanAkun1ActionPerformed

    private void buttonEditAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditAkunActionPerformed
        // TODO add your handling code here:
        komponenPetugas();
        try {
            String sql = "update tb_petugas set nama_petugas=?, username=?, password=? where id_petugas=?";
            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1, namaPetugas);
            this.pst.setString(2, usernamePetugas);
            this.pst.setString(3, passwordPetugas);
            this.pst.setString(4, IDPetugas);
            this.pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "berhasil update");
            showDataPetugas();
            komponenPetugas();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_buttonEditAkunActionPerformed

    private void ButtonHapusAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusAkunActionPerformed
        komponenPetugas();
        int konfirmasi = JOptionPane.showConfirmDialog(null, "yakin ingin menghapus data?");
        System.out.println(konfirmasi);
        if(konfirmasi==0){
        try {
            String sql = "delete from tb_petugas where id_petugas=?";
            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1, IDPetugas);
            this.pst.execute();
            
            int input = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Untuk Menghapusnya?", "Silahkan Pilih ", JOptionPane.YES_NO_OPTION);
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        }
        showDataPetugas();
    }//GEN-LAST:event_ButtonHapusAkunActionPerformed

    private void tablePetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePetugasMouseClicked
        mouseclickPetugas();
    }//GEN-LAST:event_tablePetugasMouseClicked

    private void buttonEditAkunUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditAkunUserActionPerformed
        komponen();
        try {
            String sql = "update tb_masyarakat set nama=?, username=?, password=? where id=?";
            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1, InputNamaMasyarakat);
            this.pst.setString(2, InputUsernameMasyarakat);
            this.pst.setString(3, InputPsswordMasyarakat);
            this.pst.setString(4, InputidMasyarakat);
            this.pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "berhasil update");
            showDataMasyrakat();
            komponen();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_buttonEditAkunUserActionPerformed

    private void ButtonHapusAkunUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusAkunUserActionPerformed
        komponen();
        int konfirmasi = JOptionPane.showConfirmDialog(null, "yakin ingin menghapus data?");
        System.out.println(konfirmasi);
        if(konfirmasi==0){
        try {
            String sql = "delete from tb_masyarakat where id=?";
            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1, InputidMasyarakat);
            this.pst.execute();
            
            int input = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Untuk Menghapusnya?", "Silahkan Pilih ", JOptionPane.YES_NO_OPTION);
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        }
        showDataMasyrakat();
    }//GEN-LAST:event_ButtonHapusAkunUserActionPerformed

    private void ButtonClearDataUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearDataUserActionPerformed
        ResetDataMasyarakat();
    }//GEN-LAST:event_ButtonClearDataUserActionPerformed

    private void ButtonClearDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearDataActionPerformed
        ResetDataPetugas();
    }//GEN-LAST:event_ButtonClearDataActionPerformed

    private void TableMasyarakatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMasyarakatMouseClicked
        mouseclickMasyarakat();
    }//GEN-LAST:event_TableMasyarakatMouseClicked

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
            java.util.logging.Logger.getLogger(PageAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageAP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.Button ButtonClear;
    private button.Button ButtonClear1;
    private button.Button ButtonClearData;
    private button.Button ButtonClearDataUser;
    private button.Button ButtonDaftarBarang;
    private button.Button ButtonDaftarLelang;
    private button.Button ButtonDataPetugas;
    private button.Button ButtonDataUser;
    private button.Button ButtonDelete;
    private button.Button ButtonDelete1;
    private button.Button ButtonEdit;
    private button.Button ButtonEdit1;
    private button.Button ButtonHapusAkun;
    private button.Button ButtonHapusAkunUser;
    private button.Button ButtonHistoryLelang;
    private button.Button ButtonSave;
    private button.Button ButtonSave1;
    private button.Button ButtonSimpanAkun;
    private button.Button ButtonSimpanAkun1;
    private button.Button ButtonSimpanHistory;
    private combobox.Combobox CbBarang;
    private combobox.Combobox CbDataStatus;
    private combobox.Combobox CbIDBarang;
    private combobox.Combobox CbIDMasyarakat;
    private combobox.Combobox CbIDPetugas;
    private combobox.Combobox CbUser;
    private textarea.TextArea DeskripsiDataBarang;
    private textfield.TextField_1 FieldCariDataBarang;
    private textfield.TextField_1 FieldCariDataHistory;
    private textfield.TextField_1 FieldCariDataLelang;
    private textfield.TextField_1 FieldCariDataMasyarakat;
    private textfield.TextField_1 FieldCariDataMasyarakat1;
    private textfield.TextField_1 FieldCariDataMasyarakat2;
    private textfield.TextField_1 FieldCariDataPetugas;
    private textfield.TextField_1 FieldHB;
    private textfield.TextField_1 FieldHL;
    private textfield.TextField_1 FieldHargaAwalBarang;
    private textfield.TextField_1 FieldHargaTawarHistory;
    private textfield.TextField_1 FieldHargaTawarLelang;
    private textfield.TextField_1 FieldIDBarang;
    private textfield.TextField_1 FieldIDHistory;
    private textfield.TextField_1 FieldIDLelang;
    private textfield.TextField FieldIDMasyarakat;
    private textfield.TextField_1 FieldNB;
    private textfield.TextField_1 FieldNU;
    private textfield.TextField_1 FieldNamaBarang;
    private textfield.TextField_1 FieldNamaBarangHistor;
    private textfield.TextField_1 FieldNamaDataLelang;
    private textfield.TextField FieldNamaMasyarakat;
    private textfield.TextField_1 FieldNamaUserHistory;
    private textfield.TextField FieldNoTelp;
    private textfield.TextField FieldPasswordMasyarakat;
    private textfield.TextField_1 FieldTawar;
    private textfield.TextField FieldUsernameMasyarakat;
    private javax.swing.JPanel FrameDataPenawaran;
    private javax.swing.JPanel HalamanDataBarang;
    private javax.swing.JPanel HalamanDataHistoryLelang;
    private javax.swing.JPanel HalamanDataLelang;
    private javax.swing.JPanel HalamanDataMasyarakat;
    private javax.swing.JPanel HalamanDataPetugas;
    private javax.swing.JScrollPane ScrollPaneBarang;
    private javax.swing.JScrollPane ScrollPaneLelang;
    private javax.swing.JScrollPane ScrollPaneMasyarakat;
    private javax.swing.JScrollPane ScrollPanePenawaran;
    private javax.swing.JScrollPane ScrollPanePenawaran1;
    private javax.swing.JScrollPane ScrollPanePetugas;
    private javax.swing.JScrollPane ScrollPanelHistoryLelang;
    private javax.swing.JTable TableDataBarang;
    private javax.swing.JTable TableHistoryLelang;
    private javax.swing.JTable TableMasyarakat;
    private com.toedter.calendar.JDateChooser TanggalDataBarang;
    private com.toedter.calendar.JDateChooser TanggalDataLelang;
    private button.Button button1;
    private button.Button button10;
    private button.Button button11;
    private button.Button button12;
    private button.Button button13;
    private button.Button button15;
    private button.Button button16;
    private button.Button button17;
    private button.Button button5;
    private button.Button button6;
    private button.Button button7;
    private button.Button button8;
    private button.Button button9;
    private button.Button buttonClear;
    private button.Button buttonEditAkun;
    private button.Button buttonEditAkunUser;
    private button.Button buttonEditHistory;
    private button.Button buttonEditLelang;
    private button.Button buttonHapusHistory;
    private button.Button buttonHapusLelang;
    private button.Button buttonResetHistory;
    private button.Button buttonSimpanLelang;
    private combobox.Combobox cbIDBarangHistory;
    private combobox.Combobox cbIDLelangHistory;
    private combobox.Combobox cbIDMasyarakatHistory;
    private textfield.TextField fieldIDPetugas;
    private textfield.TextField fieldNamaPetugas;
    private textfield.TextField fieldPasswordPetugas;
    private textfield.TextField fieldUsernamePetugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelError1;
    private LoginPage.PanelRound_1 panelRound_11;
    private LoginPage.PanelRound_1 panelRound_110;
    private LoginPage.PanelRound_1 panelRound_111;
    private LoginPage.PanelRound_1 panelRound_112;
    private LoginPage.PanelRound_1 panelRound_113;
    private LoginPage.PanelRound_1 panelRound_114;
    private LoginPage.PanelRound_1 panelRound_115;
    private LoginPage.PanelRound_1 panelRound_12;
    private LoginPage.PanelRound_1 panelRound_13;
    private LoginPage.PanelRound_1 panelRound_14;
    private LoginPage.PanelRound_1 panelRound_15;
    private LoginPage.PanelRound_1 panelRound_16;
    private LoginPage.PanelRound_1 panelRound_17;
    private LoginPage.PanelRound_1 panelRound_18;
    private LoginPage.PanelRound_1 panelRound_19;
    private LoginPage.PanelRound_1 panelRound_20;
    private LoginPage.PanelRound_1 panelRound_21;
    private LoginPage.PanelRound_1 panelRound_22;
    private LoginPage.PanelRound_1 panelRound_23;
    private LoginPage.PanelRound_1 panelRound_24;
    private javax.swing.JTable tableLelang;
    private javax.swing.JTable tablePetugas;
    private javax.swing.JTable tableUser;
    private javax.swing.JTable tableUser1;
    private textarea.TextAreaScroll textAreaScroll1;
    // End of variables declaration//GEN-END:variables

    //SOURCE CODE(CODINGAN) UNTUK MENGAMBIL DATA RELASI(UNTUK COMBO BOX)
    
    public void idBarangHistory(){
        try{
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            java.sql.Statement stat = conn.createStatement();
            String sql = "SELECT id_barang FROM tb_barang";
            java.sql.ResultSet set = stat.executeQuery(sql);
            while(set.next()){
                String idBarang = set.getString("id_barang");
                cbIDBarangHistory.addItem(idBarang);
            }
        }catch (Exception e){
        }
        }
            
    public void idLelangHistory(){
        try{
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            java.sql.Statement stat = conn.createStatement();
            String sql = "SELECT id_lelang FROM tb_lelang";
            java.sql.ResultSet set = stat.executeQuery(sql);
            while(set.next()){
                String idBarang = set.getString("id_lelang");
                cbIDLelangHistory.addItem(idBarang);
            }
        }catch (Exception e){
            
        }
            
    }
    
    public void idMasyarakatHistory(){
        try{
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            java.sql.Statement stat = conn.createStatement();
            String sql = "SELECT id FROM tb_masyarakat";
            java.sql.ResultSet set = stat.executeQuery(sql);
            while(set.next()){
                String idBarang = set.getString("id");
                CbIDMasyarakat.addItem(idBarang);
            }
        }catch (Exception e){
        }
            
    }
    public void idBarangLelang(){
        try{
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            java.sql.Statement stat = conn.createStatement();
            String sql = "SELECT id_barang FROM tb_barang";
            java.sql.ResultSet set = stat.executeQuery(sql);
            while(set.next()){
                String idBarang = set.getString("id_barang");
                CbIDBarang.addItem(idBarang);
            }
        }catch (Exception e){
        }
        }
            
    public void idPetugasLelang(){
        try{
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            java.sql.Statement stat = conn.createStatement();
            String sql = "SELECT id_petugas FROM tb_petugas";
            java.sql.ResultSet set = stat.executeQuery(sql);
            while(set.next()){
                String idBarang = set.getString("id_petugas");
                CbIDPetugas.addItem(idBarang);
            }
        }catch (Exception e){
            
        }
            
    }
    
    public void idMasyarakatLelang(){
        try{
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            java.sql.Statement stat = conn.createStatement();
            String sql = "SELECT id FROM tb_masyarakat";
            java.sql.ResultSet set = stat.executeQuery(sql);
            while(set.next()){
                String idBarang = set.getString("id");
                cbIDMasyarakatHistory.addItem(idBarang);
            }
        }catch (Exception e){
            
        }
            
    }
    
    
    
    
    //SOURCE CODE(CODINGAN) KHUSUS MENAMPILKAN DATA.
    public void showDataBarang (){
        TableCustom.apply(ScrollPaneBarang, TableCustom.TableType.MULTI_LINE);
        Object[] barang= {"ID", "NAMA BARANG", "TANGGAL",  "HARGA AWAL", "DESKRIPSI"};
        tabmode = new DefaultTableModel(null, barang);
        TableDataBarang.setModel(tabmode);
        
        try{
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            String sql = "select * from tb_barang";
            java.sql.Statement stat = conn.createStatement();
            ResultSet set = stat.executeQuery(sql);
            
            while(set.next()){
                String[] data = {
                    set.getString("id_barang"),
                    set.getString("nama_barang"),
                    set.getString("tanggal"),
                    set.getString("harga_awal"),
                    set.getString("desc_barang")
                };
                tabmode.addRow(data);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            
        }
    }
    public void showDataMasyrakat (){
        TableCustom.apply(ScrollPaneMasyarakat, TableCustom.TableType.MULTI_LINE);
        Object[] Masyarakat= {"ID", "NAMA", "NAMA PENGGUNA", "PASSWORD", "NO TELEPON"};
        tabmode = new DefaultTableModel(null, Masyarakat);
        TableMasyarakat.setModel(tabmode);
        
        try{
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            String sql = "select * from tb_masyarakat";
            java.sql.Statement stat = conn.createStatement();
            ResultSet set = stat.executeQuery(sql);
            
            while(set.next()){
                String[] data = {
                    set.getString("id"),
                    set.getString("nama"),
                    set.getString("username"),
                    set.getString("password"),
                    set.getString("telp")
                };
                tabmode.addRow(data);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            
        }
    }
    public void showDataPetugas (){
        TableCustom.apply(ScrollPanePetugas, TableCustom.TableType.MULTI_LINE);
        Object[] Petugas= {"ID", "NAMA", "NAMA PENGGUNA", "PASSWORD", "SEBAGAI"};
        tabmode = new DefaultTableModel(null, Petugas);
        tablePetugas.setModel(tabmode);
        
        try{
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            String sql = "SELECT * FROM tb_petugas JOIN tb_level on tb_petugas.id_level = tb_level.id_level WHERE tb_level.level='Petugas'";
            java.sql.Statement stat = conn.createStatement();
            ResultSet set = stat.executeQuery(sql);
            
            while(set.next()){
                String[] data = {
                    set.getString("id_petugas"),
                    set.getString("nama_petugas"),
                    set.getString("username"),
                    set.getString("password"),
                    set.getString("level")
                };
                tabmode.addRow(data);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            
        }
    }
    public void  ShowDataLelang (){
        TableCustom.apply(ScrollPaneLelang, TableCustom.TableType.MULTI_LINE);
        Object[] Lelang= {"ID LELANG", "ID BARANG", "TANGGAL", "ID MASYARAKAT", "NAMA", "HARGA TAWAR",  "ID PETUGAS", "STATUS"};
            tabmode = new DefaultTableModel(null, Lelang);
        tableLelang.setModel(tabmode);
        
        try{
            
             idMasyarakat = (String) CbIDMasyarakat.getSelectedItem();
             idBarang = (String) CbIDBarang.getSelectedItem();
             idPetugas = (String) CbIDPetugas.getSelectedItem();
             String status = (String) CbDataStatus.getSelectedItem();
            
            java.sql.Connection conn = (java.sql.Connection)connect.connectDB();
            String sql = "select * from tb_lelang join tb_barang on tb_lelang.id_barang = tb_barang.id_barang join tb_masyarakat on tb_lelang.id = tb_masyarakat.id join tb_petugas on tb_lelang.id_petugas = tb_petugas.id_petugas";
//            String sql = "select * from tb_lelang, tb_barang, tb_masyarakat, tb_petugas WHERE tb_barang.id_barang=tb_lelang.id_barang AND tb_masyarakat.id=tb_lelang.id AND tb_petugas.id_petugas=tb_lelang.id_petugas";
            java.sql.Statement stat = conn.createStatement();
            ResultSet set = stat.executeQuery(sql);
            
            while(set.next()){
                String[] data = {
                    set.getString("id_lelang"),
                    set.getString("id_barang"),
                    set.getString("tanggal_barang"),
                    set.getString("id"),
                    set.getString("nama"),
                    set.getString("harga_tawar"),
                    set.getString("id_petugas"),
                    set.getString("status")
                };
                tabmode.addRow(data);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            
        }
    }
    public void  ShowDataHistoryLelang (){
        
        Object[] Lelang= {"ID CATATAN", "ID LELANG", "ID BARANG", "ID MASYARAKAT",  "HARGA TAWAR"};
            tabmode = new DefaultTableModel(null, Lelang);
        TableHistoryLelang.setModel(tabmode);
        
        try{
            idMasyarakat = (String) cbIDMasyarakatHistory.getSelectedItem();
            
            java.sql.Connection conn = (java.sql.Connection)connect.connectDB();
            String sql = "select * from tb_masyarakat join tb_lelang on tb_lelang.id = tb_masyarakat.id where tb_masyarakat.id='"+idMasyarakat+"'";
            java.sql.Statement stat = conn.createStatement();
            ResultSet set = stat.executeQuery(sql);
            
            while(set.next()){
                String[] data = {
                    set.getString("id_history"),
                    set.getString("id_lelang"),
                    set.getString("id_barang"),
                    set.getString("id"),
                    set.getString("harga_tawar")
                };
                tabmode.addRow(data);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            
        }
    }
    public void  showfullDataHistoryLelang(){
         TableCustom.apply(ScrollPanelHistoryLelang, TableCustom.TableType.MULTI_LINE);
        Object[] Lelang= {"ID CATATAN", "ID LELANG", "ID BARANG", "ID MASYARAKAT",  "HARGA TAWAR"};
            tabmode = new DefaultTableModel(null, Lelang);
        TableHistoryLelang.setModel(tabmode);
        
        try{
           
            
            java.sql.Connection conn = (java.sql.Connection)connect.connectDB();
            String sql = "select * from history_lelang"; 
            java.sql.Statement stat = conn.createStatement();
            ResultSet set = stat.executeQuery(sql);
            
            while(set.next()){
                String[] data = {
                    set.getString("id_history"),
                    set.getString("id_lelang"),
                    set.getString("id_barang"),
                    set.getString("id"),
                    set.getString("harga_tawar")
                };
                tabmode.addRow(data);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            
        }
    }
    
    //BATAS MENAMPILKAN DATA.
    
    
    
    public void delete(){
        int row= tabmode.getRowCount();
        for( int i=0; i<row; i++){
            tabmode.removeRow(0);
        }
    }
    
    
    //SOURCE CODE(CODINGAN) UNTUK TABLE CLICK ATAU UNTUK MENGHAPUS DATA DAN MENGUBAH DATA.
    
    public void tableClickBarang () {    //TABLE CLICK UNTUK TABLE BARANG
        
        
        int row = TableDataBarang.getSelectedRow();
        if(row==row){
            
        }
        String Barang = (TableDataBarang.getModel().getValueAt(row, 0).toString());
        
        try{
            
            java.sql.Connection conn = (java.sql.Connection)connect.connectDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from tb_barang where id_barang='"+Barang+"'");
            if(sql.next()){
                String add1 = sql.getString("id_barang");
                FieldIDBarang.setText(add1);
                String add2 = sql.getString("nama_barang");
                FieldNamaBarang.setText(add2);
                Date add3 = sql.getDate("tanggal");
                TanggalDataBarang.setDate(add3);
                String add4 = sql.getString("harga_awal");
                FieldHargaAwalBarang.setText(add4);
                String add5 = sql.getString("desc_barang");
                DeskripsiDataBarang.setText(add5);
                
            
                
            }
        }catch (Exception e){
            
        }
      
    }
    
    public void mouseclickPetugas(){
            int baris = tablePetugas.getSelectedRow();
            String Id = tablePetugas.getModel().getValueAt(baris, 0).toString();
            String Nama = tablePetugas.getModel().getValueAt(baris, 1).toString();
            String Username = tablePetugas.getModel().getValueAt(baris, 2).toString();
            String Password = tablePetugas.getModel().getValueAt(baris, 3).toString();
            
            fieldIDPetugas.setText(Id);
            fieldNamaPetugas.setText(Nama);
            fieldUsernamePetugas.setText(Username);
            fieldPasswordPetugas.setText(Password);
        }
    
    public void mouseclickMasyarakat(){
            int baris = TableMasyarakat.getSelectedRow();
            String Id = TableMasyarakat.getModel().getValueAt(baris, 0).toString();
            String Nama = TableMasyarakat.getModel().getValueAt(baris, 1).toString();
            String Username = TableMasyarakat.getModel().getValueAt(baris, 2).toString();
            String Password = TableMasyarakat.getModel().getValueAt(baris, 3).toString();
            String No = TableMasyarakat.getModel().getValueAt(baris, 4).toString();
            
            FieldIDMasyarakat.setText(Id);
            FieldNamaMasyarakat.setText(Nama);
            FieldUsernameMasyarakat.setText(Username);
            FieldPasswordMasyarakat.setText(Password);
            FieldNoTelp.setText(No);
        }
    
    
    
    
    public void tableClickLelang () {        //TABLE CLICK UNTUK TABLE LELANG
int row = tableLelang.getSelectedRow();
        if(row==row){
            CbIDBarang.setEditable(true);
            CbIDMasyarakat.setEditable(true);
            CbIDPetugas.setEditable(true);
            CbDataStatus.setEditable(true);
        }
        String lelang = (tableLelang.getModel().getValueAt(row, 0).toString());
        
        try{
            
            java.sql.Connection conn = (java.sql.Connection)connect.connectDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from tb_lelang where id_lelang='"+lelang+"'");
            if(sql.next()){
                String add1 = sql.getString("id_lelang");
                FieldIDLelang.setText(add1);
                String add2 = sql.getString("id_barang");
                CbIDBarang.setSelectedItem(add2);
                Date add3 = sql.getDate("tanggal_barang");
                TanggalDataLelang.setDate(add3);
                String add4 = sql.getString("id");
                CbIDMasyarakat.setSelectedItem(add4);
                String add5 = sql.getString("nama");
                FieldNamaBarang.setText(add5);
                String add6 = sql.getString("harga_tawar");
                FieldHargaTawarLelang.setText(add6);
                String add7 = sql.getString("id_petugas");
                CbIDPetugas.setSelectedItem(add7);
                String add8 = sql.getString("status");
                CbDataStatus.setSelectedItem(add8);
                
              
                
             
                
            
                
            }
        }catch (Exception e){
            
        }
    }
    
    public void tableClickHistoryLelang () {        //TABLE CLICK UNTUK TABLE HISTORY LELANG
int row = TableHistoryLelang.getSelectedRow();
        if(row==row){
            cbIDLelangHistory.setEditable(true);
            cbIDBarangHistory.setEditable(true);
            cbIDMasyarakatHistory.setEditable(true);
            
        }
        String lelang = (TableHistoryLelang.getModel().getValueAt(row, 0).toString());
        
        String HargaTawar = (TableHistoryLelang.getModel().getValueAt(row, 4).toString());
          FieldHargaTawarHistory.setText(HargaTawar);
        
        
        try{
            
      
            String sql = "select * from history_lelang where id_history=?"; 
            this.pst = connect.connectDB().prepareStatement(sql); 
            this.pst.setString(1, lelang); 
            this.set = pst.executeQuery(); 
            
           
            if(set.next()){
                String add1 = set.getString("id_history");
                FieldIDHistory.setText(add1);
                String add2 = set.getString("id_lelang");
                cbIDLelangHistory.setSelectedItem(add2);
                String add3 = set.getString("id_barang");
                cbIDBarangHistory.setSelectedItem(add3);
                String add4 = set.getString("nama_barang");
                FieldNamaBarangHistor.setText(add4);
                String add5 = set.getString("id");
                cbIDMasyarakatHistory.setSelectedItem(add5);
                String add6 = set.getString("nama");
//                FieldNamaUserHistory.setText(add6);
//                String add7 = set.getString("penawaran.harga_tawar");
                
                
            
                
            }
          
        }catch (Exception e){
            
        }
    }
    
    //BATAS SC TABLE CLICK.
    
    
    
    
    
    
    
    
    
    //INI SOURCE CODE(CODINGAN) UNTUK MENCARI DATA
    
    private void searchDataLelang(){
        try{
            tableLelang.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            TableCustom.apply(ScrollPanelHistoryLelang, TableCustom.TableType.MULTI_LINE);
            Object[] search = {"ID LELANG", "ID BARANG", "ID MASYARAKAT", "HARGA TAWAR",  "ID PETUGAS", "STATUS"};
            tabmode= new DefaultTableModel(null, search);
            tableLelang.setModel(tabmode);
            
            String cari = FieldCariDataLelang.getText();
            
            Connection conn = (Connection)connect.connectDB();
            Statement st = conn.createStatement();
            tabmode.getDataVector().removeAllElements();
            
            
            SearchBarang=st.executeQuery("SELECT * from tb_lelang where id_lelang LIKE '%"+cari+"%' OR id_barang LIKE '%"+cari+"%' OR id LIKE '%"+cari+"%' OR harga_tawar LIKE '%"+cari+"%' OR id_petugas LIKE '%"+cari+"%' OR status LIKE '%"+cari+"%'");
            while(SearchBarang.next()){
                Object[] data={
                    
                    SearchBarang.getString("id_lelang"),
                    SearchBarang.getString("id_barang"),
                    SearchBarang.getString("id"),
                    SearchBarang.getString("harga_tawar"),
                    SearchBarang.getString("id_petugas"),
                    SearchBarang.getString("status")
                };
                tabmode.addRow(data);
                }
        } catch (Exception e){
        }
    }  
    private void searchDataBarang(){
        try{
            TableDataBarang.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            TableCustom.apply(ScrollPanelHistoryLelang, TableCustom.TableType.MULTI_LINE);
            Object[] search = {"ID BARANG","NAMA BARANG", "TANGGAL", "HARGA AWAL", "DESKRIPSI"};
            tabmode= new DefaultTableModel(null, search);
            TableDataBarang.setModel(tabmode);
            
            String cari = FieldCariDataBarang.getText();
            
            Connection conn = (Connection)connect.connectDB();
            Statement st = conn.createStatement();
            tabmode.getDataVector().removeAllElements();
            
            
            SearchBarang=st.executeQuery("SELECT * from tb_barang where id_barang LIKE '%"+cari+"%' OR nama_barang LIKE '%"+cari+"%' OR tanggal LIKE '%"+cari+"%' OR desc_barang LIKE '%"+cari+"%'");
            while(SearchBarang.next()){
                Object[] data={
                    
                    SearchBarang.getString("id_barang"),
                    SearchBarang.getString("nama_barang"),
                    SearchBarang.getString("tanggal"),
                    SearchBarang.getString("harga_awal"),
                    SearchBarang.getString("desc_barang")
                };
                tabmode.addRow(data);
                }
        } catch (Exception e){
        }
    }  
    private void searchDataPetugas(){
        try{
            tablePetugas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            TableCustom.apply(ScrollPanelHistoryLelang, TableCustom.TableType.MULTI_LINE);
            Object[] search = {"ID PETUGAS","NAMA", "NAMA PENGGUNA", "KATA SANDI", "SEBAGAI"};
            tabmode= new DefaultTableModel(null, search);
            tablePetugas.setModel(tabmode);
            
            String cari = FieldCariDataPetugas.getText();
            
            Connection conn = (Connection)connect.connectDB();
            Statement st = conn.createStatement();
            tabmode.getDataVector().removeAllElements();
            
            
            SearchBarang=st.executeQuery("SELECT * FROM tb_petugas JOIN tb_level ON tb_petugas.id_level = tb_level.id_level "
                    + "WHERE tb_petugas.nama_petugas LIKE '"+cari+"%' OR tb_petugas.id_petugas LIKE '"+cari+"%'");
            while(SearchBarang.next()){
                Object[] data={
                    
                    SearchBarang.getString("id_petugas"),
                    SearchBarang.getString("nama_petugas"),
                    SearchBarang.getString("username"),
                    SearchBarang.getString("password"),
                    SearchBarang.getString("level")
                };
                tabmode.addRow(data);
                }
        } catch (Exception e){
        }
    }  
    private void searchDataPengguna(){
        try{
            TableMasyarakat.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            TableCustom.apply(ScrollPanelHistoryLelang, TableCustom.TableType.MULTI_LINE);
            Object[] search = {"ID MASYARAKAT","NAMA", "NAMA PENGGUNA", "KATA SANDI", "NO TELEPON"};
            tabmode= new DefaultTableModel(null, search);
            TableMasyarakat.setModel(tabmode);
            
            String cari = FieldCariDataMasyarakat.getText();
            
            Connection conn = (Connection)connect.connectDB();
            Statement st = conn.createStatement();
            tabmode.getDataVector().removeAllElements();
            
            
            SearchBarang=st.executeQuery("SELECT * from tb_masyarakat where id LIKE '%"+cari+"%' OR nama LIKE '%"+cari+"%' OR username LIKE '%"+cari+"%' OR password LIKE '%"+cari+"%' OR telp LIKE '%"+cari+"%'");
            while(SearchBarang.next()){
                Object[] data={
                    
                    SearchBarang.getString("id"),
                    SearchBarang.getString("nama"),
                    SearchBarang.getString("username"),
                    SearchBarang.getString("password"),
                    SearchBarang.getString("telp")
                };
                tabmode.addRow(data);
                }
        } catch (Exception e){
        }
    }  
    private void searchDataHistory(){
          TableHistoryLelang.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            TableCustom.apply(ScrollPanelHistoryLelang, TableCustom.TableType.MULTI_LINE);
            Object[] search = {"ID CATATAN", "ID LELANG", "ID BARANG", "ID MASYARAKAT", "HARGA TAWAR"};
            tabmode= new DefaultTableModel(null, search);
            TableHistoryLelang.setModel(tabmode);
            
            String cari = FieldCariDataHistory.getText();
            System.out.println(cari);
        try{
            
            String sql = "select * from history_lelang where id_history like? or id_barang like? or id_lelang like? or harga_tawar like? or id like?"; 
            this.pst = connect.connectDB().prepareStatement(sql); 
            this.pst.setString(1, "%" + cari + "%");
            this.pst.setString(2, "%" + cari + "%");
            this.pst.setString(3, "%" + cari + "%");
            this.pst.setString(4, "%" + cari + "%");
            this.pst.setString(5, "%" + cari + "%");
            this.set = pst.executeQuery(); 
            while(set.next()){
                     Object[] data={
                    
                    set.getString("id_history"),
                    set.getString("id_lelang"),
                    set.getString("id_barang"),
                    set.getString("id"),
                    set.getString("harga_tawar")
                };
                     
                 tabmode.addRow(data);
                    
                
            }
           
                
                
            
            
            
          
            
            
            
        
            

        
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    } 
    
    //BATAS SC MENCARI DATA

    

    
    // CODINGAN UNTUK TANGGAL
    
    public void lahir(){
        if(TanggalDataBarang.getDate() !=null){
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            tanggal = String.valueOf(format.format(TanggalDataBarang.getDate()));
        }
    }
    
    
    public void ResetDataBarang(){
        FieldIDBarang.setText("");
        FieldNamaBarang.setText("");
        TanggalDataBarang.setDate(null);
        FieldHargaAwalBarang.setText("");
        DeskripsiDataBarang.setText("");
        
        
        
    
}
    public void ResetDataLelang(){
        FieldIDLelang.setText("");
        CbIDBarang.setSelectedItem("-");
        TanggalDataLelang.setDate(null);
        CbIDMasyarakat.setSelectedItem("-");
        FieldNamaDataLelang.setText("");
        FieldHargaTawarLelang.setText("");
        CbIDPetugas.setSelectedItem("-");
        CbDataStatus.setSelectedItem("-");
        
        
        
        
}
    public void ResetDataPetugas(){
        
        fieldNamaPetugas.setText(" ");
        fieldUsernamePetugas.setText(" ");
        fieldPasswordPetugas.setText(" ");
        
        
        
        
}
    public void ResetDataMasyarakat(){
        
        FieldNamaMasyarakat.setText("");
        FieldUsernameMasyarakat.setText("");
        FieldPasswordMasyarakat.setText("");
        FieldNoTelp.setText("");
        
}
    
    
    
    public void ResetDataHistoryLelang(){
        FieldIDHistory.setText("");
        cbIDLelangHistory.setSelectedItem("-");
        cbIDBarangHistory.setSelectedItem("-");
        FieldNamaBarangHistor.setText("");
        cbIDMasyarakatHistory.setSelectedItem("-");
        FieldNamaUserHistory.setText("");
        FieldHargaTawarHistory.setText("");
        
        
        
    }
    
    public void autoNumberHistory(){
        try {
            String sql = "select max(id_history) as autoNumber from history_lelang "; 
            this.pst = connect.connectDB().prepareStatement(sql); 
            this.set = pst.executeQuery();
            if(set.next()){
                int autoNumber = set.getInt("autoNumber"); 
                FieldIDHistory.setText(String.valueOf(autoNumber + 1));
            }
        } catch (Exception e) {
        }
    }
    
    public void autoNumberLelang(){
        try {
            String sql = "select max(id_lelang) as autoNumber from tb_lelang "; 
            this.pst = connect.connectDB().prepareStatement(sql); 
            this.set = pst.executeQuery();
            if(set.next()){
                int autoNumber = set.getInt("autoNumber"); 
                FieldIDLelang.setText(String.valueOf(autoNumber + 1));
            }
        } catch (Exception e) {
        }
    }
    
    public void autoNumberBarang(){
        try {
            String sql = "select max(id_barang) as autoNumber from tb_barang "; 
            this.pst = connect.connectDB().prepareStatement(sql); 
            this.set = pst.executeQuery();
            if(set.next()){
                int autoNumber = set.getInt("autoNumber"); 
                FieldIDBarang.setText(String.valueOf(autoNumber + 1));
            }
        } catch (Exception e) {
        }
    }
    
    //BAGIAN KHUSUS UNTUK PENAWARAN
    
    public void idBarang(){
        try{
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            java.sql.Statement stat = conn.createStatement();
            String sql = "SELECT id_barang FROM tb_barang";
            java.sql.ResultSet set = stat.executeQuery(sql);
            while(set.next()){
                String idBarang = set.getString("id_barang");
                CbBarang.addItem(idBarang);
            }
        }catch (Exception e){
            
        }
            
    }
    
    public void idUser(){
        try{
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            java.sql.Statement stat = conn.createStatement();
            String sql = "SELECT id FROM tb_masyarakat";
            java.sql.ResultSet set = stat.executeQuery(sql);
            while(set.next()){
                String idUser = set.getString("id");
                CbUser.addItem(idUser);
            }
        }catch (Exception e){
            
        }
            
    }
    
    public void showData (){
        
        TableCustom.apply(ScrollPanePenawaran1, TableCustom.TableType.MULTI_LINE);
        Object[] barang= {"ID", "HARGA TAWAR", "ID BARANG",  "ID MASYARAKAT"};
        tabmode = new DefaultTableModel(null, barang);
        tableUser1.setModel(tabmode);
        
        try{
            java.sql.Connection conn = (java.sql.Connection)connecction.connect.connectDB();
            String sql = "select * from penawaran";
            java.sql.Statement stat = conn.createStatement();
            ResultSet set = stat.executeQuery(sql);
            
            while(set.next()){
                String[] data = {
                    set.getString("id_penawaran"),
                    set.getString("harga_tawar"),
                    set.getString("id_barang"),
                    set.getString("id")
                   
                };
                tabmode.addRow(data);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            
        }
    }
    
    
    
    public void clear(){
        FieldTawar.setText("");
        CbBarang.setSelectedItem("-");
        FieldNB.setText("");
        FieldHB.setText("");
        FieldHL.setText("");
        CbUser.setSelectedItem("-");
        FieldNU.setText("");
        
        
    }
    
    
    
    public void mouseClickPaket () {
int baris = tableUser.getSelectedRow () ;
String idP = tableUser.getModel (). getValueAt (baris, 0). toString () ;
String hP = tableUser.getModel () .getValueAt (baris, 1) .toString ();
String idB = tableUser.getModel (). getValueAt (baris, 2). toString () ;
String idU = tableUser.getModel().getValueAt(baris, 3).toString();


FieldTawar.setText(idP);
FieldHL.setText(hP);
CbBarang.setSelectedItem(idB);
CbUser.setSelectedItem(idU);


    
    }
    
    private void SearchDataPenawaran(){
        try{
            tableUser1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            TableCustom.apply(ScrollPanePenawaran1, TableCustom.TableType.MULTI_LINE);
            Object[] search = {"ID PENAWARAN","HARGA TAWAR", "ID BARANG", "ID MASYARAKAT"};
            tabmode= new DefaultTableModel(null, search);
            tableUser1.setModel(tabmode);
            
            String cari = FieldCariDataMasyarakat2.getText();
            
            Connection conn = connect.connectDB();
            Statement st = conn.createStatement();
            tabmode.getDataVector().removeAllElements();
            
            SearchBarang=st.executeQuery("SELECT * FROM penawaran JOIN tb_barang ON penawaran.id_barang =  tb_barang.id_barang JOIN tb_masyarakat ON penawaran.id = tb_masyarakat.id "
                    + "WHERE penawaran.id_penawaran LIKE '"+cari+"%' OR penawaran.harga_tawar LIKE '"+cari+"%' OR tb_barang.id_barang LIKE '"+cari+"%' OR tb_masyarakat.id LIKE '"+cari+"%'");
            
            
//            SearchBarang=st.executeQuery("SELECT * from tb_penawaran, tb_barang, tb_masyarakat where id_penawaran LIKE '%"+cari+"%' OR harga_tawar LIKE '%"+cari+"%' OR id_barang LIKE '%"+cari+"%' OR id LIKE '%"+cari+"%'");

            while(SearchBarang.next()){
                Object[] data={
                    
                    SearchBarang.getString("id_penawaran"),
                    SearchBarang.getString("harga_tawar"),
                    SearchBarang.getString("id_barang"),
                    SearchBarang.getString("id")
                };
                tabmode.addRow(data);
                }
        } catch (Exception e){
        }
    }
    
    public void autoNumberPenawaran(){
        try {
            String sql = "select max(id_penawaran) as autoNumber from penawaran "; 
            this.pst = connect.connectDB().prepareStatement(sql); 
            this.set = pst.executeQuery();
            if(set.next()){
                int autoNumber = set.getInt("autoNumber"); 
                FieldTawar.setText(String.valueOf(autoNumber + 1));
            }
        } catch (Exception e) {
        }
    }
    
    public void komponenPetugas(){
        MD5 hash = new MD5(); 
        IDPetugas = fieldIDPetugas.getText().trim(); 
        namaPetugas = fieldNamaPetugas.getText().trim(); 
        usernamePetugas = fieldUsernamePetugas.getText().trim(); 
        passwordPetugas = hash.getMd5(fieldPasswordPetugas.getText().trim()); 
        
    }
    
    public void buatAkunPetugas(){
        
        komponenPetugas();
        try {
            String sql = "insert into tb_petugas values(?, ?, ?, ?, ?)"; 
            this.pst = connect.connectDB().prepareStatement(sql); 
            this.pst.setString(1, IDPetugas); 
            this.pst.setString(2, namaPetugas); 
            this.pst.setString(3, usernamePetugas); 
            this.pst.setString(4, passwordPetugas); 
            this.pst.setString(5, "1002"); 
            this.pst.execute(); 
            JOptionPane.showConfirmDialog(null, "Apakah anda yakin untuk menyimpannya?"); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        showDataPetugas();
        autoNumberPetugas();
    }
    
    public void autoNumberPetugas(){
        try {
            String sql = "select max(id_petugas) as autoNumber from tb_petugas "; 
            this.pst = connect.connectDB().prepareStatement(sql); 
            this.set = pst.executeQuery();
            if(set.next()){
                int autoNumber = set.getInt("autoNumber"); 
                fieldIDPetugas.setText(String.valueOf(autoNumber + 1));
            }
        } catch (Exception e) {
        }
    }
    public void komponen(){
        MD5 hash = new MD5(); 
        
        InputidMasyarakat = FieldIDMasyarakat.getText().trim();
        InputNamaMasyarakat = FieldNamaMasyarakat.getText().trim();
        InputUsernameMasyarakat = FieldUsernameMasyarakat.getText().trim();
        InputPsswordMasyarakat = hash.getMd5(FieldPasswordMasyarakat.getText().trim()); 
        InputNoMasyarakat = FieldNoTelp.getText().trim();
    }
    public void AutoNumberID(){
        try {
            String sql = "select max(id) as autoNumber from tb_masyarakat "; 
            this.pst = connect.connectDB().prepareStatement(sql); 
            this.set = pst.executeQuery();
            if(set.next()){
                int autoNumber = set.getInt("autoNumber"); 
                FieldIDMasyarakat.setText(String.valueOf(autoNumber + 1));
            }
        } catch (Exception e) {
        }
    }
    
}


    

