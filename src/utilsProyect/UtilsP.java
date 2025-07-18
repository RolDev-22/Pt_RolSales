package utilsProyect;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

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

    public Image iconWindow (){
        return icon = imageIcon.getImage();
    }
    
    public int heigthWindow(){
        return screnSize.height;
    }
    
}
