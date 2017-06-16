/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class contacto {
    private String nombre;
    private int num_telefono;
    private String correo;
    private String decsripcion;
    private int edad;
    private String genero;

    public contacto() {
    }

    public contacto(String nombre, int num_telefono, String correo, String decsripcion, int edad, String genero) {
        this.nombre = nombre;
        this.num_telefono = num_telefono;
        this.correo = correo;
        this.decsripcion = decsripcion;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(int num_telefono) {
        this.num_telefono = num_telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDecsripcion() {
        return decsripcion;
    }

    public void setDecsripcion(String decsripcion) {
        this.decsripcion = decsripcion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
