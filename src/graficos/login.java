package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.swing.border.EmptyBorder;
import save.Persona;

public class login extends JFrame {

    JTextField nombre;
    JTextField contraseña;
    JLabel nom;
    JLabel con;
    JLabel reg;
    JLabel ent;
    Dimension tamanio;
    ArrayList<Persona> lista;
    FileInputStream fos;
    ObjectInputStream entrada;
    protected Image img[];

    public login(Dimension tamano) {
        this.setTitle("DibuTech");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/dibutech 2.png"));
        setIconImage(icon);
        tamanio = tamano;

        img = new Image[4];
        nom = new JLabel();
        con = new JLabel();
        reg = new JLabel();
        ent = new JLabel();

        lista = new ArrayList();
        try {
            fos = new FileInputStream("datos");
            entrada = new ObjectInputStream(fos);
            lista = (ArrayList<Persona>) entrada.readObject();
        } catch (FileNotFoundException e) {
        } catch (IOException | ClassNotFoundException e) {
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, tamanio.width, tamanio.height);
        setLocationRelativeTo(null);
        fondo p = new fondo();
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        this.setContentPane(p);
        this.setLayout(null);
        this.setVisible(true);

        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/usuario.png"));
        img[0] = imagen.getImage();

        imagen = new ImageIcon(getClass().getResource("/imagenes/contraseña.png"));
        img[1] = imagen.getImage();

        imagen = new ImageIcon(getClass().getResource("/imagenes/boton registrar.png"));
        img[2] = imagen.getImage();

        imagen = new ImageIcon(getClass().getResource("/imagenes/boton entrar.png"));
        img[3] = imagen.getImage();

        nom.setBounds((tamanio.width / 3), tamanio.height / 3, tamanio.width / 10, tamanio.height / 20);
        Image newimg = img[0].getScaledInstance(tamanio.width / 10, tamanio.height / 20, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        nom.setIcon(newIcon);
        add(nom);

        con.setBounds((tamanio.width / 3), (tamanio.height * 2) / 5, tamanio.width / 10, tamanio.height / 20);
        newimg = img[1].getScaledInstance(tamanio.width / 10, tamanio.height / 20, java.awt.Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(newimg);
        con.setIcon(newIcon);
        add(con);

        reg.setBounds((tamanio.width / 3), ((tamanio.height * 27) / 50), ((tamanio.width * 19) / 120), (tamanio.height / 8));
        newimg = img[2].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(newimg);
        reg.setIcon(newIcon);
        add(reg);

        reg.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton registrar shine.png"));
                img[2] = imagen.getImage();
                Image newimg = img[2].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                reg.setIcon(newIcon);
                super.mouseMoved(e);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton entrar.png"));
                img[3] = imagen.getImage();
                newimg = img[3].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                ent.setIcon(newIcon);

            }

        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton registrar.png"));
                img[2] = imagen.getImage();
                Image newimg = img[2].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                reg.setIcon(newIcon);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton entrar.png"));
                img[3] = imagen.getImage();
                newimg = img[3].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                ent.setIcon(newIcon);
                super.mouseMoved(e);
            }

        });
        reg.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton registrar unshine.png"));
                img[2] = imagen.getImage();
                Image newimg = img[2].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                reg.setIcon(newIcon);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton entrar.png"));
                img[3] = imagen.getImage();
                newimg = img[3].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                ent.setIcon(newIcon);
                super.mousePressed(e);
            }

            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                Registro r = new Registro(tamanio);

            }
        });

        ent.setBounds((tamanio.width / 2), ((tamanio.height * 27) / 50), ((tamanio.width * 19) / 120), (tamanio.height / 8));
        newimg = img[3].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(newimg);
        ent.setIcon(newIcon);
        add(ent);

        ent.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton entrar shine.png"));
                img[3] = imagen.getImage();
                Image newimg = img[3].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                ent.setIcon(newIcon);
                super.mouseMoved(e);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton registrar.png"));
                img[2] = imagen.getImage();
                newimg = img[2].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                reg.setIcon(newIcon);
            }

        });

        ent.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton entrar unshine.png"));
                img[3] = imagen.getImage();
                Image newimg = img[3].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                ent.setIcon(newIcon);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton registrar.png"));
                img[2] = imagen.getImage();
                newimg = img[2].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                reg.setIcon(newIcon);
                super.mousePressed(e);
            }

            @Override
            public void mouseClicked(MouseEvent evt) {
                int com = 0;
                Persona aux = new Persona();
                int cuantos = lista.size();
                for (int i = 0; i < cuantos; i++) {
                    aux = lista.get(i);
                    if (nombre.getText().equals(aux.getBoleta()) && contraseña.getText().equals(aux.getContra())) {
                        //JOptionPane.showMessageDialog(null, "¡Bienvenido " + aux.getNombre() + "!");
                        JOptionPane.showMessageDialog(null, "¡Bienvenido " + aux.getNombre() + "!", "Sesión iniciada", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        menu l = new menu(tamanio);
                        com = 1;
                        break;
                    }
                }
                if (com == 0) {
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        nombre = new JTextField();
        nombre.setBounds(tamanio.width / 2, tamanio.height / 3, tamanio.width / 10, tamanio.height / 20);
        add(nombre);

        contraseña = new JPasswordField();
        contraseña.setBounds(tamanio.width / 2, (tamanio.height * 2) / 5, tamanio.width / 10, tamanio.height / 20);
        add(contraseña);

        this.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                tamanio = getSize();
                nombre.setBounds(tamanio.width / 2, tamanio.height / 3, tamanio.width / 10, tamanio.height / 20);
                contraseña.setBounds(tamanio.width / 2, (tamanio.height * 2) / 5, tamanio.width / 10, tamanio.height / 20);
                nom.setBounds((tamanio.width / 3), tamanio.height / 3, tamanio.width / 10, tamanio.height / 20);

                Image newimg = img[0].getScaledInstance(tamanio.width / 10, tamanio.height / 20, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                nom.setIcon(newIcon);

                con.setBounds((tamanio.width / 3), (tamanio.height * 2) / 5, tamanio.width / 10, tamanio.height / 20);
                newimg = img[1].getScaledInstance(tamanio.width / 10, tamanio.height / 20, java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                con.setIcon(newIcon);

                reg.setBounds((tamanio.width / 3), ((tamanio.height * 27) / 50), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                newimg = img[2].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                reg.setIcon(newIcon);

                ent.setBounds((tamanio.width / 2), ((tamanio.height * 27) / 50), ((tamanio.width * 19) / 120), (tamanio.height / 8));
                newimg = img[3].getScaledInstance(((tamanio.width * 19) / 120), (tamanio.height / 8), java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                ent.setIcon(newIcon);
            }
        });
    }

}
