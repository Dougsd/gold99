package com.mycompany.gold99;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.sql.Date;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Interface extends javax.swing.JPanel {
    public Interface() {
        initComponents();

        DAO dao = new DAO();
        List<Object[]> dados = dao.GetAllClientes();
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);
        for (Object[] linha : dados) {
         model.addRow(linha);
        }
        Estoque estoque = dao.getEstoque();
        
        BigDecimal bd = new BigDecimal(estoque.getGramas());
        bd = bd.setScale(2, RoundingMode.DOWN); // Trunca sem arredondar
        jTextField6.setText(Float.toString(bd.floatValue()));
        
        BigDecimal bdc = new BigDecimal(estoque.getCcustoMedio());
        bdc = bdc.setScale(2, RoundingMode.DOWN); // Trunca sem arredondar
        jTextField13.setText(Float.toString(bdc.floatValue()));
        
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        model1.setRowCount(0);
        List<Object[]> vendas = dao.HistoryVendas();
        for (Object[] linha : vendas) {
            model1.addRow(linha);
        } 
        int anoAtual = LocalDate.now().getYear();
        jTextField11.setText(Integer.toString(anoAtual));
        Date date = new Date(System.currentTimeMillis());
        jTextField12.setText(Float.toString(dao.getLucroMes(date)));
        LocalDate localDate = date.toLocalDate(); // Converte para LocalDate
        int mes = localDate.getMonthValue(); // Obtém o número do mês
        jComboBox1.setSelectedIndex(mes-1);
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField12 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        jLabel1.setText("Peso Seco (g)        :");

        jLabel2.setText("Peso Molhado (g):");

        jTextField1.setColumns(4);
        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setColumns(4);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.setColumns(4);
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jButton1.setText("Confirma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor do Fino (R$):");

        jTextField7.setColumns(4);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jLabel6.setText("Valor grama     (g):");

        jTextField8.setEditable(false);
        jTextField8.setColumns(4);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel22.setText("% :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(303, Short.MAX_VALUE))))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Compra", jPanel1);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Credito");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Debito");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel14.setText("ID             :");

        jTextField14.setEditable(false);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel15.setText("Nome      :");

        jTextField15.setEditable(false);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jLabel16.setText("Valor (R$):");

        jTextField16.setColumns(4);
        jTextField16.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField16KeyTyped(evt);
            }
        });

        jLabel17.setText("Descrição:");

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jButton4.setText("Confirmar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data", "Valor", "Tipo", "Descrição", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMaxWidth(125);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(125);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(125);
        }

        jLabel18.setText("Saldo (R$):");

        jTextField18.setEditable(false);
        jTextField18.setColumns(7);
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField18KeyTyped(evt);
            }
        });

        jLabel19.setText("Histórico:");

        jLabel20.setText("Nome:");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "ID", "IDCC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMinWidth(200);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(200);
        }

        jButton5.setText("Estornar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField17))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField15)
                                            .addComponent(jTextField14))))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jLabel16))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 504, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Conta Corrente", jPanel2);

        jLabel3.setText("Nome completo:");

        jButton2.setText("Confirma");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel21.setText("Celular:");

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jTextField5))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel21)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(337, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel3);

        jLabel4.setText("Fino                  (g):");

        jTextField6.setEditable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jSeparator2.setToolTipText("aaa");

        jLabel7.setText("Saida:");

        jLabel8.setText("Valor do Fino (R$):");

        jLabel9.setText("Quantidade        (g):");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });

        jButton3.setText("Confirma");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Mes:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Ano:");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Data", "Quantidade (g)", "Lucro (R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTextField12.setEditable(false);
        jTextField12.setColumns(6);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });

        jLabel13.setText("Custo Médio:");

        jTextField13.setEditable(false);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });

        jLabel23.setText("Hitórico:");

        jLabel12.setText("Lucro Mensal:");

        jButton6.setText("Estornar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estoque", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!jTextField3.getText().isEmpty()){
            
            Estoque est = new Estoque();
            DAO dao = new DAO();
            Estoque estoque = dao.getEstoque();
            
            float porcent   =  Float.parseFloat(jTextField3.getText());
            float pesoseco  =  Float.parseFloat(jTextField1.getText());
            float fino      =  (pesoseco*(porcent/100));
            
            if (!jTextField7.getText().isEmpty()){
                    float valorFino     = Float.parseFloat(jTextField7.getText());
                    float valorGrama    = (valorFino*(porcent/100));
                    float customedio    = valorGrama * pesoseco;
                    est.setCcustoMedio(estoque.getCcustoMedio()+customedio);
            }

            est.setGramas(estoque.getGramas()+fino);   
            dao.updatEstoque(est);
            
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField6.setText(Float.toString(est.getGramas()));
            jTextField13.setText(Float.toString(est.getCcustoMedio()));
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        //jTextField1.setPreferredSize(new java.awt.Dimension(64,22));
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        int option = 0;
        
        if (jComboBox1.getSelectedItem().toString().equals("Janeiro")){
            option = 1;
        }
        if (jComboBox1.getSelectedItem().toString().equals("Fevereiro")){
            option = 2;
        }
        if (jComboBox1.getSelectedItem().toString().equals("Março")){
            option = 3;
        }
        if (jComboBox1.getSelectedItem().toString().equals("Abril")){
            option = 4;
        }
        if (jComboBox1.getSelectedItem().toString().equals("Maio")){
            option = 5;
        }
        if (jComboBox1.getSelectedItem().toString().equals("Junho")){
            option = 6;
        }
        if (jComboBox1.getSelectedItem().toString().equals("Julho")){
            option = 7;
        }
        if (jComboBox1.getSelectedItem().toString().equals("Agosto")){
            option = 8;
        }
        if (jComboBox1.getSelectedItem().toString().equals("Setembro")){
            option = 9;
        }
        if (jComboBox1.getSelectedItem().toString().equals("Outubro")){
            option = 10;
        }
        if (jComboBox1.getSelectedItem().toString().equals("Novembro")){
            option = 11;
        }
        if (jComboBox1.getSelectedItem().toString().equals("Dezembro")){
            option = 12;
        }
        int ano = Integer.parseInt(jTextField11.getText());
        LocalDate dataManual = LocalDate.of(ano, option, 1);

        // Convertendo para java.sql.Date
        Date sqlDate = Date.valueOf(dataManual);
        
        DAO dao = new DAO();
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        model1.setRowCount(0);
        List<Object[]> vendas = dao.getVendasMes(sqlDate);
        for (Object[] linha : vendas) {
            model1.addRow(linha);
        } 
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int row = jTable3.getSelectedRow();
        String TipoOP = "";
        if (jRadioButton1.isSelected()){
            TipoOP = "C";
        }
        if (jRadioButton2.isSelected()){
            TipoOP = "D";
        }
        
        DAO dao = new DAO();
        Lancamentos lanc = new Lancamentos();
        
        if (row != -1 && !jTextField16.getText().isEmpty() && !TipoOP.isEmpty()) {
                float valor = Float.parseFloat(jTextField16.getText());                       
                lanc.setIdcliente(jTable3.getValueAt(row, 2).toString());
                lanc.setIDCC(jTable3.getValueAt(row, 3).toString());
                lanc.setValor(valor);
                lanc.setTipoOP(TipoOP);
                lanc.setDescricao(jTextField17.getText());
                dao.NovoLanc(lanc);

                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                model.setRowCount(0);
                List<Object[]> dados = dao.Historyc(jTable3.getValueAt(row, 2).toString(), jTable3.getValueAt(row, 3).toString());
                for (Object[] linha : dados) {
                    model.addRow(linha);
                } 
                
                float val = dao.getSaldo(jTable3.getValueAt(row, 2).toString(), jTable3.getValueAt(row, 3).toString());
                
                jTextField18.setText(Float.toString(val));
                jTextField16.setText("");
                jTextField17.setText("");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (!jTextField5.getText().isEmpty()){
            Cliente cliente = new Cliente(jTextField5.getText(),jTextField19.getText());
            DAO dao = new DAO();
            dao.inserirCliente(cliente);
            jTextField5.setText("");
            jTextField19.setText("");
        }else{
            System.out.println("Informe o nome!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);
        // Dados da nova linha (substitua pelos valores desejados)
       DAO dao = new DAO();
       List<Object[]> dados = dao.GetClientes(jTextField4.getText());
       
        // Adiciona todas as linhas ao modelo
        for (Object[] linha : dados) {
         model.addRow(linha);
        }
        System.out.println("CLICOU!");
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        int row = jTable3.getSelectedRow(); // Obtém a linha selecionada
        if (row != -1) { // Verifica se alguma linha foi selecionada
            jTextField14.setText("");//id cliente
            jTextField15.setText("");//nome cliente
            jTextField15.setText(jTable3.getValueAt(row, 0).toString()); 
            jTextField14.setText(jTable3.getValueAt(row, 2).toString()); 
            
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            
            DAO dao = new DAO();
            List<Object[]> dados = dao.Historyc(jTable3.getValueAt(row, 2).toString(), jTable3.getValueAt(row, 3).toString());
            for (Object[] linha : dados) {
                model.addRow(linha);
            }
            jTable2.setDefaultRenderer(Object.class, new myRTable());
            
            float val = dao.getSaldo(jTable3.getValueAt(row, 2).toString(), jTable3.getValueAt(row, 3).toString());
            String resultado ="";
           
            jTextField18.setText(Float.toString(val));
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Bloqueia a entrada de caracteres inválidos
        }

        // Impede que o usuário insira mais de um ponto ou vírgula
        if ((c == '.') && jTextField1.getText().contains(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Bloqueia a entrada de caracteres inválidos
        }

        if ((c == '.') && jTextField2.getText().contains(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Bloqueia a entrada de caracteres inválidos
        }

        // Impede que o usuário insira mais de um ponto ou vírgula
        if ((c == '.') && jTextField1.getText().contains(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Bloqueia a entrada de caracteres inválidos
        }

        // Impede que o usuário insira mais de um ponto ou vírgula
        if ((c == '.') && jTextField1.getText().contains(String.valueOf(c))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Bloqueia a entrada de caracteres inválidos
        }

        // Impede que o usuário insira mais de um ponto ou vírgula
        if ((c == '.') && jTextField1.getText().contains(String.valueOf(c))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Bloqueia a entrada de caracteres inválidos
        }

        // Impede que o usuário insira mais de um ponto ou vírgula
        if ((c == '.') && jTextField1.getText().contains(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField16KeyTyped

    private void jTextField18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyTyped
        /* char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Bloqueia a entrada de caracteres inválidos
        }

        // Impede que o usuário insira mais de um ponto ou vírgula
        if ((c == '.') && jTextField1.getText().contains(String.valueOf(c))) {
            evt.consume();
        }        // TODO add your handling code here:
    */
    }//GEN-LAST:event_jTextField18KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Bloqueia a entrada de caracteres inválidos
        }

        // Impede que o usuário insira mais de um ponto ou vírgula
        if ((c == '.') && jTextField1.getText().contains(String.valueOf(c))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Bloqueia a entrada de caracteres inválidos
        }

        // Impede que o usuário insira mais de um ponto ou vírgula
        if ((c == '.') && jTextField1.getText().contains(String.valueOf(c))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Bloqueia a entrada de caracteres inválidos
        }

        // Impede que o usuário insira mais de um ponto ou vírgula
        if ((c == '.') && jTextField1.getText().contains(String.valueOf(c))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Bloqueia a entrada de caracteres inválidos
        }

        // Impede que o usuário insira mais de um ponto ou vírgula
        if ((c == '.') && jTextField1.getText().contains(String.valueOf(c))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Bloqueia a entrada de caracteres inválidos
        }

        // Impede que o usuário insira mais de um ponto ou vírgula
        if ((c == '.') && jTextField1.getText().contains(String.valueOf(c))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12KeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int row = jTable3.getSelectedRow();
        String IDCC ="";
        DAO dao = new DAO();
        Lancamentos lanc = new Lancamentos();
        
        if (row != -1) {                                  
                lanc.setIdcliente(jTable3.getValueAt(row, 2).toString());
                lanc.setIDCC(jTable3.getValueAt(row, 3).toString());
        }
        
        row = jTable2.getSelectedRow();
        if (row != -1) {       
                lanc.setData((Date.valueOf(jTable2.getValueAt(row, 0).toString())));
                lanc.setValor(Float.parseFloat(jTable2.getValueAt(row, 1).toString()));
                lanc.setId(jTable2.getValueAt(row, 4).toString());
                
                dao.EstornaLanc(lanc);
                
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                model.setRowCount(0);
                
                jTable2.setDefaultRenderer(Object.class, new myRTable());
                
                List<Object[]> dados = dao.Historyc(lanc.getIdcliente(), lanc.getIDCC());
                for (Object[] linha : dados) {
                    model.addRow(linha);
                } 
                
                float val = dao.getSaldo(lanc.getIdcliente(), lanc.getIDCC());
                
                jTextField18.setText(Float.toString(val));
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
       // TODO add your handling code here:
        jTextField3.setText("");
        if (!jTextField1.getText().isEmpty() && !jTextField2.getText().isEmpty()){
            
            float pesoseco = Float.parseFloat(jTextField1.getText());
            float pesomolhado = Float.parseFloat(jTextField2.getText());
            float teor = (((pesomolhado/pesoseco)*2307)-2088);
            BigDecimal bd = new BigDecimal(teor);
            bd = bd.setScale(2, RoundingMode.DOWN); // Trunca sem arredondar
            jTextField3.setText(Float.toString(bd.floatValue()));
            teor =0;
            
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        jTextField3.setText("");
        if (!jTextField1.getText().isEmpty() && !jTextField2.getText().isEmpty()){
            
            float pesoseco = Float.parseFloat(jTextField1.getText());
            float pesomolhado = Float.parseFloat(jTextField2.getText());
            float teor = (((pesomolhado/pesoseco)*2307)-2088);
            BigDecimal bd = new BigDecimal(teor);
            bd = bd.setScale(2, RoundingMode.DOWN); // Trunca sem arredondar
            jTextField3.setText(Float.toString(bd.floatValue()));
            teor =0;
            
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        // TODO add your handling code here:
        if(!jTextField1.getText().isEmpty() && !jTextField2.getText().isEmpty()){
            float pesoseco = Float.parseFloat(jTextField1.getText());
            float pesomolhado = Float.parseFloat(jTextField2.getText());
            float teor = (((pesomolhado/pesoseco)*2307)-2088);

            //jTextField3.setText(Float.toString(bd.floatValue()));
           
            if (!jTextField7.getText().isEmpty()){
                    float valorFino     = Float.parseFloat(jTextField7.getText());
                    float valorGrama    = (Float.parseFloat(jTextField7.getText())*(teor/100));
                    BigDecimal bd       = new BigDecimal(valorGrama);
                    bd = bd.setScale(2, RoundingMode.DOWN); // Trunca sem arredondar
                    jTextField8.setText(Float.toString(bd.floatValue()));
            }
        }
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DAO dao = new DAO();
        if (!jTextField9.getText().isEmpty() && !jTextField10.getText().isEmpty()){
                float qtd   = Float.parseFloat(jTextField10.getText());
                float preco = Float.parseFloat(jTextField9.getText());
                float valorVenda = qtd*preco;
                
                Estoque est         = dao.getEstoque();
                Estoque estoque     = new Estoque();
                float valorMedio    = (est.getCcustoMedio()/est.getGramas());
                float lucro         =  ((valorMedio*qtd)-(qtd*preco));
                if (lucro < 0){
                    lucro = (lucro * (-1));
                }
                float valorcompra = qtd*(est.getCcustoMedio()/est.getGramas());
                
                float customedio = (est.getCcustoMedio()-valorcompra);//+lucro
                estoque.setCcustoMedio(customedio);
                
                float gramas = (est.getGramas()-qtd);
                estoque.setGramas(gramas);
                
                Vendas venda = new Vendas();

                venda.setLucro(lucro);
                venda.setQtd(qtd);
                
                dao.vender(venda);
                dao.updatEstoque(estoque);
                
                est = dao.getEstoque();
                
                jTextField6.setText(Float.toString(est.getGramas()));
                jTextField13.setText(Float.toString(est.getCcustoMedio()));
                jTextField9.setText("");
                jTextField10.setText("");
                
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                List<Object[]> dados = dao.HistoryVendas();
                for (Object[] linha : dados) {
                    model.addRow(linha);
                } 
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        float valorCG    = 0;//Valor custo grama
        float qtdR      = 0;       
        DAO dao = new DAO();
        
        Vendas venda = new Vendas();
        
        if (row != -1) {  
                venda.setId(jTable1.getValueAt(row, 0).toString());
                qtdR = Float.parseFloat(jTable1.getValueAt(row, 2).toString());
        }
        
        Estoque estoque = dao.getEstoque();
        valorCG = (estoque.getCcustoMedio()/estoque.getGramas());
        float custoM = valorCG * qtdR;
        Estoque est = new Estoque();
        
        est.setCcustoMedio(custoM+estoque.getCcustoMedio());
        est.setGramas(qtdR+estoque.getGramas());
        
        dao.updatEstoque(est);
        dao.EstornaVenda(venda);
        
        Date sqlDate = new Date(System.currentTimeMillis());
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        model1.setRowCount(0);
        List<Object[]> vendas = dao.getVendasMes(sqlDate);
        for (Object[] linha : vendas) {
            model1.addRow(linha);
        }
        jTextField6.setText(Float.toString(est.getGramas()));
        jTextField13.setText(Float.toString(est.getCcustoMedio()));
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
