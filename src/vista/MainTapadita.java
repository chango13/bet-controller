/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
//import java.io.File;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
//import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
/*import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;*/
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import modelo.Apuesta;
import modelo.Sorteo;




/**
 *
 * @author chango
 */
public class MainTapadita extends javax.swing.JFrame {

    /**
     * Creates new form mainTapadita
     */
    File archivoExcel = null;
    File unExcel = null;
   DefaultTableModel modelo;
   DefaultTableModel mod;
   List listaSorteo;
   List <Apuesta>listaApuestas;
   List <Apuesta>listaAciertos;
   
        Sorteo sorteo;
        
   
    public MainTapadita() {
        initComponents();
        mod = new DefaultTableModel();
        //model = new DefaultTableModel();
        modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        jTable1.setModel(mod);
        listaSorteo = new ArrayList();
        listaApuestas = new ArrayList<Apuesta>();
        listaAciertos = new ArrayList<Apuesta>();
       
        sorteo = new Sorteo();
        
        this.setTitle("Tapadita v1.0");
        
        this.setLocationRelativeTo(null);
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Agregar Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla.setAutoCreateRowSorter(true);
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton2.setText("Cargar sorteo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Controlar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(583, 583, 583)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // TODO add your handling code here:
      JFileChooser examinar = new JFileChooser();
       examinar.setFileFilter(new FileNameExtensionFilter("archivos excel", "xlsx", "xls"));
       int opcion = examinar.showOpenDialog(this);
       
       if (opcion == JFileChooser.APPROVE_OPTION){
       archivoExcel = examinar.getSelectedFile().getAbsoluteFile();
       }

      
        try {
            Workbook leerExcel = Workbook.getWorkbook(archivoExcel);
            for (int hoja = 0; hoja < leerExcel.getNumberOfSheets(); hoja++){
                Sheet hojaActiva = leerExcel.getSheet(hoja);
                int columnas = hojaActiva.getColumns();
                int filas = hojaActiva.getRows();
                Object datos[] = new Object[columnas];
                
                for(int fila = 0; fila<filas; fila++){
                    Apuesta apuesta = new Apuesta();
                     List num=new ArrayList();
                     for(int columna = 0; columna<columnas;columna++){
                         
                        if (fila ==0){
                            modelo.addColumn(hojaActiva.getCell(columna, fila).getContents());
                        }
                       // System.out.println(hojaActiva.getCell(columna, fila).getContents());
                        if (fila>=1){
                            datos[columna] =  hojaActiva.getCell(columna, fila).getContents();
                        }
                            if(columna==0){
                                apuesta.setNombre(hojaActiva.getCell(columna, fila).getContents());
                            }       
                                if(columna>0){
                                num.add(hojaActiva.getCell(columna, fila).getContents());
                              } 
                             
                            }
                     Collections.sort(num);
                    apuesta.setNumeros(num);
                    listaApuestas.add(apuesta);
                    modelo.addRow(datos);
                  System.out.println("Cantidad apuestas: "+listaApuestas.size());
                  System.out.println("Apostador: "+listaApuestas.get(fila).getNombre());
                  System.out.println("Apuesta: "+listaApuestas.get(fila).getNumeros());
                }
               }
           modelo.removeRow(0);
        } catch (IOException | BiffException ex) {
            Logger.getLogger(MainTapadita.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       // TODO add your handling code here:
      JFileChooser exam = new JFileChooser();
       exam.setFileFilter(new FileNameExtensionFilter("archivos excel", "xlsx", "xls"));
       int op = exam.showOpenDialog(this);
       
       if (op == JFileChooser.APPROVE_OPTION){
       unExcel = exam.getSelectedFile().getAbsoluteFile();
       }
 
          try {
            Workbook getExcel = Workbook.getWorkbook(unExcel);
           for (int hoja = 0; hoja < getExcel.getNumberOfSheets(); hoja++){
                Sheet hojaActiva = getExcel.getSheet(hoja);
                int column = hojaActiva.getColumns();
                int fil = hojaActiva.getRows();
                List nume= new ArrayList();
                Object datos[] = new Object[column];
                for(int fila = 0; fila<fil; fila++){
                    for(int columna = 0; columna<column;columna++){
                        if (fila ==0){
                            mod.addColumn(hojaActiva.getCell(columna, fila).getContents());
                        }
                        System.out.println(hojaActiva.getCell(columna, fila).getContents());
                        if (fila>=1){
                            datos[columna] = hojaActiva.getCell(columna, fila).getContents();
                          if(columna>0){
                                listaSorteo.add(hojaActiva.getCell(columna, fila).getContents());
                                       // }else{
                           }
                          }                  
                         }
                    mod.addRow(datos);    
                }
                    Set Hash = new HashSet(listaSorteo);
                    listaSorteo.clear();
                    listaSorteo.addAll(Hash);
                    Collections.sort(listaSorteo);
                    for(Object sor:listaSorteo){
                    System.out.println("numeros sorteados: "+sor);}
                }
             mod.removeRow(0);
          }
        catch (BiffException ex) {
              Logger.getLogger(MainTapadita.class.getName()).log(Level.SEVERE, null, ex);
          
    
        } catch (IOException ex) {    
           Logger.getLogger(MainTapadita.class.getName()).log(Level.SEVERE, null, ex);
       }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
               List<Apuesta> aciertos= new ArrayList();
        String columnas[]={"Nombre", "N1", "N2", "N3", "N4", "N5", "N6", "N7", 
                            "N8", "N9", "N10"};
        for(int i=0;i<listaApuestas.size();i++){
            Apuesta apu= listaApuestas.get(i);
            aciertos.add(apu.coincidencias(apu, listaSorteo));
            
        }
            for(int i=0;i<aciertos.size()-1;i++){
            for(int j=i+1;j<aciertos.size();j++){
               if(aciertos.get(i).getNumeros().size()<aciertos.get(j).getNumeros().size()){
                   Apuesta aux= aciertos.get(i);
                   aciertos.set(i, aciertos.get(j));
                   aciertos.set(j, aux);
               }
            }
          }
             for(int m=0;m<aciertos.size();m++){  
                 System.out.println("acierto: "+aciertos.get(m).getNombre()+aciertos.get(m).getNumeros());
              }
             DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(columnas);
                int fila= aciertos.size();
                for(int fil=0;fil<fila;fil++){
               Object dato[]=new Object[11];
                   if(aciertos.get(fil)!= null){
                 dato[0]=aciertos.get(fil).getNombre();
                    int col=aciertos.get(fil).getNumeros().size();
                        for(int colu=0;colu<col;colu++){
                        dato[colu+1]=aciertos.get(fil).getNumeros().get(colu);
                   }
                  }
                  model.addRow(dato);
                  }
               //model.removeRow(0);
      new Control().setVisible(true);
               Control.tablaControl.setModel(model);
       
             
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainTapadita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainTapadita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainTapadita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainTapadita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
         
            new MainTapadita().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
