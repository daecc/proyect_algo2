
package com.mycompany.sistemareforzamiento.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aula implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String horario;
    private String dia;
    private String link;
    private String asesor;
    

    public Aula() {
    }

    public Aula(int id, String nombre, String horario, String dia, String link, String asesor) {
        this.id = id;
        this.nombre = nombre;
        this.horario = horario;
        this.dia = dia;
        this.link = link;
        this.asesor = asesor;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDocente() {
        return asesor;
    }

    public void setDocente(String docente) {
        this.asesor = docente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    

    
}
