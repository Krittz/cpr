package view;

import controller.AgenciaController;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Agencia;
import controller.BaseDeDados;

/**
 *
 * @author crist
 */
public final class ScreenAgency extends javax.swing.JInternalFrame {
    
    private ArrayList<Agencia> agencias;
    private final AgenciaController controller;
    private BaseDeDados baseDeDados;
    
    public ScreenAgency(BaseDeDados baseDeDados) {
        initComponents();
        estadoIncial();
        agencias = new ArrayList<Agencia>();
        controller = new AgenciaController(agencias);
        this.baseDeDados = baseDeDados;
        
    }
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputNome = new javax.swing.JTextField();
        inputCodigo = new javax.swing.JTextField();
        inputEndereco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAgencias = new javax.swing.JTable();
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
        inputCodigoExcluir = new javax.swing.JTextField();
        labelAvisosExcluir = new javax.swing.JLabel();
        btnConfirmaExcluir = new javax.swing.JButton();
        btnCancelarExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputHoraFechamento = new javax.swing.JFormattedTextField();
        inputHoraAbertura = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle("AGÊNCIAS");
        setMaximumSize(new java.awt.Dimension(1280, 680));
        setMinimumSize(new java.awt.Dimension(1280, 680));
        setPreferredSize(new java.awt.Dimension(1280, 680));

        jPanel1.setBackground(new java.awt.Color(9, 13, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputNome.setBackground(new java.awt.Color(18, 20, 31));
        inputNome.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputNome.setForeground(new java.awt.Color(218, 31, 79));
        inputNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputNome.setBorder(null);
        inputNome.setPreferredSize(new java.awt.Dimension(260, 50));
        inputNome.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputNome.setSelectionColor(new java.awt.Color(218, 31, 79));
        jPanel1.add(inputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 185, -1, -1));

        inputCodigo.setBackground(new java.awt.Color(18, 20, 31));
        inputCodigo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCodigo.setForeground(new java.awt.Color(218, 31, 79));
        inputCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCodigo.setBorder(null);
        inputCodigo.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCodigo.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputCodigo.setSelectionColor(new java.awt.Color(218, 31, 79));
        jPanel1.add(inputCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 106, -1, -1));

