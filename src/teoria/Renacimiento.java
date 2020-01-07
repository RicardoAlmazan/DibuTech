package teoria;

import graficos.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.border.EmptyBorder;

public class Renacimiento extends JFrame implements ActionListener {

    JLabel lapiz, dib, como, imag, imag2;
    JButton audio, home, next;
    ImageIcon lap, hom, audioo, nex, ini, img, img2;
    JTextArea textarea1, text2;
    Font fuente;
    Clip clip;
    String liga;
    int i = 0;

    public Renacimiento() {
        
        fondo p = new fondo();
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        this.setContentPane(p);
        this.setTitle("Renacimiento");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/dibutech 2.png"));
        setIconImage(icon);

        liga = "/Audio/";

        imag = new JLabel();
        imag.setBounds(350,400, 150,150);
        img = new ImageIcon(getClass().getResource("/imagenes/Img 5.jpg"));
        imag.setIcon(new ImageIcon(img.getImage().getScaledInstance(imag.getWidth(), imag.getHeight(), Image.SCALE_DEFAULT)));
        add(imag);
        
        imag2 = new JLabel();
        imag2.setBounds(650,400, 150,150);
        img2 = new ImageIcon(getClass().getResource("/imagenes/Img 6.jpg"));
        imag2.setIcon(new ImageIcon(img2.getImage().getScaledInstance(imag2.getWidth(), imag2.getHeight(), Image.SCALE_DEFAULT)));
        add(imag2);
        
        como = new JLabel();
        como.setBounds(350, 100, 400, 70);
        ini = new ImageIcon(getClass().getResource("/imagenes/renacimiento.png"));
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
        textarea1.setBounds(250, 230, 1000, 300);
        textarea1.setOpaque(false);
        textarea1.setBackground(new Color(0,0,0,0));
        textarea1.setFont(fuente);
        textarea1.setText("Este fue un período de grandes cambios, surge las grandes obras pictóricas como las de: Leonardo Da Vincí,"
                + "\nMiguel Ángel Buenarroti, Rafael y otros. Los artistas de esa época tenían como rasgo singular ser versátiles; "
                + "\nMotivo por el cual eran solicitados con extraordinaria frecuencia. \n"
                + "\nLa aplicación de la pólvora para fines bélicos marcó el principio del fin de las ciudades amuralladas."
                + "\nLos soberanos, deseando mostrar su poderío y riqueza, se interesaron en mejorar el aspecto de las ciudades "
                + "\ncomo medio de exhibición; por este motivo se construyeron suntuosos palacios decorados con temas clásicos, "
                + "\nse erigieron grandes templos, se trazaron y remodelaron plazas, se construyeron avenidas y paseos. \n"
                + "Como consecuencia de todo esto el dibujo geométrico tuvo un gran desarrollo.");
        textarea1.setEditable(false);
        add(textarea1);

        text2 = new JTextArea();
        text2.setBounds(250, 230, 1000, 300);
        text2.setOpaque(false);
        text2.setBackground(new Color(0,0,0,0));
        text2.setFont(fuente);
        text2.setText("Hacia finales del siglo XV la pintura se afirma como la disciplina más adecuada para expresar los ideales del "
                + "\nrenacimiento y la voluntad individualista que cada vez se hará más patente. Así, desde su origen el autorretrato"
                + "\nse presenta como un arte de la comparación y después, gracias a los estudios anatómicos de Leonardo da Vinci, "
                + "\ncomo un arte de la observación. Bajo la influencia de estas ciencias, el artista fijará su atención a la vez "
                + "\nen sus rasgos, para subrayar la dimensión psicológica de su personalidad, y en los colores diluidos, para observar"
                + "\nel paso del tiempo sobre su rostro. El artista no deberá ser sólo comprendido, sino también reconocido.");
        text2.setEditable(true);
        text2.setVisible(false);
        add(text2);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("1")) {
            if (i == 0 && textarea1.isVisible() == true && text2.isVisible() == false) {
                ImageIcon personaje = new ImageIcon(getClass().getResource("/imagenes/persona6.gif"));
                ImageIcon persona = new ImageIcon(personaje.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT));
                lapiz.setIcon(persona);
                sonido("Audio6");
                i = 1;
            } else {
                if (i == 0 && textarea1.isVisible() == false && text2.isVisible() == true) {
                    ImageIcon personaje = new ImageIcon(getClass().getResource("/imagenes/persona7.gif"));
                    ImageIcon persona = new ImageIcon(personaje.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT));
                    lapiz.setIcon(persona);
                    sonido("Audio7");
                    i = 1;
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
                    }
                }
                if (clip.isActive() == true) {
                    clip.stop();
                }
            }
        }
    }
}

