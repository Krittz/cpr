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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(inputCodigoAluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 108, 295, 45));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 160, 594, 304));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 31, 79));
        jLabel1.setText("PAGAMENTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("CÓDIGO ALUGUEL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 85, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 542, -1, -1));

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
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 562, -1, -1));

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
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 486, -1, -1));

        labelAvisos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisos.setText(" ");
        labelAvisos.setToolTipText("");
        jPanel1.add(labelAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 458, 30));

        inputCodigoExcluir.setBackground(new java.awt.Color(18, 20, 31));
        inputCodigoExcluir.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCodigoExcluir.setForeground(new java.awt.Color(218, 31, 79));
        inputCodigoExcluir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCodigoExcluir.setBorder(null);
        inputCodigoExcluir.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCodigoExcluir.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputCodigoExcluir.setSelectionColor(new java.awt.Color(218, 31, 79));
        jPanel1.add(inputCodigoExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 482, 140, -1));

        labelAvisosExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosExcluir.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisosExcluir.setText(" ");
        labelAvisosExcluir.setToolTipText("");
        jPanel1.add(labelAvisosExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 548, 270, 45));

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
        jPanel1.add(btnConfirmaExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 486, -1, -1));

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
        jPanel1.add(btnCancelarExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 490, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Black White and Red Modern Automotive Logo.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 198, 116));

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
        jPanel1.add(btnConsultarAluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 109, -1, -1));

        inputValorAluguel.setEditable(false);
        inputValorAluguel.setBackground(new java.awt.Color(18, 20, 31));
        inputValorAluguel.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputValorAluguel.setForeground(new java.awt.Color(218, 31, 79));
        inputValorAluguel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputValorAluguel.setBorder(null);
        inputValorAluguel.setPreferredSize(new java.awt.Dimension(260, 50));
        inputValorAluguel.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputValorAluguel.setSelectionColor(new java.awt.Color(218, 31, 79));
        jPanel1.add(inputValorAluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 195, 122, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("VALOR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 172, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("PARCELAS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 298, 78, -1));

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

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 321, 104, 45));

        inputVencimento.setBackground(new java.awt.Color(18, 20, 31));
        inputVencimento.setBorder(null);
        inputVencimento.setForeground(new java.awt.Color(218, 31, 79));
        inputVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        inputVencimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputVencimento.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputVencimento.setPreferredSize(new java.awt.Dimension(102, 50));
        inputVencimento.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputVencimento.setSelectionColor(new java.awt.Color(218, 31, 79));
        jPanel1.add(inputVencimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 401, 108, 56));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("VENCIMENTO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 378, -1, -1));

        inputValorParcela.setEditable(false);
        inputValorParcela.setBackground(new java.awt.Color(18, 20, 31));
        inputValorParcela.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputValorParcela.setForeground(new java.awt.Color(218, 31, 79));
        inputValorParcela.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputValorParcela.setBorder(null);
        inputValorParcela.setPreferredSize(new java.awt.Dimension(260, 50));
        inputValorParcela.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputValorParcela.setSelectionColor(new java.awt.Color(218, 31, 79));
        jPanel1.add(inputValorParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 401, 154, 56));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("VALOR DA PARCELA R$");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 378, -1, -1));

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
        jPanel1.add(btnGerarFatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 196, -1, 50));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(218, 31, 79));
        jLabel2.setText("DADOS DA FATURA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 264, -1, -1));

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
        jPanel1.add(btnParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 321, 50, -1));

        inputCodigoPagamento.setBackground(new java.awt.Color(18, 20, 31));
        inputCodigoPagamento.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCodigoPagamento.setForeground(new java.awt.Color(218, 31, 79));
        inputCodigoPagamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCodigoPagamento.setBorder(null);
        inputCodigoPagamento.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCodigoPagamento.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputCodigoPagamento.setSelectionColor(new java.awt.Color(218, 31, 79));
        jPanel1.add(inputCodigoPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 498, -1, 45));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("CÓDIGO PAGAMENTO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 475, -1, -1));

        labelAvisosAluguel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosAluguel.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisosAluguel.setText(" ");
        jPanel1.add(labelAvisosAluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 123, -1, -1));

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
        jPanel1.add(btnGerarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 499, 55, -1));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, -1, -1));

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

    }//GEN-LAST:event_btnCancelarExcluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

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

                boolean pagamentoExistente = verificarPagamentoExistente(pagamento);
                if (pagamentoExistente) {
                    labelAvisos.setText("Pagamento já cadastrado");
                    btnCancelar.setEnabled(true);
                    btnCadastrar.setEnabled(false);
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

                // Verificar se o pagamento já está cadastrado
                boolean pagamentoParceladoExistente = verificarPagamentoExistente(pagamentoParcelado);
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

    }//GEN-LAST:event_btnConfirmaExcluirActionPerformed

    private void btnGerarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarCodigoActionPerformed
        btnParcelas.setEnabled(false);
        String codAluguel = inputCodigoAluguel.getText().trim();

        try {
            int codAl = Integer.parseInt(codAluguel);
            int codP = (codAl * 7);
            String codigoPagamento = "#" + String.valueOf(codP);

            // Verificar se o código do pagamento já existe
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

    private boolean verificarPagamentoExistente(Pagamento pagamento) {
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
