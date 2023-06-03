package view;

import controller.PagamentoController;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Pagamento;
import controller.BaseDeDados;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.Aluguel;
import model.Parcela;

/**
 *
 * @author crist
 */
public final class ScreenPayment extends javax.swing.JInternalFrame {

    private int qtdeParcelas;
    private Aluguel aluguel;
    private Pagamento pagamento;
    private BaseDeDados baseDeDados;
    private DateTimeFormatter formatter;
    private DecimalFormat decimalFormat;
    private ArrayList<Pagamento> pagamentos;
    private final PagamentoController controller;

    public ScreenPayment(BaseDeDados baseDeDados) {
        initComponents();
        estadoIncial();

        aluguel = new Aluguel();
        pagamento = new Pagamento();
        this.baseDeDados = baseDeDados;
        pagamentos = new ArrayList<Pagamento>();
        decimalFormat = new DecimalFormat("0.00");
        controller = new PagamentoController(pagamentos);
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        inputCodigoAluguel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAgencias = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        labelAvisos = new javax.swing.JLabel();
        inputCodigoExcluir = new javax.swing.JTextField();
        labelAvisosExcluir = new javax.swing.JLabel();
        btnConfirmaExcluir = new javax.swing.JButton();
        btnCancelarExcluir = new javax.swing.JButton();
        btnConsultarAluguel = new javax.swing.JButton();
        inputValorAluguel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputParcelas = new javax.swing.JList<>();
        inputVencimento = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        inputValorParcela = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnGerarFatura = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        inputVeiculo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        labelAvisosCadastros = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaParcelas = new javax.swing.JTable();
        labelParcelas = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        wave = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBorder(null);
        setClosable(true);
        setTitle("PAGAMENTOS");
        setMaximumSize(new java.awt.Dimension(1280, 680));
        setMinimumSize(new java.awt.Dimension(1280, 680));
        setPreferredSize(new java.awt.Dimension(1280, 680));

        jPanel1.setBackground(new java.awt.Color(40, 42, 54));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 680));

        inputCodigoAluguel.setBackground(new java.awt.Color(40, 42, 54));
        inputCodigoAluguel.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCodigoAluguel.setForeground(new java.awt.Color(189, 147, 249));
        inputCodigoAluguel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCodigoAluguel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputCodigoAluguel.setMaximumSize(new java.awt.Dimension(120, 50));
        inputCodigoAluguel.setMinimumSize(new java.awt.Dimension(120, 50));
        inputCodigoAluguel.setPreferredSize(new java.awt.Dimension(120, 40));
        inputCodigoAluguel.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputCodigoAluguel.setSelectionColor(new java.awt.Color(189, 147, 249));

        tabelaAgencias.setBackground(new java.awt.Color(40, 41, 66));
        tabelaAgencias.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaAgencias.setForeground(new java.awt.Color(189, 147, 249));
        tabelaAgencias.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "CONDIÇÃO", "PARCELAS", "VALOR PARCELA", "VENCIMENTO", "STATUS", "ALUGUEL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        tabelaAgencias.setGridColor(new java.awt.Color(40, 41, 66));
        tabelaAgencias.setPreferredSize(new java.awt.Dimension(300, 300));
        tabelaAgencias.setRowSelectionAllowed(false);
        tabelaAgencias.setSelectionBackground(new java.awt.Color(189, 147, 249));
        tabelaAgencias.setSelectionForeground(new java.awt.Color(40, 41, 66));
        tabelaAgencias.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaAgencias);

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(189, 147, 249));
        jLabel1.setText("PAGAMENTOS");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(189, 147, 249));
        jLabel3.setText("Código aluguel");

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));

        btnCadastrar.setBackground(new java.awt.Color(189, 147, 249));
        btnCadastrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(40, 42, 54));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setBorder(null);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(184, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(18, 20, 31));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setBorder(null);
        btnExcluir.setBorderPainted(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setMaximumSize(new java.awt.Dimension(120, 40));
        btnExcluir.setMinimumSize(new java.awt.Dimension(120, 40));
        btnExcluir.setPreferredSize(new java.awt.Dimension(120, 40));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        labelAvisos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(189, 147, 249));
        labelAvisos.setText(" ");
        labelAvisos.setToolTipText("");

        inputCodigoExcluir.setBackground(new java.awt.Color(40, 42, 54));
        inputCodigoExcluir.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCodigoExcluir.setForeground(new java.awt.Color(189, 147, 249));
        inputCodigoExcluir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCodigoExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputCodigoExcluir.setMaximumSize(new java.awt.Dimension(120, 50));
        inputCodigoExcluir.setMinimumSize(new java.awt.Dimension(120, 50));
        inputCodigoExcluir.setPreferredSize(new java.awt.Dimension(120, 40));
        inputCodigoExcluir.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputCodigoExcluir.setSelectionColor(new java.awt.Color(189, 147, 249));

        labelAvisosExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosExcluir.setForeground(new java.awt.Color(189, 147, 249));
        labelAvisosExcluir.setText(" ");
        labelAvisosExcluir.setToolTipText("");

        btnConfirmaExcluir.setBackground(new java.awt.Color(40, 42, 54));
        btnConfirmaExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnConfirmaExcluir.setForeground(new java.awt.Color(189, 147, 249));
        btnConfirmaExcluir.setText("CONFIRMAR");
        btnConfirmaExcluir.setBorder(null);
        btnConfirmaExcluir.setBorderPainted(false);
        btnConfirmaExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmaExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfirmaExcluir.setMaximumSize(new java.awt.Dimension(120, 40));
        btnConfirmaExcluir.setMinimumSize(new java.awt.Dimension(120, 40));
        btnConfirmaExcluir.setPreferredSize(new java.awt.Dimension(120, 40));
        btnConfirmaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaExcluirActionPerformed(evt);
            }
        });

        btnCancelarExcluir.setBackground(new java.awt.Color(40, 42, 54));
        btnCancelarExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCancelarExcluir.setForeground(new java.awt.Color(189, 147, 249));
        btnCancelarExcluir.setText("CANCELAR");
        btnCancelarExcluir.setBorder(null);
        btnCancelarExcluir.setBorderPainted(false);
        btnCancelarExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarExcluir.setMaximumSize(new java.awt.Dimension(120, 40));
        btnCancelarExcluir.setMinimumSize(new java.awt.Dimension(120, 40));
        btnCancelarExcluir.setOpaque(true);
        btnCancelarExcluir.setPreferredSize(new java.awt.Dimension(120, 40));
        btnCancelarExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarExcluirActionPerformed(evt);
            }
        });

        btnConsultarAluguel.setBackground(new java.awt.Color(40, 42, 54));
        btnConsultarAluguel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnConsultarAluguel.setForeground(new java.awt.Color(189, 147, 249));
        btnConsultarAluguel.setText("BUSCAR");
        btnConsultarAluguel.setBorder(null);
        btnConsultarAluguel.setBorderPainted(false);
        btnConsultarAluguel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarAluguel.setFocusPainted(false);
        btnConsultarAluguel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarAluguel.setMaximumSize(new java.awt.Dimension(120, 40));
        btnConsultarAluguel.setMinimumSize(new java.awt.Dimension(120, 40));
        btnConsultarAluguel.setPreferredSize(new java.awt.Dimension(120, 40));
        btnConsultarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAluguelActionPerformed(evt);
            }
        });

        inputValorAluguel.setEditable(false);
        inputValorAluguel.setBackground(new java.awt.Color(40, 42, 54));
        inputValorAluguel.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputValorAluguel.setForeground(new java.awt.Color(189, 147, 249));
        inputValorAluguel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputValorAluguel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputValorAluguel.setMaximumSize(new java.awt.Dimension(120, 50));
        inputValorAluguel.setMinimumSize(new java.awt.Dimension(120, 50));
        inputValorAluguel.setPreferredSize(new java.awt.Dimension(120, 40));
        inputValorAluguel.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputValorAluguel.setSelectionColor(new java.awt.Color(189, 147, 249));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(189, 147, 249));
        jLabel4.setText("Valor");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(189, 147, 249));
        jLabel8.setText("Parcelas");

        inputParcelas.setBackground(new java.awt.Color(40, 42, 54));
        inputParcelas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputParcelas.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        inputParcelas.setForeground(new java.awt.Color(189, 147, 249));
        inputParcelas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        inputParcelas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        inputParcelas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        inputParcelas.setMaximumSize(new java.awt.Dimension(120, 40));
        inputParcelas.setMinimumSize(new java.awt.Dimension(120, 40));
        inputParcelas.setPreferredSize(new java.awt.Dimension(120, 40));
        inputParcelas.setSelectionBackground(new java.awt.Color(189, 147, 249));
        inputParcelas.setSelectionForeground(new java.awt.Color(40, 42, 54));
        inputParcelas.setVisibleRowCount(2);
        jScrollPane3.setViewportView(inputParcelas);

        inputVencimento.setBackground(new java.awt.Color(40, 42, 54));
        inputVencimento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputVencimento.setForeground(new java.awt.Color(189, 147, 249));
        inputVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        inputVencimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputVencimento.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputVencimento.setMaximumSize(new java.awt.Dimension(120, 40));
        inputVencimento.setMinimumSize(new java.awt.Dimension(120, 40));
        inputVencimento.setPreferredSize(new java.awt.Dimension(120, 40));
        inputVencimento.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputVencimento.setSelectionColor(new java.awt.Color(189, 147, 249));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(189, 147, 249));
        jLabel9.setText("Vencimento");

        inputValorParcela.setEditable(false);
        inputValorParcela.setBackground(new java.awt.Color(40, 42, 54));
        inputValorParcela.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputValorParcela.setForeground(new java.awt.Color(189, 147, 249));
        inputValorParcela.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputValorParcela.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputValorParcela.setMaximumSize(new java.awt.Dimension(120, 40));
        inputValorParcela.setMinimumSize(new java.awt.Dimension(120, 40));
        inputValorParcela.setPreferredSize(new java.awt.Dimension(120, 40));
        inputValorParcela.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputValorParcela.setSelectionColor(new java.awt.Color(189, 147, 249));
        inputValorParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorParcelaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(189, 147, 249));
        jLabel11.setText("Valor parcela R$");

        btnGerarFatura.setBackground(new java.awt.Color(40, 42, 54));
        btnGerarFatura.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnGerarFatura.setForeground(new java.awt.Color(189, 147, 249));
        btnGerarFatura.setText("GERAR FATURA");
        btnGerarFatura.setBorder(null);
        btnGerarFatura.setBorderPainted(false);
        btnGerarFatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerarFatura.setFocusPainted(false);
        btnGerarFatura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerarFatura.setMaximumSize(new java.awt.Dimension(120, 40));
        btnGerarFatura.setMinimumSize(new java.awt.Dimension(120, 40));
        btnGerarFatura.setPreferredSize(new java.awt.Dimension(120, 40));
        btnGerarFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarFaturaActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(40, 42, 54));
        btnCancelar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(189, 147, 249));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnCancelar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnCancelar.setOpaque(true);
        btnCancelar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        inputVeiculo.setEditable(false);
        inputVeiculo.setBackground(new java.awt.Color(40, 42, 54));
        inputVeiculo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputVeiculo.setForeground(new java.awt.Color(189, 147, 249));
        inputVeiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputVeiculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputVeiculo.setMaximumSize(new java.awt.Dimension(120, 50));
        inputVeiculo.setMinimumSize(new java.awt.Dimension(120, 50));
        inputVeiculo.setPreferredSize(new java.awt.Dimension(120, 40));
        inputVeiculo.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputVeiculo.setSelectionColor(new java.awt.Color(189, 147, 249));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(189, 147, 249));
        jLabel6.setText("Cliente");

        inputCliente.setEditable(false);
        inputCliente.setBackground(new java.awt.Color(40, 42, 54));
        inputCliente.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCliente.setForeground(new java.awt.Color(189, 147, 249));
        inputCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputCliente.setMaximumSize(new java.awt.Dimension(120, 50));
        inputCliente.setMinimumSize(new java.awt.Dimension(120, 50));
        inputCliente.setPreferredSize(new java.awt.Dimension(120, 40));
        inputCliente.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputCliente.setSelectionColor(new java.awt.Color(189, 147, 249));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(189, 147, 249));
        jLabel7.setText("Veículo");

        labelAvisosCadastros.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosCadastros.setForeground(new java.awt.Color(189, 147, 249));
        labelAvisosCadastros.setText(" ");
        labelAvisosCadastros.setToolTipText("");

        tabelaParcelas.setBackground(new java.awt.Color(40, 41, 66));
        tabelaParcelas.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaParcelas.setForeground(new java.awt.Color(189, 147, 249));
        tabelaParcelas.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "VALOR R$", "VENCIMENTO", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tabelaParcelas.setEnabled(false);
        tabelaParcelas.setFocusable(false);
        tabelaParcelas.setGridColor(new java.awt.Color(40, 41, 66));
        tabelaParcelas.setPreferredSize(new java.awt.Dimension(300, 300));
        tabelaParcelas.setRowSelectionAllowed(false);
        tabelaParcelas.setSelectionBackground(new java.awt.Color(189, 147, 249));
        tabelaParcelas.setSelectionForeground(new java.awt.Color(40, 41, 66));
        tabelaParcelas.setShowGrid(true);
        jScrollPane2.setViewportView(tabelaParcelas);

        labelParcelas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelParcelas.setForeground(new java.awt.Color(189, 147, 249));
        labelParcelas.setText("Parcelas");

        btnPagar.setBackground(new java.awt.Color(40, 42, 54));
        btnPagar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(189, 147, 249));
        btnPagar.setText("PAGAR");
        btnPagar.setBorder(null);
        btnPagar.setBorderPainted(false);
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.setFocusPainted(false);
        btnPagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPagar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnPagar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnPagar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        wave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fotor_2023-6-3_11_58_13.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)
                        .addGap(369, 369, 369)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(inputCodigoAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputValorAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(labelAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(btnGerarFatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(616, 616, 616)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(btnConfirmaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(906, 906, 906)
                        .addComponent(btnCancelarExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(870, 870, 870)
                        .addComponent(wave))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(labelAvisosCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(624, 624, 624)
                        .addComponent(labelAvisosExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(inputVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(754, 754, 754)
                        .addComponent(inputCodigoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(inputValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(inputCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnConsultarAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel6))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputCodigoAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputValorAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnGerarFatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(inputVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(labelParcelas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnCancelarExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel7))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(wave)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel8))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(525, 525, 525)
                .addComponent(labelAvisosExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(inputVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(472, 472, 472)
                .addComponent(inputCodigoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel9))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(inputCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btnConsultarAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel11))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(inputValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labelAvisosCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        clear();
        estadoIncial();
        if (!controller.listaVazia()) {
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGerarFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarFaturaActionPerformed
        btnGerarFatura.setEnabled(false);
        btnConsultarAluguel.setEnabled(false);
        inputCodigoAluguel.setEditable(false);

        inputParcelas.setEnabled(true);
      
    }//GEN-LAST:event_btnGerarFaturaActionPerformed

    private void inputValorParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValorParcelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorParcelaActionPerformed

    private void btnConsultarAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAluguelActionPerformed
        String codAluguel = inputCodigoAluguel.getText().trim();
        if (!codAluguel.isEmpty()) {
            labelAvisos.setText("");
            try {
                int codigo = Integer.parseInt(codAluguel);
                aluguel = baseDeDados.buscarAluguelPorCodigo(codigo);
                if (aluguel != null) {
                    labelAvisos.setText("");

                    double valor = aluguel.getValorTotal();
                    inputValorAluguel.setText(decimalFormat.format(valor));
                    btnGerarFatura.setEnabled(true);

                } else {

                    labelAvisos.setText("Aluguel não encontrado");
                }
            } catch (NumberFormatException ex) {

                labelAvisos.setText("Informe um aluguel válido");
            }
        } else {

            labelAvisos.setText("Informe um aluguel válido");
        }
    }//GEN-LAST:event_btnConsultarAluguelActionPerformed

    private void btnCancelarExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarExcluirActionPerformed
        estadoIncial();
        clear();
        if (!controller.listaVazia()) {
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btnCancelarExcluirActionPerformed

    private void btnConfirmaExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaExcluirActionPerformed
        String codigo = inputCodigoExcluir.getText().trim();
        if (!codigo.isEmpty()) {
            Pagamento pg = controller.buscarPorCodigo(codigo);
            if (pg != null) {
                int confirma = JOptionPane.showConfirmDialog(this, "Confirma exclusão: (" + pg.getCodigo() + ")",
                    "Confirme a exclusão", JOptionPane.OK_CANCEL_OPTION);
                if (confirma == JOptionPane.OK_OPTION) {
                    controller.excluir(pg);
                    pagamentos = controller.getPagamentos();
                    atualizarTabela(pagamentos);
                    estadoIncial();
                    clear();
                    if (!controller.listaVazia()) {
                        btnExcluir.setEnabled(true);
                    }
                } else {
                    estadoIncial();
                    clear();
                    if (!controller.listaVazia()) {
                        btnExcluir.setEnabled(true);
                    }
                }
            } else {
                labelAvisosExcluir.setText("Informe um código válido");
            }
        } else {
            labelAvisosExcluir.setText("Informe um código válido");
        }
    }//GEN-LAST:event_btnConfirmaExcluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        estadoIncial();
        clear();

        inputCodigoExcluir.setVisible(true);
        inputCodigoExcluir.setText("");
        btnCancelarExcluir.setVisible(true);
        btnConfirmaExcluir.setVisible(true);
        labelAvisosExcluir.setText("Informe o código do pagamento");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        switch (qtdeParcelas) {
            case 1:
            int codigo = (aluguel.getCodigo() * 2);
            String codigoParcela = "#" + String.valueOf(codigo);

            double valor = aluguel.getValorTotal();
            LocalDate vencimento = aluguel.getDataDevolucao();
            Parcela parcela = new Parcela(codigoParcela, valor, vencimento);
            ArrayList<Parcela> parcelas = new ArrayList<>();
            parcelas.add(parcela);
            Pagamento pagamento = new Pagamento(codigoParcela, valor, parcelas, aluguel);

            boolean pagamentoExistente = verificarExistente(pagamento);
            if (pagamentoExistente) {
                labelAvisos.setText("Pagamento já cadastrado");
                btnCancelar.setEnabled(true);
                return;
            }

            controller.cadastrar(pagamento);
            pagamentos = controller.getPagamentos();
            atualizarTabela(pagamentos);
            estadoIncial();
            clear();
            btnExcluir.setEnabled(true);
            break;

            case 3:
            int codigoP = (aluguel.getCodigo() * 14);
            String codigoParcelado = "#" + String.valueOf(codigoP);
            int cod1 = (aluguel.getCodigo() * 3);
            int cod2 = (aluguel.getCodigo() * 5);
            int cod3 = (aluguel.getCodigo() * 9);
            String codigoParcela1 = "#" + String.valueOf(cod1);
            String codigoParcela2 = "#" + String.valueOf(cod2);
            String codigoParcela3 = "#" + String.valueOf(cod3);
            double valorTotal = aluguel.getValorTotal() / 3;
            double valor1 = valorTotal;
            double valor2 = valorTotal;
            double valor3 = valorTotal;
            LocalDate dataVencimento1 = aluguel.getDataDevolucao().plusMonths(1);
            LocalDate dataVencimento2 = dataVencimento1.plusMonths(1);
            LocalDate dataVencimento3 = dataVencimento2.plusMonths(1);

            Parcela parcela1 = new Parcela(codigoParcela1, valor1, dataVencimento1);
            Parcela parcela2 = new Parcela(codigoParcela2, valor2, dataVencimento2);
            Parcela parcela3 = new Parcela(codigoParcela3, valor3, dataVencimento3);

            ArrayList<Parcela> parcelas1 = new ArrayList<>();
            parcelas1.add(parcela1);
            parcelas1.add(parcela2);
            parcelas1.add(parcela3);

            Pagamento pagamentoParcelado = new Pagamento(codigoParcelado, valorTotal, parcelas1, aluguel);

            boolean pagamentoParceladoExistente = verificarExistente(pagamentoParcelado);
            if (pagamentoParceladoExistente) {
                labelAvisos.setText("Pagamento já cadastrado");
                return;
            }

            controller.cadastrar(pagamentoParcelado);
            pagamentos = controller.getPagamentos();
            atualizarTabela(pagamentos);
            estadoIncial();
            clear();
            btnExcluir.setEnabled(true);
            break;
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagarActionPerformed


    public void estadoIncial() {

        inputCodigoAluguel.setEditable(true);
        btnConsultarAluguel.setEnabled(true);

        btnGerarFatura.setEnabled(false);
        inputValorAluguel.setEditable(false);

        btnExcluir.setEnabled(false);
        btnConfirmaExcluir.setVisible(false);
        btnCancelarExcluir.setVisible(false);
        btnCadastrar.setEnabled(false);
        inputCodigoExcluir.setVisible(false);

        inputParcelas.setEnabled(false);
      

        inputVencimento.setEditable(false);
        inputValorParcela.setEditable(false);

        
        btnCancelar.setEnabled(false);

    }

    public void clear() {
        inputCodigoAluguel.setText("");
        inputCodigoExcluir.setText("");
        inputValorAluguel.setText("");

        inputParcelas.clearSelection();

        inputVencimento.setText("");
        inputValorParcela.setText("");
       
        labelAvisos.setText("");
       
        labelAvisosExcluir.setText("");
    }

    private boolean verificarExistente(Pagamento pagamento) {
        Iterator<Pagamento> iterator = pagamentos.iterator();
        while (iterator.hasNext()) {
            Pagamento p = iterator.next();
            if (p.getCodigo().equals(pagamento.getCodigo())) {
                return true;
            }
        }
        return false;
    }

    public void atualizarTabela(ArrayList<Pagamento> pagamentos) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("CÓDIGO");
        model.addColumn("ALUGUEL");
        model.addColumn("VALOR R$");
        model.addColumn("PARCELAS");
        Iterator<Pagamento> it = pagamentos.iterator();
        while (it.hasNext()) {
            Pagamento p = it.next();
            int codigo = p.getAluguel().getCodigo();
            Object[] row = {
                p.getCodigo(),
                codigo,
                p.getValorTotal(),
                p.getParcelas().size()
            };
            model.addRow(row);
        }
        tabelaAgencias.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarExcluir;
    private javax.swing.JButton btnConfirmaExcluir;
    private javax.swing.JButton btnConsultarAluguel;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGerarFatura;
    private javax.swing.JButton btnPagar;
    private javax.swing.JTextField inputCliente;
    private javax.swing.JTextField inputCodigoAluguel;
    private javax.swing.JTextField inputCodigoExcluir;
    private javax.swing.JList<String> inputParcelas;
    private javax.swing.JTextField inputValorAluguel;
    private javax.swing.JTextField inputValorParcela;
    private javax.swing.JTextField inputVeiculo;
    private javax.swing.JFormattedTextField inputVencimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelAvisosCadastros;
    private javax.swing.JLabel labelAvisosExcluir;
    private javax.swing.JLabel labelParcelas;
    private javax.swing.JTable tabelaAgencias;
    private javax.swing.JTable tabelaParcelas;
    private javax.swing.JLabel wave;
    // End of variables declaration//GEN-END:variables
}
