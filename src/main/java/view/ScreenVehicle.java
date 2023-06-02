package view;

import controller.BaseDeDados;
import model.Veiculo;
import controller.VeiculoController;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crist
 */
public class ScreenVehicle extends javax.swing.JInternalFrame {

    private ArrayList<Veiculo> veiculos;
    private final VeiculoController controller;
    private BaseDeDados baseDeDados;

    public ScreenVehicle(BaseDeDados baseDeDados) {
        initComponents();
        veiculos = new ArrayList<Veiculo>();
        controller = new VeiculoController(veiculos);
        this.baseDeDados = baseDeDados;
        estadoInicial();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        inputPlaca = new javax.swing.JTextField();
        inputMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVeiculos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        inputModelo = new javax.swing.JTextField();
        labelAvisos = new javax.swing.JLabel();
        inputDiaria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        inputPlacaExcluir = new javax.swing.JTextField();
        btnConfirmaExcluir = new javax.swing.JButton();
        btnCancelarExcluir = new javax.swing.JButton();
        labelAvisosExcluir = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnDisponivelTrue = new javax.swing.JCheckBox();
        btnDisponivelFalse = new javax.swing.JCheckBox();
        inputAno = new javax.swing.JFormattedTextField();

        setBorder(null);
        setClosable(true);
        setTitle("VEICULOS");
        setMaximumSize(new java.awt.Dimension(1280, 680));
        setMinimumSize(new java.awt.Dimension(1280, 680));
        setPreferredSize(new java.awt.Dimension(1280, 680));

        jPanel1.setBackground(new java.awt.Color(9, 13, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 680));

        inputPlaca.setBackground(new java.awt.Color(18, 20, 31));
        inputPlaca.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputPlaca.setForeground(new java.awt.Color(218, 31, 79));
        inputPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputPlaca.setBorder(null);
        inputPlaca.setPreferredSize(new java.awt.Dimension(260, 50));
        inputPlaca.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputPlaca.setSelectionColor(new java.awt.Color(218, 31, 79));

        inputMarca.setBackground(new java.awt.Color(18, 20, 31));
        inputMarca.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputMarca.setForeground(new java.awt.Color(218, 31, 79));
        inputMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputMarca.setBorder(null);
        inputMarca.setPreferredSize(new java.awt.Dimension(260, 50));
        inputMarca.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputMarca.setSelectionColor(new java.awt.Color(218, 31, 79));

        tabelaVeiculos.setBackground(new java.awt.Color(18, 20, 31));
        tabelaVeiculos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaVeiculos.setForeground(new java.awt.Color(218, 31, 79));
        tabelaVeiculos.setModel(new javax.swing.table.DefaultTableModel(
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
                "PLACA", "MARCA", "MODELO", "ANO", "DIÁRIA", "DISPONÍVEL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVeiculos.setEnabled(false);
        tabelaVeiculos.setFocusable(false);
        tabelaVeiculos.setGridColor(new java.awt.Color(18, 20, 31));
        tabelaVeiculos.setPreferredSize(new java.awt.Dimension(300, 300));
        tabelaVeiculos.setRowSelectionAllowed(false);
        tabelaVeiculos.setSelectionBackground(new java.awt.Color(218, 31, 79));
        tabelaVeiculos.setSelectionForeground(new java.awt.Color(18, 20, 31));
        tabelaVeiculos.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaVeiculos);

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 31, 79));
        jLabel1.setText("VEÍCULOS");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("PLACA");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("ANO (xxxx/xxxx)");

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("MODELO");

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("MARCA");

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

        btnEditar.setBackground(new java.awt.Color(18, 20, 31));
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

        inputModelo.setBackground(new java.awt.Color(18, 20, 31));
        inputModelo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputModelo.setForeground(new java.awt.Color(218, 31, 79));
        inputModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputModelo.setBorder(null);
        inputModelo.setPreferredSize(new java.awt.Dimension(260, 50));
        inputModelo.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputModelo.setSelectionColor(new java.awt.Color(218, 31, 79));

        labelAvisos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisos.setText(" ");

