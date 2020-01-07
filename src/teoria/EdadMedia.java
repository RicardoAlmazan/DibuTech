package teoria;

import graficos.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.border.EmptyBorder;

public class EdadMedia extends JFrame implements ActionListener {

    JLabel lapiz, dib, como;
    JButton audio, home;
    ImageIcon lap, hom, audioo, ini;
    JTextArea textarea1;
    Font fuente;
    Clip clip;
    String liga;
    int i = 0;

    public EdadMedia() {

        fondo p = new fondo();
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        this.setContentPane(p);
        
        this.setTitle("Edad Media");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/dibutech 2.png"));
        setIconImage(icon);

        liga = "/Audio/";

        como = new JLabel();
        como.setBounds(350, 100, 400, 70);
        ini = new ImageIcon(getClass().getResource("/imagenes/media.png"));
        como.setIcon(new ImageIcon(ini.getImage().getScaledInstance(como.getWidth(), como.getHeight(), Image.SCALE_DEFAULT)));
        add(como);

        Font fuente = new Font("Arial", Font.BOLD, 16);

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
        textarea1.setText("Época feudal por excelencia. Al final de esta época sé empiezan a gestar las ideas que habrán de florecer en el"
                + "´\nRenacimiento. Este periodo se caracteriza por la edificación de ciudades amuralladas. \n"
                + "\nEl dibujo sé utilizo principalmente con fines bélicos, en el trazo de fuertes, castillos, torreones; en el diseño de armas "
                + "\ny como medio de ubicar las posiciones enemigas. \n"
                + "\nEn los monasterios se cultivaba el conocimiento de las ciencias; dentro de estos centros se impartía a los monjes la"
                + "\ncátedra de dibujo y geometría plana entre otras.");
        textarea1.setEditable(false);
        add(textarea1);

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

            System.out.println(e.toString());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("2")) {
            
            dispose();
            sonido.BACK.loop();
            menuTeoria men = new menuTeoria();
            clip.stop();
        } else {
            if (e.getActionCommand().equals("1")) {
                ImageIcon personaje = new ImageIcon("Persona5.gif");
                ImageIcon persona = new ImageIcon(personaje.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT));
                lapiz.setIcon(persona);
                if (i == 0) {
                    sonido("Audio5");
                    i = 1;
                }
            }
        }
    }
}
