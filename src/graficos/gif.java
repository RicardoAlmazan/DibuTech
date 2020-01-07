package graficos;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
public class gif extends JPanel{
    
    @Override
    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image img = t.getImage(getClass().getResource("/imagenes/Logitos.gif"));
        g.drawImage(img,0,0, 300, 300, this);
        super.paint(g); 
    }
}
