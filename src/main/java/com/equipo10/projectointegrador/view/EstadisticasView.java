package com.equipo10.projectointegrador.view;

import com.equipo10.projectointegrador.controller.Controller;
import com.equipo10.projectointegrador.model.Especialidad;
import com.equipo10.projectointegrador.model.Incidente;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;

public class EstadisticasView extends javax.swing.JFrame {

    private Controller control;

    public EstadisticasView(Controller control) {
        initComponents();
        this.control = control;
        cargarCB();
        txt1.setText(mostrarResueltosultimos10Dias());
        txt3.setText(mostrarResueltosEnMenorTiempo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbEspe = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("ESTADISTICAS GENERALES");

        cbEspe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspeActionPerformed(evt);
            }
        });

        jLabel3.setText("Elije Especialidad");

        jLabel2.setText("Tecnico que resolvio mas Incidentes los ultimos 10 dias");

        jLabel4.setText("Tecnico que resolvio mas Incidentes de una especialidad los ultimos 10 dias");

        jLabel5.setText("Tecnico con Resolucion mas rapida de Incidentes");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 214, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(355, 355, 355))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(cbEspe, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(txt3, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(cbEspe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbEspeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspeActionPerformed
        txt2.setText(mostrarResueltosultimos10DiasSegunEspecialidad());
    }//GEN-LAST:event_cbEspeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Especialidad> cbEspe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
    private void cargarCB() {
        control.traerTodasEspecialidades()
                .stream()
                .forEach(a -> cbEspe.addItem(a));
    }

    

    private String mostrarResueltosultimos10Dias() {
        LocalDateTime fechaHace10Dias = LocalDateTime.now().minusDays(10);
        
        Optional<Integer> idTecnicoMaxIncidentes = control.traerTodosIncidentes().stream()
                .filter(incidente -> incidente.isEstado() && incidente.getFechaFin().isAfter(fechaHace10Dias))
                .collect(Collectors.groupingBy(incidente -> incidente.getTecnico().getId_tecnico(), Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(entry -> entry.getKey());

        if(idTecnicoMaxIncidentes.isPresent()){
            return String.valueOf(control.traerTecnico(idTecnicoMaxIncidentes.get()));
        }
        return "NotFound";
    }

    private String mostrarResueltosultimos10DiasSegunEspecialidad() {
        LocalDateTime fechaHace10Dias = LocalDateTime.now().minusDays(10);

        // Obtener la especialidad seleccionada desde el combo box
        Especialidad especialidadSeleccionada = (Especialidad) cbEspe.getSelectedItem(); // Ajusta según tu implementación

        // Encontrar al técnico con más incidentes resueltos en la especialidad seleccionada en los últimos 10 días
        Optional<Integer> idTecnicoMaxIncidentes = control.traerTodosIncidentes().stream()
                .filter(incidente -> incidente.isEstado() && incidente.getFechaFin().isAfter(fechaHace10Dias)
                        && incidente.getTecnico().getEspecialidad().equals(especialidadSeleccionada))
                .collect(Collectors.groupingBy(incidente -> incidente.getTecnico().getId_tecnico(), Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(entry -> entry.getKey());

        if (idTecnicoMaxIncidentes.isPresent()) {
            return String.valueOf(control.traerTecnico(idTecnicoMaxIncidentes.get()));
        }
        return "NotFound";
    }

    private String mostrarResueltosEnMenorTiempo() {
        LocalDateTime fechaHace10Dias = LocalDateTime.now().minusDays(10);
        Optional<Integer> idTecnicoMenorSumaTiempos = control.traerTodosIncidentes().stream()
                .filter(incidente -> incidente.isEstado() && incidente.getFechaFin().isAfter(fechaHace10Dias))
                .collect(Collectors.groupingBy(incidente -> incidente.getTecnico().getId_tecnico(),
                        Collectors.summarizingLong(incidente -> Duration.between(incidente.getFechaInicio(), incidente.getFechaFin()).toMinutes())))
                .entrySet().stream()
                .min(Comparator.comparingDouble(entry -> entry.getValue().getSum()))
                .map(entry -> entry.getKey());
        if (idTecnicoMenorSumaTiempos.isPresent()) {
            return String.valueOf(control.traerTecnico(idTecnicoMenorSumaTiempos.get()));
        }
    return "NotFound";
    }   

}
