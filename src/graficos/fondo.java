package graficos;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class fondo extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g) {
        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
        setOpaque(false);
        imagenFondo = new ImageIcon(getClass().getResource("/imagenes/Logogif.gif"));
        g.drawImage(imagenFondo.getImage(),((tamanio.width / 10) * 8),((tamanio.height / 4) * 3), tamanio.width / 4, tamanio.height / 4 , this);
        super.paintComponent(g); 
        }
    
}