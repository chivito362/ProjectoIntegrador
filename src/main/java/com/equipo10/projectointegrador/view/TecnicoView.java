
package com.equipo10.projectointegrador.view;

import com.equipo10.projectointegrador.controller.Controller;
import com.equipo10.projectointegrador.model.Incidente;
import com.equipo10.projectointegrador.model.Tecnico;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Optional;
import javax.swing.table.DefaultTableModel;


public class TecnicoView extends javax.swing.JFrame {

    private Controller control;
    DefaultTableModel model=new DefaultTableModel();
    
    public TecnicoView(Controller control) {
        initComponents();
        this.control=control;
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
        jButton1 = new javax.swing.JButton();

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

        jButton1.setText("Marcar como Finalizado ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
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
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JComboBox<Tecnico> cbTecnico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        String[] columns={"id","desc","tipo","estimado"};
        model.setColumnIdentifiers(columns);
        Tabla.setModel(model);
    }
    private void limpiarTabla(){
        for (int i = model.getRowCount()-1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    
    private void datosTabla(){
        control.traerTodosIncidentes().stream()
                .filter(in->in.getTecnico().getId_tecnico()==((Tecnico)cbTecnico.getSelectedItem()).getId_tecnico()).forEach(
                String desc=inci.getDescripcion();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'a las' HH:mm a", new Locale("es", "AR"));
                    String fecha=inci.getFechaInicio().format(formatter);
                    int id=inci.getId_incidente();
                    String tipo=inci.getTipo().getNombre_problema();
                );
                
    }
    private void cargarCB(){
        control.traerTodosTecnicos().stream().forEach(tec->cbTecnico.addItem(tec));
    }
}
