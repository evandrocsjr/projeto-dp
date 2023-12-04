/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.EntradaSaidaProdutosDAO;
import dao.ProdutoDAO;
import dao.UsuarioDAO;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.EntradaSaidaProdutos;
import model.Produto;
import model.Usuario;

/**
 *
 * @author Cliente
 */
public class JFrameEntradaSaidaProdutos extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCadEstoque
     */
    public JFrameEntradaSaidaProdutos() {
        initComponents();
        preencherComboProduto();
        preencherComboUsuario();
        setTitle("ENTRADA E SAÍDA DE PRODUTOS");
        setSize(400, 400);
        setLocationRelativeTo(null);
    }
        
    public void preencherComboProduto(){
        ProdutoDAO pDAO = new ProdutoDAO();
        List<Produto> listaProduto = pDAO.getProdutos();
        for(Produto produto : listaProduto){
            cmb_Produto.addItem(produto);
        }
    }
    
    public void preencherComboUsuario(){
        UsuarioDAO uDAO = new UsuarioDAO();
        List<Usuario> listaUsuario = uDAO.getUsuarios();
        for(Usuario usuario : listaUsuario){
            cmb_Usuario.addItem(usuario);
        }
    }
    
    public void limparFormulario(){
        cmb_Produto.setSelectedItem(0);
        cmb_Usuario.setSelectedItem(0);
        txtMotivo.setText("");
        txtQuantidade.setText("");
        txtDataModificacao.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtQuantidade = new javax.swing.JTextField();
        txtMotivo = new javax.swing.JTextField();
        txtDataModificacao = new javax.swing.JFormattedTextField();
        cmb_Produto = new javax.swing.JComboBox();
        cmb_Usuario = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-produto-25.png"))); // NOI18N
        jLabel1.setText("ENTRADA E SAÍDA DE PRODUTOS");

        jLabel2.setText("PRODUTO");

        jLabel3.setText("USUÁRIO");

        jLabel4.setText("MOTIVO");

        jLabel5.setText("QUANTIDADE");

        jLabel6.setText("DATA DE MODIFICAÇÃO");

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        try {
            txtDataModificacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantidade)
                            .addComponent(txtMotivo)
                            .addComponent(txtDataModificacao)
                            .addComponent(cmb_Produto, 0, 210, Short.MAX_VALUE)
                            .addComponent(cmb_Usuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmb_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDataModificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Usuario usuario = (Usuario) cmb_Usuario.getSelectedItem();
        long idUsuario = usuario.getId();
        
        Produto produto = (Produto) cmb_Produto.getSelectedItem();
        long idProduto = produto.getId();
        
        EntradaSaidaProdutos entradaSaidaProdutos = new EntradaSaidaProdutos();
        
        entradaSaidaProdutos.setIdProduto(produto);
        entradaSaidaProdutos.setIdUsuario(usuario);
        entradaSaidaProdutos.setMotivo(txtMotivo.getText());
        entradaSaidaProdutos.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        entradaSaidaProdutos.setDataModificacao(new Date(txtDataModificacao.getText()));
        
        EntradaSaidaProdutosDAO entradaSaidaProdutosDAO = new EntradaSaidaProdutosDAO();
        
        entradaSaidaProdutosDAO.inserir(entradaSaidaProdutos);
        
        limparFormulario();
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameEntradaSaidaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameEntradaSaidaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameEntradaSaidaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameEntradaSaidaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameEntradaSaidaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmb_Produto;
    private javax.swing.JComboBox cmb_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JFormattedTextField txtDataModificacao;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
