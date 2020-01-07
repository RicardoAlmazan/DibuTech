package teoria;

import graficos.fondo;
import javax.swing.*;
import graficos.menu;
import graficos.sonido;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class menuTeoria extends JFrame implements ActionListener {

    JButton pre, clasic, renac, actual, home, media;
    ImageIcon preh, clasica, renaci, actuali, homee, lap, emedia;
    JLabel lapiz;

    public menuTeoria() {
        

        fondo p = new fondo();
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        this.setContentPane(p);
        this.setTitle("Menú");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("dibutech 2.png"));
        setIconImage(icon);

        home = new JButton("1");
        home.setBounds(1000, 10, 100, 100);
        homee = new ImageIcon(getClass().getResource("/imagenes/Home.png"));
        home.setBorderPainted(false);
        home.setRolloverEnabled(false);
        home.setContentAreaFilled(false);
        home.addActionListener(this);
        home.setIcon(new ImageIcon(homee.getImage().getScaledInstance(home.getWidth(), home.getHeight(), Image.SCALE_DEFAULT)));
        add(home);

        pre = new JButton("2");
        pre.addActionListener(this);
        pre.setBounds(400, 100, 200, 100);
        preh = new ImageIcon(getClass().getResource("/imagenes/GomPrehist.png"));
        pre.setIcon(new ImageIcon(preh.getImage().getScaledInstance(pre.getWidth(), pre.getHeight(), Image.SCALE_DEFAULT)));
        pre.setBorderPainted(false);
        pre.setRolloverEnabled(false);
        pre.setContentAreaFilled(false);

        add(pre);

        clasic = new JButton("3");
        clasic.setBounds(400, 300, 200, 100);
        clasica = new ImageIcon(getClass().getResource("/imagenes/gomClasic.png"));
        clasic.setIcon(new ImageIcon(clasica.getImage().getScaledInstance(clasic.getWidth(), clasic.getHeight(), Image.SCALE_DEFAULT)));
        clasic.setBorderPainted(false);
        clasic.setRolloverEnabled(false);
        clasic.setContentAreaFilled(false);
        clasic.addActionListener(this);
        add(clasic);

        renac = new JButton("4");
        renac.setBounds(750, 200, 200, 100);
        renaci = new ImageIcon(getClass().getResource("/imagenes/GomRen.png"));
        renac.setIcon(new ImageIcon(renaci.getImage().getScaledInstance(renac.getWidth(), renac.getHeight(), Image.SCALE_DEFAULT)));
        renac.setBorderPainted(false);
        renac.setRolloverEnabled(false);
        renac.setContentAreaFilled(false);
        renac.addActionListener(this);
        add(renac);

        actual = new JButton("5");
        actual.setBounds(750, 400, 200, 100);
        actuali = new ImageIcon(getClass().getResource("/imagenes/GomActu.png"));
        actual.setIcon(new ImageIcon(actuali.getImage().getScaledInstance(actual.getWidth(), actual.getHeight(), Image.SCALE_DEFAULT)));
        actual.setBorderPainted(false);
        actual.setRolloverEnabled(false);
        actual.setContentAreaFilled(false);
        actual.addActionListener(this);
        add(actual);

        media = new JButton("6");
        media.setBounds(400, 500, 200, 100);
        emedia = new ImageIcon(getClass().getResource("/imagenes/GomEdad.png"));
        media.setIcon(new ImageIcon(emedia.getImage().getScaledInstance(media.getWidth(), media.getHeight(), Image.SCALE_DEFAULT)));
        media.setBorderPainted(false);
        media.setRolloverEnabled(false);
        media.setContentAreaFilled(false);
        media.addActionListener(this);
        add(media);

        lapiz = new JLabel();
        lapiz.setBounds(70, 150, 300, 300);
        lap = new ImageIcon(getClass().getResource("/imagenes/Personaje1.gif"));
        ImageIcon personaje = new ImageIcon(lap.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT));
        lapiz.setIcon(personaje);
        add(lapiz);

        setLayout(null);
        this.getContentPane().setBackground(Color.white);
        setSize(1200, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Dimension tamanio;
        tamanio = this.getSize();
        if (e.getActionCommand().equals("1")) {
            dispose();
            menu m = new menu(tamanio);
        } else {
            if (e.getActionCommand().equals("2")) {
                dispose();
                inicio preH = new inicio();
            } else {
                if (e.getActionCommand().equals("3")) {
                    EpocaClasica epoca = new EpocaClasica();
                    dispose();
                } else {
                    if (e.getActionCommand().equals("6")) {
                        EdadMedia edad = new EdadMedia();
                        dispose();
                    } else {
                        if (e.getActionCommand().equals("4")) {
                            Renacimiento renac = new Renacimiento();
                            dispose();
                        } else {
                            if (e.getActionCommand().equals("5")) {

                                Actualidad actual = new Actualidad();
                                dispose();
                            }
                        }
                    }
                }
            }
        }
    }
}
