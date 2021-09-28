/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Rocio
 */
public class Asiento {
    private Integer numero;
    private Character letra;
    private Character ocupado;

    public Asiento() {
    }

    public Asiento(Integer numero, Character letra, Character ocupado) {
        this.numero = numero;
        this.letra = letra;
        this.ocupado = ocupado;
    }

    public Integer getNumero() {
        return numero;
    }

    public Character getLetra() {
        return letra;
    }

    public Character getOcupado() {
        return ocupado;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setLetra(Character letra) {
        this.letra = letra;
    }

    public void setOcupado(Character ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return numero +" "+ letra +" "+ocupado+" | " ;
    }
    
    
}
