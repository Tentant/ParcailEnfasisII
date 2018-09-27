/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Animal;

/**
 *
 * @author s204e14
 */
public class Controlador {
    List<Animal> listaAnimales;

    public Controlador(List<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }
    
    public Controlador() {
        this.listaAnimales = new ArrayList<Animal>();
    }    
    
    public void llenar (Animal animal){
        listaAnimales.add(animal);
    }
    
    //USANDO DTOs, ya que si se hace de la otra manera, me pide implementar los métodos abstractos.
//    public void llenar (String nombre, String edad, String sexo){
//        listaAnimales.add(new Animal(nombre, edad, sexo));
//    }
    
    public String mostrar(){
        String muestraAnimal="";
        for (Animal animal : listaAnimales) {
            muestraAnimal = muestraAnimal+animal.toString();
        }
        return muestraAnimal;
        
    }

    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(List<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }
    
    
}
