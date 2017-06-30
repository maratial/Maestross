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
public class Articulo {
   private Integer codigo;
   private String nombre;
   private String descripcion;
   private Subrubro subrubro;
   private Rubro rubro;


    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSubrubro(Subrubro subrubro) {
        this.subrubro = subrubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }
   
}
