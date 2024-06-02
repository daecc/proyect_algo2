
package com.mycompany.sistemareforzamiento.logica;

import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_usuario;
    private String nombre;
    private String email;
    private String contrasena;
   

    public Usuario(int id, String nombre, String email, String contrasena,String marca) {
        this.id_usuario = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        
    }

    public Usuario() {
    }
    

    public int getId() {
        return id_usuario;
    }

    public void setId(int id) {
        this.id_usuario = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

   
    
    

        
   
    public void iniciarSesion() {
        // Implementar método
    }

    public void cerrarSesion() {
        // Implementar método
    }
}