        inputEndereco.setBackground(new java.awt.Color(18, 20, 31));
        inputEndereco.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputEndereco.setForeground(new java.awt.Color(218, 31, 79));
        inputEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputEndereco.setBorder(null);
        inputEndereco.setPreferredSize(new java.awt.Dimension(260, 50));
        inputEndereco.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputEndereco.setSelectionColor(new java.awt.Color(218, 31, 79));
        jPanel1.add(inputEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 362, 262, -1));

        tabelaAgencias.setBackground(new java.awt.Color(18, 20, 31));
        tabelaAgencias.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaAgencias.setForeground(new java.awt.Color(218, 31, 79));
        tabelaAgencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOME", "TELEFONE", "ENDEREÇO", "ABRE ÀS", "FECHA ÀS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAgencias.setEnabled(false);
        tabelaAgencias.setFocusable(false);
        tabelaAgencias.setGridColor(new java.awt.Color(18, 20, 31));
        tabelaAgencias.setPreferredSize(new java.awt.Dimension(300, 300));
        tabelaAgencias.setRowSelectionAllowed(false);
        tabelaAgencias.setSelectionBackground(new java.awt.Color(218, 31, 79));
        tabelaAgencias.setSelectionForeground(new java.awt.Color(18, 20, 31));
        tabelaAgencias.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaAgencias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 162, 690, 304));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 31, 79));
        jLabel1.setText("AGÊNCIAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 43, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("CÓDIGO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 83, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("NOME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 162, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("TELEFONE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 247, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 362, -1, -1));

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
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 515, -1, -1));

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
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 515, -1, -1));

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
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, -1));

        inputTelefone.setBackground(new java.awt.Color(18, 20, 31));
        inputTelefone.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputTelefone.setForeground(new java.awt.Color(218, 31, 79));
        inputTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTelefone.setBorder(null);
        inputTelefone.setPreferredSize(new java.awt.Dimension(260, 50));
        inputTelefone.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputTelefone.setSelectionColor(new java.awt.Color(218, 31, 79));
        jPanel1.add(inputTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 276, -1, -1));

        labelAvisos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisos.setText(" ");
        labelAvisos.setToolTipText("");
        jPanel1.add(labelAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 572, 316, 45));

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
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 515, -1, -1));

        inputCodigoExcluir.setBackground(new java.awt.Color(18, 20, 31));
        inputCodigoExcluir.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCodigoExcluir.setForeground(new java.awt.Color(218, 31, 79));
        inputCodigoExcluir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCodigoExcluir.setBorder(null);
        inputCodigoExcluir.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCodigoExcluir.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputCodigoExcluir.setSelectionColor(new java.awt.Color(218, 31, 79));
        jPanel1.add(inputCodigoExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 140, -1));

        labelAvisosExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosExcluir.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisosExcluir.setText(" ");
        labelAvisosExcluir.setToolTipText("");
        jPanel1.add(labelAvisosExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 270, 45));

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
        jPanel1.add(btnConfirmaExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, -1, -1));

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
        jPanel1.add(btnCancelarExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 480, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Black White and Red Modern Automotive Logo.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, 198, 116));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("ENDEREÇO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 338, -1, -1));

        inputHoraFechamento.setBackground(new java.awt.Color(18, 20, 31));
        inputHoraFechamento.setBorder(null);
        inputHoraFechamento.setForeground(new java.awt.Color(218, 31, 79));
        inputHoraFechamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        inputHoraFechamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputHoraFechamento.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputHoraFechamento.setPreferredSize(new java.awt.Dimension(130, 50));
        inputHoraFechamento.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputHoraFechamento.setSelectionColor(new java.awt.Color(218, 31, 79));
        jPanel1.add(inputHoraFechamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 447, 139, -1));

        inputHoraAbertura.setBackground(new java.awt.Color(18, 20, 31));
        inputHoraAbertura.setBorder(null);
        inputHoraAbertura.setForeground(new java.awt.Color(218, 31, 79));
        inputHoraAbertura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        inputHoraAbertura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputHoraAbertura.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputHoraAbertura.setPreferredSize(new java.awt.Dimension(130, 50));
        inputHoraAbertura.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputHoraAbertura.setSelectionColor(new java.awt.Color(218, 31, 79));
        jPanel1.add(inputHoraAbertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 447, 123, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("ABRE ÀS(xx:xx)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 424, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("FECHA ÀS(xx:xx)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 424, -1, -1));

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

    private void btnCancelarExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarExcluirActionPerformed
        clear();
        habilitarCampos(true);
        btnCadastrar.setEnabled(true);
        btnCancelarExcluir.setVisible(false);
        btnConfirmaExcluir.setVisible(false);
        inputCodigoExcluir.setVisible(false);
        if (!controller.listaVazia()) {
            btnExcluir.setEnabled(true);
            btnEditar.setEnabled(true);
        } else {
            btnExcluir.setEnabled(false);
            btnEditar.setEnabled(false);
        }
    }//GEN-LAST:event_btnCancelarExcluirActionPerformed

    private void btnConfirmaExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaExcluirActionPerformed
        String codigo = inputCodigoExcluir.getText().trim();
        if (!codigo.isEmpty()) {
            Agencia agencia = controller.buscarPorCodigo(codigo);
            if (agencia != null) {
                labelAvisos.setText("");
                int confirma = JOptionPane.showConfirmDialog(this, "Confirma exclusão: (" + agencia.getNome() + ")",
                        "Confirme a exclusão", JOptionPane.OK_CANCEL_OPTION);
                if (confirma == JOptionPane.OK_OPTION) {
                    controller.excluir(agencia);
                    agencias = controller.getAgencias();
                    atualizarTabela(agencias);
                    baseDeDados.atualizarAgencias(agencias);
                    inputCodigoExcluir.setVisible(false);
                    btnCancelarExcluir.setVisible(false);
                    btnConfirmaExcluir.setVisible(false);
                    habilitarCampos(true);
                    btnCadastrar.setEnabled(true);
                    clear();
                    if (!controller.listaVazia()) {
                        btnEditar.setEnabled(true);
                        btnExcluir.setEnabled(true);
                    }
                    
                } else {
                    if (!controller.listaVazia()) {
                        btnExcluir.setEnabled(true);
                        btnEditar.setEnabled(true);
                    }
                    inputCodigoExcluir.setVisible(false);
                    btnConfirmaExcluir.setVisible(false);
                    btnCancelarExcluir.setVisible(false);
                    btnCadastrar.setEnabled(true);
                    habilitarCampos(true);
                }
            } else {
                labelAvisos.setText("Código não encontrado");
            }
        } else {
            labelAvisosExcluir.setText("Informe um valor válido");
            inputCodigoExcluir.setText("");
        }
    }//GEN-LAST:event_btnConfirmaExcluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        inputCodigoExcluir.setText("");
        inputCodigoExcluir.setVisible(true);
        btnCancelarExcluir.setVisible(true);
        btnConfirmaExcluir.setVisible(true);
        habilitarCampos(false);
        btnExcluir.setEnabled(false);
        btnCadastrar.setEnabled(false);
        btnEditar.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String codigo = JOptionPane.showInputDialog(this, "Informe o código da agência");
        if (!codigo.isBlank()) {
            btnCadastrar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnEditar.setEnabled(false);
            
            Agencia a = controller.buscarPorCodigo(codigo);
            inputCodigo.setText(a.getCodigo());
            inputCodigo.setEditable(false);
            
            inputNome.setText(a.getNome());
            inputTelefone.setText(a.getTelefone());
            inputEndereco.setText(a.getEndereco());
            inputHoraAbertura.setText(a.getAbertura());
            inputHoraFechamento.setText(a.getFechamento());
            
            btnSalvar.setVisible(true);
            
            btnSalvar.addActionListener((ActionEvent evt1) -> {
                String nome = inputNome.getText().trim();
                String telefone = inputTelefone.getText().trim();
                String endereco = inputEndereco.getText().trim();
                String abre = inputHoraAbertura.getText().trim();
                String fecha = inputHoraFechamento.getText().trim();
                if (!nome.isEmpty() && !telefone.isEmpty() && !endereco.isEmpty() && !abre.isEmpty() && !fecha.isEmpty()) {
                    labelAvisos.setText("");
                    controller.editar(codigo, nome, telefone, endereco, abre, fecha);
                    clear();
                    agencias = controller.getAgencias();
                    atualizarTabela(agencias);
                    baseDeDados.atualizarAgencias(agencias);
                    
                    btnCadastrar.setEnabled(true);
                    btnSalvar.setVisible(false);
                    habilitarCampos(true);
                    if (!controller.listaVazia()) {
                        btnExcluir.setEnabled(true);
                        btnEditar.setEnabled(true);
                    }
                } else {
                    labelAvisos.setText("Preencha todos os campos");
                }
                
            });
        } else {
            JOptionPane.showMessageDialog(this, "Informe um valor válido", "Valor inválido",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String codigo = inputCodigo.getText().trim();
        String nome = inputNome.getText().trim();
        String telefone = inputTelefone.getText().trim();
        String endereco = inputEndereco.getText().trim();
        String abre = inputHoraAbertura.getText().trim();
        String fecha = inputHoraFechamento.getText().trim();
        if (!codigo.isEmpty() && !nome.isEmpty() && !telefone.isEmpty() && !endereco.isEmpty() && !abre.isEmpty() && !fecha.isEmpty()) {
            Agencia agencia = new Agencia(codigo, nome, telefone, endereco, abre, fecha);
            agencias = controller.getAgencias();
            boolean agenciaJaCadastrada = false;
            
            Iterator<Agencia> it = agencias.iterator();
            while (it.hasNext()) {
                Agencia a = it.next();
                if (a.getCodigo().equals(codigo)) {
                    agenciaJaCadastrada = true;
                    break;
                }
            }
            
            if (agenciaJaCadastrada) {
                labelAvisos.setText("Agência já cadastrada");
            } else {
                controller.cadastrar(agencia);
                agencias = controller.getAgencias();
                atualizarTabela(agencias);
                clear();
                btnEditar.setEnabled(true);
                btnExcluir.setEnabled(true);
                baseDeDados.atualizarAgencias(agencias);
            }
        } else {
            labelAvisos.setText("Preencha todos os campos");
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    public void estadoIncial() {
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnSalvar.setVisible(false);
        inputCodigoExcluir.setVisible(false);
        btnConfirmaExcluir.setVisible(false);
        btnCancelarExcluir.setVisible(false);
        
    }
    
    public void habilitarCampos(boolean op) {
        inputCodigo.setEditable(op);
        inputNome.setEditable(op);
        inputEndereco.setEditable(op);
        inputTelefone.setEditable(op);
        inputHoraAbertura.setEditable(op);
        inputHoraFechamento.setEditable(op);
    }
    
    public void clear() {
        inputCodigo.setText("");
        inputNome.setText("");
        inputEndereco.setText("");
        inputTelefone.setText("");
        inputHoraAbertura.setText("");
        inputHoraFechamento.setText("");
        labelAvisos.setText("");
        inputCodigoExcluir.setText("");
        labelAvisosExcluir.setText("");
    }
    
    public void atualizarTabela(ArrayList<Agencia> agencias) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("CÓDIGO");
        model.addColumn("NOME");
        model.addColumn("TELEFONE");
        model.addColumn("ENDEREÇO");
        model.addColumn("ABRE ÁS");
        model.addColumn("FECHA ÀS");
        Iterator<Agencia> it = agencias.iterator();
        while (it.hasNext()) {
            Agencia a = it.next();
            Object[] linha = {
                a.getCodigo(),
                a.getNome(),
                a.getTelefone(),
                a.getEndereco(),
                a.getAbertura(),
                a.getFechamento()
            };
            model.addRow(linha);
        }
        tabelaAgencias.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelarExcluir;
    private javax.swing.JButton btnConfirmaExcluir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField inputCodigo;
    private javax.swing.JTextField inputCodigoExcluir;
    private javax.swing.JTextField inputEndereco;
    private javax.swing.JFormattedTextField inputHoraAbertura;
    private javax.swing.JFormattedTextField inputHoraFechamento;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelAvisosExcluir;
    private javax.swing.JTable tabelaAgencias;
    // End of variables declaration//GEN-END:variables
}
