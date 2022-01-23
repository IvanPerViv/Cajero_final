package Main;

import java.awt.*;
import java.io.*;
import java.sql.*;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import utils.Slide;
import org.apache.commons.validator.routines.CreditCardValidator;

/**
 * Tupla BBDD convertida en objeto.
 *
 * @author Iván y Roberto.
 */
public class menuMainCajero extends javax.swing.JFrame {

    protected Slide slide;
    protected final String queryTarjeta = "SELECT numero, pin, nif_cliente FROM tarjeta WHERE numero = ? AND pin = ?";
    protected Movimiento mov;
    protected Proper prop;
    protected Cliente cliente;

    public menuMainCajero() {
        initComponents();
        setLocationRelativeTo(null);
        slide = new Slide();
        prop = new Proper();

    }

    /**
     * Metodos para mover los paneles de login ADMIN
     */
    protected void moverPanelAdminArriba() {
        slide.jPanelXDerecha(390, 800, 10, 5, jLogo);
        slide.jPanelYArriba(340, 50, 10, 5, jMenuAdmin);
    }

    protected void moverPanelAdminAbajo() {
        slide.jPanelXIzquierda(800, 390, 10, 5, jLogo);
        slide.jPanelYAbajo(50, 340, 10, 5, jMenuAdmin);
    }

    /**
     * Metodos para mover los paneles de login USER.
     */
    protected void moverPanelUsuarioArriba() {
        slide.jPanelYAbajo(50, 340, 10, 5, jLogin);
        slide.jPanelYArriba(340, 50, 10, 5, jTarjetaCliente);
    }

