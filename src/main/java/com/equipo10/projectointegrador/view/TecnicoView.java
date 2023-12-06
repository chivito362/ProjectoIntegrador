package com.equipo10.projectointegrador.view;

import com.equipo10.projectointegrador.controller.Controller;
import com.equipo10.projectointegrador.model.Incidente;
import com.equipo10.projectointegrador.model.Tecnico;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TecnicoView extends javax.swing.JFrame {

    private Controller control;
    DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
        return false;
    }
    };

    public TecnicoView(Controller control) {
        initComponents();
        this.control = control;
        cargarCB();
        cargarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cbTecnico = new javax.swing.JComboBox<>();
        btnFin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista Incidentes");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jLabel2.setText("Seleccione Tecnico");

        cbTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTecnicoActionPerformed(evt);
            }
        });

        btnFin.setText("Marcar como Finalizado ");
        btnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbTecnico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFin)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnFin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTecnicoActionPerformed
        datosTabla();
    }//GEN-LAST:event_cbTecnicoActionPerformed

    private void btnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinActionPerformed
        
        int id=Integer.parseInt(Tabla.getValueAt(Tabla.getSelectedRow(), 0).toString());
        Incidente inci=control.traerIncidente(id);
        inci.setEstado(true);
        inci.setFechaFin(LocalDateTime.now());
        control.editarIncidente(inci);
        JOptionPane.showMessageDialog(null, "Incidente finalizado");
        datosTabla();
    }//GEN-LAST:event_btnFinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnFin;
    private javax.swing.JComboBox<Tecnico> cbTecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        String[] columns = {"id", "desc", "tipo", "estimado"};
        model.setColumnIdentifiers(columns);
        Tabla.setModel(model);
        datosTabla();
    }

    private void limpiarTabla() {
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    private void datosTabla() {
        limpiarTabla();
        List<Incidente> incidentes = control.traerTodosIncidentes().stream()
                .filter(in -> in.getTecnico().getId_tecnico() == ((Tecnico) cbTecnico.getSelectedItem()).getId_tecnico() && !in.isEstado())
                .collect(Collectors.toList());
        for (Incidente in : incidentes) {
            String desc = in.getDescripcion();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'a las' HH:mm a", new Locale("es", "AR"));
            String fecha = in.getFechaInicio().format(formatter);
            int id = in.getId_incidente();
            String tipo = in.getTipo().getNombre_problema();
            Object[] obj={id,desc,tipo,fecha};
            model.addRow(obj);
        }
    }

    private void cargarCB() {
        control.traerTodosTecnicos().stream().forEach(tec -> cbTecnico.addItem(tec));
    }
}
