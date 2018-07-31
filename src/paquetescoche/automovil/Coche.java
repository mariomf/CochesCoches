/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetescoche.automovil;

/**
 *
 * @author mario
 */
public class Coche {

    private String marca;
    private String tipo;
    private int velocidad;
    private int id;
    
    public Coche(){
        
    }
    public Coche(int id, String marca, String tipo, int velocidad){
        this.id = id;
        this.marca = marca;
        this.tipo = tipo;
        this.velocidad = velocidad;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    //********METODOS**************************
    public void avanzar(double n_kilometros){
        
    }
    public void parar(){
        
    }
}
