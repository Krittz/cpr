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
        inputValorTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnConsultarPlaca = new javax.swing.JButton();
        btnCalcularTotal = new javax.swing.JButton();
        btnConsultarCnh = new javax.swing.JButton();
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
        wave = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle("LOCAÇÕES");
        setMaximumSize(new java.awt.Dimension(1280, 680));
        setMinimumSize(new java.awt.Dimension(1280, 680));
        setPreferredSize(new java.awt.Dimension(1280, 680));

        jPanel1.setBackground(new java.awt.Color(40, 42, 54));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 680));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 680));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputCnh.setBackground(new java.awt.Color(40, 42, 54));
        inputCnh.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCnh.setForeground(new java.awt.Color(189, 147, 249));
        inputCnh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCnh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputCnh.setMaximumSize(new java.awt.Dimension(260, 38));
        inputCnh.setMinimumSize(new java.awt.Dimension(260, 38));
        inputCnh.setPreferredSize(new java.awt.Dimension(120, 40));
        inputCnh.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputCnh.setSelectionColor(new java.awt.Color(189, 147, 249));
        jPanel1.add(inputCnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 433, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(189, 147, 249));
        jLabel1.setText("ALUGUÉIS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 39, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(189, 147, 249));
        jLabel2.setText("Data Retirada");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 165, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(189, 147, 249));
        jLabel3.setText("Data Devolução");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 165, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(189, 147, 249));
        jLabel4.setText("Placa do veículo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 79, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(189, 147, 249));
        jLabel5.setText("CNH DO CLIENTE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 410, -1, -1));

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
        btnCadastrar.setPreferredSize(new java.awt.Dimension(110, 40));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 528, -1, -1));

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
        btnExcluir.setPreferredSize(new java.awt.Dimension(120, 40));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 476, -1, -1));

        inputPlaca.setBackground(new java.awt.Color(40, 42, 54));
        inputPlaca.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputPlaca.setForeground(new java.awt.Color(189, 147, 249));
        inputPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputPlaca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputPlaca.setMargin(new java.awt.Insets(0, 0, 0, 0));
        inputPlaca.setMaximumSize(new java.awt.Dimension(120, 40));
        inputPlaca.setMinimumSize(new java.awt.Dimension(120, 40));
        inputPlaca.setPreferredSize(new java.awt.Dimension(120, 40));
        inputPlaca.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputPlaca.setSelectionColor(new java.awt.Color(189, 147, 249));
        inputPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPlacaActionPerformed(evt);
            }
        });
        jPanel1.add(inputPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 106, -1, -1));

        labelAvisosExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosExcluir.setForeground(new java.awt.Color(189, 147, 249));
        labelAvisosExcluir.setText(" ");
        labelAvisosExcluir.setToolTipText("");
        jPanel1.add(labelAvisosExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 527, 272, 30));

        inputCodigoExcluir.setBackground(new java.awt.Color(40, 42, 54));
        inputCodigoExcluir.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCodigoExcluir.setForeground(new java.awt.Color(189, 147, 249));
        inputCodigoExcluir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCodigoExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputCodigoExcluir.setPreferredSize(new java.awt.Dimension(120, 40));
        inputCodigoExcluir.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputCodigoExcluir.setSelectionColor(new java.awt.Color(189, 147, 249));
        jPanel1.add(inputCodigoExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 475, 140, -1));

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
        btnConfirmaExcluir.setOpaque(true);
        btnConfirmaExcluir.setPreferredSize(new java.awt.Dimension(120, 40));
        btnConfirmaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmaExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(836, 476, -1, -1));

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
        btnCancelarExcluir.setOpaque(true);
        btnCancelarExcluir.setPreferredSize(new java.awt.Dimension(120, 40));
        btnCancelarExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(836, 522, -1, -1));

        inputValorTotal.setEditable(false);
        inputValorTotal.setBackground(new java.awt.Color(40, 42, 54));
        inputValorTotal.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputValorTotal.setForeground(new java.awt.Color(189, 147, 249));
        inputValorTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputValorTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputValorTotal.setMaximumSize(new java.awt.Dimension(260, 38));
        inputValorTotal.setMinimumSize(new java.awt.Dimension(260, 38));
        inputValorTotal.setPreferredSize(new java.awt.Dimension(120, 40));
        inputValorTotal.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputValorTotal.setSelectionColor(new java.awt.Color(189, 147, 249));
        jPanel1.add(inputValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 269, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(189, 147, 249));
        jLabel7.setText("Valor R$");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 246, -1, -1));

        btnConsultarPlaca.setBackground(new java.awt.Color(189, 147, 249));
        btnConsultarPlaca.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnConsultarPlaca.setForeground(new java.awt.Color(40, 42, 54));
        btnConsultarPlaca.setText("BUSCAR");
        btnConsultarPlaca.setBorder(null);
        btnConsultarPlaca.setBorderPainted(false);
        btnConsultarPlaca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarPlaca.setFocusPainted(false);
        btnConsultarPlaca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarPlaca.setMaximumSize(new java.awt.Dimension(110, 45));
        btnConsultarPlaca.setMinimumSize(new java.awt.Dimension(110, 45));
        btnConsultarPlaca.setPreferredSize(new java.awt.Dimension(110, 40));
        btnConsultarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPlacaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 107, -1, -1));

        btnCalcularTotal.setBackground(new java.awt.Color(189, 147, 249));
        btnCalcularTotal.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCalcularTotal.setForeground(new java.awt.Color(40, 42, 54));
        btnCalcularTotal.setText("CALCULAR");
        btnCalcularTotal.setBorder(null);
        btnCalcularTotal.setBorderPainted(false);
        btnCalcularTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcularTotal.setFocusPainted(false);
        btnCalcularTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalcularTotal.setMaximumSize(new java.awt.Dimension(110, 45));
        btnCalcularTotal.setMinimumSize(new java.awt.Dimension(110, 45));
        btnCalcularTotal.setPreferredSize(new java.awt.Dimension(110, 40));
        btnCalcularTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTotalActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcularTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 270, -1, -1));

        btnConsultarCnh.setBackground(new java.awt.Color(189, 147, 249));
        btnConsultarCnh.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnConsultarCnh.setForeground(new java.awt.Color(40, 42, 54));
        btnConsultarCnh.setText("BUSCAR");
        btnConsultarCnh.setBorder(null);
        btnConsultarCnh.setBorderPainted(false);
        btnConsultarCnh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarCnh.setFocusPainted(false);
        btnConsultarCnh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarCnh.setMaximumSize(new java.awt.Dimension(110, 45));
        btnConsultarCnh.setMinimumSize(new java.awt.Dimension(110, 45));
        btnConsultarCnh.setPreferredSize(new java.awt.Dimension(110, 40));
        btnConsultarCnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCnhActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarCnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 434, -1, -1));

        tabelaAlugueis.setBackground(new java.awt.Color(40, 41, 66));
        tabelaAlugueis.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaAlugueis.setForeground(new java.awt.Color(189, 147, 249));
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
        tabelaAlugueis.setGridColor(new java.awt.Color(40, 42, 54));
        tabelaAlugueis.setPreferredSize(new java.awt.Dimension(300, 300));
        tabelaAlugueis.setRequestFocusEnabled(false);
        tabelaAlugueis.setRowSelectionAllowed(false);
        tabelaAlugueis.setSelectionBackground(new java.awt.Color(189, 147, 249));
        tabelaAlugueis.setSelectionForeground(new java.awt.Color(40, 41, 66));
        tabelaAlugueis.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaAlugueis);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 165, 600, 304));

        labelAvisos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(189, 147, 249));
        labelAvisos.setText(" ");
        labelAvisos.setToolTipText("");
        jPanel1.add(labelAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 486, 316, 30));

        inputDataRetirada.setBackground(new java.awt.Color(40, 42, 54));
        inputDataRetirada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputDataRetirada.setForeground(new java.awt.Color(189, 147, 249));
        inputDataRetirada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        inputDataRetirada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputDataRetirada.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        inputDataRetirada.setMargin(new java.awt.Insets(0, 0, 0, 0));
        inputDataRetirada.setMaximumSize(new java.awt.Dimension(120, 40));
        inputDataRetirada.setMinimumSize(new java.awt.Dimension(120, 40));
        inputDataRetirada.setOpaque(true);
        inputDataRetirada.setPreferredSize(new java.awt.Dimension(120, 40));
        inputDataRetirada.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputDataRetirada.setSelectionColor(new java.awt.Color(189, 147, 249));
        jPanel1.add(inputDataRetirada, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 188, -1, -1));

        inputDataDevolucao.setBackground(new java.awt.Color(40, 42, 54));
        inputDataDevolucao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputDataDevolucao.setForeground(new java.awt.Color(189, 147, 249));
        inputDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        inputDataDevolucao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputDataDevolucao.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        inputDataDevolucao.setMargin(new java.awt.Insets(0, 0, 0, 0));
        inputDataDevolucao.setMaximumSize(new java.awt.Dimension(120, 40));
        inputDataDevolucao.setMinimumSize(new java.awt.Dimension(120, 40));
        inputDataDevolucao.setOpaque(true);
        inputDataDevolucao.setPreferredSize(new java.awt.Dimension(120, 40));
        inputDataDevolucao.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputDataDevolucao.setSelectionColor(new java.awt.Color(189, 147, 249));
        jPanel1.add(inputDataDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 188, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(189, 147, 249));
        jLabel8.setText("Agência de retirada");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 328, -1, -1));

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
        btnSalvar.setOpaque(true);
        btnSalvar.setPreferredSize(new java.awt.Dimension(110, 40));
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 528, -1, -1));

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
        btnEditar.setOpaque(true);
        btnEditar.setPreferredSize(new java.awt.Dimension(110, 40));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 528, -1, -1));

        inputAgencia.setBackground(new java.awt.Color(40, 42, 54));
        inputAgencia.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputAgencia.setForeground(new java.awt.Color(189, 147, 249));
        inputAgencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputAgencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputAgencia.setMaximumSize(new java.awt.Dimension(260, 38));
        inputAgencia.setMinimumSize(new java.awt.Dimension(260, 38));
        inputAgencia.setPreferredSize(new java.awt.Dimension(120, 40));
        inputAgencia.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputAgencia.setSelectionColor(new java.awt.Color(189, 147, 249));
        jPanel1.add(inputAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 351, -1, -1));

        btnConsultarAgencia.setBackground(new java.awt.Color(189, 147, 249));
        btnConsultarAgencia.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnConsultarAgencia.setForeground(new java.awt.Color(40, 42, 54));
        btnConsultarAgencia.setText("BUSCAR");
        btnConsultarAgencia.setBorder(null);
        btnConsultarAgencia.setBorderPainted(false);
        btnConsultarAgencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarAgencia.setFocusPainted(false);
        btnConsultarAgencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarAgencia.setMaximumSize(new java.awt.Dimension(110, 45));
        btnConsultarAgencia.setMinimumSize(new java.awt.Dimension(110, 45));
        btnConsultarAgencia.setPreferredSize(new java.awt.Dimension(110, 40));
        btnConsultarAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAgenciaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 352, -1, -1));

        wave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fotor_2023-6-3_11_58_13.png"))); // NOI18N
        jPanel1.add(wave, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPlacaActionPerformed
        String placa = inputPlaca.getText().trim();
        boolean placaEncontrada = false;

        if (!placa.isEmpty()) {
            List<Veiculo> veiculos = baseDeDados.getVeiculos();
            if (veiculos.isEmpty()) {
                labelAvisos.setText("Nenhum veiculo cadastrado");
            } else {
                try {
                    Iterator<Veiculo> iterator = veiculos.iterator();

                    while (iterator.hasNext() && !placaEncontrada) {
                        Veiculo v = iterator.next();
                        if (v.getPlaca().equals(placa)) {
                            if (v.isDisponivel() == false) {
                                labelAvisos.setText("Veículo: " + v.getPlaca() + " está indisponível");
                                inputDataRetirada.setEditable(false);
                                inputDataDevolucao.setEditable(false);
                                btnCalcularTotal.setEnabled(false);

                            } else {
                                labelAvisos.setText("Veiculo: " + v.getMarca() + "-" + v.getModelo());
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
                        labelAvisos.setText("Veículo não encontrado");
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
            labelAvisos.setText("Placa inválida");
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
                    labelAvisos.setText("Nenhum cliente cadastrado");
                } else {
                    Iterator<Cliente> iterator = clientes.iterator();

                    while (iterator.hasNext() && !cnhEncontrada) {
                        Cliente c = iterator.next();
                        if (c.getCnh().equals(cnh)) {
                            labelAvisos.setText("Cliente: " + c.getNome());
                            cliente = c;
                            btnCadastrar.setEnabled(true);
                            cnhEncontrada = true;
                        }
                    }

                    if (!cnhEncontrada) {
                        labelAvisos.setText("Cliente não encontrado");
                        btnCadastrar.setEnabled(false);
                    }
                }
            } else {
                labelAvisos.setText("CNH inválida");
            }
        } catch (NullPointerException e) {
            labelAvisos.setText("Erro: Valor nulo encontrado");
        } catch (NoSuchElementException e) {
            labelAvisos.setText("Erro: Elemento não encontrado");
        } catch (Exception e) {
            labelAvisos.setText("Erro: Ocorreu uma exceção não esperada");
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
                labelAvisos.setText("Nenhuma agência cadastrada");
            } else {

                Iterator<Agencia> iterator = agencias.iterator();
                while (iterator.hasNext()) {
                    Agencia a = iterator.next();
                    if (a.getCodigo().equals(codigo)) {
                        labelAvisos.setText("Agência: " + a.getNome());
                        agencia = a;
                        btnConsultarCnh.setEnabled(true);
                        inputCnh.setEditable(true);
                        agenciaEncontrada = true;
                    }
                }
                if (!agenciaEncontrada) {
                    labelAvisos.setText("Agência não encontrada");
                    btnConsultarCnh.setEnabled(false);
                    inputCnh.setEditable(false);
                }
            }
        } else {
            labelAvisos.setText("Código invalido");
        }
    }//GEN-LAST:event_btnConsultarAgenciaActionPerformed

    private void inputPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPlacaActionPerformed

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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelAvisosExcluir;
    private javax.swing.JTable tabelaAlugueis;
    private javax.swing.JLabel wave;
    // End of variables declaration//GEN-END:variables
}
