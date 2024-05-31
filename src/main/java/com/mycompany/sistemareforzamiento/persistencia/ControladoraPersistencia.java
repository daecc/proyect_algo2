
package com.mycompany.sistemareforzamiento.persistencia;

import com.mycompany.sistemareforzamiento.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
 
    UsuarioJpaController usuJpa = new UsuarioJpaController(); 

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
        //Select * from Usuarios
    }
    
}
