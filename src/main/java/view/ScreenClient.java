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
    private Cliente cliente;
    private final ClienteController controller;
    private BaseDeDados baseDeDados;

    public ScreenClient(BaseDeDados baseDeDados) {
        initComponents();
        estadoInicial();
        cliente = new Cliente();
        clientes = new ArrayList<Cliente>();
        controller = new ClienteController(clientes);
        this.baseDeDados = baseDeDados;

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        inputCnh = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelCnh = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
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
        wave = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        labelEstados = new javax.swing.JLabel();
        inputCodigoEditar = new javax.swing.JTextField();
        labelAvisosEditar = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle("CLIENTES");
        setMaximumSize(new java.awt.Dimension(1280, 698));
        setMinimumSize(new java.awt.Dimension(1280, 698));
        setPreferredSize(new java.awt.Dimension(1280, 698));

        painelPrincipal.setBackground(new java.awt.Color(40, 42, 54));
        painelPrincipal.setMaximumSize(new java.awt.Dimension(1280, 698));
        painelPrincipal.setMinimumSize(new java.awt.Dimension(1280, 698));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(1280, 698));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputCnh.setBackground(new java.awt.Color(40, 42, 54));
        inputCnh.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCnh.setForeground(new java.awt.Color(189, 147, 249));
        inputCnh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCnh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputCnh.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCnh.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputCnh.setSelectionColor(new java.awt.Color(189, 147, 249));
        painelPrincipal.add(inputCnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        inputNome.setBackground(new java.awt.Color(40, 42, 54));
        inputNome.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputNome.setForeground(new java.awt.Color(189, 147, 249));
        inputNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputNome.setPreferredSize(new java.awt.Dimension(260, 50));
        inputNome.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputNome.setSelectionColor(new java.awt.Color(189, 147, 249));
        painelPrincipal.add(inputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        inputEmail.setBackground(new java.awt.Color(40, 42, 54));
        inputEmail.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputEmail.setForeground(new java.awt.Color(189, 147, 249));
        inputEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputEmail.setPreferredSize(new java.awt.Dimension(260, 50));
        inputEmail.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputEmail.setSelectionColor(new java.awt.Color(189, 147, 249));
        painelPrincipal.add(inputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        tabelaClientes.setBackground(new java.awt.Color(40, 41, 66));
        tabelaClientes.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaClientes.setForeground(new java.awt.Color(189, 147, 249));
        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOME", "CNH", "EMAIL", "TELEFONE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true
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
        tabelaClientes.setGridColor(new java.awt.Color(40, 42, 54));
        tabelaClientes.setPreferredSize(new java.awt.Dimension(300, 240));
        tabelaClientes.setRowHeight(30);
        tabelaClientes.setRowSelectionAllowed(false);
        tabelaClientes.setSelectionBackground(new java.awt.Color(189, 147, 249));
        tabelaClientes.setSelectionForeground(new java.awt.Color(40, 41, 66));
        tabelaClientes.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaClientes);

        painelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 600, 270));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(189, 147, 249));
        jLabel1.setText("CLIENTES");
        painelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 43, -1, -1));

        labelNome.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(189, 147, 249));
        labelNome.setText("NOME");
        painelPrincipal.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        labelCnh.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelCnh.setForeground(new java.awt.Color(189, 147, 249));
        labelCnh.setText("CNH");
        painelPrincipal.add(labelCnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        labelTelefone.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelTelefone.setForeground(new java.awt.Color(189, 147, 249));
        labelTelefone.setText("TELEFONE");
        painelPrincipal.add(labelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        labelEmail.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(189, 147, 249));
        labelEmail.setText("EMAIL");
        painelPrincipal.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        btnCadastrar.setBackground(new java.awt.Color(189, 147, 249));
        btnCadastrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(40, 42, 54));
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
        painelPrincipal.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        btnEditar.setBackground(new java.awt.Color(40, 42, 54));
        btnEditar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(189, 147, 249));
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setMaximumSize(new java.awt.Dimension(110, 45));
        btnEditar.setMinimumSize(new java.awt.Dimension(110, 45));
        btnEditar.setPreferredSize(new java.awt.Dimension(110, 45));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, -1, -1));

        btnExcluir.setBackground(new java.awt.Color(184, 0, 0));
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
        painelPrincipal.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, -1));

        inputTelefone.setBackground(new java.awt.Color(40, 42, 54));
        inputTelefone.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputTelefone.setForeground(new java.awt.Color(189, 147, 249));
        inputTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputTelefone.setPreferredSize(new java.awt.Dimension(260, 50));
        inputTelefone.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputTelefone.setSelectionColor(new java.awt.Color(189, 147, 249));
        painelPrincipal.add(inputTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        labelAvisos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(189, 147, 249));
        labelAvisos.setText(" ");
        labelAvisos.setToolTipText("");
        painelPrincipal.add(labelAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 316, 40));

        btnSalvar.setBackground(new java.awt.Color(40, 42, 54));
        btnSalvar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(189, 147, 249));
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
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, -1, -1));

        inputCodigoExcluir.setBackground(new java.awt.Color(40, 42, 54));
        inputCodigoExcluir.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCodigoExcluir.setForeground(new java.awt.Color(189, 147, 249));
        inputCodigoExcluir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCodigoExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputCodigoExcluir.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCodigoExcluir.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputCodigoExcluir.setSelectionColor(new java.awt.Color(189, 147, 249));
        painelPrincipal.add(inputCodigoExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 140, 40));

        labelAvisosExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosExcluir.setForeground(new java.awt.Color(189, 147, 249));
        labelAvisosExcluir.setText(" ");
        labelAvisosExcluir.setToolTipText("");
        painelPrincipal.add(labelAvisosExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 260, 30));

        btnConfirmaExcluir.setBackground(new java.awt.Color(40, 42, 54));
        btnConfirmaExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnConfirmaExcluir.setForeground(new java.awt.Color(189, 147, 249));
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
        painelPrincipal.add(btnConfirmaExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, -1, -1));

        btnCancelarExcluir.setBackground(new java.awt.Color(40, 42, 54));
        btnCancelarExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCancelarExcluir.setForeground(new java.awt.Color(189, 147, 249));
        btnCancelarExcluir.setText("CANCELAR");
        btnCancelarExcluir.setBorder(null);
        btnCancelarExcluir.setBorderPainted(false);
        btnCancelarExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarExcluir.setMaximumSize(new java.awt.Dimension(110, 45));
        btnCancelarExcluir.setMinimumSize(new java.awt.Dimension(110, 45));
        btnCancelarExcluir.setPreferredSize(new java.awt.Dimension(110, 45));
        btnCancelarExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarExcluirActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnCancelarExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, -1, -1));

        wave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fotor_2023-6-3_11_58_13.png"))); // NOI18N
        painelPrincipal.add(wave, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(40, 42, 54));
        btnCancelar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(189, 147, 249));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setMaximumSize(new java.awt.Dimension(110, 45));
        btnCancelar.setMinimumSize(new java.awt.Dimension(110, 45));
        btnCancelar.setPreferredSize(new java.awt.Dimension(110, 45));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        btnNovo.setBackground(new java.awt.Color(189, 147, 249));
        btnNovo.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(40, 42, 54));
        btnNovo.setText("NOVO");
        btnNovo.setBorder(null);
        btnNovo.setBorderPainted(false);
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setFocusPainted(false);
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setMaximumSize(new java.awt.Dimension(110, 45));
        btnNovo.setMinimumSize(new java.awt.Dimension(110, 45));
        btnNovo.setPreferredSize(new java.awt.Dimension(110, 45));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(189, 147, 249));
        btnBuscar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(40, 42, 54));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnBuscar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnBuscar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 610, 140, 40));

        labelEstados.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelEstados.setForeground(new java.awt.Color(189, 147, 249));
        labelEstados.setText(" ");
        labelEstados.setToolTipText("");
        painelPrincipal.add(labelEstados, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 140, 40));

        inputCodigoEditar.setBackground(new java.awt.Color(40, 42, 54));
        inputCodigoEditar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCodigoEditar.setForeground(new java.awt.Color(189, 147, 249));
        inputCodigoEditar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCodigoEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputCodigoEditar.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCodigoEditar.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputCodigoEditar.setSelectionColor(new java.awt.Color(189, 147, 249));
        painelPrincipal.add(inputCodigoEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 140, 40));

        labelAvisosEditar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosEditar.setForeground(new java.awt.Color(189, 147, 249));
        labelAvisosEditar.setText(" ");
        labelAvisosEditar.setToolTipText("");
        painelPrincipal.add(labelAvisosEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 260, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = inputNome.getText().trim();
        String cnh = inputCnh.getText().trim();
        String email = inputEmail.getText().trim();
        String telefone = inputTelefone.getText().trim();

        if (!nome.isEmpty() && !cnh.isEmpty() && !email.isEmpty() && !telefone.isEmpty()) {
            int codigo = cliente.getCodigo();
            controller.editar(codigo, nome, cnh, email, telefone);

            clientes = controller.getClientes();
            atualizarTabela(clientes);
            baseDeDados.atualizarClientes(clientes);
            estadoInicial();
            if (!controller.listaVazia()) {
                btnEditar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
        } else {
            labelAvisos.setText("Preencha todos os campos");
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        estadoInicial();
        if (!controller.listaVazia()) {
            btnEditar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        estadoCadastrando();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cod = inputCodigoEditar.getText().trim();
        if (!cod.isEmpty()) {
            labelAvisosEditar.setText("");
            try {
                int codigo = Integer.parseInt(cod);
                cliente = controller.buscarPorCodigo(codigo);
                if (cliente != null) {
                    labelAvisosEditar.setText("");
                    habilitarEntradas(true);
                    inputNome.setText(cliente.getNome());
                    inputCnh.setText(cliente.getCnh());
                    inputEmail.setText(cliente.getEmail());
                    inputTelefone.setText(cliente.getTelefone());
                    habilitarCampos(true);

                    btnBuscar.setVisible(false);
                    inputCodigoEditar.setVisible(false);

                    btnSalvar.setEnabled(true);

                } else {
                    labelAvisosEditar.setText("Cliente não encontrado");
                }
            } catch (NumberFormatException ex) {
                labelAvisosEditar.setText("Formato de código inválido");
            }
        } else {
            labelAvisosEditar.setText("Informe um código válido");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        String nome = inputNome.getText().trim();
        String cnh = inputCnh.getText().trim();
        String email = inputEmail.getText().trim();
        String telefone = inputTelefone.getText().trim();

        if (!nome.isEmpty() && !cnh.isEmpty() && !email.isEmpty() && !telefone.isEmpty()) {
            cliente = controller.buscarPorCnh(cnh);
            if (cliente == null) {
                controller.cadastrar(nome, cnh, email, telefone);
                clientes = controller.getClientes();

                baseDeDados.atualizarClientes(clientes);

                atualizarTabela(clientes);
                estadoInicial();
                if (!controller.listaVazia()) {
                    btnExcluir.setEnabled(true);
                    btnEditar.setEnabled(true);
                }
            } else {
                labelAvisos.setText("CNH já cadastrada");
            }

        } else {
            labelAvisos.setText("Preencha todos os dados");
        }

    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
        estadoEditando();
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        estadoExcluindo();
    }

    private void btnConfirmaExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnConfirmaExcluirActionPerformed
        String cnh = inputCodigoExcluir.getText().trim();
        if (!cnh.isEmpty()) {
            cliente = controller.buscarPorCnh(cnh);
            if (cliente != null) {
                labelAvisosExcluir.setText("");
                int confirma = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o cliente?", "Confirmação excluir", JOptionPane.OK_CANCEL_OPTION);
                if (confirma == JOptionPane.OK_OPTION) {

                    controller.excluir(cliente);
                    clientes = controller.getClientes();
                    atualizarTabela(clientes);
                    baseDeDados.atualizarClientes(clientes);
                    estadoInicial();
                    if (!controller.listaVazia()) {
                        btnExcluir.setEnabled(true);
                        btnEditar.setEnabled(true);
                    }
                } else {
                    estadoInicial();
                    if (!controller.listaVazia()) {
                        btnExcluir.setEnabled(true);
                        btnEditar.setEnabled(true);
                    }
                }
            } else {
                labelAvisosExcluir.setText("Cliente não encontrado");
            }
        } else {
            labelAvisosExcluir.setText("Informe um valor válido");
        }
    }

    private void btnCancelarExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelarExcluirActionPerformed
        estadoInicial();
        if (!controller.listaVazia()) {
            btnExcluir.setEnabled(true);
            btnEditar.setEnabled(true);
        }

    }// GEN-LAST:event_btnCancelarExcluirActionPerformed

    public void estadoInicial() {
        clear();

        habilitarCampos(false);
        habilitarEntradas(true);
        btnNovo.setEnabled(true);

        btnCadastrar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(false);

        btnBuscar.setVisible(false);
        inputCodigoEditar.setVisible(false);

        btnExcluir.setEnabled(false);
        btnConfirmaExcluir.setVisible(false);
        btnCancelarExcluir.setVisible(false);

        inputCodigoExcluir.setVisible(false);

    }

    public void estadoCadastrando() {

        btnNovo.setEnabled(false);
        labelEstados.setText("CADASTRANDO...");

        btnExcluir.setEnabled(false);
        btnConfirmaExcluir.setVisible(false);
        btnCancelarExcluir.setVisible(false);
        inputCodigoExcluir.setVisible(false);

        btnEditar.setEnabled(false);
        btnBuscar.setVisible(false);
        btnSalvar.setEnabled(false);

        habilitarCampos(true);
        inputNome.requestFocus();

        btnCadastrar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    public void estadoEditando() {
        clear();
        habilitarEntradas(false);
        labelEstados.setText("EDITANDO...");

        btnNovo.setEnabled(false);
        btnCadastrar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);

        btnCancelar.setEnabled(true);

        btnBuscar.setVisible(true);
        inputCodigoEditar.setVisible(true);
        inputCodigoEditar.requestFocus();
        labelAvisosEditar.setText("Informe o CÓDIGO do cliente");

    }

    public void estadoExcluindo() {
        clear();

        btnExcluir.setEnabled(false);

        labelEstados.setText("EXCLUINDO...");
        labelAvisosExcluir.setText("Informe a CNH do cliente");

        inputCodigoExcluir.setVisible(true);
        inputCodigoExcluir.requestFocus();

        btnConfirmaExcluir.setVisible(true);
        btnCancelarExcluir.setVisible(true);

        btnNovo.setEnabled(false);
        btnCadastrar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnBuscar.setVisible(false);

        habilitarCampos(false);

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
        labelEstados.setText("");
        labelAvisosExcluir.setText("");
        labelAvisosEditar.setText("");
        inputCodigoExcluir.setText("");
    }

    public void habilitarEntradas(boolean op) {
        labelNome.setVisible(op);
        labelCnh.setVisible(op);
        labelEmail.setVisible(op);
        labelTelefone.setVisible(op);

        inputNome.setVisible(op);
        inputCnh.setVisible(op);
        inputEmail.setVisible(op);
        inputTelefone.setVisible(op);
    }

    public void atualizarTabela(ArrayList<Cliente> clientes) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("CÓDIGO");
        model.addColumn("NOME");
        model.addColumn("CNH");
        model.addColumn("EMAIL");
        model.addColumn("TELEFONE");
        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            Object[] linha = {
                c.getCodigo(),
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarExcluir;
    private javax.swing.JButton btnConfirmaExcluir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField inputCnh;
    private javax.swing.JTextField inputCodigoEditar;
    private javax.swing.JTextField inputCodigoExcluir;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelAvisosEditar;
    private javax.swing.JLabel labelAvisosExcluir;
    private javax.swing.JLabel labelCnh;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEstados;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JLabel wave;
    // End of variables declaration//GEN-END:variables
}
