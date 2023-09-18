/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulp.Vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import universidadulp.AccesoADatos.Conexion;
import universidadulp.AccesoADatos.MateriaData;
import universidadulp.Entidades.Alumno;
import universidadulp.Entidades.Materia;

/**
 *
 * @author jero
 */
public class AlumnosPorMateria extends javax.swing.JInternalFrame {
     
    /**
     * Creates new form AlumnosPorMateria
     */
    public AlumnosPorMateria() {
       initComponents();
       llenarCombo();
        mostrarTabla();
        Alumno alu=new Alumno();
        DefaultTableModel modelo = new DefaultTableModel( );
        jtTablaMaterias.setModel(modelo);
        Connection  con=Conexion.getConnection();
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
        jCselectMat = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaMaterias = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Listado de alumnos por materia");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("Seleccione una materia:");

        jCselectMat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCselectMat.setForeground(java.awt.Color.black);
        jCselectMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCselectMatActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setForeground(java.awt.Color.black);
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jtTablaMaterias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtTablaMaterias.setForeground(java.awt.Color.black);
        jtTablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ));
        jtTablaMaterias.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtTablaMateriasAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jtTablaMaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jCselectMat, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCselectMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(jButton4)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCselectMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCselectMatActionPerformed
     llenarCombo();
    }//GEN-LAST:event_jCselectMatActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     dispose();        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtTablaMateriasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtTablaMateriasAncestorAdded
  mostrarTabla();        // TODO add your handling code here:
    }//GEN-LAST:event_jtTablaMateriasAncestorAdded
 public void llenarCombo(){
  Materia materia =new Materia();
      MateriaData alu =new MateriaData();
      ArrayList <Materia> listaMaterias =(ArrayList <Materia>) alu.listarMateria();
        
      for(int i=0; i<listaMaterias.size() ;i++){
      jCselectMat.addItem(listaMaterias.get(i).getNombre());
      jCselectMat.addItem("---------------------------------------");
      }
 }
   /* public Vector  <Alumno>mostrarAlumnosxMateria(){
      DefaultTableModel modelo =new DefaultTableModel();
     PreparedStatement ps=null;
        ResultSet rs =null;
         Materia materia= new Materia(title, SOMEBITS, isIcon);
        Connection con =Conexion.getConnection();
        Vector<Alumno>datos=new Vector<Alumno>();
        Alumno dat =null;
        try {
         String sql ="SELECT alumno.idalumno, alumno.dni, alumno.nombre, alumno.apellido \" +\n" +
"                         \"FROM alumno \" +\n" +
"                         \"INNER JOIN inscripcion ON alumno.idalumno = inscripcion.idalumno \" +\n" +
"                         \"INNER JOIN materia ON inscripcion.idmateria = materia.idmateria \" +\n" +
"                         \"WHERE materia.nombre = ?\"";
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         //agregar una opcion
         //dat =new Alumno();
         //dat.setIdAlumno( 0);
         //dat.setNombre("seleccione una materia");
         datos.add(dat);
         while(rs.next()){
         Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idalumno"));
                String dni =rs.getString("dni");
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                datos.add(alumno);

         }
         rs.close();
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla de datos ");
     }
        
     return datos;   
         
 
 }*/
     public void mostrarTabla() {
         Connection  con=Conexion.getConnection();
        String[] col = {"ID", "DNI", "Apellido", "Nombre"};
        DefaultTableModel modelo = new DefaultTableModel(null, col) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        jtTablaMaterias.setModel(modelo);
        jtTablaMaterias.setAutoCreateRowSorter(true);
        TableColumnModel columna = jtTablaMaterias.getColumnModel();
        columna.getColumn(0).setMaxWidth(30);

        String sql = "SELECT alumno.idAlumno, alumno.dni, alumno.apellido, alumno.nombre\n"
                + "FROM `alumno`\n"
                + "INNER JOIN inscripcion\n"
                + "ON alumno.idAlumno = inscripcion.idAlumno\n"
                + "INNER JOIN materia\n"
                + "ON materia.idMateria = inscripcion.idMateria\n"
                + "WHERE materia.nombre=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, jCselectMat.getSelectedItem().toString());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("alumno.idAlumno"));
                String dni = String.valueOf(rs.getInt("alumno.dni"));
                String apellido = rs.getString("alumno.apellido");
                String nombre = rs.getString("alumno.nombre");
                String[] dataM = {id, dni, apellido, nombre};
                modelo.addRow(dataM);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error..");
        }

    }

    public void mostrarComboBox() {
        Connection  con=Conexion.getConnection();
        String sql = "select nombre from materia WHERE 1 order by idMateria ASC";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                jCselectMat.addItem(nombre);
            }
        } catch (SQLException ex) {
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCselectMat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTablaMaterias;
    // End of variables declaration//GEN-END:variables
}
