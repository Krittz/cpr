package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author crist
 */
public class UserRegister extends javax.swing.JInternalFrame {

    
    public UserRegister() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelInicial = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputUsuario = new javax.swing.JTextField();
        inputConfirmarSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        inputSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        labelAvisosUsuario = new javax.swing.JLabel();
        labelAvisosSenha = new javax.swing.JLabel();
        labelAvisosConfirmarSenha = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        painelInicial.setBackground(new java.awt.Color(18, 20, 31));
        painelInicial.setMaximumSize(new java.awt.Dimension(1280, 720));
        painelInicial.setMinimumSize(new java.awt.Dimension(1280, 720));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 31, 79));
        jLabel1.setText("CADASTRO");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/svg.png"))); // NOI18N

        inputUsuario.setBackground(new java.awt.Color(9, 13, 25));
        inputUsuario.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputUsuario.setForeground(new java.awt.Color(218, 31, 79));
        inputUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputUsuario.setBorder(null);
        inputUsuario.setPreferredSize(new java.awt.Dimension(220, 50));
        inputUsuario.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputUsuario.setSelectionColor(new java.awt.Color(218, 31, 79));

        inputConfirmarSenha.setBackground(new java.awt.Color(9, 13, 25));
        inputConfirmarSenha.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputConfirmarSenha.setForeground(new java.awt.Color(218, 31, 79));
        inputConfirmarSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputConfirmarSenha.setBorder(null);
        inputConfirmarSenha.setPreferredSize(new java.awt.Dimension(220, 50));
        inputConfirmarSenha.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputConfirmarSenha.setSelectionColor(new java.awt.Color(218, 31, 79));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Usuário");

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Senha");

        btnCadastrar.setBackground(new java.awt.Color(218, 30, 78));
        btnCadastrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(9, 13, 25));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setBorder(null);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrar.setMaximumSize(new java.awt.Dimension(110, 45));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(110, 45));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(110, 45));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        inputSenha.setBackground(new java.awt.Color(9, 13, 25));
        inputSenha.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        inputSenha.setForeground(new java.awt.Color(218, 31, 79));
        inputSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputSenha.setBorder(null);
        inputSenha.setPreferredSize(new java.awt.Dimension(220, 50));
        inputSenha.setSelectedTextColor(new java.awt.Color(18, 20, 31));
        inputSenha.setSelectionColor(new java.awt.Color(218, 31, 79));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Repita a senha");

        labelAvisosUsuario.setFont(new java.awt.Font("Raleway Black", 0, 12)); // NOI18N
        labelAvisosUsuario.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisosUsuario.setToolTipText("");

        labelAvisosSenha.setFont(new java.awt.Font("Raleway Black", 0, 12)); // NOI18N
        labelAvisosSenha.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisosSenha.setToolTipText("");

        labelAvisosConfirmarSenha.setFont(new java.awt.Font("Raleway Black", 0, 12)); // NOI18N
        labelAvisosConfirmarSenha.setForeground(new java.awt.Color(218, 31, 79));
        labelAvisosConfirmarSenha.setToolTipText("");

        javax.swing.GroupLayout painelInicialLayout = new javax.swing.GroupLayout(painelInicial);
        painelInicial.setLayout(painelInicialLayout);
        painelInicialLayout.setHorizontalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInicialLayout.createSequentialGroup()
                        .addGap(508, 508, 508)
                        .addComponent(jLabel1))
                    .addGroup(painelInicialLayout.createSequentialGroup()
                        .addGap(532, 532, 532)
                        .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(painelInicialLayout.createSequentialGroup()
                                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(inputConfirmarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelAvisosSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(labelAvisosUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelAvisosConfirmarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInicialLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInicialLayout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(583, 583, 583))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInicialLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        painelInicialLayout.setVerticalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAvisosUsuario))
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAvisosSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAvisosConfirmarSenha))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String username = inputUsuario.getText();
        if (username.isBlank()) {
            labelAvisosUsuario.setText("Campo vazio");
        } else {
            labelAvisosUsuario.setText("");
            String password = new String(inputSenha.getPassword());
            if (password.length() < 8) {
                labelAvisosSenha.setText("Mínimo 8 caractéres");
            } else {
                labelAvisosSenha.setText("");
                String checkPass = new String(inputConfirmarSenha.getPassword());
                if (!checkPass.equals(password)) {
                    labelAvisosConfirmarSenha.setText("Senha incompatível");
                    inputConfirmarSenha.setText("");
                } else {
                    labelAvisosConfirmarSenha.setText("");
                    User user = new User(username, password);
                    saveUser(user);
                    JOptionPane.showMessageDialog(this, "Usuário [ " + username + "] cadastrado com sucesso", "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                }
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private static final String USER_FILE = ("users.dat");

    private void saveUser(User user) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(USER_FILE))) {
            oos.writeObject(user);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void clear() {
        inputUsuario.setText("");
        inputSenha.setText("");
        inputConfirmarSenha.setText("");
        labelAvisosConfirmarSenha.setText("");
        labelAvisosSenha.setText("");
        labelAvisosUsuario.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JPasswordField inputConfirmarSenha;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JTextField inputUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelAvisosConfirmarSenha;
    private javax.swing.JLabel labelAvisosSenha;
    private javax.swing.JLabel labelAvisosUsuario;
    private javax.swing.JPanel painelInicial;
    // End of variables declaration//GEN-END:variables
}
