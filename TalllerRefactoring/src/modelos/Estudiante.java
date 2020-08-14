package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona{
    //Informacion del estudiante
    public String matricula;
    public String facultad;
   
    
    //Getter y setter de Matricula

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNotaInicial(Paralelo p){
        double notaInicial=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(p.getMateria().notaExamen + p.getMateria().notaDeberes + p.getMateria().notaLecciones)*0.80;
                double notaPractico=(p.getMateria().notaTalleres)*0.20;
                notaInicial=notaTeorico+notaPractico;
            }
        }
        return notaInicial;
    }
    
    //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    
    public double CalcularNotaFinal(Paralelo p){
        double notaFinal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(p.getMateria().notaExamen + p.getMateria().notaDeberes + p.getMateria().notaLecciones)*0.80;
                double notaPractico=(p.getMateria().notaTalleres)*0.20;
                notaFinal=notaTeorico+notaPractico;
            }
        }
        return notaFinal;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().notaInicial+p.getMateria().notaFinal)/2;
                
            }
        }
        return notaTotal;
        
    }
}
        
    
    
    
            
        
        
