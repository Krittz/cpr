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
        jLabel8 = new javax.swing.JLabel();
        btnDisponivelTrue = new javax.swing.JCheckBox();
        btnDisponivelFalse = new javax.swing.JCheckBox();
        inputAno = new javax.swing.JFormattedTextField();
        wave = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        inputCodigoEditar = new javax.swing.JTextField();
        labelAvisosEditar = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle("VEICULOS");
        setMaximumSize(new java.awt.Dimension(1280, 680));
        setMinimumSize(new java.awt.Dimension(1280, 680));
        setPreferredSize(new java.awt.Dimension(1280, 680));

        jPanel1.setBackground(new java.awt.Color(40, 42, 54));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 680));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 680));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputPlaca.setBackground(new java.awt.Color(40, 42, 54));
        inputPlaca.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputPlaca.setForeground(new java.awt.Color(189, 147, 249));
        inputPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputPlaca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputPlaca.setMaximumSize(new java.awt.Dimension(120, 50));
        inputPlaca.setMinimumSize(new java.awt.Dimension(120, 50));
        inputPlaca.setPreferredSize(new java.awt.Dimension(120, 50));
        inputPlaca.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputPlaca.setSelectionColor(new java.awt.Color(189, 147, 249));
        jPanel1.add(inputPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 164, -1, -1));

        inputMarca.setBackground(new java.awt.Color(40, 42, 54));
        inputMarca.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputMarca.setForeground(new java.awt.Color(189, 147, 249));
        inputMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputMarca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputMarca.setPreferredSize(new java.awt.Dimension(260, 50));
        inputMarca.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputMarca.setSelectionColor(new java.awt.Color(189, 147, 249));
        jPanel1.add(inputMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 346, -1, -1));

        tabelaVeiculos.setBackground(new java.awt.Color(40, 41, 66));
        tabelaVeiculos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tabelaVeiculos.setForeground(new java.awt.Color(189, 147, 249));
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
        tabelaVeiculos.setGridColor(new java.awt.Color(40, 42, 54));
        tabelaVeiculos.setPreferredSize(new java.awt.Dimension(300, 300));
        tabelaVeiculos.setRowSelectionAllowed(false);
        tabelaVeiculos.setSelectionBackground(new java.awt.Color(189, 147, 249));
        tabelaVeiculos.setSelectionForeground(new java.awt.Color(40, 41, 66));
        tabelaVeiculos.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaVeiculos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 141, 600, 304));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(189, 147, 249));
        jLabel1.setText("VEÍCULOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 43, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(189, 147, 249));
        jLabel2.setText("PLACA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 141, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(189, 147, 249));
        jLabel3.setText("ANO (xxxx/xxxx)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 232, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(189, 147, 249));
        jLabel4.setText("MODELO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 414, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(189, 147, 249));
        jLabel5.setText("MARCA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 323, -1, -1));

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
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

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
        btnEditar.setPreferredSize(new java.awt.Dimension(110, 45));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, -1, -1));

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
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 463, -1, -1));

        inputModelo.setBackground(new java.awt.Color(40, 42, 54));
        inputModelo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputModelo.setForeground(new java.awt.Color(189, 147, 249));
        inputModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputModelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputModelo.setPreferredSize(new java.awt.Dimension(260, 50));
        inputModelo.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputModelo.setSelectionColor(new java.awt.Color(189, 147, 249));
        jPanel1.add(inputModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 437, -1, -1));

        labelAvisos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisos.setForeground(new java.awt.Color(189, 147, 249));
        labelAvisos.setText(" ");
        jPanel1.add(labelAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 493, 238, 32));

        inputDiaria.setBackground(new java.awt.Color(40, 42, 54));
        inputDiaria.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputDiaria.setForeground(new java.awt.Color(189, 147, 249));
        inputDiaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputDiaria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputDiaria.setMaximumSize(new java.awt.Dimension(120, 50));
        inputDiaria.setMinimumSize(new java.awt.Dimension(120, 50));
        inputDiaria.setPreferredSize(new java.awt.Dimension(120, 50));
        inputDiaria.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputDiaria.setSelectionColor(new java.awt.Color(189, 147, 249));
        inputDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDiariaActionPerformed(evt);
            }
        });
        jPanel1.add(inputDiaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 255, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(189, 147, 249));
        jLabel6.setText("DIÁRIA R$: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 232, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(40, 42, 54));
        btnSalvar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(189, 147, 249));
        btnSalvar.setText("SALVAR");
        btnSalvar.setBorder(null);
        btnSalvar.setBorderPainted(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setMaximumSize(new java.awt.Dimension(110, 45));
        btnSalvar.setMinimumSize(new java.awt.Dimension(110, 45));
        btnSalvar.setOpaque(true);
        btnSalvar.setPreferredSize(new java.awt.Dimension(110, 45));
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, -1, -1));

        inputPlacaExcluir.setBackground(new java.awt.Color(40, 42, 54));
        inputPlacaExcluir.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputPlacaExcluir.setForeground(new java.awt.Color(189, 147, 249));
        inputPlacaExcluir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputPlacaExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputPlacaExcluir.setPreferredSize(new java.awt.Dimension(260, 50));
        inputPlacaExcluir.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputPlacaExcluir.setSelectionColor(new java.awt.Color(189, 147, 249));
        jPanel1.add(inputPlacaExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 463, 140, -1));

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
        jPanel1.add(btnConfirmaExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 467, -1, -1));

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
        btnCancelarExcluir.setPreferredSize(new java.awt.Dimension(110, 45));
        btnCancelarExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(951, 525, -1, -1));

        labelAvisosExcluir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosExcluir.setForeground(new java.awt.Color(189, 147, 249));
        labelAvisosExcluir.setText(" ");
        labelAvisosExcluir.setToolTipText("");
        jPanel1.add(labelAvisosExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 525, 270, 45));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(189, 147, 249));
        jLabel8.setText("DISPONÍVEL");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 164, -1, -1));

        btnGroup.add(btnDisponivelTrue);
        btnDisponivelTrue.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnDisponivelTrue.setForeground(new java.awt.Color(189, 147, 249));
        btnDisponivelTrue.setText("SIM");
        btnDisponivelTrue.setBorder(null);
        jPanel1.add(btnDisponivelTrue, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 187, -1, -1));

        btnGroup.add(btnDisponivelFalse);
        btnDisponivelFalse.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnDisponivelFalse.setForeground(new java.awt.Color(189, 147, 249));
        btnDisponivelFalse.setText("NÃO");
        btnDisponivelFalse.setBorder(null);
        jPanel1.add(btnDisponivelFalse, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 187, -1, -1));

        inputAno.setBackground(new java.awt.Color(40, 42, 54));
        inputAno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputAno.setForeground(new java.awt.Color(189, 147, 249));
        try {
            inputAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputAno.setText("");
        inputAno.setCaretColor(new java.awt.Color(218, 31, 79));
        inputAno.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputAno.setMaximumSize(new java.awt.Dimension(120, 50));
        inputAno.setMinimumSize(new java.awt.Dimension(120, 50));
        inputAno.setPreferredSize(new java.awt.Dimension(120, 50));
        inputAno.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputAno.setSelectionColor(new java.awt.Color(189, 147, 249));
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
        jPanel1.add(inputAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, -1, -1));

        wave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fotor_2023-6-3_11_58_13.png"))); // NOI18N
        jPanel1.add(wave, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, -1, -1));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

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
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 140, 40));

        inputCodigoEditar.setBackground(new java.awt.Color(40, 42, 54));
        inputCodigoEditar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputCodigoEditar.setForeground(new java.awt.Color(189, 147, 249));
        inputCodigoEditar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCodigoEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 147, 249), 1, true));
        inputCodigoEditar.setPreferredSize(new java.awt.Dimension(260, 50));
        inputCodigoEditar.setSelectedTextColor(new java.awt.Color(40, 42, 54));
        inputCodigoEditar.setSelectionColor(new java.awt.Color(189, 147, 249));
        jPanel1.add(inputCodigoEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 140, 40));

        labelAvisosEditar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelAvisosEditar.setForeground(new java.awt.Color(189, 147, 249));
        labelAvisosEditar.setText(" ");
        labelAvisosEditar.setToolTipText("");
        jPanel1.add(labelAvisosEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 260, 40));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarExcluir;
    private javax.swing.JButton btnConfirmaExcluir;
    private javax.swing.JCheckBox btnDisponivelFalse;
    private javax.swing.JCheckBox btnDisponivelTrue;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField inputAno;
    private javax.swing.JTextField inputCodigoEditar;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAvisos;
    private javax.swing.JLabel labelAvisosEditar;
    private javax.swing.JLabel labelAvisosExcluir;
    private javax.swing.JTable tabelaVeiculos;
    private javax.swing.JLabel wave;
    // End of variables declaration//GEN-END:variables
}
