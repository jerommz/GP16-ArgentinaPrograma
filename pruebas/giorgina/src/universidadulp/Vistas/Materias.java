/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulp.Vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import universidadulp.AccesoADatos.Conexion;
import universidadulp.AccesoADatos.MateriaData;
import universidadulp.Entidades.Materia;

/**
 *
 * @author jero
 */
public class Materias extends javax.swing.JInternalFrame {
      MateriaData materiaDB = new MateriaData();
      //private Connection con;
      Connection  con =Conexion.getConnection();

    /**
     * Creates new form Materias
     */
    public Materias() {
        initComponents();
      
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtcodigo = new javax.swing.JTextField();
        jtnombre = new javax.swing.JTextField();
        jtanio = new javax.swing.JTextField();
        jrbestado = new javax.swing.JCheckBox();
        jbnuevo = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();
        jbbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaMateria = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Materia");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("Codigo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("Estado");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setForeground(java.awt.Color.black);
        jLabel8.setText("Año");

        jtcodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtcodigo.setForeground(java.awt.Color.black);

        jtnombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtnombre.setForeground(java.awt.Color.black);

        jtanio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtanio.setForeground(java.awt.Color.black);

        jrbestado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrbestado.setForeground(java.awt.Color.black);
        jrbestado.setText("Marque si esta activa");

        jbnuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnuevo.setForeground(java.awt.Color.black);
        jbnuevo.setText("Nuevo");
        jbnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnuevoActionPerformed(evt);
            }
        });

        jbeliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbeliminar.setForeground(java.awt.Color.black);
        jbeliminar.setText("Eliminar");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbModificar.setForeground(java.awt.Color.black);
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbsalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbsalir.setForeground(java.awt.Color.black);
        jbsalir.setText("Salir");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        jbbuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbbuscar.setForeground(java.awt.Color.black);
        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jtTablaMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jtTablaMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaMateriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTablaMateria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbbuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbeliminar)
                                        .addGap(43, 43, 43)
                                        .addComponent(jbModificar)
                                        .addGap(32, 32, 32)
                                        .addComponent(jbsalir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addComponent(jLabel1))
                                            .addComponent(jrbestado)
                                            .addComponent(jtanio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jbnuevo)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbbuscar))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jrbestado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnuevo)
                    .addComponent(jbeliminar)
                    .addComponent(jbModificar)
                    .addComponent(jbsalir))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnuevoActionPerformed
       try {
            if (jtnombre.getText() == null || jtanio.getText() == null) {
                JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos menos codigo.");
            } else {
                if (jtcodigo.getText() != null) {
                    JOptionPane.showMessageDialog(null, "No es necesario llenar campo codigo al agregar materia.");
                    jtcodigo.setText("");
                    String nombre = jtnombre.getText();
                    int anio = Integer.parseInt(jtanio.getText());
                    boolean estado = jrbestado.isEnabled();
                    Materia mat = new Materia(nombre, anio, estado);
                    materiaDB.guardarMateria(mat);
                }
            }
       }catch (Exception  e){
         JOptionPane.showMessageDialog(null, "Error al cargar materia nueva");
       }
    }//GEN-LAST:event_jbnuevoActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
     if (jtnombre.getText() == null  || jtanio.getText()==(null ) ) {
            JOptionPane.showMessageDialog(null, "Primero debe realizar una busqueda.");
        } else {
            try {
                
                int codigo = Integer.parseInt(jtcodigo.getText());
                String sql = "select idAlumno from alumno where dni=?";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, codigo);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    int idmateria = rs.getInt("idMateria");
                    materiaDB.eliminarMateria(codigo);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
            }
     }
    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
               
           String sql = "select idMateria from materia";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int i = jtTablaMateria.getSelectedRow();
                        
                String id = jtTablaMateria.getModel().getValueAt(i, 0).toString();
                String nombre = jtnombre.getText();
                int anio = Integer.parseInt(jtanio.getText());
                boolean estado = jrbestado.isSelected();
                Materia mat = new Materia(Integer.valueOf(id), nombre, anio, estado);
                DefaultTableModel mod = (DefaultTableModel) jtTablaMateria.getModel();
                mod.setRowCount(0);
                tabla();
                materiaDB.modificarMateria(mat);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error inesperado.");
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos excepto el codigo.");
        }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos excepto el codigo.");
        }


    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
       dispose();
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbbuscarActionPerformed

    private void jtTablaMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaMateriaMouseClicked
             // TODO add your handling code here:
        int i = jtTablaMateria.getSelectedRow();
        String val = jtTablaMateria.getModel().getValueAt(i, 0).toString();
        int id = Integer.valueOf(val);
        String nombre = materiaDB.buscaMateria(id).getNombre();
        int anio = materiaDB.buscaMateria(id).getAnioMateria();
        Boolean estado = materiaDB.buscaMateria(id).isActivo();
        jtcodigo.setText(String.valueOf(id));
        jtnombre.setText(nombre);
        jtanio.setText(String.valueOf(anio));
        jrbestado.setSelected(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTablaMateriaMouseClicked
     private void    tabla(){
    
 try{
  DefaultTableModel modelo =new DefaultTableModel();
  jtTablaMateria.setModel(modelo);
  PreparedStatement ps =null;
  ResultSet rs=null;
  Connection con =Conexion.getConnection();
  
  String sql ="SELECT idMateria,nombre FROM materia WHERE estado=1";
  ps =con.prepareStatement(sql);
  rs =ps.executeQuery();
  ResultSetMetaData rsMd =rs.getMetaData();
  int cantidadColumnas =rsMd.getColumnCount();
  modelo.addColumn("CODIGO");
  modelo.addColumn("NOMBRE_MATERIA");
  
  while(rs.next()){
Object []filas =new Object[cantidadColumnas];
for(int i =0;i<cantidadColumnas;i++){
filas[i]=rs.getObject(i+1);
}
modelo.addRow(filas);
  
  }
          
          
 }catch(SQLException e){
 JOptionPane.showMessageDialog(null,"Error al cargar tabla de datos");
 }
}




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbnuevo;
    private javax.swing.JButton jbsalir;
    private javax.swing.JCheckBox jrbestado;
    private javax.swing.JTable jtTablaMateria;
    private javax.swing.JTextField jtanio;
    private javax.swing.JTextField jtcodigo;
    private javax.swing.JTextField jtnombre;
    // End of variables declaration//GEN-END:variables
/* public void mostrarTabla(){
        String [] col = {"ID", "Nombre"};
        DefaultTableModel modelo=new DefaultTableModel(null, col);
        jtTablaMateria.setModel(modelo);
        TableColumnModel columna= jtTablaMateria.getColumnModel();
        columna.getColumn(0).setMaxWidth(25);
        
        String sql="select idMateria, nombre from materia";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                modelo.addRow(new Object [] {rs.getInt("idMateria"), rs.getString("nombre")});
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error..");
        }
    }*/
        




}