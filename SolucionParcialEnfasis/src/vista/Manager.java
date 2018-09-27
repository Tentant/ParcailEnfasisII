/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import modelo.Animal;
import modelo.Gato;
import modelo.Perro;
import modelo.Tortuga;


public class Manager {
    
    Controlador controlador;
    
    public Manager(){
        controlador = new Controlador();
    }
    
    public void llenar(){
        Animal animal= new Perro("Klaus", "5", "Masculino", "Labrador");
        controlador.llenar(animal);
        controlador.llenar(new Gato("Angora", "6", "Femenino", "Egipcio"));
        controlador.llenar(new Tortuga("Morroqui", "45", "Masculino"));
    }
    
    public String mostrar(){
        String mostrar = controlador.mostrar();
        return mostrar;
    }
}
