package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
    public String codigo;
    public int añosdeTrabajo;
    public String facultad;
    public double BonoFijo;

    public Profesor(String codigo, String nombre, String apellido, String facultad, int edad, String direccion, String telefono, int añosdeTrabajo,Double BonoFijo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        paralelos= new ArrayList<>();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    public double calcularSueldo(){
        double sueldo=0;
        sueldo= añosdeTrabajo*600 + BonoFijo;
        return sueldo;
    }  
    
    
}
