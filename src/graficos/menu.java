package graficos;

import java.awt.BorderLayout;
import teoria.menuTeoria;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import juego.grafico;

public class menu extends JFrame {

    Dimension tamanio;
    protected Image img[];
    JLabel act;
    JLabel his;
    JLabel per;
    JLabel dibu;
    JLabel home;

    public menu(Dimension tamano) {
        this.setTitle("DibuTech");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/dibutech 2.png"));
        setIconImage(icon);
        tamanio = tamano;

        img = new Image[5];
        act = new JLabel();
        his = new JLabel();
        per = new JLabel();
        dibu = new JLabel();
        home = new JLabel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(0, 0, tamanio.width, tamanio.height);
        setLocationRelativeTo(null);
        fondo p = new fondo();
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        this.setContentPane(p);
        this.setLayout(null);
        this.setVisible(true);

        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton actividades.png"));
        img[0] = imagen.getImage();

        imagen = new ImageIcon(getClass().getResource("/imagenes/boton historia.png"));
        img[1] = imagen.getImage();

        imagen = new ImageIcon(getClass().getResource("/imagenes/dibutech letra.png"));
        img[2] = imagen.getImage();

        imagen = new ImageIcon(getClass().getResource("/imagenes/dibutech letra.png"));
        img[3] = imagen.getImage();

        imagen = new ImageIcon(getClass().getResource("/imagenes/boton salir.png"));
        img[4] = imagen.getImage();

        act.setBounds((tamanio.width / 2), ((tamanio.height * 27) / 50), ((tamanio.width * 19) / 120), (tamanio.height / 8));
        Image newimg = img[0].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        act.setIcon(newIcon);
        add(act);

        his.setBounds((tamanio.width / 2), ((tamanio.height * 25) / 70), ((tamanio.width * 19) / 120), (tamanio.height / 8));
        newimg = img[1].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(newimg);
        his.setIcon(newIcon);
        add(his);

        per.setBounds((tamanio.width / 6), ((tamanio.height * 25) / 70), ((tamanio.width * 19) / 50), (tamanio.height / 27) * 8);
        newimg = img[2].getScaledInstance(((tamanio.width * 19) / 50), (tamanio.height / 27) * 8, java.awt.Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(newimg);
        per.setIcon(newIcon);
        add(per);

        dibu.setBounds((tamanio.width / 3), 0, ((tamanio.width * 19) / 60), (tamanio.height / 8));
        newimg = img[3].getScaledInstance(((tamanio.width * 19) / 60), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(newimg);
        dibu.setIcon(newIcon);
        add(dibu);

        home.setBounds((tamanio.width / 6) * 5, 0, (tamanio.width / 6), (tamanio.height / 8));
        newimg = img[4].getScaledInstance((tamanio.width / 6), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(newimg);
        home.setIcon(newIcon);
        add(home);

        act.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton actividades shine.png"));
                img[0] = imagen.getImage();
                act.setBounds((tamanio.width / 2), ((tamanio.height * 27) / 50), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                Image newimg = img[0].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                act.setIcon(newIcon);
                super.mouseMoved(e);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton salir.png"));
                img[4] = imagen.getImage();
                newimg = img[4].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                home.setIcon(newIcon);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton historia.png"));
                img[1] = imagen.getImage();
                his.setBounds((tamanio.width / 2), ((tamanio.height * 25) / 70), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                newimg = img[1].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                his.setIcon(newIcon);
            }

        });

        his.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton actividades.png"));
                img[0] = imagen.getImage();
                act.setBounds((tamanio.width / 2), ((tamanio.height * 27) / 50), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                Image newimg = img[0].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                act.setIcon(newIcon);
                super.mouseMoved(e);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton salir.png"));
                img[4] = imagen.getImage();
                newimg = img[4].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                home.setIcon(newIcon);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton historia shine.png"));
                img[1] = imagen.getImage();
                his.setBounds((tamanio.width / 2), ((tamanio.height * 25) / 70), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                newimg = img[1].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                his.setIcon(newIcon);
            }

        });

        home.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton salir shine.png"));
                img[4] = imagen.getImage();
                Image newimg = img[4].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                home.setIcon(newIcon);
                super.mouseMoved(e);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton historia.png"));
                img[1] = imagen.getImage();
                his.setBounds((tamanio.width / 2), ((tamanio.height * 25) / 70), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                newimg = img[1].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                his.setIcon(newIcon);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton actividades.png"));
                img[0] = imagen.getImage();
                act.setBounds((tamanio.width / 2), ((tamanio.height * 27) / 50), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                newimg = img[0].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                act.setIcon(newIcon);
            }

        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton salir.png"));
                img[4] = imagen.getImage();
                Image newimg = img[4].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                home.setIcon(newIcon);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton historia.png"));
                img[1] = imagen.getImage();
                his.setBounds((tamanio.width / 2), ((tamanio.height * 25) / 70), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                newimg = img[1].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                his.setIcon(newIcon);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton actividades.png"));
                img[0] = imagen.getImage();
                act.setBounds((tamanio.width / 2), ((tamanio.height * 27) / 50), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                newimg = img[0].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                act.setIcon(newIcon);
                super.mouseMoved(e);

            }

        });

        act.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton historia.png"));
                img[1] = imagen.getImage();
                his.setBounds((tamanio.width / 2), ((tamanio.height * 25) / 70), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                Image newimg = img[1].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                his.setIcon(newIcon);
                super.mousePressed(e);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton salir.png"));
                img[4] = imagen.getImage();
                newimg = img[4].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                home.setIcon(newIcon);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton actividades unshine.png"));
                img[0] = imagen.getImage();
                newimg = img[0].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                act.setIcon(newIcon);

            }

            @Override
            public void mouseClicked(MouseEvent evt) {
                grafico g = new grafico();

            }
        });

