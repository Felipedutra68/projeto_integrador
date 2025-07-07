/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.DAO;
import Model.Cliente;
import Model.ModeloTabela;
import java.awt.Graphics;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ADM
 */
public class JFrame_Cadastro_Jogo extends javax.swing.JFrame {

    private Cliente clienteEmEdicao;

    private ModeloTabela modeloTabela;

    public JFrame_Cadastro_Jogo(ModeloTabela modeloTabela) {
        this.modeloTabela = modeloTabela;
        initComponents();
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        //ModoCadastro
        setTitle("Cadastro de Cliente");
        txt_incluir_cadastro.setVisible(true);
        txtSalvar.setVisible(false);

         setSize(1020, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Criando o JPanel com imagem de fundo
        JPanel P = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                ImageIcon imagemPanel = new ImageIcon("C:\\Users\\dev\\Documents\\NetBeansProjects\\Swing - NPC Revoltado\\src\\Resource\\Menu Iniciar.png");
//                g.drawImage(imagemPanel.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        P.setBounds(500, 500, 1020, 620); // Define posição e tamanho
        P.setOpaque(false); // Torna o painel transparente
        P.setLayout(null); // Define layout absoluto no painel

        // Adiciona o painel ao JFrame
        getContentPane().add(P);

        // Configurando o fundo
        ImageIcon imagemBackground = new ImageIcon("C:\\Users\\ADM\\Documents\\NetBeansProjects\\ProjetoIntegrador\\src\\Imagens\\foia.png");
        JLabel labelBackground = new JLabel(imagemBackground);
        labelBackground.setBounds(0, 0, 1020, 620);

        // Adiciona o fundo como último elemento
        getContentPane().add(labelBackground);
    }
        
        
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSalvar = new javax.swing.JButton();
        txt_incluir_cadastro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_Sexo_cadastro = new javax.swing.JTextField();
        txt_Classe_cadastro = new javax.swing.JTextField();
        txt_nome_cadastro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSalvar.setText("Salvar");
        txtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalvarActionPerformed(evt);
            }
        });

        txt_incluir_cadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_incluir_cadastro.setText("INCLUIR");
        txt_incluir_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_incluir_cadastroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Crie seu personagem");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Classe");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sexo");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome");

        txt_Sexo_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Sexo_cadastroActionPerformed(evt);
            }
        });

        txt_Classe_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Classe_cadastroActionPerformed(evt);
            }
        });

        txt_nome_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome_cadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(txt_Sexo_cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                            .addComponent(txt_Classe_cadastro)
                            .addComponent(txt_nome_cadastro))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_incluir_cadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSalvar)
                        .addGap(245, 245, 245))))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 528, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_Sexo_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Classe_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txt_nome_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_incluir_cadastro)
                    .addComponent(txtSalvar))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalvarActionPerformed
        if (clienteEmEdicao != null) {
            clienteEmEdicao.setNome(txt_nome_cadastro.getText());
            clienteEmEdicao.setSexo(txt_Sexo_cadastro.getText());
            clienteEmEdicao.setClasse(txt_Classe_cadastro.getText());
           
            //Atualizar o banco de dados
            DAO dao = new DAO();
            try {
                dao.alterarCliente(null, clienteEmEdicao);
            } catch (SQLException ex) {
                Logger.getLogger(JFrame_Cadastro_Jogo.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Atualizar a tabela
            modeloTabela.atualizarCliente(clienteEmEdicao);

            JOptionPane.showMessageDialog(this, "Cliene alterado com secesso!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum cliente em edicao!");

        }
    }//GEN-LAST:event_txtSalvarActionPerformed

    private void txt_incluir_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_incluir_cadastroActionPerformed
        DAO dao = new DAO();
        Cliente cliente = new Cliente(null, txt_nome_cadastro.getText(), txt_Sexo_cadastro.getText(), txt_Classe_cadastro.getText());

        try {
            dao.cadastrarCliente(cliente);
        } catch (SQLException ex) {
            Logger.getLogger(JFrame_Cadastro_Jogo.class.getName()).log(Level.SEVERE, null, ex);
        }
        modeloTabela.adicionarCliente(cliente);
        this.dispose();
    }//GEN-LAST:event_txt_incluir_cadastroActionPerformed

    private void txt_Classe_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Classe_cadastroActionPerformed

    }//GEN-LAST:event_txt_Classe_cadastroActionPerformed

    private void txt_Sexo_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Sexo_cadastroActionPerformed

    }//GEN-LAST:event_txt_Sexo_cadastroActionPerformed

    private void txt_nome_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nome_cadastroActionPerformed

    }//GEN-LAST:event_txt_nome_cadastroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_Cadastro_Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Cadastro_Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Cadastro_Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Cadastro_Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ModeloTabela modeloTabela = new ModeloTabela(listaClientes);

        new JFrame_Cadastro_Jogo(modeloTabela).setVisible(true);

    }

    private void preencherCampos(Cliente cliente) {

    }

    public JFrame_Cadastro_Jogo(Cliente cliente, ModeloTabela modeloTabela) {
        setTitle("Alterar Cliente:" + cliente.getNome());
        this.clienteEmEdicao = cliente;
        this.modeloTabela = modeloTabela;
        initComponents();
        preencherCampos(cliente);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        
        txt_incluir_cadastro.setVisible(false);
        txtSalvar.setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton txtSalvar;
    private javax.swing.JTextField txt_Classe_cadastro;
    private javax.swing.JTextField txt_Sexo_cadastro;
    private javax.swing.JButton txt_incluir_cadastro;
    private javax.swing.JTextField txt_nome_cadastro;
    // End of variables declaration//GEN-END:variables
}
