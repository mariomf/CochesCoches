/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetescoche.automovil.tipo_de_coche;

/**
 *
 * @author mario
 */
public class Familiar extends paquetescoche.automovil.Coche{
    private int cambios;
    private boolean cuatroXcuatro;
    public Familiar(){}
    public Familiar(int id, String marca, String tipo, int velocidad, int cambios, boolean cuatroXcuatro){
        super(id, marca, tipo, velocidad);
        this.cambios = cambios;
        this.cuatroXcuatro = cuatroXcuatro;
    }
    
}
