package com.equipo10.projectointegrador.view;

import com.equipo10.projectointegrador.controller.Controller;


public class AdminView extends javax.swing.JFrame {

    private Controller control;

    public AdminView(Controller control) {
        initComponents();
        this.control=control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRH = new javax.swing.JButton();
        btnMesa = new javax.swing.JButton();
        btnComer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnTecnicos = new javax.swing.JMenu();
        btnCliente = new javax.swing.JMenuItem();
        btnTec = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnEstadisticas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRH.setText("Vista RRHH");
        btnRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRHActionPerformed(evt);
            }
        });

        btnMesa.setText("Vista Mesa Ayuda");
        btnMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesaActionPerformed(evt);
            }
        });

        btnComer.setText("Vista Comercial");
        btnComer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComerActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnTecnicos.setText("Vistas");
        btnTecnicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecnicosActionPerformed(evt);
            }
        });

        btnCliente.setText("Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        btnTecnicos.add(btnCliente);

        btnTec.setText("Tecnicos");
        btnTec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecActionPerformed(evt);
            }
        });
        btnTecnicos.add(btnTec);

        jMenuBar1.add(btnTecnicos);

        jMenu2.setText("Estadisticas");

        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        jMenu2.add(btnEstadisticas);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnRH)
                .addGap(85, 85, 85)
                .addComponent(btnMesa)
                .addGap(80, 80, 80)
                .addComponent(btnComer)
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRH)
                    .addComponent(btnMesa)
                    .addComponent(btnComer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRHActionPerformed
        TecnicosCRUDView ventana=new TecnicosCRUDView(control);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRHActionPerformed

    private void btnMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesaActionPerformed
        IncidentesView ventana=new IncidentesView(control);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMesaActionPerformed

    private void btnComerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComerActionPerformed
        ClientesCRUDView ventana=new ClientesCRUDView(control);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnComerActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        ClienteView ventana=new ClienteView(control);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnTecnicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecnicosActionPerformed
        
    }//GEN-LAST:event_btnTecnicosActionPerformed

    private void btnTecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecActionPerformed
        TecnicoView ventana1=new TecnicoView(control);
        ventana1.setVisible(true);
        ventana1.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnTecActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        EstadisticasView ventana=new EstadisticasView(control);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEstadisticasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCliente;
    private javax.swing.JButton btnComer;
    private javax.swing.JMenuItem btnEstadisticas;
    private javax.swing.JButton btnMesa;
    private javax.swing.JButton btnRH;
    private javax.swing.JMenuItem btnTec;
    private javax.swing.JMenu btnTecnicos;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
