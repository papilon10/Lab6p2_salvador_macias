/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_salvador_macias;

/**
 *
 * @author Apple
 */
public class Pokemon {

    public String ataque;
    public String ataqueEsp;
    public String defensa;
    public String defensaEsp;
    public String velocida;
    public String vida;
    public String nombre;
    public String nivel;

    public Pokemon(String ataque, String ataqueEsp, String defensa, String defensaEsp, String velocida, String vida, String nombre, String nivel) {
        this.ataque = ataque;
        this.ataqueEsp = ataqueEsp;
        this.defensa = defensa;
        this.defensaEsp = defensaEsp;
        this.velocida = velocida;
        this.vida = vida;
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getAtaqueEsp() {
        return ataqueEsp;
    }

    public void setAtaqueEsp(String ataqueEsp) {
        this.ataqueEsp = ataqueEsp;
    }

    public String getDefensa() {
        return defensa;
    }

    public void setDefensa(String defensa) {
        this.defensa = defensa;
    }

    public String getDefensaEsp() {
        return defensaEsp;
    }

    public void setDefensaEsp(String defensaEsp) {
        this.defensaEsp = defensaEsp;
    }

    public String getVelocida() {
        return velocida;
    }

    public void setVelocida(String velocida) {
        this.velocida = velocida;
    }

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void getNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void curarPokemon() {
    }

    public static void SubirNivel() {
    }

    public static void QuitarVida() {
    }

    public static void SacarNaturaleza() {
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nNivel: " + nivel;
    }

}
