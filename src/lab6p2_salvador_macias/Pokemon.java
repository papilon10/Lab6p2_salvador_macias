/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_salvador_macias;

import java.util.Random;

/**
 *
 * @author Apple
 */
public class Pokemon {

    public int ataque;
    public int ataqueEsp;
    public int defensa;
    public int defensaEsp;
    public int velocida;
    public int vida;
    public String nombre;
    public int nivel;
    public String naturaleza;

    public Pokemon(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public Pokemon(int ataque, int ataqueEsp, int defensa, int defensaEsp, int velocida, int vida, String nombre, int nivel) {
        this.ataque = ataque;
        this.ataqueEsp = ataqueEsp;
        this.defensa = defensa;
        this.defensaEsp = defensaEsp;
        this.velocida = velocida;
        this.vida = vida;
        this.nombre = nombre;
        this.nivel = nivel;
        this.naturaleza = naturaleza;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaqueEsp() {
        return ataqueEsp;
    }

    public void setAtaqueEsp(int ataqueEsp) {
        this.ataqueEsp = ataqueEsp;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getDefensaEsp() {
        return defensaEsp;
    }

    public void setDefensaEsp(int defensaEsp) {
        this.defensaEsp = defensaEsp;
    }

    public int getVelocida() {
        return velocida;
    }

    public void setVelocida(int velocida) {
        this.velocida = velocida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        Random aleatorio = new Random();
        int digito = aleatorio.nextInt(5);
       switch (digito) {
            case 1:
                setNaturaleza("Adamant");

                break;
            case 2:
                setNaturaleza("Timid");
                break;
            case 3:
                setNaturaleza("Modest");
                break;
            case 4:
                setNaturaleza("Jolly");

                break;
            case 5:
                setNaturaleza("Naive");
                break;
            default:
                throw new AssertionError();
        }
       
    }

    public static void curarPokemon() {
    }

    public static void SubirNivel() {
    }

    public static void QuitarVida() {
    }

    //Pokemon p = new Pokemon(naturaleza);
    public static void SacarNaturaleza() {

        Random aleatorio = new Random();
        int digito = aleatorio.nextInt(5);
       /* switch (digito) {
            case 1:
                //this.setNaturaleza("Adamant");

                break;
            case 2:
                //  p.setNaturaleza("Timid");
                break;
            case 3:
                /// p.setNaturaleza("Modest");
                break;
            case 4:
                // p.setNaturaleza("Jolly");

                break;
            case 5:
                //p.setNaturaleza("Naive");
                break;
            default:
                throw new AssertionError();
        }*/
    }

    int vidaEstatica = getVida();

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nNivel: " + nivel
                + "\nHP: " + this.getVida() + "/" + vida
                + "\nNaturaleza: " + naturaleza
                + "\nAtaque: " + ataque
                + "\nAtaque especial: " + ataqueEsp
                + "\nDefensa: " + defensa
                + "\nDefensa especial : " + defensaEsp
                + "\nvelocidad: " + velocida;
    }

}
