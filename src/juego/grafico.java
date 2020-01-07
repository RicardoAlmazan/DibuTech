package juego;

import graficos.fondo;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.border.EmptyBorder;

public class grafico extends JFrame implements Runnable, ActionListener, Serializable {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, imagen;
    ImageIcon i1, i2, i3, i4, i5, i6, i7, i8, i9, img;
    JLabel tiempo, tFinal, imag;
    Thread hilo;
    boolean cronometroActivo;
    float inicio = 0;

    public grafico() {

        this.setTitle("DibuTech");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png"));
        setIconImage(icon);
        this.setResizable(false);

        fondo p = new fondo();
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        this.setContentPane(p);

        tiempo = new JLabel("00:00:000");
        tiempo.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        tiempo.setBounds(600, 100, 130, 130);
        tiempo.setForeground(Color.BLACK);
        //tiempo.setOpaque(true);
        add(tiempo);

        tFinal = new JLabel();
        tFinal.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        tFinal.setBounds(600, 100, 130, 130);
        tFinal.setForeground(Color.BLACK);
        //tFinal.setOpaque(true);
        add(tFinal);
        tFinal.setVisible(false);

        imagen = new JButton("Ver imagen");
        imagen.setBounds(750, 300, 100, 30);
        imagen.addActionListener(this);
        add(imagen);

        imag = new JLabel();
        imag.setBounds(700, 100, 224, 194);
        img = new ImageIcon(getClass().getResource("/imagenes/juego.gif"));
        imag.setIcon(img);
        imag.setVisible(false);
        add(imag);

        i1 = new ImageIcon(getClass().getResource("/imagenes/1-1.png"));
        i2 = new ImageIcon(getClass().getResource("/imagenes/2.png"));
        i3 = new ImageIcon(getClass().getResource("/imagenes/3.png"));
        i4 = new ImageIcon(getClass().getResource("/imagenes/4.png"));
        i5 = new ImageIcon(getClass().getResource("/imagenes/5.png"));
        i6 = new ImageIcon(getClass().getResource("/imagenes/6.png"));
        i7 = new ImageIcon(getClass().getResource("/imagenes/7.png"));
        i8 = new ImageIcon(getClass().getResource("/imagenes/8.png"));
        i9 = new ImageIcon(getClass().getResource("/imagenes/9.png"));

        b1 = new JButton("1");
        b1.setIcon(i1);
        b1.setBounds(150, 60, 133, 113);
        b1.addActionListener(this);
        b1.setBorderPainted(false);
        b1.setRolloverEnabled(false);
        b1.setContentAreaFilled(false);
        add(b1);
        b1.setVisible(false);

        b2 = new JButton("2");
        b2.setIcon(i3);
        b2.setBounds(283, 60, 133, 113);
        b2.setBorderPainted(false);
        b2.setRolloverEnabled(false);
        b2.setContentAreaFilled(false);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("3");
        b3.setIcon(i7);
        b3.setBounds(436, 60, 133, 113);
        b3.setBorderPainted(false);
        b3.setRolloverEnabled(false);
        b3.setContentAreaFilled(false);
        b3.addActionListener(this);
        add(b3);
        //b3.setVisible(false);

        b4 = new JButton("4");
        b4.setIcon(i8);
        b4.setBounds(150, 193, 133, 113);
        b4.setBorderPainted(false);
        b4.setRolloverEnabled(false);
        b4.setContentAreaFilled(false);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("5");
        b5.setIcon(i4);
        b5.setBounds(283, 193, 133, 113);
        b5.setBorderPainted(false);
        b5.setRolloverEnabled(false);
        b5.setContentAreaFilled(false);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("6");
        b6.setIcon(i2);
        b6.setBounds(436, 193, 133, 113);
        b6.setBorderPainted(false);
        b6.setRolloverEnabled(false);
        b6.setContentAreaFilled(false);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("7");
        b7.setIcon(i9);
        b7.setBounds(150, 326, 133, 113);
        b7.setBorderPainted(false);
        b7.setRolloverEnabled(false);
        b7.setContentAreaFilled(false);
        b7.addActionListener(this);
        add(b7);

        b8 = new JButton("8");
        b8.setIcon(i5);
        b8.setBounds(283, 326, 133, 113);
        b8.setBorderPainted(false);
        b8.setRolloverEnabled(false);
        b8.setContentAreaFilled(false);
        b8.addActionListener(this);
        add(b8);

        b9 = new JButton("9");
        b9.setIcon(i6);
        b9.setBounds(436, 326, 133, 113);
        b9.setBorderPainted(false);
        b9.setRolloverEnabled(false);
        b9.setContentAreaFilled(false);
        b9.addActionListener(this);
        add(b9);

        setLayout(null);
        setSize(1000, 600);
        setLocation(250, 80);
        setVisible(true);
    }

