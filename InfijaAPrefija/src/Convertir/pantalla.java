package Convertir;

import Letras_Invisibles.TextPrompt;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author MSI GF65
 */
public class pantalla extends javax.swing.JFrame {
    
    public pantalla() {
        initComponents();
        TextPrompt ingresa = new TextPrompt("Ingrese la expresion infija", infija);
        
        TextPrompt ingresa2 = new TextPrompt("los resultados se mostraran en seguida...", Resultados);
        
        TextPrompt ingresa3 = new TextPrompt("los resultados se mostraran en seguida...", Resultados2);
         btnLimpiar1.setVisible(true);
         setLocationRelativeTo(null);
         
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        infija = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        mostrarInfija = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Resultados = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Resultados2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnLimpiar1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Introduce una notación infija para convertirla a prefija y postfija");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 400, 20));

        infija.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        infija.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(infija, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 390, -1));

        jButton1.setText("Prefija");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 87, -1));

        mostrarInfija.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        mostrarInfija.setText(" ");
        jPanel1.add(mostrarInfija, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 168, 371, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        jButton3.setText("Posfija");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 80, -1));

        Resultados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Resultados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadosActionPerformed(evt);
            }
        });
        jPanel1.add(Resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 330, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Notacion Prefija:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        Resultados2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Resultados2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Resultados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 330, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Notacion Postfija:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 73, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setText("Infija a Prefija y Posfija");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(infija.getText().equals("")){
            JOptionPane.showMessageDialog(null, "¡ Llene el campo !");
        }
        else{
        String entrada=infija.getText();
        String var="";
        
        StringBuilder inversaentrada = new StringBuilder(entrada);
        inversaentrada.reverse();
      
        Stack <Character>p=new <Character>Stack();
        
        
        for(int i=0; i<inversaentrada.length(); i++){
            if(inversaentrada.charAt(i)>='0' & inversaentrada.charAt(i)<='9') 
                var+=inversaentrada.charAt(i);
            if(inversaentrada.charAt(i)>='A' & inversaentrada.charAt(i)<='Z') 
                var+=inversaentrada.charAt(i);
            if(inversaentrada.charAt(i)>='a' & inversaentrada.charAt(i)<='z') 
                var+=inversaentrada.charAt(i);
            if (inversaentrada.charAt(i)>='*' & inversaentrada.charAt(i)<='/')
                p.push(inversaentrada.charAt(i));
            if (inversaentrada.charAt(i)=='(')
                var+=p.pop(); 
            
        }
        while(!p.isEmpty())
            var+=p.pop();
      
        String salidaPrefija=var;
        
        StringBuilder inversa = new StringBuilder(salidaPrefija);        
        
        //Resultado de la Conversion
        Resultados.setText(""+inversa.reverse());
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
JOptionPane.showMessageDialog(null,"Finalizado");
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String Infija=infija.getText();
        
        String var="";
        
        Stack <Character>p=new <Character>Stack();
        
        
        for(int i=0; i<Infija.length(); i++){
            if(Infija.charAt(i)>='0' & Infija.charAt(i)<='9') 
                var+=Infija.charAt(i);
            if(Infija.charAt(i)>='A' & Infija.charAt(i)<='Z') 
                var+=Infija.charAt(i);
            if(Infija.charAt(i)>='a' & Infija.charAt(i)<='z') 
                var+=Infija.charAt(i);
            if (Infija.charAt(i)>='*' & Infija.charAt(i)<='/')
                p.push(Infija.charAt(i));
            if (Infija.charAt(i)==')') 
                var+=p.pop(); 
            
        }
        while(!p.isEmpty()) 
            var+=p.pop();
        
        Resultados2.setText(var);     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        Resultados.setText("");
        Resultados2.setText(" ");
        infija.setText(" ");
        btnLimpiar1.setVisible(true);
        JOptionPane.showMessageDialog(null, "se vaciaron los campos!!!");
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void ResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadosActionPerformed

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
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Resultados;
    private javax.swing.JTextField Resultados2;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JTextField infija;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel mostrarInfija;
    // End of variables declaration//GEN-END:variables
  
}
