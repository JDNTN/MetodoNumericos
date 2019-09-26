package FrontEnd;

import Objetos.ManejadorFalsa;
import Objetos.TablaFalsa;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableList;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author dntn
 */
public class Falso extends javax.swing.JFrame {

    private List<TablaFalsa> listaDatos;
    private ObservableList<TablaFalsa> listaObservableDatos;

    public Falso() {
        listaDatos = new ArrayList<>();
        listaObservableDatos = ObservableCollections.observableList(listaDatos);
        initComponents();
    }
  
    
      public void actualizarLista(List<TablaFalsa> listadoJugadores) {
        this.listaObservableDatos.clear(); 
       this.listaObservableDatos.addAll(listadoJugadores);
    }

    //metodo que entiende la tabla para llenar su informacion
    public ObservableList<TablaFalsa> getListaDatos() {
        return listaObservableDatos;
    }

    //cambia la informacion de la tabla
    public void setListaObservableDatos(ObservableList<TablaFalsa> listaDatos) {
        this.listaObservableDatos = listaDatos;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonInteracionBiseccion = new javax.swing.JButton();
        x1Text = new javax.swing.JTextField();
        xuText = new javax.swing.JTextField();
        xrText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textoFuncion = new javax.swing.JTextField();
        textoValor1 = new javax.swing.JTextField();
        textoValor2 = new javax.swing.JTextField();
        botonPorcentajeBiseccion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        eaText = new javax.swing.JTextField();
        textoIntereaciones = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${listaDatos}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${interacion}"));
        columnBinding.setColumnName("Interacion");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${x1}"));
        columnBinding.setColumnName("X1");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${xu}"));
        columnBinding.setColumnName("Xu");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${xr}"));
        columnBinding.setColumnName("Xr");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fx1}"));
        columnBinding.setColumnName("Fx1");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fxu}"));
        columnBinding.setColumnName("Fxu");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fxr}"));
        columnBinding.setColumnName("Fxr");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${et}"));
        columnBinding.setColumnName("Et");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ea}"));
        columnBinding.setColumnName("Ea");
        columnBinding.setColumnClass(Double.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        botonInteracionBiseccion.setText("Interacion");
        botonInteracionBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInteracionBiseccionActionPerformed(evt);
            }
        });

        jLabel5.setText("X1");

        jLabel6.setText("Xu");

        jLabel7.setText("Xr");

        jLabel1.setText("Funcion");

        jLabel2.setText("Limite 1");

        jLabel3.setText("Limite 2");

        textoFuncion.setText("e^-x-x");
        textoFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFuncionActionPerformed(evt);
            }
        });

        textoValor1.setText("0");
        textoValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoValor1ActionPerformed(evt);
            }
        });

        textoValor2.setText("1");
        textoValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoValor2ActionPerformed(evt);
            }
        });

        botonPorcentajeBiseccion.setText("%");
        botonPorcentajeBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPorcentajeBiseccionActionPerformed(evt);
            }
        });

        jLabel4.setText("Interaciones/%");

        jLabel8.setText("Ea");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textoValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(x1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xuText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoIntereaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(xrText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eaText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonPorcentajeBiseccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonInteracionBiseccion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(textoValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(textoValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(textoIntereaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonPorcentajeBiseccion)
                        .addComponent(botonInteracionBiseccion))
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(x1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(xuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(xrText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int columna=jTable1.getSelectedRow();
        x1Text.setText(String.valueOf(listaDatos.get(columna).getX1()));
        xrText.setText(String.valueOf(listaDatos.get(columna).getXr()));
        xuText.setText(String.valueOf(listaDatos.get(columna).getXu()));
        eaText.setText(String.valueOf(listaDatos.get(columna).getEa()));
    }//GEN-LAST:event_jTable1MouseClicked

    private void botonInteracionBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInteracionBiseccionActionPerformed
        List<TablaFalsa> tabla;
        String funcion = textoFuncion.getText();
        double valor1 = Double.parseDouble(textoValor1.getText());
        double valor2 = Double.parseDouble(textoValor2.getText());
        int interaciones=Integer.parseInt(textoIntereaciones.getText());
        tabla=ManejadorFalsa.generarTablaInteraciones(funcion, valor1, valor2, interaciones);
        actualizarLista(tabla);
    }//GEN-LAST:event_botonInteracionBiseccionActionPerformed

    private void textoValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoValor1ActionPerformed

    private void textoValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoValor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoValor2ActionPerformed

    private void botonPorcentajeBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPorcentajeBiseccionActionPerformed
        List<TablaFalsa> tabla=new ArrayList<>();
        String funcion = textoFuncion.getText();
        double valor1 = Double.parseDouble(textoValor1.getText());
        double valor2 = Double.parseDouble(textoValor2.getText());

        double porcentaje= Double.parseDouble(textoIntereaciones.getText());
        tabla=ManejadorFalsa.generarTablaPorcentual(funcion, valor1, valor2, porcentaje);
        actualizarLista(tabla);
    }//GEN-LAST:event_botonPorcentajeBiseccionActionPerformed

    private void textoFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoFuncionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInteracionBiseccion;
    private javax.swing.JButton botonPorcentajeBiseccion;
    private javax.swing.JTextField eaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textoFuncion;
    private javax.swing.JTextField textoIntereaciones;
    private javax.swing.JTextField textoValor1;
    private javax.swing.JTextField textoValor2;
    private javax.swing.JTextField x1Text;
    private javax.swing.JTextField xrText;
    private javax.swing.JTextField xuText;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
