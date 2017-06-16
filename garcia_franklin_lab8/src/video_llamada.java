
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class video_llamada {
     private String emisor;
    private String receptor;
    private Date fecha_realizada;
    private int duracion;

    public video_llamada() {
    }

    public video_llamada(String emisor, String receptor, Date fecha_realizada, int duracion) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha_realizada = fecha_realizada;
        this.duracion = duracion;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public Date getFecha_realizada() {
        return fecha_realizada;
    }

    public void setFecha_realizada(Date fecha_realizada) {
        this.fecha_realizada = fecha_realizada;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
}