    protected void moverPanelUsuarioAbajo() {
        slide.jPanelYAbajo(50, 340, 10, 5, jTarjetaCliente);
        slide.jPanelYArriba(340, 50, 10, 5, jLogin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu = new javax.swing.JPanel();
        jCerrarVentana = new javax.swing.JLabel();
        jMinimizarVentana = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTarjetaCliente = new javax.swing.JPanel();
        numeroTarjeta = new javax.swing.JTextField();
        jPassW = new javax.swing.JPasswordField();
        jUserValidacion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jVolver = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLogin = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBotonAccesoCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBotonAdmin = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jFondoLogin = new javax.swing.JPanel();
        jMenuAdmin = new javax.swing.JPanel();
        jUserAdmin = new javax.swing.JTextField();
        jPass = new javax.swing.JTextField();
        jVolverAtras = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        botonAdmin = new javax.swing.JButton();
        jLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jFondoAdmin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 340));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 340));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu.setBackground(new java.awt.Color(204, 0, 0));
        jMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
        jMenu.add(jCerrarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

        jMinimizarVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-minimizar-la-ventana-50.png"))); // NOI18N
        jMinimizarVentana.setToolTipText("Minimizar ventana.");
        jMinimizarVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMinimizarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinimizarVentanaMouseClicked(evt);
            }
        });
        jMenu.add(jMinimizarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("BANCO ROVAN");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 4, 290, 40));

        getContentPane().add(jMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jTarjetaCliente.setBackground(new java.awt.Color(204, 0, 0));
        jTarjetaCliente.setForeground(new java.awt.Color(204, 0, 0));
        jTarjetaCliente.setMinimumSize(new java.awt.Dimension(340, 230));
        jTarjetaCliente.setPreferredSize(new java.awt.Dimension(340, 230));
        jTarjetaCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numeroTarjeta.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        numeroTarjeta.setForeground(new java.awt.Color(153, 153, 153));
        jTarjetaCliente.add(numeroTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 200, 30));

        jPassW.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jPassW.setForeground(new java.awt.Color(153, 153, 153));
        jTarjetaCliente.add(jPassW, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 200, 30));

        jUserValidacion.setBackground(new java.awt.Color(255, 255, 255));
        jUserValidacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jUserValidacion.setForeground(new java.awt.Color(204, 0, 0));
        jUserValidacion.setText("IDENTIFICAR");
        jUserValidacion.setBorderPainted(false);
        jUserValidacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jUserValidacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUserValidacionActionPerformed(evt);
            }
        });
        jTarjetaCliente.add(jUserValidacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nº de Tarjeta: ");
        jTarjetaCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, 30));

        jVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-volver-24.png"))); // NOI18N
        jVolver.setToolTipText("Volver...");
        jVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVolverMouseClicked(evt);
            }
        });
        jTarjetaCliente.add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 30, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(204, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("INTRODUCE TU TARJETA_");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-inserte-tarjeta-50 (2).png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        jTarjetaCliente.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 50));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("PIN:");
        jTarjetaCliente.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 90, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-introducir-pin-50.png"))); // NOI18N
        jTarjetaCliente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-tarjeta-en-uso-50.png"))); // NOI18N
        jTarjetaCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        getContentPane().add(jTarjetaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 390, 290));

        jLogin.setBackground(new java.awt.Color(255, 255, 255));
        jLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLogin.setPreferredSize(new java.awt.Dimension(340, 230));
        jLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(204, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Cuéntanos, ¿qué necesitas?");
        jLogin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-grupos-de-usuarios-64.png"))); // NOI18N
        jLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 80));

        jBotonAccesoCliente.setBackground(new java.awt.Color(204, 0, 0));
        jBotonAccesoCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBotonAccesoCliente.setForeground(new java.awt.Color(255, 255, 255));
        jBotonAccesoCliente.setText("ACCESO CLIENTES");
        jBotonAccesoCliente.setBorder(null);
        jBotonAccesoCliente.setBorderPainted(false);
        jBotonAccesoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonAccesoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAccesoClienteActionPerformed(evt);
            }
        });
        jLogin.add(jBotonAccesoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 190, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-herramientas-del-administrador-64.png"))); // NOI18N
        jLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 70, 70));

        jBotonAdmin.setBackground(new java.awt.Color(204, 0, 0));
        jBotonAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBotonAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jBotonAdmin.setText("ADMINISTRADOR");
        jBotonAdmin.setBorder(null);
        jBotonAdmin.setBorderPainted(false);
        jBotonAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAdminActionPerformed(evt);
            }
        });
        jLogin.add(jBotonAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 190, 40));

        jLabel12.setBackground(new java.awt.Color(204, 0, 0));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("¡BIENVENIDO A NUESTRO SISTEMA!");
        jLogin.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, -1));

        getContentPane().add(jLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 390, 290));

        jFondoLogin.setBackground(new java.awt.Color(255, 255, 255));
        jFondoLogin.setForeground(new java.awt.Color(255, 255, 255));
        jFondoLogin.setPreferredSize(new java.awt.Dimension(400, 590));

        javax.swing.GroupLayout jFondoLoginLayout = new javax.swing.GroupLayout(jFondoLogin);
        jFondoLogin.setLayout(jFondoLoginLayout);
        jFondoLoginLayout.setHorizontalGroup(
            jFondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jFondoLoginLayout.setVerticalGroup(
            jFondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(jFondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 390, 290));

        jMenuAdmin.setBackground(new java.awt.Color(204, 0, 0));
        jMenuAdmin.setForeground(new java.awt.Color(204, 0, 0));
        jMenuAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jUserAdmin.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jUserAdmin.setForeground(new java.awt.Color(153, 153, 153));
        jUserAdmin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jMenuAdmin.add(jUserAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 180, 30));

        jPass.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jPass.setForeground(new java.awt.Color(153, 153, 153));
        jPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jMenuAdmin.add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 180, 30));

        jVolverAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-volver-24.png"))); // NOI18N
        jVolverAtras.setToolTipText("Volver...");
        jVolverAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVolverAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVolverAtrasMouseClicked(evt);
            }
        });
        jMenuAdmin.add(jVolverAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 30, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(204, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("ADMINISTRADOR_");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 50));

        jMenuAdmin.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-cambiar-usuario-masculino-50.png"))); // NOI18N
        jMenuAdmin.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-password-50.png"))); // NOI18N
        jMenuAdmin.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 60));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CONTRASEÑA: ");
        jMenuAdmin.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 180, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("USUARIO:");
        jMenuAdmin.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 180, 30));

        botonAdmin.setBackground(new java.awt.Color(255, 255, 255));
        botonAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonAdmin.setForeground(new java.awt.Color(204, 0, 0));
        botonAdmin.setText("IDENTIFICAR");
        botonAdmin.setBorderPainted(false);
        botonAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdminActionPerformed(evt);
            }
        });
        jMenuAdmin.add(botonAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 180, 30));

        getContentPane().add(jMenuAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 410, 290));

        jLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLogo.setForeground(new java.awt.Color(255, 255, 255));
        jLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-logotipo-mastercard-256.png"))); // NOI18N
        jLogo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 170));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(141, 108, 159));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BANCO ROVAN");
        jLogo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 300, -1));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Roberto & Iván CORP.");
        jLogo.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, 30));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-spain-25.png"))); // NOI18N
        jLogo.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        getContentPane().add(jLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 410, 290));

        jFondoAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jFondoAdmin.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jFondoAdminLayout = new javax.swing.GroupLayout(jFondoAdmin);
        jFondoAdmin.setLayout(jFondoAdminLayout);
        jFondoAdminLayout.setHorizontalGroup(
            jFondoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jFondoAdminLayout.setVerticalGroup(
            jFondoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(jFondoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 410, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCerrarVentanaMouseClicked
        int mensaje = JOptionPane.YES_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "¿Desea salir de la aplicacion?", "Salir", mensaje);
        if (resultado == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jCerrarVentanaMouseClicked

    private void jMinimizarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizarVentanaMouseClicked
        setState(menuMainCajero.ICONIFIED);
    }//GEN-LAST:event_jMinimizarVentanaMouseClicked

    private void jBotonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAdminActionPerformed
        //BOTON DESPLEGABLE ADMINISTRADOR
        moverPanelAdminArriba();
    }//GEN-LAST:event_jBotonAdminActionPerformed

    private void jBotonAccesoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAccesoClienteActionPerformed
        //BOTON DESPLEGABLE USUARIO
        moverPanelUsuarioArriba();
    }//GEN-LAST:event_jBotonAccesoClienteActionPerformed

    private void jVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVolverMouseClicked
        moverPanelUsuarioAbajo();
    }//GEN-LAST:event_jVolverMouseClicked

    private void jVolverAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVolverAtrasMouseClicked
        moverPanelAdminAbajo();
    }//GEN-LAST:event_jVolverAtrasMouseClicked

    private void jUserValidacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUserValidacionActionPerformed
        // BOTON ACCESO USUARIO 
        try (Connection con = DriverManager.getConnection(prop.url + prop.bbdd, prop.user, prop.pass);
                PreparedStatement pst = con.prepareStatement(queryTarjeta)) {

            String numTarjeta = numeroTarjeta.getText();
            String pass = String.valueOf(jPassW.getPassword());

            pst.setString(1, numTarjeta);
            pst.setString(2, pass);

            Pattern patronTarjeta = Pattern.compile("[0-9]{16}");
            Matcher matchTarjeta = patronTarjeta.matcher(numTarjeta);

            if (!matchTarjeta.matches()) {
                JOptionPane.showMessageDialog(this, "Necesitas 16 digitos en la tarjeta", "Error numero de tarjeta", JOptionPane.ERROR_MESSAGE);
                
            } else {
                try (ResultSet rs = pst.executeQuery()) {
                    if (rs.next()) {
                        cliente = new Cliente(rs.getString(3));
                        new menuUsuario(cliente.getNombre(), cliente.getApellidos(), numTarjeta).setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Credenciales Incorrectas", "ERROR BOBO!", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    System.err.println("Error al ejecutar la consulta!!" + ex.toString());
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No he podido conectar a la BBDD" + ex.toString());
        }


    }//GEN-LAST:event_jUserValidacionActionPerformed

    private void botonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdminActionPerformed
        // BOTON ACCESO ADMIN 
        new menuAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonAdminActionPerformed

    private void jMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMousePressed
        mov = new Movimiento(evt);
    }//GEN-LAST:event_jMenuMousePressed

    private void jMenuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMouseDragged
        int cordX = mov.x;
        int cordY = mov.y;
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - cordX, point.y - cordY);
    }//GEN-LAST:event_jMenuMouseDragged

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuMainCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuMainCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuMainCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuMainCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuMainCajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdmin;
    private javax.swing.JButton jBotonAccesoCliente;
    private javax.swing.JButton jBotonAdmin;
    private javax.swing.JLabel jCerrarVentana;
    private javax.swing.JPanel jFondoAdmin;
    private javax.swing.JPanel jFondoLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jLogin;
    private javax.swing.JPanel jLogo;
    private javax.swing.JPanel jMenu;
    private javax.swing.JPanel jMenuAdmin;
    private javax.swing.JLabel jMinimizarVentana;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPass;
    private javax.swing.JPasswordField jPassW;
    private javax.swing.JPanel jTarjetaCliente;
    private javax.swing.JTextField jUserAdmin;
    private javax.swing.JButton jUserValidacion;
    private javax.swing.JLabel jVolver;
    private javax.swing.JLabel jVolverAtras;
    private javax.swing.JTextField numeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