        his.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton actividades.png"));
                img[0] = imagen.getImage();
                act.setBounds((tamanio.width / 2), ((tamanio.height * 27) / 50), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                Image newimg = img[0].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                act.setIcon(newIcon);
                super.mousePressed(e);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton salir.png"));
                img[4] = imagen.getImage();
                newimg = img[4].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                home.setIcon(newIcon);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton historia unshine.png"));
                img[1] = imagen.getImage();
                his.setBounds((tamanio.width / 2), ((tamanio.height * 25) / 70), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                newimg = img[1].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                his.setIcon(newIcon);
            }

            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                menuTeoria l = new menuTeoria();

            }
        });

        home.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton salir unshine.png"));
                img[4] = imagen.getImage();
                Image newimg = img[4].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                home.setIcon(newIcon);
                super.mousePressed(e);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton historia.png"));
                img[1] = imagen.getImage();
                his.setBounds((tamanio.width / 2), ((tamanio.height * 25) / 70), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                newimg = img[1].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                his.setIcon(newIcon);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton actividades.png"));
                img[0] = imagen.getImage();
                act.setBounds((tamanio.width / 2), ((tamanio.height * 27) / 50), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                newimg = img[0].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                act.setIcon(newIcon);
            }

            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                inicio l = new inicio();

            }
        });

        this.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                tamanio = getSize();

                act.setBounds((tamanio.width / 2), ((tamanio.height * 27) / 50), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                Image newimg = img[0].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                act.setIcon(newIcon);

                his.setBounds((tamanio.width / 2), ((tamanio.height * 25) / 70), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                newimg = img[1].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                his.setIcon(newIcon);

                per.setBounds((tamanio.width / 6), ((tamanio.height * 25) / 70), ((tamanio.width * 19) / 50), (tamanio.height / 27) * 8);
                newimg = img[2].getScaledInstance(((tamanio.width * 19) / 50), (tamanio.height / 27) * 8, java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                per.setIcon(newIcon);

                dibu.setBounds((tamanio.width / 3), 0, ((tamanio.width * 19) / 60), (tamanio.height / 8));
                newimg = img[3].getScaledInstance(((tamanio.width * 19) / 60), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                dibu.setIcon(newIcon);

                home.setBounds((tamanio.width / 6) * 5, 0, (tamanio.width / 6), (tamanio.height / 8));
                newimg = img[4].getScaledInstance((tamanio.width / 6), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                home.setIcon(newIcon);
            }
        });
    }
}
