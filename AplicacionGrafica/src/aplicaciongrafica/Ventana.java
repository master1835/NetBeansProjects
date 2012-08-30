/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongrafica;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class Ventana extends javax.swing.JFrame {

private double numeroo;    
private double numero;
private double acumulador;
private int ultimaOperacion=0;
private double total=0;
private double memoria;
private boolean KeyCode;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    public boolean getKeyCode() {
        return KeyCode;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sumar = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        result = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        num1 = new javax.swing.JTextField();
        fact = new javax.swing.JButton();
        mem = new javax.swing.JButton();
        memresult = new javax.swing.JButton();
        log = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        sumar.setText("+");
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarActionPerformed(evt);
            }
        });

        restar.setText("-");
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarActionPerformed(evt);
            }
        });

        multiplicar.setText("*");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Resultado");

        result.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        result.setMaximumSize(new java.awt.Dimension(999999999, 2147483647));

        jLabel4.setFont(new java.awt.Font("Old English Text MT", 3, 24)); // NOI18N
        jLabel4.setText("Pela's Proyect");

        limpiar.setText("C");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        igual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                igualKeyReleased(evt);
            }
        });

        fact.setText("!");
        fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factActionPerformed(evt);
            }
        });

        mem.setText("M+");
        mem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memActionPerformed(evt);
            }
        });

        memresult.setText("MR");
        memresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memresultActionPerformed(evt);
            }
        });

        log.setText("Lg");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(num1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(sumar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(restar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(multiplicar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dividir)))
                                        .addGap(75, 75, 75)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(memresult)
                                            .addComponent(log))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(mem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(result, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(result, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(igual)))))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restar)
                    .addComponent(sumar)
                    .addComponent(memresult)
                    .addComponent(mem)
                    .addComponent(limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiplicar)
                    .addComponent(dividir)
                    .addComponent(log)
                    .addComponent(fact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(igual)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed

       
        try { 
            if (ultimaOperacion==1) {
            suma();
        }else
            if (ultimaOperacion==2) {
                resta();
            }else
                if (ultimaOperacion==3) {
                    mult();
                }else
                    if(ultimaOperacion==4) {
                    divi();
                }else {
                        suma();
                    }
           ultimaOperacion=1;
        
        }catch(NumberFormatException ex){
            
        JOptionPane.showMessageDialog(null,"Ah bueno, Te Sarpas En Pelotudo");
        num1.setText("");
        result.setText("");
        acumulador=0;
        numero=0;
        }
        
       
        
    }//GEN-LAST:event_sumarActionPerformed
public void suma() {
    if(ultimaOperacion==0) {
        numero = Double.parseDouble(this.num1.getText());
        acumulador=numero;
        numero=0;
        num1.setText("");
        ultimaOperacion=1;
    }else{
    numero = Double.parseDouble(this.num1.getText());
    acumulador=acumulador+numero;
    numero=0;
    num1.setText("");
    ultimaOperacion=1;
}
}

    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed
        try { 
            if (ultimaOperacion==1) {
            suma();
        }else
            if (ultimaOperacion==2) {
                resta();
            }else
                if (ultimaOperacion==3) {
                    mult();
                }else
                    if(ultimaOperacion==4) {
                    divi();
                }else {
                        resta();
                    }
           
           ultimaOperacion=2;
           
        }catch(NumberFormatException ex){
               
        JOptionPane.showMessageDialog(null,"Ah bueno, Te Sarpas En Pelotudo");
        num1.setText("");
        result.setText("");
        acumulador=0;
        numero=0;
        
        }
    }//GEN-LAST:event_restarActionPerformed

    public void resta() {
    if(ultimaOperacion==0) {
        numero = Double.parseDouble(this.num1.getText());
        acumulador=numero;
        numero=0;
        num1.setText("");
        ultimaOperacion=2;
    }else{
    numero = Double.parseDouble(this.num1.getText());
    acumulador=acumulador-numero;
    numero=0;
    num1.setText("");
    ultimaOperacion=2;
    }
}
    
    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed

        try { 
            if (ultimaOperacion==1) {
            suma();
        }else
            if (ultimaOperacion==2) {
                resta();
            }else
                if (ultimaOperacion==3) {
                    mult();
                }else
                    if(ultimaOperacion==4) {
                    divi();
               }else {
                        mult();
                    }
           
           ultimaOperacion=3;
            
        }catch(NumberFormatException ex){
               
        JOptionPane.showMessageDialog(null,"Ah bueno, Te Sarpas En Pelotudo");
        num1.setText("");
        result.setText("");
        acumulador=0;
        numero=0;
        
        }
    }//GEN-LAST:event_multiplicarActionPerformed