    public void run() {
        Integer minutos = 0, segundos = 0, milesimas = 0;
        String min = "", seg = "", mil = "";
        try {
            while (cronometroActivo) {
                Thread.sleep(4);
                milesimas += 4;

                if (milesimas == 1000) {
                    milesimas = 0;
                    segundos += 1;
                    if (segundos == 60) {
                        segundos = 0;
                        minutos++;
                    }
                }

                if (minutos < 10) {
                    min = "0" + minutos;
                } else {
                    min = minutos.toString();
                }
                if (segundos < 10) {
                    seg = "0" + segundos;
                } else {
                    seg = segundos.toString();
                }

                if (milesimas < 10) {
                    mil = "00" + milesimas;
                } else if (milesimas < 100) {
                    mil = "0" + milesimas;
                } else {
                    mil = milesimas.toString();
                }

                tiempo.setText(min + ":" + seg + ":" + mil);
            }
        } catch (Exception e) {
        }

        tiempo.setText("00:00:000");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("2")) {
            if (b1.isVisible() == false && b3.isVisible() == true && b5.isVisible() == true) {
                b1.setIcon(b2.getIcon());
                b1.setVisible(true);
                b2.setVisible(false);
            } else {
                if (b3.isVisible() == false && b6.isVisible() == true && b5.isVisible() == true) {
                    b3.setIcon(b2.getIcon());
                    b3.setVisible(true);
                    b2.setVisible(false);
                } else {
                    if (b3.isVisible() == true && b6.isVisible() == true && b5.isVisible() == false) {
                        b5.setIcon(b2.getIcon());
                        b5.setVisible(true);
                        b2.setVisible(false);
                    }
                }
            }
        } else {
            if (e.getActionCommand().equals("4")) {
                if (b1.isVisible() == false && b2.isVisible() == true) {
                    b1.setIcon(b4.getIcon());
                    b1.setVisible(true);
                    b4.setVisible(false);
                } else {
                    if (b1.isVisible() == true && b5.isVisible() == false) {
                        b5.setIcon(b4.getIcon());
                        b5.setVisible(true);
                        b4.setVisible(false);
                    } else {
                        if (b5.isVisible() == true
                                && b1.isVisible() == true && b7.isVisible() == false) {
                            b7.setIcon(b4.getIcon());
                            b7.setVisible(true);
                            b4.setVisible(false);
                        }
                    }
                }
            } else {
                if (e.getActionCommand().equals("1")) {
                    if (b2.isVisible() == true && b4.isVisible() == false) {
                        b4.setIcon(b1.getIcon());
                        b4.setVisible(true);
                        b1.setVisible(false);
                    } else {
                        if (b2.isVisible() == false && b4.isVisible() == true) {
                            b2.setIcon(b1.getIcon());
                            b2.setVisible(true);
                            b1.setVisible(false);
                        }
                    }
                } else {
                    if (e.getActionCommand().equals("7")) {
                        if (b8.isVisible() == true && b4.isVisible() == false) {
                            b4.setIcon(b7.getIcon());
                            b4.setVisible(true);
                            b7.setVisible(false);
                        } else {
                            if (b8.isVisible() == false && b4.isVisible() == true) {
                                b8.setIcon(b7.getIcon());
                                b8.setVisible(true);
                                b7.setVisible(false);
                            }
                        }
                    } else {
                        if (e.getActionCommand().equals("3")) {
                            if (b6.isVisible() == true && b2.isVisible() == false) {
                                b2.setIcon(b3.getIcon());
                                b2.setVisible(true);
                                b3.setVisible(false);
                            } else {
                                if (b6.isVisible() == false && b2.isVisible() == true) {
                                    b6.setIcon(b3.getIcon());
                                    b6.setVisible(true);
                                    b3.setVisible(false);
                                }
                            }
                        } else {
                            if (e.getActionCommand().equals("9")) {
                                if (b6.isVisible() == true && b8.isVisible() == false) {
                                    b8.setIcon(b9.getIcon());
                                    b8.setVisible(true);
                                    b9.setVisible(false);
                                } else {
                                    if (b6.isVisible() == false && b8.isVisible() == true) {
                                        b6.setIcon(b9.getIcon());
                                        b6.setVisible(true);
                                        b9.setVisible(false);
                                    }
                                }
                            } else {
                                if (e.getActionCommand().equals("6")) {
                                    if (b3.isVisible() == false && b9.isVisible() == true && b5.isVisible() == true) {
                                        b3.setIcon(b6.getIcon());
                                        b3.setVisible(true);
                                        b6.setVisible(false);
                                    } else {
                                        if (b3.isVisible() == true && b9.isVisible() == false && b5.isVisible() == true) {
                                            b9.setIcon(b6.getIcon());
                                            b9.setVisible(true);
                                            b6.setVisible(false);
                                        } else {
                                            if (b3.isVisible() == true && b9.isVisible() == true && b5.isVisible() == false) {
                                                b5.setIcon(b6.getIcon());
                                                b5.setVisible(true);
                                                b6.setVisible(false);
                                            }
                                        }
                                    }
                                } else {
                                    if (e.getActionCommand().equals("8")) {
                                        if (b7.isVisible() == false && b9.isVisible() == true && b5.isVisible() == true) {
                                            b7.setIcon(b8.getIcon());
                                            b7.setVisible(true);
                                            b8.setVisible(false);
                                        } else {
                                            if (b7.isVisible() == true && b9.isVisible() == false && b5.isVisible() == true) {
                                                b9.setIcon(b8.getIcon());
                                                b9.setVisible(true);
                                                b8.setVisible(false);
                                            } else {
                                                if (b7.isVisible() == true && b9.isVisible() == true && b5.isVisible() == false) {
                                                    b5.setIcon(b8.getIcon());
                                                    b5.setVisible(true);
                                                    b8.setVisible(false);
                                                }
                                            }
                                        }
                                    } else {
                                        if (e.getActionCommand().equals("5")) {
                                            if (b2.isVisible() == false && b6.isVisible() == true && b8.isVisible() == true && b4.isVisible() == true) {
                                                b2.setIcon(b5.getIcon());
                                                b2.setVisible(true);
                                                b5.setVisible(false);
                                            } else {
                                                if (b2.isVisible() == true && b6.isVisible() == false && b8.isVisible() == true && b4.isVisible() == true) {
                                                    b6.setIcon(b5.getIcon());
                                                    b6.setVisible(true);
                                                    b5.setVisible(false);
                                                } else {
                                                    if (b2.isVisible() == true && b6.isVisible() == true && b8.isVisible() == false && b4.isVisible() == true) {
                                                        b8.setIcon(b5.getIcon());
                                                        b8.setVisible(true);
                                                        b5.setVisible(false);
                                                    } else {
                                                        if (b2.isVisible() == true && b6.isVisible() == true && b8.isVisible() == true && b4.isVisible() == false) {
                                                            b4.setIcon(b5.getIcon());
                                                            b4.setVisible(true);
                                                            b5.setVisible(false);
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (e.getActionCommand().equals("1") || e.getActionCommand().equals("2") || e.getActionCommand().equals("3")
                || e.getActionCommand().equals("4") || e.getActionCommand().equals("5") || e.getActionCommand().equals("6")
                || e.getActionCommand().equals("7") || e.getActionCommand().equals("8") || e.getActionCommand().equals("9")) {
            if (b2.getIcon() == i2 && b3.getIcon() == i3 && b4.getIcon() == i4
                    && b5.getIcon() == i5 && b6.getIcon() == i6 && b7.getIcon() == i7 && b8.getIcon() == i8 && b9.getIcon() == i9) {
                tFinal.setText(tiempo.getText());
                tFinal.setVisible(true);
                tiempo.setVisible(false);
                cronometroActivo = false;
                JOptionPane.showMessageDialog(null, "Felicidades, ¡Haz ganado! \n Tiempo: " + tFinal.getText());
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
        } else {
            if (inicio == 0) {
                cronometroActivo = true;
                hilo = new Thread(this);
                hilo.start();
                inicio = 1;
            } else {
                if (e.getActionCommand().equals("Ver imagen")) {
                    {
                        imag.setVisible(true);
                        imagen.setEnabled(false);
                    }
                }
            }
        }
    }
}
