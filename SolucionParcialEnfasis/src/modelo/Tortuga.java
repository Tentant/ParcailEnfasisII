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
public class Tortuga extends Animal{

    public Tortuga(String nombre, String edad, String sexo) {
        super(nombre, edad, sexo);
    }

    @Override
    public int promedioVida() {
        return 40;
    }

    
}
