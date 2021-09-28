/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Rocio
 */
public class Adopcion {
    
    private Persona personaQueAdopta;
    private Perro perroAAdoptar;
    
     public Adopcion() {
    }

    public Adopcion(Persona personaQueAdopta, Perro perroAAdoptar) {
        this.personaQueAdopta = personaQueAdopta;
        this.perroAAdoptar = perroAAdoptar;
    }
     
    public Persona getPersonaQueAdopta() {
        return personaQueAdopta;
    }

    public Perro getPerroAAdoptar() {
        return perroAAdoptar;
    }
    
    public void setPersonaQueAdopta(Persona personaQueAdopta) {
        this.personaQueAdopta = personaQueAdopta;
    }

    public void setPerroAAdoptar(Perro perroAAdoptar) {
        this.perroAAdoptar = perroAAdoptar;
    }
    
    public Adopcion generarAdopcion(Persona persona){
        Adopcion adopcion = new Adopcion();
        
        Perro perroAAdoptar = persona.getPerroAdoptado();
        adopcion.setPersonaQueAdopta(persona);
        adopcion.setPerroAAdoptar(perroAAdoptar);
        
        return adopcion;
    }

    @Override
    public String toString() {
        return "Adopcion{" + "personaQueAdopta = " + personaQueAdopta +'}';
    }
    
    
}
