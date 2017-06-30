/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maestross;

/**
 *
 * @author PC06
 */
public class Insumos {
    private Integer codigo;
    private String nombre;
    private String unidadmedida;
    private Integer precio;
    private Envase envase;
    private RubroInsumo rubroinsumo;

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidadmedida(String unidadmedida) {
        this.unidadmedida = unidadmedida;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setEnvase(Envase envase) {
        this.envase = envase;
    }

    public void setRubroinsumo(RubroInsumo rubroinsumo) {
        this.rubroinsumo = rubroinsumo;
    }
    
    
}
