package save;

import java.io.Serializable;

public class Persona implements Serializable{

    private String contraseña;
    private String nombre;
    private String boleta;

    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }

    public String getBoleta() {
        return boleta;
    }

    public String getContra() {
        return contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setContra(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
