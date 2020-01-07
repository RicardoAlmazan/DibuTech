package graficos;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.swing.border.EmptyBorder;
import save.Persona;

public class Registro extends JFrame implements Serializable {

    private JTextField nombre, contraseña1, contraseña2, boleta;
    private JLabel nombreI, contraseña1I, boletaI, boton1, boton2, contraseña2I;

    FileInputStream fos;
    ObjectInputStream entrada;

    ArrayList<Persona> lista;
    Persona aux;

    Dimension tamanio;
    protected Image img[];

    public Registro(Dimension tamano) {

        lista = new ArrayList();
        try {
            fos = new FileInputStream("datos");
            entrada = new ObjectInputStream(fos);
            lista = (ArrayList<Persona>) entrada.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("el archivo no existe, sera creado");
        } catch (IOException | ClassNotFoundException e) {
        }

        this.setTitle("DibuTech");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/dibutech 2.png"));
        setIconImage(icon);
        tamanio = tamano;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, tamanio.width, tamanio.height);
        fondo p = new fondo();
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        this.setContentPane(p);
        setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);

        img = new Image[6];
        nombreI = new JLabel();
        contraseña1I = new JLabel();
        contraseña2I = new JLabel();
        boletaI = new JLabel();
        boton1 = new JLabel();
        boton2 = new JLabel();

        nombre = new JTextField();
        nombre.setBounds(tamanio.width / 2, tamanio.height / 3, tamanio.width / 10, tamanio.height / 20);
        add(nombre);

        boleta = new JTextField();
        boleta.setBounds(tamanio.width / 2, (tamanio.height * 2) / 5, tamanio.width / 10, tamanio.height / 20);
        add(boleta);

        contraseña1 = new JPasswordField();
        contraseña1.setBounds(tamanio.width / 2, (tamanio.height * 7) / 15, tamanio.width / 10, tamanio.height / 20);
        add(contraseña1);

        contraseña2 = new JPasswordField();
        contraseña2.setBounds(tamanio.width / 2, (tamanio.height * 8) / 15, tamanio.width / 10, tamanio.height / 20);
        add(contraseña2);

        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/nombre.png"));
        img[0] = imagen.getImage();

        imagen = new ImageIcon(getClass().getResource("/imagenes/usuario.png"));
        img[1] = imagen.getImage();

        imagen = new ImageIcon(getClass().getResource("/imagenes/contraseña.png"));
        img[2] = imagen.getImage();

        imagen = new ImageIcon(getClass().getResource("/imagenes/contraseña.png"));
        img[3] = imagen.getImage();

        imagen = new ImageIcon(getClass().getResource("/imagenes/boton registrar.png"));
        img[4] = imagen.getImage();

        imagen = new ImageIcon(getClass().getResource("/imagenes/boton salir.png"));
        img[5] = imagen.getImage();

        nombreI.setBounds((tamanio.width / 3), tamanio.height / 3, tamanio.width / 10, tamanio.height / 20);
        Image newimg = img[0].getScaledInstance(tamanio.width / 10, tamanio.height / 20, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        nombreI.setIcon(newIcon);
        add(nombreI);

        boletaI.setBounds((tamanio.width / 3), (tamanio.height * 2) / 5, tamanio.width / 10, tamanio.height / 20);
        newimg = img[1].getScaledInstance(tamanio.width / 10, tamanio.height / 20, java.awt.Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(newimg);
        boletaI.setIcon(newIcon);
        add(boletaI);

        contraseña1I.setBounds((tamanio.width / 3), (tamanio.height * 7) / 15, tamanio.width / 10, tamanio.height / 20);
        newimg = img[2].getScaledInstance(tamanio.width / 10, tamanio.height / 20, java.awt.Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(newimg);
        contraseña1I.setIcon(newIcon);
        add(contraseña1I);

        contraseña2I.setBounds((tamanio.width / 3), (tamanio.height * 8) / 15, tamanio.width / 10, tamanio.height / 20);
        newimg = img[3].getScaledInstance(tamanio.width / 10, tamanio.height / 20, java.awt.Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(newimg);
        contraseña2I.setIcon(newIcon);
        add(contraseña2I);

        boton1.setBounds((tamanio.width / 3), (tamanio.height * 9) / 15, (tamanio.width * 19) / 120, tamanio.height / 8);
        newimg = img[4].getScaledInstance((tamanio.width * 19) / 120, tamanio.height / 8, java.awt.Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(newimg);
        boton1.setIcon(newIcon);
        add(boton1);

        boton1.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton registrar shine.png"));
                img[4] = imagen.getImage();
                Image newimg = img[4].getScaledInstance((tamanio.width * 19) / 120, tamanio.height / 8, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                boton1.setIcon(newIcon);
                super.mouseMoved(e);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton salir.png"));
                img[5] = imagen.getImage();
                newimg = img[5].getScaledInstance((tamanio.width * 19) / 120, tamanio.height / 8, java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                boton2.setIcon(newIcon);

            }

        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton registrar.png"));
                img[4] = imagen.getImage();
                Image newimg = img[4].getScaledInstance((tamanio.width * 19) / 120, tamanio.height / 8, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                boton1.setIcon(newIcon);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton salir.png"));
                img[5] = imagen.getImage();
                newimg = img[5].getScaledInstance((tamanio.width * 19) / 120, tamanio.height / 8, java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                boton2.setIcon(newIcon);
                super.mouseMoved(e);
            }

        });
        boton1.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton registrar unshine.png"));
                img[4] = imagen.getImage();
                Image newimg = img[4].getScaledInstance((tamanio.width * 19) / 120, tamanio.height / 8, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                boton1.setIcon(newIcon);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton salir.png"));
                img[5] = imagen.getImage();
                newimg = img[5].getScaledInstance((tamanio.width * 19) / 120, tamanio.height / 8, java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                boton2.setIcon(newIcon);
                super.mousePressed(e);
            }

            @Override
            public void mouseClicked(MouseEvent evt) {
                aux = new Persona();
                if (contraseña1.getText().equals(contraseña2.getText())) {
                    aux.setNombre(nombre.getText());
                    aux.setBoleta(boleta.getText());
                    aux.setContra(contraseña1.getText());
                    lista.add(aux);

                    try {
                        FileOutputStream fos = new FileOutputStream("datos");
                        ObjectOutputStream grabar = new ObjectOutputStream(fos);
                        grabar.writeObject(lista);
                        grabar.close();
                        JOptionPane.showMessageDialog(null, "registro exitoso");
                        dispose();
                        login l = new login(tamanio);
                    } catch (IOException e) {
                        System.out.println("estas pendejo");
                        System.out.println(e.toString());
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Contraseñas no coinsiden", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        boton2.setBounds((tamanio.width / 2), (tamanio.height * 9) / 15, (tamanio.width * 19) / 120, tamanio.height / 8);
        newimg = img[5].getScaledInstance((tamanio.width * 19) / 120, tamanio.height / 8, java.awt.Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(newimg);
        boton2.setIcon(newIcon);
        add(boton2);

        boton2.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton registrar.png"));
                img[4] = imagen.getImage();
                Image newimg = img[4].getScaledInstance((tamanio.width * 19) / 120, tamanio.height / 8, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                boton1.setIcon(newIcon);
                super.mouseMoved(e);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton salir shine.png"));
                img[5] = imagen.getImage();
                newimg = img[5].getScaledInstance((tamanio.width * 19) / 120, tamanio.height / 8, java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                boton2.setIcon(newIcon);

            }

        });

        boton2.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/boton registrar.png"));
                img[4] = imagen.getImage();
                Image newimg = img[4].getScaledInstance((tamanio.width * 19) / 120, tamanio.height / 8, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                boton1.setIcon(newIcon);

                imagen = new ImageIcon(getClass().getResource("/imagenes/boton salir unshine.png"));
                img[5] = imagen.getImage();
                newimg = img[5].getScaledInstance((tamanio.width * 19) / 120, tamanio.height / 8, java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                boton2.setIcon(newIcon);
                super.mousePressed(e);
            }

            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                login l = new login(tamanio);
            }
        });

        this.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                tamanio = getSize();
                nombreI.setBounds((tamanio.width / 3), tamanio.height / 3, tamanio.width / 10, tamanio.height / 20);
                Image newimg = img[0].getScaledInstance(tamanio.width / 10, tamanio.height / 20, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimg);
                nombreI.setIcon(newIcon);

                boletaI.setBounds((tamanio.width / 3), (tamanio.height * 2) / 5, tamanio.width / 10, tamanio.height / 20);
                newimg = img[1].getScaledInstance(tamanio.width / 10, tamanio.height / 20, java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                boletaI.setIcon(newIcon);

                contraseña1I.setBounds((tamanio.width / 3), (tamanio.height * 7) / 15, tamanio.width / 10, tamanio.height / 20);
                newimg = img[2].getScaledInstance(tamanio.width / 10, tamanio.height / 20, java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                contraseña1I.setIcon(newIcon);

                contraseña2I.setBounds((tamanio.width / 3), (tamanio.height * 8) / 15, tamanio.width / 10, tamanio.height / 20);
                newimg = img[3].getScaledInstance(tamanio.width / 10, tamanio.height / 20, java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                contraseña2I.setIcon(newIcon);

                boton1.setBounds((tamanio.width / 3), (tamanio.height * 9) / 15, (tamanio.width * 19) / 120, tamanio.height / 8);
                newimg = img[4].getScaledInstance((tamanio.width * 19) / 120, tamanio.height / 8, java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                boton1.setIcon(newIcon);

                boton2.setBounds((tamanio.width / 2), (tamanio.height * 9) / 15, (tamanio.width * 19) / 120, tamanio.height / 8);
                newimg = img[5].getScaledInstance((tamanio.width * 19) / 120, tamanio.height / 8, java.awt.Image.SCALE_SMOOTH);
                newIcon = new ImageIcon(newimg);
                boton2.setIcon(newIcon);
            }
        });

    }

}
