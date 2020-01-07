package teoria;

import graficos.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.border.EmptyBorder;

public class Actualidad extends JFrame implements ActionListener {

    JLabel lapiz, dib, como, imag, imag2;
    JButton audio, home, next;
    ImageIcon lap, hom, audioo, nex, ini, img, img2;
    JTextArea textarea1, text2, text3;
    Font fuente;
    Clip clip;
    String liga;
    int i = 0;

    public Actualidad() {
        fondo p = new fondo();
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        this.setContentPane(p);
        
        this.setTitle("Época Actual");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/dibutech 2.png"));
        setIconImage(icon);

        liga = "/Audio/";

        imag = new JLabel();
        imag.setBounds(350,400, 150,150);
        img = new ImageIcon(getClass().getResource("/imagenes/Img 7.jpg"));
        imag.setIcon(new ImageIcon(img.getImage().getScaledInstance(imag.getWidth(), imag.getHeight(), Image.SCALE_DEFAULT)));
        add(imag);
        
        imag2 = new JLabel();
        imag2.setBounds(650,400, 150,150);
        img2 = new ImageIcon(getClass().getResource("/imagenes/Img 8.jpg"));
        imag2.setIcon(new ImageIcon(img2.getImage().getScaledInstance(imag2.getWidth(), imag2.getHeight(), Image.SCALE_DEFAULT)));
        add(imag2);
        
        como = new JLabel();
        como.setBounds(350, 100, 400, 70);
        ini = new ImageIcon(getClass().getResource("/imagenes/actual.png"));
        como.setIcon(new ImageIcon(ini.getImage().getScaledInstance(como.getWidth(), como.getHeight(), Image.SCALE_DEFAULT)));
        add(como);

        Font fuente = new Font("Arial", Font.BOLD, 16);

        next = new JButton("3");
        next.setBounds(1000, 550, 70, 70);
        nex = new ImageIcon(getClass().getResource("/imagenes/next.png"));
        next.setBorderPainted(false);
        next.setRolloverEnabled(false);
        next.setContentAreaFilled(false);
        next.addActionListener(this);
        next.setIcon(new ImageIcon(nex.getImage().getScaledInstance(next.getWidth(), next.getHeight(), Image.SCALE_DEFAULT)));
        add(next);

        home = new JButton("2");
        home.setBounds(1000, 10, 100, 100);
        hom = new ImageIcon(getClass().getResource("/imagenes/Home.png"));
        ImageIcon ho = new ImageIcon(hom.getImage().getScaledInstance(home.getWidth(), home.getHeight(), Image.SCALE_DEFAULT));
        home.setBorderPainted(false);
        home.setRolloverEnabled(false);
        home.setContentAreaFilled(false);
        home.addActionListener(this);
        home.setIcon(ho);
        add(home);

        audio = new JButton("1");
        audio.setBounds(800, 550, 80, 80);
        audioo = new ImageIcon(getClass().getResource("/imagenes/audio.png"));
        ImageIcon audiooo = new ImageIcon(audioo.getImage().getScaledInstance(audio.getWidth(), audio.getHeight(), Image.SCALE_DEFAULT));
        audio.setBorderPainted(false);
        audio.setRolloverEnabled(false);
        audio.setContentAreaFilled(false);
        audio.setIcon(audiooo);
        audio.addActionListener(this);
        add(audio);

        lapiz = new JLabel();
        lapiz.setBounds(50, 220, 200, 150);
        lap = new ImageIcon(getClass().getResource("/imagenes/Personaje1.gif"));
        ImageIcon personaje = new ImageIcon(lap.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT));
        lapiz.setIcon(personaje);
        add(lapiz);

        textarea1 = new JTextArea();
        
        textarea1.setBounds(250, 230, 800, 300);
        textarea1.setOpaque(false);
        textarea1.setBackground(new Color(0,0,0,0));
        textarea1.setFont(fuente);
        textarea1.setText("Entre 1907 y 1914, Pablo Picasso y Georges Braque desarrollaron el cubismo en París, inspirándose en"
                + "\nla forma, cada vez más geométrica, que tenía Cézanne de representar los paisajes y las naturalezas"
                + "\nmuertas, y en las formas dinámicas de la escultura africana e ibérica. El cubismo llegó a ser el "
                + "\nestilo artístico que más influencia ejerció en todo el siglo XX."
                + "\nEn 1924 André Breton presentó un manifiesto dando el nombre de surrealismo al movimiento que "
                + "\nproclamaba la superioridad del inconsciente y el papel de los sueños en la creación artística. "
                + "\nLos surrealistas más importantes fueron Ernst, Salvador Dalí, Joan Miró,René Magritte, Jean Arp"
                + "\n y André Masson.");
        textarea1.setEditable(false);
        add(textarea1);

