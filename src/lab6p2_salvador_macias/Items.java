/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_salvador_macias;

/**
 *
 * @author Apple
 */
public class Items {

    public String nombre;

    public Items(String nombre) {
        this.nombre = nombre;
    }

    public static void EfectoPokemon() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Items{" + "nombre=" + nombre + '}';
    }

}
