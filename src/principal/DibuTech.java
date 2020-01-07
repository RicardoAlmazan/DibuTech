package principal;
import graficos.inicio;
import graficos.sonido;

public class DibuTech {
    public static void main(String[] args){
        inicio frame = new inicio();
        frame.setVisible(true);
        sonido.BACK.loop();
    }
    
}

