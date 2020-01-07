package teoria;

import graficos.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.border.EmptyBorder;

public class EpocaClasica extends JFrame implements ActionListener {

    JLabel lapiz, dib, como;
    JButton audio, home, next;
    ImageIcon lap, hom, audioo, nex, ini;
    JTextArea text1, text2;
    Font fuente;
    Clip clip;
    String liga;
    int i = 0;

    public EpocaClasica() {
        
        fondo p = new fondo();
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        this.setContentPane(p);
        
        this.setTitle("Epoca Clásica");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/dibutech 2.png"));
        setIconImage(icon);

        liga = "/Audio/";

        como = new JLabel();
        como.setBounds(300, 30, 500, 200);
        ini = new ImageIcon(getClass().getResource("/imagenes/clasica.png"));
        como.setIcon(ini);
        add(como);

        Font fuente = new Font("Arial", Font.BOLD, 14);

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

        text1 = new JTextArea();
        text1.setBounds(250, 200, 1000, 300);
        text1.setOpaque(false);
        text1.setBackground(new Color(0,0,0,0));
        text1.setFont(fuente);
        text1.setText("La iniciadora fue la cultura griega, que influyó en todas las épocas siguientes: "
                + "\nse caracterizó porque en ella se fomentó y cultivó la razón, la lógica y floreció la "
                + "\ninvestigación. Fue un periodo de gran filosofía. El empleo del dibujo tuvo su mayor "
                + "\naplicación; en: arquitectura, obras de carácter civil, en diseño de ciudades, otros "
                + "\n(templos, teatros y lugares para juegos atléticos). Un ejemplo refinado del razonamiento"
                + "\ny armonía entre otros, fue la construcción del Partenón. \n"
                + "La Cultura Romana, Los romanos absorbieron y supieron aprovechar la cultura griega, la transformaron"
                + "\ny adaptaron de acuerdo a sus necesidades, destacaron en la técnica de la ingeniería; construyeron"
                + "\nciudades solucionando los problemas que traen consigo éstas, realizando obras como: acueductos,"
                + "\npuentes,puertos y otros. Construyeron teatros, grandes monumentos para recordar las victorias de las"
                + "\nhazañas bélicas; estadios (El Coliseo y el Circo Máximo).\n\n"
                + "La alta época clásica (c. 475 a.C.-448 a.C.)  Después de la victoria griega sobre los persas, "
                + "\nla necesidad de reparar la devastación de la guerra generó una gran actividad artística tanto en"
                + "\n arquitectura como en escultura. Esto fue especialmente evidente en Atenas, centro neurálgico del"
                + "\npoder político y económico.");
        text1.setEditable(false);
        add(text1);

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
                ImageIcon personaje = new ImageIcon(getClass().getResource("/imagenes/Persona4.gif"));
                ImageIcon persona = new ImageIcon(personaje.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT));
                lapiz.setIcon(persona);
                if (i == 0 && text1.isVisible() == true) {
                    sonido("Audio4");
                    i = 1;

                }
            }
        }
    }
}
