/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author pale
 */
public class LengFavorBean {
    private String nombre;
    private String lenguaje;
    private String cancion;

    public LengFavorBean() {}

    public void setNombre(String nombre) {

    this.nombre=nombre;
    }

    public String getNombre(){

    return nombre;
    }

    public void setLenguaje(String lenguaje){

    this.lenguaje=lenguaje;
    }

    public String getLenguaje() {

    return lenguaje;
    }
    
    public void setCancion(String cancion) {
        this.cancion = cancion;
    }
    
    public String getCancion() {
        return cancion;
    }

    
    public String getcomentariosLenguaje(){

        switch (lenguaje) {
            case "Java":
                return "El rey de los lenguaje Orientados a objetos";
            case "PHP":
                return "Demasiado complejo";
            case "C#":
                return "OK si te gusta el códigoincomprensible";
            default:
                return "Lo siento, no conozco el lenguaje " + lenguaje ;
        }
    }
    
}
