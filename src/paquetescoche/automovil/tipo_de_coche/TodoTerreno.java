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
public class TodoTerreno extends paquetescoche.automovil.Coche{
    
    private int cambios;
    private boolean cuatroXcuatro;
    public TodoTerreno(){}
    public TodoTerreno(int id, String marca, String tipo, int velocidad, int cambios, boolean cuatroXcuatro){
        super(id, marca, tipo, velocidad);
        this.cambios = cambios;
        this.cuatroXcuatro = cuatroXcuatro;
    }

    /**
     * @return the cambios
     */
    public int getCambios() {
        return cambios;
    }

    /**
     * @param cambios the cambios to set
     */
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    /**
     * @return the cuatroXcuatro
     */
    public boolean isCuatroXcuatro() {
        return cuatroXcuatro;
    }

    /**
     * @param cuatroXcuatro the cuatroXcuatro to set
     */
    public void setCuatroXcuatro(boolean cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }
}
