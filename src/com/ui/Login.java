package com.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import com.controller.sessionController;
import javax.swing.JOptionPane;

/**
 * Autor: Rolando Murillo Aguirre Clase: Login Descripción: [Clase de extensión
 * para incio de sesion] Fecha: 8 jul. 2025
 */
public class Login extends JFrame {

    private final Color clrText = new Color(0, 120, 150, 240);
    private final Font fontText = new Font("Agency FB", Font.BOLD, 18);
    private final Font fontInput = new Font("sansserif", Font.PLAIN, 18);
    private final Dimension dimsInput = new Dimension(300, 40);
    private final Dimension diBox = new Dimension(300, 100);
    private final Border brdInput = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(clrText),
            BorderFactory.createEmptyBorder(5, 1, 2, -10));
    private final ImageIcon imageIcon = new ImageIcon(getClass().getResource("/assets/log.png"));
    private final ImageIcon imageIconUs = new ImageIcon(getClass().getResource("/assets/log_user.png"));
    private final Image icon = imageIcon.getImage();
    private final Image iconUs = imageIconUs.getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);
    private final ImageIcon resizeIcon = new ImageIcon(iconUs);
    private final sessionController sc = new sessionController();

    private JPanel container;
    private JPanel boxContent;
    private JLabel boxIconUs;
    private TitledBorder tittleBorder;
    private Border lineBorder;
    private JPanel box1;
    private JPanel box2;
    private JLabel tex1;
    private JLabel tex2;
    private JTextField inputUser;
    private JPasswordField inputPas;
    private JButton btnEnter;
    private GridBagConstraints gbc;
    private String checUs;
    private String checPsw;

    public Login() {

        this.setIconImage(icon);
        this.setTitle("INICIO DE SESIÓN - RolSales");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        mainPanel();
    }

    private void mainPanel() {
        boxContent = new JPanel();//Box de contenido general
        container = new JPanel();//Contenedor del login
        boxIconUs = new JLabel();
        gbc = new GridBagConstraints();

        boxContent.setLayout(new BoxLayout(boxContent, BoxLayout.Y_AXIS));
        boxContent.setBackground(new Color(67, 170, 211, 50));

        //Ajustes decorativos para el border del container
        lineBorder = new LineBorder(clrText);
        tittleBorder = new TitledBorder(lineBorder, "Datos de Usuario");
        tittleBorder.setTitleColor(clrText);
        tittleBorder.setTitlePosition(0);
        tittleBorder.setTitleFont(new Font("Monospaced", Font.BOLD, 18));
        tittleBorder.setTitleJustification(2);

        //Contenedor de los box y boton
        container.setLayout(new GridBagLayout());
        container.setBorder(BorderFactory.createCompoundBorder(
                tittleBorder, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        container.setBackground(new Color(0, 0, 0, 0));

        boxIconUs.setLayout(new FlowLayout());
        boxIconUs.setIcon(resizeIcon);
        boxIconUs.setBackground(Color.RED);

        /*
        Espaciado entre componentes del container, solo aplica cuando hay 
        GridBagLayout aplicado al componente
         */
        gbc.gridx = 0;//Empieso del componnete en columna
        gbc.gridy = 0;//Empiezo de Componente en fila
        gbc.gridwidth = 1;//Numero de columnas que abarca
        gbc.gridheight = 1; //Numeros de filas que abarca
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        container.add(boxIconUs, gbc);

        boxcontainer();
        textLabel();
        inputField();
        btnIng();

        //Añadimos al box general del frame
        boxContent.add(container);

        //Añadimos al Frame
        this.add(boxContent);
    }

    private void boxcontainer() {
        box1 = new JPanel(); //Box del input usr
        box2 = new JPanel(); //Box del input psw

        //Ajustes para el box del usuario
        box1.setLayout(new GridBagLayout());
        box1.setPreferredSize(diBox);

        //Ajustes para el Box de la contraseña
        box2.setLayout(new GridBagLayout());
        box2.setPreferredSize(diBox);

        gbc.gridx = 0; //Empieso del componnete en columna
        gbc.gridy = 1; //Empiezo de Componente en fila
        container.add(box1, gbc); //Añadimos al contenedor con las configuraciones

        gbc.gridx = 0; //Empieso del componnete en columna
        gbc.gridy = 2; //Empiezo de Componente en fila

        gbc.insets = new Insets(10, 0, 10, 0);
        container.add(box2, gbc); //Añadimos al contenedor con las 
                                   //configuraciones

    }

    private void textLabel() {
        GridBagConstraints gbcBox1 = new GridBagConstraints();
        GridBagConstraints gbcBox2 = new GridBagConstraints();

        tex1 = new JLabel();
        tex2 = new JLabel();
        //Ajustes de los textos para los imputs
        tex1.setText("USUARIO");
        tex1.setForeground(clrText);
        tex1.setFont(fontText);
        tex2.setText("CONTRASEÑA");
        tex2.setForeground(clrText);
        tex2.setFont(fontText);

        gbcBox1.gridx = 0;
        gbcBox1.gridy = 0;
        gbcBox1.gridwidth = 2;
        gbcBox1.gridheight = 1;
        gbcBox1.fill = GridBagConstraints.HORIZONTAL;
        gbcBox1.weightx = 1.0;
        gbcBox1.anchor = GridBagConstraints.WEST;
        box1.add(tex1, gbcBox1);

        gbcBox2.gridx = 0;
        gbcBox2.gridy = 0;
        gbcBox2.gridwidth = 2;
        gbcBox2.gridheight = 1;
        gbcBox2.fill = GridBagConstraints.HORIZONTAL;
        gbcBox2.weightx = 1.0;
        gbcBox2.anchor = GridBagConstraints.WEST;
        box2.add(tex2, gbcBox2);

    }

    private void inputField() {
        GridBagConstraints gbcInput1 = new GridBagConstraints();
        GridBagConstraints gbcInput2 = new GridBagConstraints();
        inputUser = new JTextField();//Campo de usuario
        inputPas = new JPasswordField(); //Campo de contraseña

        //Ajustes de los inputs de usuario y contraseña
        inputUser.setFont(fontInput);
        inputUser.setBorder(brdInput);
        inputUser.setPreferredSize(dimsInput);

        inputPas.setFont(fontInput);
        inputPas.setBorder(brdInput);
        inputPas.setPreferredSize(dimsInput);

        gbcInput1.gridx = 0;
        gbcInput1.gridy = 2;
        gbcInput1.fill = GridBagConstraints.HORIZONTAL;
        gbcInput1.weightx = 1.0;
        gbcInput1.anchor = GridBagConstraints.WEST;
        box1.add(inputUser, gbcInput1);

        gbcInput2.gridx = 0;
        gbcInput2.gridy = 2;

        box2.add(inputPas, gbcInput2);

    }

    private void btnIng() {
        btnEnter = new JButton();

        //Ajustes del botton de ingreso
        btnEnter.setText("Ingresar");
        btnEnter.setFont(new Font("Arial", Font.BOLD, 18));
        btnEnter.setBackground(new Color(23, 78, 100, 240));
        btnEnter.setBorderPainted(false);
        btnEnter.setFocusPainted(false);
        btnEnter.setForeground(Color.WHITE);
        btnEnter.setPreferredSize(new Dimension(200, 50));

        gbc.gridx = 0; //Empieso del componnete en columna
        gbc.gridy = 5; //Empiezo de Componente en filalineación del componente
                        //dentro de su celda
        container.add(btnEnter, gbc); //Añadimos al contenedor con las 
                                        //configuraciones

        btnEnter.addActionListener((ActionEvent e) -> {
            checUs = inputUser.getText();
            checPsw = new String(inputPas.getPassword());

            if (sc.userVerification(checUs, checPsw)) {
                msjSystem("Bienvenid@ "+checUs);
                clearInputs();
                
            } else {
                msjSystem("Usuario o contraseña Invalido");
                clearInputs();
            }
        });
    }

    private void clearInputs() {
        inputUser.setText("");
        inputPas.setText("");
    }
    
    private void msjSystem(String msj){
        JOptionPane.showMessageDialog(null, msj, "Respuesta del sistema",0 
                ,resizeIcon);
    }
}
