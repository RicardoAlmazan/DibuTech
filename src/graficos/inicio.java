package graficos;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class inicio extends JFrame {

    JLabel dibutech;
    JLabel boton;
    Dimension tamanio;

    protected Image img[];

    public inicio() {
        this.setTitle("DibuTech");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/dibutech 2.png"));
        setIconImage(icon);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 0, 1200, 800);
        fondo p = new fondo();
        setLocationRelativeTo(null);
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        this.setContentPane(p);

        tamanio = getSize();

        img = new Image[2];
        dibutech = new JLabel();
        boton = new JLabel();

        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/dibutech letra.png"));
        img[0] = imagen.getImage();

        imagen = new ImageIcon(getClass().getResource("/imagenes/boton inicio.png"));
        img[1] = imagen.getImage();

        dibutech.setBounds((tamanio.width / 6), (tamanio.height / 10), ((tamanio.width / 3) * 2), (tamanio.height / 2));
        Image newimg = img[0].getScaledInstance(((tamanio.width / 3) * 2), (tamanio.height / 2), java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        dibutech.setIcon(newIcon);
        add(dibutech);

        boton.setBounds(((tamanio.width * 2) / 5), ((tamanio.height * 27) / 40), ((tamanio.width * 19) / 120), (tamanio.height / 8));
        newimg = img[1].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(newimg);
        boton.setIcon(newIcon);
        add(boton);

        boton.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton inicio shine.png"));
                img[1] = imagen.getImage();
                Image newimg = img[1].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                boton.setIcon(newIcon);
                super.mouseMoved(e);

            }

        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton inicio.png"));
                img[1] = imagen.getImage();
                Image newimg = img[1].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                boton.setIcon(newIcon);
                super.mouseMoved(e);

            }

        });
        boton.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton inicio unshine.png"));
                img[1] = imagen.getImage();
                Image newimg = img[1].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                boton.setIcon(newIcon);
                super.mousePressed(e);
            }

            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                login l = new login(tamanio);

            }
        });

        this.setLayout(null);
        this.setVisible(true);
        this.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                tamanio = getSize();
                dibutech.setBounds((tamanio.width / 6), (tamanio.height / 10), ((tamanio.width / 3) * 2), (tamanio.height / 2));
                Image newimg = img[0].getScaledInstance(((tamanio.width / 3) * 2), (tamanio.height / 2), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                dibutech.setIcon(newIcon);

                boton.setBounds(((tamanio.width * 2) / 5), ((tamanio.height * 27) / 40), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                newimg = img[1].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                boton.setIcon(newIcon);
            }
        });

    }

}
