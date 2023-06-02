package view;

import controller.AluguelController;
import controller.BaseDeDados;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author crist
 */
public final class ScreenLocate extends javax.swing.JInternalFrame {

    private ArrayList<Aluguel> alugueis;
    private final AluguelController controller;
    private final BaseDeDados baseDeDados;
    private Veiculo veiculo;
    private Cliente cliente;
    private Agencia agencia;

    LocalDate retirada, devolucao;
    double total;

    public ScreenLocate(BaseDeDados baseDeDados) {
        initComponents();
        this.baseDeDados = baseDeDados;
        veiculo = new Veiculo();
        cliente = new Cliente();
        agencia = new Agencia();
        alugueis = new ArrayList<Aluguel>();
        controller = new AluguelController(alugueis);
        estadoIncial();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputCnh = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        inputPlaca = new javax.swing.JTextField();
        labelAvisosExcluir = new javax.swing.JLabel();
        inputCodigoExcluir = new javax.swing.JTextField();
        btnConfirmaExcluir = new javax.swing.JButton();
        btnCancelarExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        inputValorTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnConsultarPlaca = new javax.swing.JButton();
        btnCalcularTotal = new javax.swing.JButton();
        btnConsultarCnh = new javax.swing.JButton();
        labelAvisosCnh = new javax.swing.JLabel();
        labelAvisosPlaca = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAlugueis = new javax.swing.JTable();
        labelAvisos = new javax.swing.JLabel();
        inputDataRetirada = new javax.swing.JFormattedTextField();
        inputDataDevolucao = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        inputAgencia = new javax.swing.JTextField();
        btnConsultarAgencia = new javax.swing.JButton();
        labelAvisosAg = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle("LOCAÇÕES");
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
        inputCnh.setMaximumSize(new java.awt.Dimension(260, 38));
        inputCnh.setMinimumSize(new java.awt.Dimension(260, 38));
        inputCnh.setPreferredSize(new java.awt.Dimension(260, 38));
        inputCnh.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputCnh.setSelectionColor(new java.awt.Color(218, 31, 79));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 31, 79));
        jLabel1.setText("ALUGUÉIS");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("DATA RETIRADA");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("DATA DEVOLUÇÃO");

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("PLACA DO VEÍCULO");

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("CNH DO CLIENTE");

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

        inputPlaca.setBackground(new java.awt.Color(18, 20, 31));
        inputPlaca.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputPlaca.setForeground(new java.awt.Color(218, 31, 79));
        inputPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputPlaca.setBorder(null);
        inputPlaca.setMaximumSize(new java.awt.Dimension(260, 38));
        inputPlaca.setMinimumSize(new java.awt.Dimension(260, 38));
        inputPlaca.setPreferredSize(new java.awt.Dimension(260, 38));
        inputPlaca.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputPlaca.setSelectionColor(new java.awt.Color(218, 31, 79));

        labelAvisosExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosExcluir.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisosExcluir.setText(" ");
        labelAvisosExcluir.setToolTipText("");

        inputCodigoExcluir.setBackground(new java.awt.Color(18, 20, 31));
        inputCodigoExcluir.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCodigoExcluir.setForeground(new java.awt.Color(218, 31, 79));
        inputCodigoExcluir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCodigoExcluir.setBorder(null);
        inputCodigoExcluir.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCodigoExcluir.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputCodigoExcluir.setSelectionColor(new java.awt.Color(218, 31, 79));

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
        btnCancelarExcluir.setPreferredSize(new java.awt.Dimension(110, 45));
        btnCancelarExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarExcluirActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Black White and Red Modern Automotive Logo.png"))); // NOI18N

        inputValorTotal.setEditable(false);
        inputValorTotal.setBackground(new java.awt.Color(18, 20, 31));
        inputValorTotal.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputValorTotal.setForeground(new java.awt.Color(218, 31, 79));
        inputValorTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputValorTotal.setBorder(null);
        inputValorTotal.setMaximumSize(new java.awt.Dimension(260, 38));
        inputValorTotal.setMinimumSize(new java.awt.Dimension(260, 38));
        inputValorTotal.setPreferredSize(new java.awt.Dimension(260, 38));
        inputValorTotal.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputValorTotal.setSelectionColor(new java.awt.Color(218, 31, 79));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("VALOR TOTAL");

        btnConsultarPlaca.setBackground(new java.awt.Color(218, 31, 79));
        btnConsultarPlaca.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnConsultarPlaca.setForeground(new java.awt.Color(9, 13, 25));
        btnConsultarPlaca.setText("BUSCAR");
        btnConsultarPlaca.setBorder(null);
        btnConsultarPlaca.setBorderPainted(false);
        btnConsultarPlaca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarPlaca.setFocusPainted(false);
        btnConsultarPlaca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarPlaca.setMaximumSize(new java.awt.Dimension(110, 45));
        btnConsultarPlaca.setMinimumSize(new java.awt.Dimension(110, 45));
        btnConsultarPlaca.setPreferredSize(new java.awt.Dimension(110, 45));
        btnConsultarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPlacaActionPerformed(evt);
            }
        });

        btnCalcularTotal.setBackground(new java.awt.Color(218, 31, 79));
        btnCalcularTotal.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCalcularTotal.setForeground(new java.awt.Color(9, 13, 25));
        btnCalcularTotal.setText("CALCULAR");
        btnCalcularTotal.setBorder(null);
        btnCalcularTotal.setBorderPainted(false);
        btnCalcularTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcularTotal.setFocusPainted(false);
        btnCalcularTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalcularTotal.setMaximumSize(new java.awt.Dimension(110, 45));
        btnCalcularTotal.setMinimumSize(new java.awt.Dimension(110, 45));
        btnCalcularTotal.setPreferredSize(new java.awt.Dimension(110, 45));
        btnCalcularTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTotalActionPerformed(evt);
            }
        });

        btnConsultarCnh.setBackground(new java.awt.Color(218, 31, 79));
        btnConsultarCnh.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnConsultarCnh.setForeground(new java.awt.Color(9, 13, 25));
        btnConsultarCnh.setText("BUSCAR");
        btnConsultarCnh.setBorder(null);
        btnConsultarCnh.setBorderPainted(false);
        btnConsultarCnh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarCnh.setFocusPainted(false);
        btnConsultarCnh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarCnh.setMaximumSize(new java.awt.Dimension(110, 45));
        btnConsultarCnh.setMinimumSize(new java.awt.Dimension(110, 45));
        btnConsultarCnh.setPreferredSize(new java.awt.Dimension(110, 45));
        btnConsultarCnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCnhActionPerformed(evt);
            }
        });

        labelAvisosCnh.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosCnh.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisosCnh.setText(" ");
        labelAvisosCnh.setToolTipText("");

        labelAvisosPlaca.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosPlaca.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisosPlaca.setText(" ");
        labelAvisosPlaca.setToolTipText("");

        tabelaAlugueis.setBackground(new java.awt.Color(18, 20, 31));
        tabelaAlugueis.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaAlugueis.setForeground(new java.awt.Color(218, 31, 79));
        tabelaAlugueis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "RETIRADA", "DEVOLUÇÃO", "TOTAL R$", "CLIENTE", "VEÍCULO", "AGÊNCIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAlugueis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaAlugueis.setEnabled(false);
        tabelaAlugueis.setFocusable(false);
        tabelaAlugueis.setGridColor(new java.awt.Color(18, 20, 31));
        tabelaAlugueis.setPreferredSize(new java.awt.Dimension(300, 300));
        tabelaAlugueis.setRequestFocusEnabled(false);
        tabelaAlugueis.setRowSelectionAllowed(false);
        tabelaAlugueis.setSelectionBackground(new java.awt.Color(218, 31, 79));
        tabelaAlugueis.setSelectionForeground(new java.awt.Color(18, 20, 31));
        tabelaAlugueis.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaAlugueis);

        labelAvisos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisos.setText(" ");
        labelAvisos.setToolTipText("");

        inputDataRetirada.setBackground(new java.awt.Color(18, 20, 31));
        inputDataRetirada.setBorder(null);
        inputDataRetirada.setForeground(new java.awt.Color(218, 31, 79));
        inputDataRetirada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        inputDataRetirada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputDataRetirada.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        inputDataRetirada.setOpaque(true);
        inputDataRetirada.setPreferredSize(new java.awt.Dimension(120, 32));

        inputDataDevolucao.setBackground(new java.awt.Color(18, 20, 31));
        inputDataDevolucao.setBorder(null);
        inputDataDevolucao.setForeground(new java.awt.Color(218, 31, 79));
        inputDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        inputDataDevolucao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputDataDevolucao.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        inputDataDevolucao.setOpaque(true);
        inputDataDevolucao.setPreferredSize(new java.awt.Dimension(120, 32));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("CÓDIGO AG RETIRADA");

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

        inputAgencia.setBackground(new java.awt.Color(18, 20, 31));
        inputAgencia.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputAgencia.setForeground(new java.awt.Color(218, 31, 79));
        inputAgencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputAgencia.setBorder(null);
        inputAgencia.setMaximumSize(new java.awt.Dimension(260, 38));
        inputAgencia.setMinimumSize(new java.awt.Dimension(260, 38));
        inputAgencia.setPreferredSize(new java.awt.Dimension(260, 38));
        inputAgencia.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputAgencia.setSelectionColor(new java.awt.Color(218, 31, 79));

        btnConsultarAgencia.setBackground(new java.awt.Color(218, 31, 79));
        btnConsultarAgencia.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnConsultarAgencia.setForeground(new java.awt.Color(9, 13, 25));
        btnConsultarAgencia.setText("BUSCAR");
        btnConsultarAgencia.setBorder(null);
        btnConsultarAgencia.setBorderPainted(false);
        btnConsultarAgencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarAgencia.setFocusPainted(false);
        btnConsultarAgencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarAgencia.setMaximumSize(new java.awt.Dimension(110, 45));
        btnConsultarAgencia.setMinimumSize(new java.awt.Dimension(110, 45));
        btnConsultarAgencia.setPreferredSize(new java.awt.Dimension(110, 45));
        btnConsultarAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAgenciaActionPerformed(evt);
            }
        });

        labelAvisosAg.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosAg.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisosAg.setText(" ");
        labelAvisosAg.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(426, 426, 426)
                                .addComponent(jLabel1))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputDataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConsultarPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3))
                            .addComponent(labelAvisosPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(inputAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnConsultarAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(inputValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCalcularTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46))))
                            .addComponent(labelAvisosAg, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultarCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelAvisosCnh, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAvisosExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputCodigoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConfirmaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelarExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultarPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inputCodigoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnConfirmaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCancelarExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(labelAvisosExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelAvisosPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputDataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcularTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultarAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(labelAvisosAg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultarCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelAvisosCnh, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPlacaActionPerformed
        String placa = inputPlaca.getText().trim();
        boolean placaEncontrada = false;

        if (!placa.isEmpty()) {
            List<Veiculo> veiculos = baseDeDados.getVeiculos();
            if (veiculos.isEmpty()) {
                labelAvisosPlaca.setText("Nenhum veiculo cadastrado");
            } else {
                try {
                    Iterator<Veiculo> iterator = veiculos.iterator();

                    while (iterator.hasNext() && !placaEncontrada) {
                        Veiculo v = iterator.next();                       
                        if (v.getPlaca().equals(placa)) {
                            if (v.isDisponivel() == false) {
                                labelAvisosPlaca.setText("Veículo: " + v.getPlaca() + " está indisponível");
                                inputDataRetirada.setEditable(false);
                                inputDataDevolucao.setEditable(false);
                                btnCalcularTotal.setEnabled(false);

                            } else {
                                labelAvisosPlaca.setText("Veiculo: " + v.getMarca() + "-" + v.getModelo());
                                veiculo = v;
                                inputDataRetirada.setEditable(true);
                                inputDataRetirada.requestFocus();
                                inputDataDevolucao.setEditable(true);
                                btnCalcularTotal.setEnabled(true);
                            }
                            placaEncontrada = true;
                            break;
                        }
                    }

                    if (!placaEncontrada) {
                        labelAvisosPlaca.setText("Veículo não encontrado");
                        estadoIncial();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Erro ao consultar placa do veículo: " + e.getMessage(),
                            "Erro", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }
        } else {
            if (!controller.listaVazia()) {
                estadoIncial();
                btnEditar.setEnabled(true);
                btnExcluir.setEnabled(true);

            }
            labelAvisosPlaca.setText("Placa inválida");
        }
    }//GEN-LAST:event_btnConsultarPlacaActionPerformed

    private void btnCalcularTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTotalActionPerformed
        try {
            String dataRetirada = inputDataRetirada.getText().trim();
            String dataDevolucao = inputDataDevolucao.getText().trim();
            double diaria = veiculo.getDiaria();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            retirada = LocalDate.parse(dataRetirada, formatter);
            devolucao = LocalDate.parse(dataDevolucao, formatter);
            long diasAlugados = ChronoUnit.DAYS.between(retirada, devolucao);
            total = diaria * diasAlugados;
            inputValorTotal.setText(String.valueOf(total));
            inputAgencia.setEditable(true);
            btnConsultarAgencia.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao calcular valor total: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnCalcularTotalActionPerformed

    private void btnConsultarCnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCnhActionPerformed
        String cnh = inputCnh.getText().trim();
        boolean cnhEncontrada = false;

        try {
            if (!cnh.isEmpty()) {
                List<Cliente> clientes = baseDeDados.getClientes();

                if (clientes.isEmpty()) {
                    labelAvisosCnh.setText("Nenhum cliente cadastrado");
                } else {
                    Iterator<Cliente> iterator = clientes.iterator();

                    while (iterator.hasNext() && !cnhEncontrada) {
                        Cliente c = iterator.next();
                        if (c.getCnh().equals(cnh)) {
                            labelAvisosCnh.setText("Cliente: " + c.getNome());
                            cliente = c;
                            btnCadastrar.setEnabled(true);
                            cnhEncontrada = true;
                        }
                    }

                    if (!cnhEncontrada) {
                        labelAvisosCnh.setText("Cliente não encontrado");
                        btnCadastrar.setEnabled(false);
                    }
                }
            } else {
                labelAvisosCnh.setText("CNH inválida");
            }
        } catch (NullPointerException e) {
            labelAvisosCnh.setText("Erro: Valor nulo encontrado");
        } catch (NoSuchElementException e) {
            labelAvisosCnh.setText("Erro: Elemento não encontrado");
        } catch (Exception e) {
            labelAvisosCnh.setText("Erro: Ocorreu uma exceção não esperada");
        }
    }//GEN-LAST:event_btnConsultarCnhActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String codigo = JOptionPane.showInputDialog(this, "Informe o código do aluguel:");
        if (!codigo.isBlank()) {
            int cod = Integer.parseInt(codigo);
            Aluguel a = controller.buscarPorCodigo(cod);
            Veiculo v = a.getVeiculo();
            Agencia ag = a.getAgencia();
            Cliente c = a.getCliente();

            habilitarCampos(false);
            btnConsultarPlaca.setEnabled(false);
            inputPlaca.setText(v.getPlaca());

            inputDataRetirada.setText(String.valueOf(a.getDataRetirada()));
            inputDataRetirada.setEditable(true);

            inputDataDevolucao.setText(String.valueOf(a.getDataDevolucao()));
            inputDataDevolucao.setEditable(true);

            inputValorTotal.setText(String.valueOf(a.getValorTotal()));
            btnCalcularTotal.setEnabled(true);

            inputAgencia.setText(ag.getNome());
            btnConsultarAgencia.setEnabled(false);
            inputCnh.setText(c.getCnh());
            btnConsultarCnh.setEnabled(false);
            btnCalcularTotal.addActionListener((ActionEvent evt1) -> {
                btnSalvar.setVisible(true);
                btnSalvar.addActionListener((ActionEvent evt2) -> {
                    String dataRetirada = inputDataRetirada.getText().trim();
                    String dataDevolucao = inputDataDevolucao.getText().trim();
                    String valorTotal = inputValorTotal.getText().trim();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    retirada = LocalDate.parse(dataRetirada, formatter);
                    devolucao = LocalDate.parse(dataDevolucao, formatter);
                    total = Double.parseDouble(valorTotal);
                    controller.editar(cod, retirada, devolucao, cliente, veiculo, agencia, total);
                    alugueis = controller.getAlugueis();
                    atualizarTabela(alugueis);
                    baseDeDados.atualizarAlugueis(alugueis);
                    clear();
                    estadoIncial();
                    if (!controller.listaVazia()) {
                        btnEditar.setEnabled(true);
                        btnExcluir.setEnabled(true);
                    }
                });
            });

        } else {
            JOptionPane.showMessageDialog(this, "Informe um valor válido", "Valor inválido",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnConsultarAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAgenciaActionPerformed
        String codigo = inputAgencia.getText().trim();
        boolean agenciaEncontrada = false;
        if (!codigo.isEmpty()) {
            List<Agencia> agencias = baseDeDados.getAgencias();
            if (agencias.isEmpty()) {
                labelAvisosAg.setText("Nenhuma agência cadastrada");
            } else {

                Iterator<Agencia> iterator = agencias.iterator();
                while (iterator.hasNext()) {
                    Agencia a = iterator.next();
                    if (a.getCodigo().equals(codigo)) {
                        labelAvisosAg.setText("Agência: " + a.getNome());
                        agencia = a;
                        btnConsultarCnh.setEnabled(true);
                        inputCnh.setEditable(true);
                        agenciaEncontrada = true;
                    }
                }
                if (!agenciaEncontrada) {
                    labelAvisosAg.setText("Agência não encontrada");
                    btnConsultarCnh.setEnabled(false);
                    inputCnh.setEditable(false);
                }
            }
        } else {
            labelAvisosAg.setText("Código invalido");
        }
    }//GEN-LAST:event_btnConsultarAgenciaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        controller.cadastrar(retirada, devolucao, veiculo, agencia, cliente, total);
        alugueis = controller.getAlugueis();
        atualizarTabela(alugueis);
        baseDeDados.atualizarAlugueis(alugueis);
        clear();
        posCadastro();

    }

    public void posCadastro() {
        estadoIncial();
        if (!controller.listaVazia()) {
            btnEditar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        habilitarCampos(false);
        btnExcluir.setEnabled(false);
        btnEditar.setEnabled(false);
        inputCodigoExcluir.setVisible(true);
        btnCancelarExcluir.setVisible(true);
        btnConfirmaExcluir.setVisible(true);
        labelAvisosExcluir.setText("Informe o código do aluguel");

    }

    private void btnConfirmaExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        String codigo = inputCodigoExcluir.getText().trim();
        if (!codigo.isEmpty()) {
            int cod = Integer.parseInt(codigo);
            Aluguel a = controller.buscarPorCodigo(cod);
            if (a != null) {
                labelAvisosExcluir.setText("");
                int confirma = JOptionPane.showConfirmDialog(this, "Confirma exclusão: (" + a.getCodigo() + ")",
                        "Confirme a exclusão", JOptionPane.OK_CANCEL_OPTION);
                if (confirma == JOptionPane.OK_OPTION) {
                    controller.excluir(a);
                    alugueis = controller.getAlugueis();
                    atualizarTabela(alugueis);
                    btnConfirmaExcluir.setVisible(false);
                    inputCodigoExcluir.setVisible(false);
                    btnCancelarExcluir.setVisible(false);
                    habilitarCampos(true);
                    baseDeDados.atualizarAlugueis(alugueis);
                    if (!controller.listaVazia()) {
                        btnExcluir.setEnabled(true);
                        btnEditar.setEnabled(true);
                    } else {
                        estadoIncial();
                    }
                } else {
                    if (!controller.listaVazia()) {
                        estadoIncial();
                        btnConsultarPlaca.setEnabled(true);
                        inputPlaca.setEditable(true);
                        btnExcluir.setEnabled(true);
                        btnEditar.setEnabled(true);
                    } else {
                        estadoIncial();
                    }

                }
            } else {
                labelAvisosExcluir.setText("Aluguel não encontrado");
            }
        } else {
            labelAvisosExcluir.setText("Informe um valor válido");
            inputCodigoExcluir.setText("");
        }
    }

    private void btnCancelarExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        if (!controller.listaVazia()) {
            estadoIncial();

            btnEditar.setEnabled(true);
            btnExcluir.setEnabled(true);
            clear();
        } else {
            estadoIncial();
        }

    }

    public void estadoIncial() {
        clear();
        inputCnh.setEditable(false);
        btnConsultarCnh.setEnabled(false);
        inputDataDevolucao.setEditable(false);
        inputDataRetirada.setEditable(false);
        inputValorTotal.setEditable(false);
        btnCalcularTotal.setEnabled(false);
        btnCadastrar.setEnabled(false);
        btnSalvar.setVisible(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        inputCodigoExcluir.setVisible(false);
        btnConfirmaExcluir.setVisible(false);
        btnCancelarExcluir.setVisible(false);
        inputAgencia.setEditable(false);
        btnConsultarAgencia.setEnabled(false);
        habilitarCampos(true);
    }

    public void habilitarCampos(boolean op) {
        inputPlaca.setEditable(op);
        btnConsultarPlaca.setEnabled(op);

    }

    public void clear() {
        inputPlaca.setText("");
        inputCnh.setText("");
        inputDataDevolucao.setText("");
        inputDataRetirada.setText("");
        inputAgencia.setText("");
        inputCnh.setText("");
        inputValorTotal.setText("");
        labelAvisos.setText("");
        labelAvisosExcluir.setText("");
        labelAvisosCnh.setText("");
        labelAvisosPlaca.setText("");
        labelAvisosAg.setText("");
        labelAvisosExcluir.setText("");
    }

    public void atualizarTabela(ArrayList<Aluguel> alugueis) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("CÓDIGO");
        model.addColumn("RETIRADA");
        model.addColumn("DEVOLUÇÃO");
        model.addColumn("TOTAL R$");
        model.addColumn("VEÍCULO");
        model.addColumn("CLIENTE");
        model.addColumn("AGÊNCIA");

        Iterator<Aluguel> it = alugueis.iterator();
        while (it.hasNext()) {
            Aluguel a = it.next();
            Veiculo v = a.getVeiculo();
            Cliente c = a.getCliente();
            Agencia ag = a.getAgencia();
            Object[] linha = {
                a.getCodigo(),
                a.getDataRetirada(),
                a.getDataDevolucao(),
                a.getValorTotal(),
                v.getPlaca(),
                c.getCnh(),
                ag.getNome()
            };
            model.addRow(linha);
        }
        tabelaAlugueis.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCalcularTotal;
    private javax.swing.JButton btnCancelarExcluir;
    private javax.swing.JButton btnConfirmaExcluir;
    private javax.swing.JButton btnConsultarAgencia;
    private javax.swing.JButton btnConsultarCnh;
    private javax.swing.JButton btnConsultarPlaca;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField inputAgencia;
    private javax.swing.JTextField inputCnh;
    private javax.swing.JTextField inputCodigoExcluir;
    private javax.swing.JFormattedTextField inputDataDevolucao;
    private javax.swing.JFormattedTextField inputDataRetirada;
    private javax.swing.JTextField inputPlaca;
    private javax.swing.JTextField inputValorTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelAvisosAg;
    private javax.swing.JLabel labelAvisosCnh;
    private javax.swing.JLabel labelAvisosExcluir;
    private javax.swing.JLabel labelAvisosPlaca;
    private javax.swing.JTable tabelaAlugueis;
    // End of variables declaration//GEN-END:variables
}
