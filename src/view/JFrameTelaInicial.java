/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Cliente
 */
public class JFrameTelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form JFrameTelaInicial
     */
    public JFrameTelaInicial() {
        initComponents();
        setTitle("MENU");
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_Inicio = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_CadUsuario = new javax.swing.JMenuItem();
        menu_EditarUsuario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_CadProduto = new javax.swing.JMenuItem();
        menu_EditarProduto = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menu_EntradaSaidaProdutos = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menu_ConsultaUsuarios = new javax.swing.JMenuItem();
        menu_ConsultasProdutos = new javax.swing.JMenuItem();
        menu_ConsultasEstoque = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menu_Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-casa-25.png"))); // NOI18N
        jMenu1.setText("INÍCIO");

        menu_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-casa-18.png"))); // NOI18N
        menu_Inicio.setText("MENU");
        menu_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_InicioActionPerformed(evt);
            }
        });
        jMenu1.add(menu_Inicio);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-usuário-25.png"))); // NOI18N
        jMenu2.setText("USUÁRIO");

        menu_CadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-usuário-masculino-18.png"))); // NOI18N
        menu_CadUsuario.setText("CADASTRAR");
        menu_CadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_CadUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(menu_CadUsuario);

        menu_EditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-editar-usuário-masculino-18.png"))); // NOI18N
        menu_EditarUsuario.setText("EDITAR/EXCLUIR");
        menu_EditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_EditarUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(menu_EditarUsuario);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-carrinho-25.png"))); // NOI18N
        jMenu3.setText("PRODUTO");

        menu_CadProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-o-carrinho-de-compras-18.png"))); // NOI18N
        menu_CadProduto.setText("CADASTRAR");
        menu_CadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_CadProdutoActionPerformed(evt);
            }
        });
        jMenu3.add(menu_CadProduto);

        menu_EditarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-esvaziar-o-carrinho-de-compras-18.png"))); // NOI18N
        menu_EditarProduto.setText("EDITAR/EXCLUIR");
        menu_EditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_EditarProdutoActionPerformed(evt);
            }
        });
        jMenu3.add(menu_EditarProduto);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-produto-25.png"))); // NOI18N
        jMenu4.setText("ENTRADA E SAÍDA");

        menu_EntradaSaidaProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-produto-add-18.png"))); // NOI18N
        menu_EntradaSaidaProdutos.setText("ENTRADA/SAIDA DE PRODUTOS");
        menu_EntradaSaidaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_EntradaSaidaProdutosActionPerformed(evt);
            }
        });
        jMenu4.add(menu_EntradaSaidaProdutos);

        jMenuBar1.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-relatório-25.png"))); // NOI18N
        jMenu6.setText("CONSULTAS");

        menu_ConsultaUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-usuário-18.png"))); // NOI18N
        menu_ConsultaUsuarios.setText("USUÁRIOS");
        menu_ConsultaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ConsultaUsuariosActionPerformed(evt);
            }
        });
        jMenu6.add(menu_ConsultaUsuarios);

        menu_ConsultasProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-carrinho-18.png"))); // NOI18N
        menu_ConsultasProdutos.setText("PRODUTOS");
        menu_ConsultasProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ConsultasProdutosActionPerformed(evt);
            }
        });
        jMenu6.add(menu_ConsultasProdutos);

        menu_ConsultasEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-produto-18.png"))); // NOI18N
        menu_ConsultasEstoque.setText("ESTOQUE");
        jMenu6.add(menu_ConsultasEstoque);

        jMenuBar1.add(jMenu6);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-sair-25.png"))); // NOI18N
        jMenu5.setText("SAIR");

        menu_Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-sair-18.png"))); // NOI18N
        menu_Sair.setText("SAIR");
        menu_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_SairActionPerformed(evt);
            }
        });
        jMenu5.add(menu_Sair);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_InicioActionPerformed
        JFrameTelaInicial jFrameTelaInicial = new JFrameTelaInicial();
        jFrameTelaInicial.setVisible(true);
    }//GEN-LAST:event_menu_InicioActionPerformed

    private void menu_CadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_CadUsuarioActionPerformed
        JFrameCadUsuario jFrameCadUsuario = new JFrameCadUsuario();
        jFrameCadUsuario.setVisible(true);
    }//GEN-LAST:event_menu_CadUsuarioActionPerformed

    private void menu_CadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_CadProdutoActionPerformed
        JFrameCadProduto jFrameCadProduto = new JFrameCadProduto();
        jFrameCadProduto.setVisible(true);
    }//GEN-LAST:event_menu_CadProdutoActionPerformed

    private void menu_EntradaSaidaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_EntradaSaidaProdutosActionPerformed
        JFrameEntradaSaidaProdutos jFrameEntradaSaidaProdutos = new JFrameEntradaSaidaProdutos();
        jFrameEntradaSaidaProdutos.setVisible(true);
    }//GEN-LAST:event_menu_EntradaSaidaProdutosActionPerformed

    private void menu_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menu_SairActionPerformed

    private void menu_ConsultaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ConsultaUsuariosActionPerformed
        JFrameConsultaUsuario jFrameConsultaUsuario = new JFrameConsultaUsuario();
        jFrameConsultaUsuario.setVisible(true);
    }//GEN-LAST:event_menu_ConsultaUsuariosActionPerformed

    private void menu_ConsultasProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ConsultasProdutosActionPerformed
        JFrameConsultaProduto jFrameConsultaProduto = new JFrameConsultaProduto();
        jFrameConsultaProduto.setVisible(true);
    }//GEN-LAST:event_menu_ConsultasProdutosActionPerformed

    private void menu_EditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_EditarUsuarioActionPerformed
        JFrameAtualizaUsuario jFrameAtualizaUsuario = new JFrameAtualizaUsuario();
        jFrameAtualizaUsuario.setVisible(true);
    }//GEN-LAST:event_menu_EditarUsuarioActionPerformed

    private void menu_EditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_EditarProdutoActionPerformed
        JFrameAtualizaProduto jFrameAtualizaProduto = new JFrameAtualizaProduto();
        jFrameAtualizaProduto.setVisible(true);
    }//GEN-LAST:event_menu_EditarProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(JFrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menu_CadProduto;
    private javax.swing.JMenuItem menu_CadUsuario;
    private javax.swing.JMenuItem menu_ConsultaUsuarios;
    private javax.swing.JMenuItem menu_ConsultasEstoque;
    private javax.swing.JMenuItem menu_ConsultasProdutos;
    private javax.swing.JMenuItem menu_EditarProduto;
    private javax.swing.JMenuItem menu_EditarUsuario;
    private javax.swing.JMenuItem menu_EntradaSaidaProdutos;
    private javax.swing.JMenuItem menu_Inicio;
    private javax.swing.JMenuItem menu_Sair;
    // End of variables declaration//GEN-END:variables
}
