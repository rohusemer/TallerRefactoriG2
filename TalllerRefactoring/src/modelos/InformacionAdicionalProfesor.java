package modelos;

public class InformacionAdicionalProfesor {
    public int añosdeTrabajo;
    public String facultad;
    public double BonoFijo;
    
    
    public double calcularSueldo(){
        double sueldo=0;
        sueldo= añosdeTrabajo*600 + BonoFijo;
        return sueldo;
    }  
}
