package view;

import controller.ClienteController;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import controller.BaseDeDados;

/**
 *
 * @author crist
 */
public final class ScreenClient extends javax.swing.JInternalFrame {

    private ArrayList<Cliente> clientes;
    private final ClienteController controller;
    private BaseDeDados baseDeDados;

    public ScreenClient(BaseDeDados baseDeDados) {
        initComponents();
        estadoInicial();
        clientes = new ArrayList<Cliente>();
        controller = new ClienteController(clientes);
        this.baseDeDados = baseDeDados;

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputCnh = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        inputTelefone = new javax.swing.JTextField();
        labelAvisos = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        inputCnhExcluir = new javax.swing.JTextField();
        labelAvisosExcluir = new javax.swing.JLabel();
        btnConfirmaExcluir = new javax.swing.JButton();
        btnCancelarExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle("CLIENTES");
        setMaximumSize(new java.awt.Dimension(1280, 680));
        setMinimumSize(new java.awt.Dimension(1280, 680));
        setPreferredSize(new java.awt.Dimension(1280, 680));

        jPanel1.setBackground(new java.awt.Color(9, 13, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 680));

        inputCnh.setBackground(new java.awt.Color(18, 20, 31));
        inputCnh.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCnh.setForeground(new java.awt.Color(218, 31, 79));
        inputCnh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCnh.setBorder(null);
        inputCnh.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCnh.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputCnh.setSelectionColor(new java.awt.Color(218, 31, 79));

        inputNome.setBackground(new java.awt.Color(18, 20, 31));
        inputNome.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputNome.setForeground(new java.awt.Color(218, 31, 79));
        inputNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputNome.setBorder(null);
        inputNome.setPreferredSize(new java.awt.Dimension(260, 50));
        inputNome.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputNome.setSelectionColor(new java.awt.Color(218, 31, 79));

        inputEmail.setBackground(new java.awt.Color(18, 20, 31));
        inputEmail.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputEmail.setForeground(new java.awt.Color(218, 31, 79));
        inputEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputEmail.setBorder(null);
        inputEmail.setPreferredSize(new java.awt.Dimension(260, 50));
        inputEmail.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputEmail.setSelectionColor(new java.awt.Color(218, 31, 79));

        tabelaClientes.setBackground(new java.awt.Color(18, 20, 31));
        tabelaClientes.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaClientes.setForeground(new java.awt.Color(218, 31, 79));
        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOME", "CNH", "EMAIL", "TELEFONE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaClientes.setEnabled(false);
        tabelaClientes.setFocusable(false);
        tabelaClientes.setGridColor(new java.awt.Color(18, 20, 31));
        tabelaClientes.setPreferredSize(new java.awt.Dimension(300, 300));
        tabelaClientes.setRowSelectionAllowed(false);
        tabelaClientes.setSelectionBackground(new java.awt.Color(218, 31, 79));
        tabelaClientes.setSelectionForeground(new java.awt.Color(18, 20, 31));
        tabelaClientes.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaClientes);

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 31, 79));
        jLabel1.setText("CLIENTES");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("NOME");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("CNH");

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("TELEFONE");

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("EMAIL");

        btnCadastrar.setBackground(new java.awt.Color(218, 31, 79));
        btnCadastrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(9, 13, 25));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setBorder(null);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrar.setMaximumSize(new java.awt.Dimension(110, 45));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(110, 45));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(110, 45));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(9, 13, 25));
        btnEditar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(218, 31, 79));
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setMaximumSize(new java.awt.Dimension(110, 45));
        btnEditar.setMinimumSize(new java.awt.Dimension(110, 45));
        btnEditar.setOpaque(true);
        btnEditar.setPreferredSize(new java.awt.Dimension(110, 45));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(102, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(18, 20, 31));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setBorder(null);
        btnExcluir.setBorderPainted(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setMaximumSize(new java.awt.Dimension(110, 45));
        btnExcluir.setMinimumSize(new java.awt.Dimension(110, 45));
        btnExcluir.setPreferredSize(new java.awt.Dimension(110, 45));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        inputTelefone.setBackground(new java.awt.Color(18, 20, 31));
        inputTelefone.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputTelefone.setForeground(new java.awt.Color(218, 31, 79));
        inputTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTelefone.setBorder(null);
        inputTelefone.setPreferredSize(new java.awt.Dimension(260, 50));
        inputTelefone.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputTelefone.setSelectionColor(new java.awt.Color(218, 31, 79));

        labelAvisos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisos.setText(" ");
        labelAvisos.setToolTipText("");

        btnSalvar.setBackground(new java.awt.Color(9, 13, 25));
        btnSalvar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(218, 31, 79));
        btnSalvar.setText("SALVAR");
        btnSalvar.setBorder(null);
        btnSalvar.setBorderPainted(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setFocusPainted(false);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setMaximumSize(new java.awt.Dimension(110, 45));
        btnSalvar.setMinimumSize(new java.awt.Dimension(110, 45));
        btnSalvar.setPreferredSize(new java.awt.Dimension(110, 45));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        inputCnhExcluir.setBackground(new java.awt.Color(18, 20, 31));
        inputCnhExcluir.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCnhExcluir.setForeground(new java.awt.Color(218, 31, 79));
        inputCnhExcluir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCnhExcluir.setBorder(null);
        inputCnhExcluir.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCnhExcluir.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputCnhExcluir.setSelectionColor(new java.awt.Color(218, 31, 79));

        labelAvisosExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosExcluir.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisosExcluir.setText(" ");
        labelAvisosExcluir.setToolTipText("");

        btnConfirmaExcluir.setBackground(new java.awt.Color(9, 13, 25));
        btnConfirmaExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnConfirmaExcluir.setForeground(new java.awt.Color(218, 31, 79));
        btnConfirmaExcluir.setText("CONFIRMAR");
        btnConfirmaExcluir.setBorder(null);
        btnConfirmaExcluir.setBorderPainted(false);
        btnConfirmaExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmaExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfirmaExcluir.setMaximumSize(new java.awt.Dimension(110, 45));
        btnConfirmaExcluir.setMinimumSize(new java.awt.Dimension(110, 45));
        btnConfirmaExcluir.setPreferredSize(new java.awt.Dimension(110, 45));
        btnConfirmaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaExcluirActionPerformed(evt);
            }
        });

        btnCancelarExcluir.setBackground(new java.awt.Color(9, 13, 25));
        btnCancelarExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCancelarExcluir.setForeground(new java.awt.Color(218, 31, 79));
        btnCancelarExcluir.setText("CANCELAR");
        btnCancelarExcluir.setBorder(null);
        btnCancelarExcluir.setBorderPainted(false);
        btnCancelarExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarExcluir.setMaximumSize(new java.awt.Dimension(110, 45));
        btnCancelarExcluir.setMinimumSize(new java.awt.Dimension(110, 45));
        btnCancelarExcluir.setOpaque(true);
        btnCancelarExcluir.setPreferredSize(new java.awt.Dimension(110, 45));
        btnCancelarExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarExcluirActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Black White and Red Modern Automotive Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(labelAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(inputCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAvisosExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputCnhExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConfirmaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelarExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(447, 447, 447)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputCnhExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnConfirmaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCancelarExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)))
                .addComponent(labelAvisosExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        String nome = inputNome.getText().trim();
        String cnh = inputCnh.getText().trim();
        String email = inputEmail.getText().trim();
        String telefone = inputTelefone.getText().trim();

        if (!nome.isBlank() && !cnh.isBlank() && !email.isBlank() && !telefone.isBlank()) {
            Cliente cliente = new Cliente(nome, cnh, email, telefone);
            clientes = controller.getClientes();

            boolean cnhJaCadastrada = false;
            Iterator<Cliente> iterator = clientes.iterator();

            while (iterator.hasNext()) {
                Cliente c = iterator.next();
                if (c.getCnh().equals(cnh)) {
                    cnhJaCadastrada = true;
                    break;
                }
            }

            if (cnhJaCadastrada) {
                labelAvisos.setText("CNH já cadastrada!");
            } else {
                controller.cadastrar(cliente);
                clientes = controller.getClientes();
                atualizarTabela(clientes);
                clear();
                btnExcluir.setEnabled(true);
                btnEditar.setEnabled(true);
                baseDeDados.atualizarClientes(clientes);

            }
        } else {
            labelAvisos.setText("Preencha todos os campos");
        }

    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
        String cnh = JOptionPane.showInputDialog(this, "Informe a CNH do cliente");
        if (!cnh.isBlank()) {
            btnCadastrar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            
            Cliente cliente = controller.buscarPorCnh(cnh);
            
            inputNome.setText(cliente.getNome());
            inputCnh.setText(cliente.getCnh());
            inputEmail.setText(cliente.getEmail());
            inputTelefone.setText(cliente.getTelefone());

            btnSalvar.setVisible(true);

            inputCnh.setEditable(false);
            btnSalvar.addActionListener((ActionEvent evt1) -> {
                String nome = inputNome.getText().trim();
                String email = inputEmail.getText().trim();
                String telefone = inputTelefone.getText().trim();
                if (!nome.isEmpty() && !email.isEmpty() && !telefone.isEmpty()) {
                    labelAvisos.setText("");
                    controller.editar(nome, cnh, email, telefone);
                    clear();
                    clientes = controller.getClientes();
                    atualizarTabela(clientes);

                    btnSalvar.setVisible(false);
                    btnCadastrar.setEnabled(true);

                    habilitarCampos(true);
                    baseDeDados.atualizarClientes(clientes);
                    if (!controller.listaVazia()) {
                        btnEditar.setEnabled(true);
                        btnExcluir.setEnabled(true);
                    }
                } else {
                    labelAvisos.setText("Preencha todos os campos");

                }
            });
        } else {
            JOptionPane.showMessageDialog(this, "Informe um valor válido", "Valor inválido",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {

        inputCnhExcluir.setText("");
        inputCnhExcluir.setVisible(true);
        btnExcluir.setEnabled(false);
        labelAvisosExcluir.setText("Informe a CNH do cliente");
        btnConfirmaExcluir.setVisible(true);
        btnCancelarExcluir.setVisible(true);
        btnCadastrar.setEnabled(false);
        btnEditar.setEnabled(false);
        habilitarCampos(false);

    }

    private void btnConfirmaExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnConfirmaExcluirActionPerformed

        String cnh = inputCnhExcluir.getText().trim();
        if (!cnh.isEmpty()) {
            Cliente cliente = controller.buscarPorCnh(cnh);
            if (cliente != null) {
                labelAvisosExcluir.setText("");
                int confirma = JOptionPane.showConfirmDialog(this, "Confirma exclusão: (" + cliente.getNome() + ")",
                        "Confirme a exclusão", JOptionPane.OK_CANCEL_OPTION);
                if (confirma == JOptionPane.OK_OPTION) {
                    controller.excluir(cliente);
                    clientes = controller.getClientes();
                    atualizarTabela(clientes);
                    btnConfirmaExcluir.setVisible(false);
                    inputCnhExcluir.setVisible(false);
                    btnCancelarExcluir.setVisible(false);
                    habilitarCampos(true);
                    btnCadastrar.setEnabled(true);
                    baseDeDados.atualizarClientes(clientes);
                    if (!controller.listaVazia()) {
                        btnExcluir.setEnabled(true);
                        btnEditar.setEnabled(true);
                    }
                } else {
                    if (!controller.listaVazia()) {
                        estadoInicial();
                        btnExcluir.setEnabled(true);
                        btnEditar.setEnabled(true);
                    }
                    inputCnhExcluir.setVisible(false);
                    btnConfirmaExcluir.setVisible(false);
                    btnCancelarExcluir.setVisible(false);
                    btnCadastrar.setEnabled(true);
                    habilitarCampos(true);

                }
            } else {
                labelAvisosExcluir.setText("Cnh não encontrada");
            }
        } else {
            labelAvisosExcluir.setText("Informe um valor válido");
            inputCnhExcluir.setText("");
        }

    }// GEN-LAST:event_btnConfirmaExcluirActionPerformed

    private void btnCancelarExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelarExcluirActionPerformed
        if (!controller.listaVazia()) {
            btnExcluir.setEnabled(true);
            btnEditar.setEnabled(true);
        }

        habilitarCampos(true);
        inputCnhExcluir.setVisible(false);
        btnCadastrar.setEnabled(true);
        btnCancelarExcluir.setVisible(false);
        btnConfirmaExcluir.setVisible(false);
        labelAvisosExcluir.setText("");

    }// GEN-LAST:event_btnCancelarExcluirActionPerformed

    public void estadoInicial() {
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnSalvar.setVisible(false);
        inputCnhExcluir.setVisible(false);
        btnConfirmaExcluir.setVisible(false);
        btnCancelarExcluir.setVisible(false);

    }

    public void habilitarCampos(boolean op) {
        inputNome.setEditable(op);
        inputCnh.setEditable(op);
        inputEmail.setEditable(op);
        inputTelefone.setEditable(op);
    }

    public void clear() {
        inputNome.setText("");
        inputCnh.setText("");
        inputEmail.setText("");
        inputTelefone.setText("");
        labelAvisos.setText("");
    }

    public void atualizarTabela(ArrayList<Cliente> clientes) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NOME");
        model.addColumn("CNH");
        model.addColumn("EMAIL");
        model.addColumn("TELEFONE");
        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            Object[] linha = {
                c.getNome(),
                c.getCnh(),
                c.getEmail(),
                c.getTelefone()
            };
            model.addRow(linha);
        }
        tabelaClientes.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelarExcluir;
    private javax.swing.JButton btnConfirmaExcluir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField inputCnh;
    private javax.swing.JTextField inputCnhExcluir;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelAvisosExcluir;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}
