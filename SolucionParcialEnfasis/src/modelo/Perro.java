/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author s114e3
 */
public class Perro extends Animal{
    
    private String raza;
    
    public Perro(String nombre, String edad, String sexo, String raza) {
        super(nombre, edad, sexo);
        this.raza=raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }

    @Override
    public int promedioVida() {
        return 10;
    }


}
