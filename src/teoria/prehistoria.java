package teoria;

import graficos.fondo;
import graficos.sonido;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.border.EmptyBorder;

public class prehistoria extends JFrame implements ActionListener {

    JLabel lapiz, dib, como, imag, imag2;
    JButton audio, home, next;
    ImageIcon lap, hom, audioo, nex, ini, img, img2;
    JTextArea textarea1, text2, text3;
    Font fuente;
    Clip clip;
    String liga;
    int i = 0;

    public prehistoria() {
        
        fondo p = new fondo();
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        this.setContentPane(p);
        
        this.setTitle("Prehistoria");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/dibutech 2.png"));
        setIconImage(icon);

        liga = "/Audio/";

        imag = new JLabel();
        imag.setBounds(50, 600, 200, 200);
        img = new ImageIcon(getClass().getResource("/imagenes/Img 1.gif"));
        imag.setIcon(new ImageIcon(img.getImage().getScaledInstance(imag.getWidth(), imag.getHeight(), Image.SCALE_DEFAULT)));
        add(imag);

        imag2 = new JLabel();
        imag2.setBounds(350, 600, 200, 200);
        img2 = new ImageIcon(getClass().getResource("/imagenes/Img 2.gif"));
        imag2.setIcon(new ImageIcon(img2.getImage().getScaledInstance(imag2.getWidth(), imag2.getHeight(), Image.SCALE_DEFAULT)));
        add(imag2);

        como = new JLabel();
        como.setBounds(350, 100, 400, 70);
        ini = new ImageIcon(getClass().getResource("/imagenes/inicio.png"));
        como.setIcon(new ImageIcon(ini.getImage().getScaledInstance(como.getWidth(), como.getHeight(), Image.SCALE_DEFAULT)));
        add(como);

        Font fuente = new Font("Arial", Font.BOLD, 16);

        next = new JButton("3");
        como.setBounds(350, 100, 400, 70);
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
        textarea1.setFont(fuente);
        textarea1.setText("Desde la prehistoria los primeros hombres utilizaron el dibujo como una forma de comunicacion, \n"
                + "por medio de figuras de tamaño reducido, ubicados en rocas e interior de cuevas. \n\n"
                + "Desde estos tiempos, se ha usado un lenguaje universal, un lenguaje gráfico, que permitió a los más antiguos hombres\n"
                + "comunicar sus ideas y pensamientos entre sí. Estas representaciones constituyen las formas más primitivas"
                + "\nque luego se convirtió en símbolos usados en la cultura actual.");
        textarea1.setEditable(false);
        add(textarea1);

        text2 = new JTextArea();
        text2.setBounds(250, 230, 1000, 300);
        text2.setFont(fuente);
        text2.setText("Aún antes de convertirse en homo sapiens, el hombre demostró talento para pintar. Las denominadas "
                + "\npinturas rupestres encontradas en las paredes de algunas cavernas son testimonios de ese talento. "
                + "\n\nEl hombre primitivo solía pintar figuras de animales o de personas con extraños atuendos que, al parecer,"
                + "\n eran brujos que dirigían una especie de rito mágico. También pintaba a grupos de hombres cazando a algún animal,"
                + "\nporque tenían la creencia de que la representación gráfica de la acción le daría suerte en la cacería. Las pinturas"
                + "\nprehistóricas constituyen documentos de incalculable valor, porque de ese modo narró su historia el hombre que no\n"
                + " conocía la escritura.");
        text2.setEditable(true);
        text2.setVisible(false);
        add(text2);

        text3 = new JTextArea();
        text3.setBounds(250, 230, 1000, 300);
        text3.setFont(fuente);
        text3.setText("En las avanzadas civilizaciones que surgieron en Egipto, Mesopotamia y las islas del mar Egeo, entre el 3000"
                + "\ny 2000 a.C., la pintura alcanzó un alto grado de desarrollo. Las paredes de todos sus edificios fueron adornadas"
                + "\ncon escenas de la vida cortesana, hazañas militares, representaciones de los dioses y retratos de los grandes "
                + "\nsoberanos, en las que se aprecian excelentes técnicas y gran habilidad.\n\n"
                + "El arte egipcio, numerosos frescos han permitido reconstruir la vida diaria de los egipcios. La escritura inclusive, "
                + "\nera un arte. Los jeroglíficos estaban compuestos de ideogramas, es decir dibujos que representaban conceptos.");
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("1")) {
            if (i == 0 && textarea1.isVisible() == true && text2.isVisible() == false) {
                ImageIcon personaje = new ImageIcon(getClass().getResource("/imagenes/Prehistoria.gif"));
                ImageIcon persona = new ImageIcon(personaje.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT));
                lapiz.setIcon(persona);
                sonido("Audio1");
                i = 1;
            } else {
                if (i == 0 && textarea1.isVisible() == false && text2.isVisible() == true) {
                    ImageIcon personaje = new ImageIcon(getClass().getResource("/imagenes/persona2.gif"));
                    ImageIcon persona = new ImageIcon(personaje.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT));
                    lapiz.setIcon(persona);
                    sonido("Audio2");
                    i = 1;
                } else {
                    if (i == 0 && textarea1.isVisible() == false && text2.isVisible() == false) {
                        ImageIcon personaje = new ImageIcon(getClass().getResource("/imagenes/persona3.gif"));
                        ImageIcon persona = new ImageIcon(personaje.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT));
                        lapiz.setIcon(persona);
                        sonido("Audio3");
                        i = 1;
                    }
                }
            }
        } else {
            if (e.getActionCommand().equals("2")) {
                dispose();
                menuTeoria men = new menuTeoria();
            } else {
                if (e.getActionCommand().equals("3")) {

                    if (textarea1.isVisible() == true) {
                        textarea1.setVisible(false);
                        text2.setVisible(true);
                        ini = new ImageIcon(getClass().getResource("/imagenes/rupestres.png"));
                        como.setIcon(new ImageIcon(ini.getImage().getScaledInstance(como.getWidth(), como.getHeight(), Image.SCALE_DEFAULT)));
                        i = 0;
                        lapiz.setIcon(new ImageIcon(lap.getImage().getScaledInstance(lapiz.getWidth(), lapiz.getHeight(), Image.SCALE_DEFAULT)));
                    } else {
                        if (textarea1.isVisible() == false && text2.isVisible() == true) {
                            text2.setVisible(false);
                            text3.setVisible(true);
                            next.setVisible(false);
                            img = new ImageIcon(getClass().getResource("/imagenes/Img 4.gif"));
                            imag.setIcon(new ImageIcon(img.getImage().getScaledInstance(imag.getWidth(), imag.getHeight(), Image.SCALE_DEFAULT)));
                            img2 = new ImageIcon(getClass().getResource("/imagenes/Img 5.gif"));
                            imag2.setIcon(new ImageIcon(img2.getImage().getScaledInstance(imag2.getWidth(), imag2.getHeight(), Image.SCALE_DEFAULT)));
                            ini = new ImageIcon(getClass().getResource("/imagenes/egipcia.png"));
                            como.setIcon(new ImageIcon(ini.getImage().getScaledInstance(como.getWidth(), como.getHeight(), Image.SCALE_DEFAULT)));
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
}