        text2 = new JTextArea();
        text2.setBounds(250, 230, 800, 300);
        text2.setOpaque(false);
        text2.setBackground(new Color(0,0,0,0));
        text2.setFont(fuente);
        text2.setText("Con la versión de la normalización, el dibujo adquiere un carácter verdaderamente técnico.\n"
                + "Podemos definirlas cómo el conjunto de normas para la realización de un dibujo técnico y\n"
                + "la correcta utilización de los instrumentos de dibujo.\n\n"
                + "La normalización aporta al dibujo técnico una serie de reglas que determinan infinidad de detalles,\n"
                + "a fin de que pueda ser un verdadero lenguaje gráfico. Las reglas se refieren en especial a las unidades\n"
                + "de medida, símbolos representativos, formatos, tipos de línea y todos los datos que cualquier técnico \n"
                + "competente debe saber utilizar. ");
        text2.setEditable(true);
        text2.setVisible(false);
        add(text2);

        text3 = new JTextArea();
        text3.setOpaque(false);
        text3.setBackground(new Color(0,0,0,0));
        text3.setBounds(250, 230, 1000, 300);
        text3.setFont(fuente);
        text3.setText("En la actualidad el dibujo ha alcanzado un grado de importancia increíble y no ha quedado ajeno al \n"
                + "desarrollo de la informática; en nuestro medio, el dibujo dela mayoría de las oficinas de arquitectura \n"
                + " e ingeniería se realizan por medio de programas de tipo CAD (Computer Aided Design) con lo que se \n"
                + "logra desarrollar trabajos de gran complejidad. Entre los programas más populares para el dibujo asistido\n"
                + "por ordenador están AutoCAD y Solid Edge");
        text3.setEditable(true);
        text3.setVisible(false);
        add(text3);

        setLayout(null);
        this.getContentPane().setBackground(Color.white);
        setSize(1200, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void sonido(String archivo) {
        try {
            sonido.BACK.stop();
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(liga + archivo + ".wav")));
            clip.start();

        } catch (Exception e) {

        }
    }

    public void sonidoOff(){
        clip.stop();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("1")) {
            if (i == 0 && textarea1.isVisible() == true && text2.isVisible() == false) {
                ImageIcon personaje = new ImageIcon(getClass().getResource("/imagenes/persona8.gif"));
                ImageIcon persona = new ImageIcon(personaje.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT));
                lapiz.setIcon(persona);
                sonido("Audio8");
                i = 1;
            } else {
                if (i == 0 && textarea1.isVisible() == false && text2.isVisible() == true) {
                    ImageIcon personaje = new ImageIcon(getClass().getResource("/imagenes/persona9.gif"));
                    ImageIcon persona = new ImageIcon(personaje.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT));
                    lapiz.setIcon(persona);
                    sonido("Audio9");
                    i = 1;
                } else {
                    if (i == 0 && textarea1.isVisible() == false && text2.isVisible() == false) {
                        ImageIcon personaje = new ImageIcon(getClass().getResource("/imagenes/persona9.gif"));
                        ImageIcon persona = new ImageIcon(personaje.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT));
                        lapiz.setIcon(persona);
                        sonido("Audio10");
                        i = 1;
                    }
                }
            }
        } else {
            if (e.getActionCommand().equals("2")) {
                dispose();
                sonido.BACK.loop();
                menuTeoria men = new menuTeoria();
                clip.stop();
            } else {
                if (e.getActionCommand().equals("3")) {

                    if (textarea1.isVisible() == true) {
                        textarea1.setVisible(false);
                        text2.setVisible(true);
                        i = 0;
                        lapiz.setIcon(new ImageIcon(lap.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT)));
                    } else {
                        if (textarea1.isVisible() == false && text2.isVisible() == true) {
                            text2.setVisible(false);
                            text3.setVisible(true);
                            next.setVisible(false);
                            i = 0;
                            lapiz.setIcon(new ImageIcon(lap.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT)));
                        }
                    }
                    if (clip.isActive() == true) {
                    sonidoOff();
                    }
                }
            }
        }
    }
}
