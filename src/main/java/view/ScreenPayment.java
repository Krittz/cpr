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
        jLabel6 = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
        btnParcelas = new javax.swing.JButton();
        inputCodigoPagamento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        labelAvisosAluguel = new javax.swing.JLabel();
        btnGerarCodigo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

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

        jPanel1.setBackground(new java.awt.Color(9, 13, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 680));

        inputCodigoAluguel.setBackground(new java.awt.Color(18, 20, 31));
        inputCodigoAluguel.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCodigoAluguel.setForeground(new java.awt.Color(218, 31, 79));
        inputCodigoAluguel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCodigoAluguel.setBorder(null);
        inputCodigoAluguel.setMaximumSize(new java.awt.Dimension(260, 50));
        inputCodigoAluguel.setMinimumSize(new java.awt.Dimension(260, 50));
        inputCodigoAluguel.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCodigoAluguel.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputCodigoAluguel.setSelectionColor(new java.awt.Color(218, 31, 79));

        tabelaAgencias.setBackground(new java.awt.Color(18, 20, 31));
        tabelaAgencias.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaAgencias.setForeground(new java.awt.Color(218, 31, 79));
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
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
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

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 31, 79));
        jLabel1.setText("PAGAMENTOS");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("CÓDIGO ALUGUEL");

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));

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

        labelAvisos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisos.setText(" ");
        labelAvisos.setToolTipText("");

        inputCodigoExcluir.setBackground(new java.awt.Color(18, 20, 31));
        inputCodigoExcluir.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCodigoExcluir.setForeground(new java.awt.Color(218, 31, 79));
        inputCodigoExcluir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCodigoExcluir.setBorder(null);
        inputCodigoExcluir.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCodigoExcluir.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputCodigoExcluir.setSelectionColor(new java.awt.Color(218, 31, 79));

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

        btnConsultarAluguel.setBackground(new java.awt.Color(218, 31, 79));
        btnConsultarAluguel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnConsultarAluguel.setForeground(new java.awt.Color(9, 13, 25));
        btnConsultarAluguel.setText("BUSCAR");
        btnConsultarAluguel.setBorder(null);
        btnConsultarAluguel.setBorderPainted(false);
        btnConsultarAluguel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarAluguel.setFocusPainted(false);
        btnConsultarAluguel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarAluguel.setMaximumSize(new java.awt.Dimension(110, 45));
        btnConsultarAluguel.setMinimumSize(new java.awt.Dimension(110, 45));
        btnConsultarAluguel.setPreferredSize(new java.awt.Dimension(110, 45));
        btnConsultarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAluguelActionPerformed(evt);
            }
        });

        inputValorAluguel.setEditable(false);
        inputValorAluguel.setBackground(new java.awt.Color(18, 20, 31));
        inputValorAluguel.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputValorAluguel.setForeground(new java.awt.Color(218, 31, 79));
        inputValorAluguel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputValorAluguel.setBorder(null);
        inputValorAluguel.setPreferredSize(new java.awt.Dimension(260, 50));
        inputValorAluguel.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputValorAluguel.setSelectionColor(new java.awt.Color(218, 31, 79));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("VALOR");

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("PARCELAS");

        inputParcelas.setBackground(new java.awt.Color(18, 20, 31));
        inputParcelas.setBorder(null);
        inputParcelas.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        inputParcelas.setForeground(new java.awt.Color(218, 31, 79));
        inputParcelas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        inputParcelas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        inputParcelas.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        inputParcelas.setPreferredSize(new java.awt.Dimension(72, 50));
        inputParcelas.setSelectionBackground(new java.awt.Color(218, 31, 79));
        inputParcelas.setSelectionForeground(new java.awt.Color(18, 20, 31));
        jScrollPane3.setViewportView(inputParcelas);

        inputVencimento.setBackground(new java.awt.Color(18, 20, 31));
        inputVencimento.setBorder(null);
        inputVencimento.setForeground(new java.awt.Color(218, 31, 79));
        inputVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        inputVencimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputVencimento.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputVencimento.setPreferredSize(new java.awt.Dimension(102, 50));
        inputVencimento.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputVencimento.setSelectionColor(new java.awt.Color(218, 31, 79));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("VENCIMENTO");

        inputValorParcela.setEditable(false);
        inputValorParcela.setBackground(new java.awt.Color(18, 20, 31));
        inputValorParcela.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputValorParcela.setForeground(new java.awt.Color(218, 31, 79));
        inputValorParcela.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputValorParcela.setBorder(null);
        inputValorParcela.setPreferredSize(new java.awt.Dimension(260, 50));
        inputValorParcela.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputValorParcela.setSelectionColor(new java.awt.Color(218, 31, 79));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("VALOR DA PARCELA R$");

        btnGerarFatura.setBackground(new java.awt.Color(218, 31, 79));
        btnGerarFatura.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnGerarFatura.setForeground(new java.awt.Color(9, 13, 25));
        btnGerarFatura.setText("GERAR FATURA");
        btnGerarFatura.setBorder(null);
        btnGerarFatura.setBorderPainted(false);
        btnGerarFatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerarFatura.setFocusPainted(false);
        btnGerarFatura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerarFatura.setMaximumSize(new java.awt.Dimension(110, 45));
        btnGerarFatura.setMinimumSize(new java.awt.Dimension(110, 45));
        btnGerarFatura.setPreferredSize(new java.awt.Dimension(110, 45));
        btnGerarFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarFaturaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(218, 31, 79));
        jLabel2.setText("DADOS DA FATURA");

        btnParcelas.setBackground(new java.awt.Color(218, 31, 79));
        btnParcelas.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnParcelas.setForeground(new java.awt.Color(9, 13, 25));
        btnParcelas.setText("OK");
        btnParcelas.setBorder(null);
        btnParcelas.setBorderPainted(false);
        btnParcelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParcelas.setFocusPainted(false);
        btnParcelas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnParcelas.setMaximumSize(new java.awt.Dimension(110, 45));
        btnParcelas.setMinimumSize(new java.awt.Dimension(110, 45));
        btnParcelas.setPreferredSize(new java.awt.Dimension(110, 45));
        btnParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParcelasActionPerformed(evt);
            }
        });

        inputCodigoPagamento.setBackground(new java.awt.Color(18, 20, 31));
        inputCodigoPagamento.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCodigoPagamento.setForeground(new java.awt.Color(218, 31, 79));
        inputCodigoPagamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCodigoPagamento.setBorder(null);
        inputCodigoPagamento.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCodigoPagamento.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputCodigoPagamento.setSelectionColor(new java.awt.Color(218, 31, 79));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("CÓDIGO PAGAMENTO");

        labelAvisosAluguel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosAluguel.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisosAluguel.setText(" ");

        btnGerarCodigo.setBackground(new java.awt.Color(218, 31, 79));
        btnGerarCodigo.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnGerarCodigo.setForeground(new java.awt.Color(9, 13, 25));
        btnGerarCodigo.setText("GERAR");
        btnGerarCodigo.setBorder(null);
        btnGerarCodigo.setBorderPainted(false);
        btnGerarCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerarCodigo.setFocusPainted(false);
        btnGerarCodigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerarCodigo.setMaximumSize(new java.awt.Dimension(110, 45));
        btnGerarCodigo.setMinimumSize(new java.awt.Dimension(110, 45));
        btnGerarCodigo.setPreferredSize(new java.awt.Dimension(110, 45));
        btnGerarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarCodigoActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(9, 13, 25));
        btnCancelar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(218, 31, 79));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setMaximumSize(new java.awt.Dimension(110, 45));
        btnCancelar.setMinimumSize(new java.awt.Dimension(110, 45));
        btnCancelar.setOpaque(true);
        btnCancelar.setPreferredSize(new java.awt.Dimension(110, 45));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(inputCodigoAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnConsultarAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelAvisosAluguel)))
                        .addGap(375, 375, 375)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(inputValorAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnGerarFatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))))
                        .addGap(338, 338, 338)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(inputCodigoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(btnGerarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel5)
                        .addGap(165, 165, 165)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputCodigoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnConfirmaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(388, 388, 388)
                        .addComponent(labelAvisosExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(inputCodigoAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultarAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(labelAvisosAluguel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputValorAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnGerarFatura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(inputCodigoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnGerarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(inputCodigoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConfirmaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelAvisosExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(labelAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnCancelarExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarExcluirActionPerformed
        estadoIncial();
        clear();
        if (!controller.listaVazia()) {
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btnCancelarExcluirActionPerformed

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

    private void btnConsultarAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAluguelActionPerformed
        String codAluguel = inputCodigoAluguel.getText().trim();
        if (!codAluguel.isEmpty()) {
            labelAvisos.setText("");
            try {
                int codigo = Integer.parseInt(codAluguel);
                aluguel = baseDeDados.buscarAluguelPorCodigo(codigo);
                if (aluguel != null) {
                    labelAvisos.setText("");
                    labelAvisosAluguel.setText("OK");

                    double valor = aluguel.getValorTotal();
                    inputValorAluguel.setText(decimalFormat.format(valor));
                    btnGerarFatura.setEnabled(true);

                } else {
                    labelAvisosAluguel.setText("");
                    labelAvisos.setText("Aluguel não encontrado");
                }
            } catch (NumberFormatException ex) {
                labelAvisosAluguel.setText("");
                labelAvisos.setText("Informe um aluguel válido");
            }
        } else {
            labelAvisosAluguel.setText("");
            labelAvisos.setText("Informe um aluguel válido");
        }
    }//GEN-LAST:event_btnConsultarAluguelActionPerformed


    private void btnParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParcelasActionPerformed
        String parcelaSelecionada = inputParcelas.getSelectedValue();
        if (parcelaSelecionada != null) {

            btnGerarCodigo.setEnabled(false);

            switch (parcelaSelecionada) {
                case "1":
                    qtdeParcelas = 1;
                    LocalDate data = aluguel.getDataDevolucao();
                    String dataFormatada = formatter.format(data);
                    inputVencimento.setText(dataFormatada);

                    double valor = aluguel.getValorTotal();
                    inputValorParcela.setText(decimalFormat.format(valor));
                    btnGerarCodigo.setEnabled(true);

                    break;
                case "3":
                    qtdeParcelas = 3;
                    LocalDate dataDev = aluguel.getDataDevolucao();
                    LocalDate novaData = dataDev.plusMonths(1);
                    String novaDataFormatada = formatter.format(novaData);
                    inputVencimento.setText(novaDataFormatada);

                    double valorParcela = aluguel.getValorTotal() / 3.0;
                    inputValorParcela.setText(decimalFormat.format(valorParcela));
                    btnGerarCodigo.setEnabled(true);
                    break;
                default:
                    btnGerarCodigo.setEnabled(false);
                    labelAvisos.setText("Escolha a quantidade de parcelas");
            }
        } else {
            labelAvisos.setText("Escolha a quantidade de parcelas");

        }
    }//GEN-LAST:event_btnParcelasActionPerformed

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

    private void btnGerarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarCodigoActionPerformed
        btnParcelas.setEnabled(false);
        String codAluguel = inputCodigoAluguel.getText().trim();

        try {
            int codAl = Integer.parseInt(codAluguel);
            int codP = (codAl * 7);
            String codigoPagamento = "#" + String.valueOf(codP);

            boolean codigoExistente = verificarCodigoExistente(codigoPagamento);
            if (codigoExistente) {
                labelAvisos.setText("Código já existente");
                return;
            }

            inputCodigoPagamento.setText(codigoPagamento);
            btnGerarCodigo.setEnabled(false);
            btnCadastrar.setEnabled(true);
        } catch (NumberFormatException ex) {
            labelAvisos.setText("Erro ao gerar código");
        }
    }

    private boolean verificarCodigoExistente(String codigo) {
        Iterator<Pagamento> iterator = pagamentos.iterator();
        while (iterator.hasNext()) {
            Pagamento p = iterator.next();
            if (p.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }//GEN-LAST:event_btnGerarCodigoActionPerformed

    private void btnGerarFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarFaturaActionPerformed
        btnGerarFatura.setEnabled(false);
        btnConsultarAluguel.setEnabled(false);
        inputCodigoAluguel.setEditable(false);

        inputParcelas.setEnabled(true);
        btnParcelas.setEnabled(true);
    }//GEN-LAST:event_btnGerarFaturaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        clear();
        estadoIncial();
        if (!controller.listaVazia()) {
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

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
        btnParcelas.setEnabled(false);

        inputVencimento.setEditable(false);
        inputValorParcela.setEditable(false);

        inputCodigoPagamento.setEditable(false);
        btnGerarCodigo.setEnabled(false);
        btnCancelar.setEnabled(false);

    }

    public void clear() {
        inputCodigoAluguel.setText("");
        inputCodigoExcluir.setText("");
        inputValorAluguel.setText("");

        inputParcelas.clearSelection();

        inputVencimento.setText("");
        inputValorParcela.setText("");
        inputCodigoPagamento.setText("");

        labelAvisos.setText("");
        labelAvisosAluguel.setText("");
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
    private javax.swing.JButton btnGerarCodigo;
    private javax.swing.JButton btnGerarFatura;
    private javax.swing.JButton btnParcelas;
    private javax.swing.JTextField inputCodigoAluguel;
    private javax.swing.JTextField inputCodigoExcluir;
    private javax.swing.JTextField inputCodigoPagamento;
    private javax.swing.JList<String> inputParcelas;
    private javax.swing.JTextField inputValorAluguel;
    private javax.swing.JTextField inputValorParcela;
    private javax.swing.JFormattedTextField inputVencimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelAvisosAluguel;
    private javax.swing.JLabel labelAvisosExcluir;
    private javax.swing.JTable tabelaAgencias;
    // End of variables declaration//GEN-END:variables
}