        inputDiaria.setBackground(new java.awt.Color(18, 20, 31));
        inputDiaria.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputDiaria.setForeground(new java.awt.Color(218, 31, 79));
        inputDiaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputDiaria.setBorder(null);
        inputDiaria.setPreferredSize(new java.awt.Dimension(260, 50));
        inputDiaria.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputDiaria.setSelectionColor(new java.awt.Color(218, 31, 79));
        inputDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDiariaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("DIÁRIA R$: ");

        btnSalvar.setBackground(new java.awt.Color(18, 20, 31));
        btnSalvar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(218, 31, 79));
        btnSalvar.setText("SALVAR");
        btnSalvar.setBorder(null);
        btnSalvar.setBorderPainted(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setMaximumSize(new java.awt.Dimension(110, 45));
        btnSalvar.setMinimumSize(new java.awt.Dimension(110, 45));
        btnSalvar.setOpaque(true);
        btnSalvar.setPreferredSize(new java.awt.Dimension(110, 45));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        inputPlacaExcluir.setBackground(new java.awt.Color(18, 20, 31));
        inputPlacaExcluir.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputPlacaExcluir.setForeground(new java.awt.Color(218, 31, 79));
        inputPlacaExcluir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputPlacaExcluir.setBorder(null);
        inputPlacaExcluir.setPreferredSize(new java.awt.Dimension(260, 50));
        inputPlacaExcluir.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputPlacaExcluir.setSelectionColor(new java.awt.Color(218, 31, 79));

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

        labelAvisosExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosExcluir.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisosExcluir.setText(" ");
        labelAvisosExcluir.setToolTipText("");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Black White and Red Modern Automotive Logo.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("DISPONÍVEL");

        btnGroup.add(btnDisponivelTrue);
        btnDisponivelTrue.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnDisponivelTrue.setForeground(new java.awt.Color(218, 31, 79));
        btnDisponivelTrue.setText("SIM");
        btnDisponivelTrue.setBorder(null);

        btnGroup.add(btnDisponivelFalse);
        btnDisponivelFalse.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnDisponivelFalse.setForeground(new java.awt.Color(218, 31, 79));
        btnDisponivelFalse.setText("NÃO");
        btnDisponivelFalse.setBorder(null);

        inputAno.setBackground(new java.awt.Color(18, 20, 31));
        inputAno.setBorder(null);
        inputAno.setForeground(new java.awt.Color(218, 31, 79));
        try {
            inputAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputAno.setText("");
        inputAno.setCaretColor(new java.awt.Color(218, 31, 79));
        inputAno.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputAno.setMaximumSize(new java.awt.Dimension(260, 50));
        inputAno.setMinimumSize(new java.awt.Dimension(260, 50));
        inputAno.setPreferredSize(new java.awt.Dimension(260, 50));
        inputAno.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputAno.setSelectionColor(new java.awt.Color(218, 31, 79));
        inputAno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputAnoFocusLost(evt);
            }
        });
        inputAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(inputDiaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inputMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inputPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(inputModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnDisponivelTrue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDisponivelFalse))
                                    .addComponent(inputAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelAvisos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAvisosExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(inputPlacaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnConfirmaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancelarExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(inputPlacaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnConfirmaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCancelarExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelAvisos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelAvisosExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDisponivelTrue)
                            .addComponent(btnDisponivelFalse))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAnoActionPerformed

    private void inputAnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputAnoFocusLost
    }//GEN-LAST:event_inputAnoFocusLost

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCadastrarActionPerformed
        String placa = inputPlaca.getText().trim();
        String ano = inputAno.getText().trim();
        String marca = inputMarca.getText().trim();
        String modelo = inputModelo.getText().trim();
        String diaria = inputDiaria.getText().trim();
        boolean disponivel = false;
        if (btnDisponivelTrue.isSelected()) {
            disponivel = true;
        } else if (btnDisponivelFalse.isSelected()) {
            disponivel = false;
        }

        if (!placa.isEmpty() && !ano.isEmpty() && !marca.isEmpty() && !modelo.isEmpty() && !diaria.isEmpty()) {
            double diariaDouble = Double.parseDouble(diaria);
            Veiculo veiculo = new Veiculo(placa, marca, modelo, ano, diariaDouble, disponivel);
            veiculos = controller.getVeiculos();

            boolean placaJaCadastrada = false;
            Iterator<Veiculo> iterator = veiculos.iterator();

            while (iterator.hasNext()) {
                Veiculo v = iterator.next();
                if (v.getPlaca().equals(placa)) {
                    placaJaCadastrada = true;
                    break;
                }
            }
            if (placaJaCadastrada) {
                labelAvisos.setText("Placa já cadastrada!");
            } else {
                controller.cadastrar(veiculo);
                veiculos = controller.getVeiculos();
                atualizarTabela(veiculos);
                clear();
                btnExcluir.setEnabled(true);
                btnEditar.setEnabled(true);
                baseDeDados.atualizarVeiculos(veiculos);
            }
        } else {
            labelAvisos.setText("Preencha todos os campos");
        }

    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEditarActionPerformed
        String placa = JOptionPane.showInputDialog(this, "Informe a placa do veiculo");
        if (!placa.isBlank()) {
            btnCadastrar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            Veiculo veiculo = controller.buscarPorPlaca(placa);
            inputPlaca.setText(veiculo.getPlaca());

            inputPlaca.setEditable(false);

            inputAno.setText(veiculo.getAno());
            inputMarca.setText(veiculo.getMarca());
            inputDiaria.setText(String.valueOf(veiculo.getDiaria()));
            inputModelo.setText(veiculo.getModelo());
            if (veiculo.getDisponivel() == true) {
                btnDisponivelTrue.setSelected(true);
            } else {
                btnDisponivelFalse.setSelected(true);
            }

            btnSalvar.setVisible(true);

            btnSalvar.addActionListener((ActionEvent evt1) -> {
                String marca = inputMarca.getText().trim();
                String modelo = inputModelo.getText().trim();
                String ano = inputAno.getText().trim();
                String diaria = inputDiaria.getText().trim();
                boolean disponivel = false;
                if (btnDisponivelTrue.isSelected()) {
                    disponivel = true;
                } else if (btnDisponivelFalse.isSelected()) {
                    disponivel = false;
                }
                if (!marca.isEmpty() && !modelo.isEmpty() && !ano.isEmpty() && !diaria.isEmpty()) {
                    labelAvisos.setText("");
                    double diariaDouble = Double.parseDouble(diaria);
                    controller.editar(placa, marca, modelo, ano, diariaDouble, disponivel);
                    clear();
                    veiculos = controller.getVeiculos();
                    atualizarTabela(veiculos);

                    btnSalvar.setVisible(false);
                    btnCadastrar.setEnabled(true);
                    baseDeDados.atualizarVeiculos(veiculos);
                    habilitarCampos(true);
                    if (!controller.listaVazia()) {
                        btnEditar.setEnabled(true);
                        btnExcluir.setEnabled(true);
                        labelAvisos.setText("");
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

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcluirActionPerformed
        inputPlacaExcluir.setText("");
        inputPlacaExcluir.setVisible(true);
        btnExcluir.setEnabled(false);
        labelAvisosExcluir.setText("Informe a Placa do veículo");
        btnConfirmaExcluir.setVisible(true);
        btnCancelarExcluir.setVisible(true);
        btnCadastrar.setEnabled(false);
        btnEditar.setEnabled(false);
        habilitarCampos(false);

    }

    private void inputDiariaActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnConfirmaExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnConfirmaExcluirActionPerformed
        String placa = inputPlacaExcluir.getText().trim();
        if (!placa.isEmpty()) {
            Veiculo veiculo = controller.buscarPorPlaca(placa);
            if (veiculo != null) {
                labelAvisosExcluir.setText("");
                int confirma = JOptionPane.showConfirmDialog(this, "Confirma exclusão ( " + veiculo.getPlaca() + ")",
                        "Confirma exclusão", JOptionPane.OK_CANCEL_OPTION);
                if (confirma == JOptionPane.OK_OPTION) {
                    controller.excluir(veiculo);
                    veiculos = controller.getVeiculos();
                    atualizarTabela(veiculos);
                    baseDeDados.atualizarVeiculos(veiculos);
                    inputPlacaExcluir.setVisible(false);
                    btnConfirmaExcluir.setVisible(false);
                    btnCancelarExcluir.setVisible(false);
                    habilitarCampos(true);

                    btnCadastrar.setEnabled(true);
                    if (!controller.listaVazia()) {
                        btnEditar.setEnabled(true);
                        btnExcluir.setEnabled(true);
                    }
                } else {
                    if (!controller.listaVazia()) {
                        btnExcluir.setEnabled(true);
                        btnEditar.setEnabled(true);
                    }
                    inputPlacaExcluir.setVisible(false);
                    btnConfirmaExcluir.setVisible(false);
                    btnCancelarExcluir.setVisible(false);
                    btnCadastrar.setEnabled(true);
                    habilitarCampos(true);
                }
            } else {
                labelAvisosExcluir.setText("Placa não encontrada");
            }
        } else {
            labelAvisosExcluir.setText("Informe um valor válido");
            inputPlacaExcluir.setText("");
        }
    }// GEN-LAST:event_btnConfirmaExcluirActionPerformed

    private void btnCancelarExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelarExcluirActionPerformed
        if (!controller.listaVazia()) {
            btnEditar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
        habilitarCampos(true);
        btnCadastrar.setEnabled(true);
        btnConfirmaExcluir.setVisible(false);
        btnCancelarExcluir.setVisible(false);
        labelAvisosExcluir.setText("");
        inputPlacaExcluir.setText("");
        inputPlacaExcluir.setVisible(false);
    }// GEN-LAST:event_btnCancelarExcluirActionPerformed

    public void atualizarTabela(ArrayList<Veiculo> veiculos) {
        baseDeDados.atualizarVeiculos(veiculos);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("PLACA");
        model.addColumn("MARCA");
        model.addColumn("MODELO");
        model.addColumn("ANO");
        model.addColumn("DIÁRIA R$");
        model.addColumn("DISPONÍVEL");

        String disponivel = "";
        Iterator<Veiculo> it = veiculos.iterator();
        while (it.hasNext()) {
            Veiculo v = it.next();
            if (v.getDisponivel() == true) {
                disponivel = "SIM";
            } else {
                disponivel = "NÃO";
            }
            Object[] linha = {
                v.getPlaca(),
                v.getMarca(),
                v.getModelo(),
                v.getAno(),
                v.getDiaria(),
                disponivel
            };
            model.addRow(linha);
        }
        tabelaVeiculos.setModel(model);
    }

    public void habilitarCampos(boolean op) {
        inputPlaca.setEditable(op);
        inputAno.setEditable(op);
        inputMarca.setEditable(op);
        inputModelo.setEditable(op);
        inputDiaria.setEditable(op);
        btnDisponivelTrue.setEnabled(op);
        btnDisponivelFalse.setEnabled(op);
    }

    public void estadoInicial() {
        btnEditar.setEnabled(false);
        btnSalvar.setVisible(false);
        btnExcluir.setEnabled(false);
        btnConfirmaExcluir.setVisible(false);
        btnCancelarExcluir.setVisible(false);

        inputPlacaExcluir.setVisible(false);
    }

    public void clear() {
        inputPlaca.setText("");
        inputAno.setText("");
        inputMarca.setText("");
        inputModelo.setText("");
        inputDiaria.setText("");
        labelAvisos.setText("");
        labelAvisosExcluir.setText("");
        btnGroup.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelarExcluir;
    private javax.swing.JButton btnConfirmaExcluir;
    private javax.swing.JCheckBox btnDisponivelFalse;
    private javax.swing.JCheckBox btnDisponivelTrue;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField inputAno;
    private javax.swing.JTextField inputDiaria;
    private javax.swing.JTextField inputMarca;
    private javax.swing.JTextField inputModelo;
    private javax.swing.JTextField inputPlaca;
    private javax.swing.JTextField inputPlacaExcluir;
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
    private javax.swing.JLabel labelAvisosExcluir;
    private javax.swing.JTable tabelaVeiculos;
    // End of variables declaration//GEN-END:variables
}
