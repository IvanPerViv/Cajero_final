package Main;

import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JOptionPane;

public class consultaSaldo extends javax.swing.JFrame {

    protected String nombre, apellidos, tarjeta;
    protected Movimiento mov;
    
    public consultaSaldo(double saldo, String nombre, String apellidos, String tarjeta) {
        initComponents();
        setLocationRelativeTo(this);
        Saldo.setText(Double.toString(saldo));
        jUser.setText(nombre + " " + apellidos);
        Tarjeta.setText("Numero de tarjeta: " + tarjeta);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tarjeta = tarjeta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu = new javax.swing.JPanel();
        jCerrarVentana = new javax.swing.JLabel();
        jMinimizarVentana = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jMenuSaldo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tarjeta = new javax.swing.JLabel();
        Saldo = new javax.swing.JLabel();
        Euro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jFondoCuadrado = new javax.swing.JLabel();
        jVolverMenu = new javax.swing.JLabel();
        fondo1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jUser = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu.setBackground(new java.awt.Color(204, 0, 0));
        jMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jMenu.setForeground(new java.awt.Color(204, 0, 0));
        jMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenuMouseDragged(evt);
            }
        });
        jMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuMousePressed(evt);
            }
        });
        jMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCerrarVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-cerrar-ventana-50.png"))); // NOI18N
        jCerrarVentana.setToolTipText("Cerrar ventana.");
        jCerrarVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCerrarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCerrarVentanaMouseClicked(evt);
            }
        });
        jMenu.add(jCerrarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        jMinimizarVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-minimizar-la-ventana-50.png"))); // NOI18N
        jMinimizarVentana.setToolTipText("Minimizar ventana");
        jMinimizarVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMinimizarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinimizarVentanaMouseClicked(evt);
            }
        });
        jMenu.add(jMinimizarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("BANCO ROVAN");
        jMenu.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 4, 280, 40));

        getContentPane().add(jMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        jMenuSaldo.setBackground(new java.awt.Color(255, 255, 255));
        jMenuSaldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jMenuSaldo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EL SALDO ACTUAL DE SU CUENTA");
        jMenuSaldo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, 40));

        Tarjeta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Tarjeta.setForeground(new java.awt.Color(204, 0, 0));
        Tarjeta.setText("TARJETA XXXX-XXXX-XXXX-XXXX");
        jMenuSaldo.add(Tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 230, 30));

        Saldo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Saldo.setForeground(new java.awt.Color(255, 255, 255));
        Saldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Saldo.setText("1000,00");
        jMenuSaldo.add(Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 210, 50));

        Euro.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Euro.setForeground(new java.awt.Color(255, 255, 255));
        Euro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Euro.setText("€");
        jMenuSaldo.add(Euro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 60, 50));
        jMenuSaldo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 270, 20));

        jFondoCuadrado.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jFondoCuadrado.setForeground(new java.awt.Color(255, 255, 255));
        jFondoCuadrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFondoCuadrado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jMenuSaldo.add(jFondoCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 400, 140));

        jVolverMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-volver-50.png"))); // NOI18N
        jVolverMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVolverMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVolverMenuMouseClicked(evt);
            }
        });
        jMenuSaldo.add(jVolverMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 50, 50));

        fondo1.setBackground(new java.awt.Color(204, 0, 0));
        fondo1.setForeground(new java.awt.Color(204, 0, 0));
        fondo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondo1.setBorderPainted(false);
        fondo1.setEnabled(false);
        jMenuSaldo.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 420, 160));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("VOLVER...");
        jMenuSaldo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 70, -1));

        jUser.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jUser.setForeground(new java.awt.Color(153, 153, 153));
        jUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jUser.setText("<USER>");
        jMenuSaldo.add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 230, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPanelUsuario/icons8-logotipo-mastercard-25.png"))); // NOI18N
        jMenuSaldo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 30, 30));

        getContentPane().add(jMenuSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCerrarVentanaMouseClicked
        int mensaje = JOptionPane.YES_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "¿Desea cerrar la ventana?", "Salir", mensaje);
        if (resultado == 0) {
            new menuUsuario(nombre, apellidos, tarjeta).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jCerrarVentanaMouseClicked

    private void jMinimizarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizarVentanaMouseClicked
        setState(menuMainCajero.ICONIFIED);
    }//GEN-LAST:event_jMinimizarVentanaMouseClicked

    private void jVolverMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVolverMenuMouseClicked
        // BOTON VOLVER MENU USUARIO.
        // new menuUsuario().setVisible(true);
        new menuUsuario(nombre, apellidos, tarjeta).setVisible(true);
        dispose();
    }//GEN-LAST:event_jVolverMenuMouseClicked

    private void jMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMousePressed
        mov = new Movimiento(evt);
    }//GEN-LAST:event_jMenuMousePressed

    private void jMenuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMouseDragged
        int cordX = mov.x;
        int cordY = mov.y;
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - cordX, point.y - cordY);
    }//GEN-LAST:event_jMenuMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Euro;
    private javax.swing.JLabel Saldo;
    private javax.swing.JLabel Tarjeta;
    private javax.swing.JButton fondo1;
    private javax.swing.JLabel jCerrarVentana;
    private javax.swing.JLabel jFondoCuadrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jMenu;
    private javax.swing.JPanel jMenuSaldo;
    private javax.swing.JLabel jMinimizarVentana;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jUser;
    private javax.swing.JLabel jVolverMenu;
    // End of variables declaration//GEN-END:variables
}
