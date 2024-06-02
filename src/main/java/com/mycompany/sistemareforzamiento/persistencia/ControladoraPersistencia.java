
package com.mycompany.sistemareforzamiento.persistencia;

import com.mycompany.sistemareforzamiento.logica.Aula;
import com.mycompany.sistemareforzamiento.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
 
    UsuarioJpaController usuJpa = new UsuarioJpaController(); 
    AulaJpaController aulaJpa = new AulaJpaController();

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
        //Select * from Usuarios
    }

    public List<Aula> traercursos() {
        
        return aulaJpa.findAulaEntities();
    }

    public void guardar(Aula al) {
        
        aulaJpa.create(al);
    }
    
}
