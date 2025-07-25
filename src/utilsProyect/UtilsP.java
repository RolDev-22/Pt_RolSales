package utilsProyect;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Autor: Rolando Murillo Aguirre Clase: Utils Descripción: Java class con
 * funciones y componentes reutilizables Fecha: 16 jul. 2025
 */
public class UtilsP {

    private final ImageIcon imageIconUs = new ImageIcon(getClass()
            .getResource("/assets/log_user.png"));
    private final ImageIcon imageIcon = new ImageIcon(getClass()
            .getResource("/assets/log.png"));

    private final Image iconUs = imageIconUs.getImage()
            .getScaledInstance(110, 110, Image.SCALE_SMOOTH);
    private final Toolkit tk = Toolkit.getDefaultToolkit();
    private Dimension screnSize = tk.getScreenSize();

    public ImageIcon resizeIcon;
    public Image icon;

    public UtilsP() {
    }

    public ImageIcon resizeIcon() {
        return resizeIcon = new ImageIcon(iconUs);
    }

    public Image iconWindow() {
        return icon = imageIcon.getImage();
    }

    public int heigthWindow() {
        return screnSize.height;
    }

    public JButton btnMenuGenerate(String textBtnP, Color clrBtnP) {

        JButton btnGenerate = new JButton(textBtnP);

        btnGenerate.setPreferredSize(new Dimension(200, 50));
        btnGenerate.setFocusable(false);
        btnGenerate.setFont(new Font("Arial", Font.BOLD, 18));
        btnGenerate.setForeground(Color.WHITE);
        btnGenerate.setBackground(clrBtnP);

        return btnGenerate;
    }

}
