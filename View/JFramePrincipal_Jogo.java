/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.Criptografia;
import DAO.DAO;
import Model.ModeloTabela;
import Model.Cliente;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ADM
 */
public class JFramePrincipal_Jogo extends javax.swing.JFrame {

     
    
    private ArrayList<Cliente> personagen;
    private ModeloTabela modeloTabela;

    public JFramePrincipal_Jogo() {
        initComponents();

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
        
        //Inicializar a lista de clienes
        DAO dao = new DAO();

        try {
            personagen = dao.listarCliente();

        } catch (Exception e) {
            e.printStackTrace();
            personagen = new ArrayList<>();

        }

        //criar o ModeloTabela com a lista 
        modeloTabela = new ModeloTabela(personagen);

        tabela_cadastro.setModel(modeloTabela);

        // Configurar o botao cadastrar
        txtCadastrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaCadastro();

            }

        });
        //Fechamento de todas as operacoes
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    //Metodo para aprir a tela de cadastro
    private void abrirTelaCadastro() {
        JFrame_Cadastro_Jogo cadastro = new JFrame_Cadastro_Jogo(modeloTabela);
        cadastro.setLocationRelativeTo(this);
        cadastro.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtCadastrar = new javax.swing.JButton();
        txtComecar = new javax.swing.JButton();
        txtExcluir = new javax.swing.JButton();
        txtAlterar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_cadastro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txtCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        txtCadastrar.setFont(new java.awt.Font("Blackadder ITC", 0, 24)); // NOI18N
        txtCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        txtCadastrar.setText("Cadastar");
        txtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadastrarActionPerformed(evt);
            }
        });

        txtComecar.setBackground(new java.awt.Color(255, 255, 255));
        txtComecar.setFont(new java.awt.Font("Blackadder ITC", 0, 24)); // NOI18N
        txtComecar.setForeground(new java.awt.Color(0, 0, 0));
        txtComecar.setText("Começar");
        txtComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComecarActionPerformed(evt);
            }
        });

        txtExcluir.setBackground(new java.awt.Color(255, 255, 255));
        txtExcluir.setFont(new java.awt.Font("Blackadder ITC", 0, 24)); // NOI18N
        txtExcluir.setForeground(new java.awt.Color(0, 0, 0));
        txtExcluir.setText("Excluir");
        txtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExcluirActionPerformed(evt);
            }
        });

        txtAlterar.setBackground(new java.awt.Color(255, 255, 255));
        txtAlterar.setFont(new java.awt.Font("Blackadder ITC", 0, 24)); // NOI18N
        txtAlterar.setForeground(new java.awt.Color(0, 0, 0));
        txtAlterar.setText("Alterar");
        txtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlterarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Blackadder ITC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CADASTRO DE PERSONAGEM");

        tabela_cadastro.setBackground(new java.awt.Color(255, 255, 255));
        tabela_cadastro.setFont(new java.awt.Font("Blackadder ITC", 0, 18)); // NOI18N
        tabela_cadastro.setForeground(new java.awt.Color(0, 0, 0));
        tabela_cadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nome", "Sexo", "Classe"
            }
        ));
        jScrollPane1.setViewportView(tabela_cadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtComecar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(txtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(txtAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtComecar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(140, 140, 140))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExcluirActionPerformed
        int linhaSelecionada = tabela_cadastro.getSelectedRow();
        System.out.println("Linha selecionada " + linhaSelecionada);

        if (linhaSelecionada != -1) {
            String id = tabela_cadastro.getValueAt(linhaSelecionada, 0).toString();
            System.out.println("ID selecionada: " + id);
            int confirmacao = JOptionPane.showConfirmDialog(null, "Voce realmente quer excluir o cadastro selecionado?", "Confirmacao", JOptionPane.YES_NO_OPTION);
            System.out.println("Corfirmado?" + (confirmacao == JOptionPane.YES_NO_OPTION));

            if (confirmacao == JOptionPane.YES_NO_OPTION) {

                try {
                    DAO dao = new DAO();
                    dao.excluirCliente(id);
                    System.out.println("Cliente excluido com sucesso");
                    ModeloTabela modelo = (ModeloTabela) tabela_cadastro.getModel();
                    modelo.removerClientePorID(id);
                    JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso");

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao excluir " + e.getMessage());
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro para excluir");
        }


    }//GEN-LAST:event_txtExcluirActionPerformed

    private void txtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlterarActionPerformed
        int linhaSelecionada = tabela_cadastro.getSelectedRow();
        System.out.println("Linha selecionada " + linhaSelecionada);

        if (linhaSelecionada != -1) {

            int confirmacao = JOptionPane.showConfirmDialog(null, "Voce realmente quer alterar o cadastro selecionado?", "Confirmacao", JOptionPane.YES_NO_OPTION);

            if (confirmacao == JOptionPane.YES_NO_OPTION) {

                String id = tabela_cadastro.getValueAt(linhaSelecionada, 0).toString();
                DAO dao = new DAO();

                try {
                    Cliente clienteSelecionado = dao.consultarCliente(id);
                    JFrame_Cadastro_Jogo telaEdicao = new JFrame_Cadastro_Jogo(clienteSelecionado, modeloTabela);
                    telaEdicao.setLocationRelativeTo(this);
                    telaEdicao.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao buescar cliente: " + e.getMessage());
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro para alterar");
        }

    }//GEN-LAST:event_txtAlterarActionPerformed

    private void txtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadastrarActionPerformed

    private void txtComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComecarActionPerformed

        int linhaSelecionada = tabela_cadastro.getSelectedRow();
        System.out.println("Linha selecionada " + linhaSelecionada);

        if (linhaSelecionada != -1) {

            int confirmacao = JOptionPane.showConfirmDialog(null, "Voce realmente quer começar o jogo com o personagem selecionado?", "Confirmacao", JOptionPane.YES_NO_OPTION);

            if (confirmacao == JOptionPane.YES_NO_OPTION) {

                String id = tabela_cadastro.getValueAt(linhaSelecionada, 0).toString();

                try {
                    dispose();
                    Jogo0 jp = new Jogo0();
                    jp.setLocationRelativeTo(jp);
                    jp.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao selecionar personagem: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro para excluir");
        }

    }//GEN-LAST:event_txtComecarActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal_Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal_Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal_Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal_Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            try {
                JFrame_Login_Jogo frame = new JFrame_Login_Jogo();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            } catch (Exception e) {
                e.printStackTrace();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_cadastro;
    private javax.swing.JButton txtAlterar;
    private javax.swing.JButton txtCadastrar;
    private javax.swing.JButton txtComecar;
    private javax.swing.JButton txtExcluir;
    // End of variables declaration//GEN-END:variables

}