public void mult() {
    
    if(ultimaOperacion==0) {
        numero = Double.parseDouble(this.num1.getText());
        acumulador=numero;
        numero=0;
        num1.setText("");
        ultimaOperacion=3;
    }else{
    numero = Double.parseDouble(this.num1.getText());
    acumulador=acumulador*numero;
    numero=0;
    num1.setText("");
    ultimaOperacion=3;
    }
}
    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        
        try { 
            numeroo = Integer.parseInt(this.num1.getText());
            if (ultimaOperacion==1) {
            suma();
        }else
            if (ultimaOperacion==2) {
                resta();
            }else
                if (ultimaOperacion==3) {
                    mult();
                }else
                    if(ultimaOperacion==4) {
                    divi();
                }else {
                        divi();
                    }
            
            ultimaOperacion=4;
           
        }catch(NumberFormatException ex){
               
        JOptionPane.showMessageDialog(null,"Ah bueno, Te Sarpas En Pelotudo");
        num1.setText("");
        result.setText("");
        acumulador=0;
        numero=0;
        
        }
    }//GEN-LAST:event_dividirActionPerformed
public void divi() {
    if(ultimaOperacion==0) {
        acumulador=numeroo;
        numero=0;
        num1.setText("");
        ultimaOperacion=4;
    }else{
    acumulador=acumulador/numero;
    numero=0;
    num1.setText("");
    ultimaOperacion=4;
    }
}
        
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
         num1.setText(null);
         result.setText(null);
         acumulador=0;
         numero=0;
    }//GEN-LAST:event_limpiarActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
      
     
         if (ultimaOperacion==1) {
            suma();
        }else
            if (ultimaOperacion==2) {
                resta();
            }else
                if (ultimaOperacion==3) {
                    mult();
                }else 
                    if (ultimaOperacion==4)
                     {
                    divi();
                } else {
                        acumulador=Integer.parseInt(this.num1.getText());
                    }
        
        
        //JOptionPane.showMessageDialog(null,"El resultado es "+acumulador+"  Ni Una Cuenta Podes Hacer Pelotudo");
       num1.setText(String.valueOf("El resultado es:  ''"+acumulador+"''  Ni Una Cuenta Podes Hacer Pelotudo"));
        
    
       
    }//GEN-LAST:event_igualActionPerformed

    private void factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factActionPerformed
        int numero;
        int resultado=1;
        
        
        numero = Integer.parseInt(this.num1.getText());
        while (numero>=1) {
        resultado=resultado*numero;
        numero=numero-1;
        }
         result.setText(String.valueOf(resultado));
    }//GEN-LAST:event_factActionPerformed

    private void memActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memActionPerformed
       
        memoria = acumulador;
        numero=0;
        acumulador=0;
        num1.setText("");
        result.setText("");
        total=total+memoria;
        
    }//GEN-LAST:event_memActionPerformed

    private void memresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memresultActionPerformed
      result.setText(String.valueOf(total));
      num1.setText("");
    }//GEN-LAST:event_memresultActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        double log;
        
        numero = Integer.parseInt(this.num1.getText());
        
        
    }//GEN-LAST:event_logActionPerformed

    private void igualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_igualKeyReleased

Ventana m=new Ventana();
        int code = evt.getKeyCode(); 
      
      if(evt.getKeyCode() == evt.VK_ENTER) {
          m.igualActionPerformed();
      }else{
          result.setText(String.valueOf("Pelotudo"));
      }

    }//GEN-LAST:event_igualKeyReleased
/*Ventana m=new Ventana();
        int code = evt.getKeyCode(); 
      
      if(evt.getKeyCode() == evt.VK_ENTER) {
          m.igualActionPerformed(null);
      }
        */
  
        
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dividir;
    private javax.swing.JButton fact;
    private javax.swing.JButton igual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton log;
    private javax.swing.JButton mem;
    private javax.swing.JButton memresult;
    private javax.swing.JButton multiplicar;
    private javax.swing.JTextField num1;
    private javax.swing.JButton restar;
    private javax.swing.JTextField result;
    private javax.swing.JButton sumar;
    // End of variables declaration//GEN-END:variables
}
