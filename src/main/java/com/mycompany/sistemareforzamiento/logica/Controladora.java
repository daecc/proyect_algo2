
package com.mycompany.sistemareforzamiento.logica;

import com.mycompany.sistemareforzamiento.igu.PantallaAsesor;
import com.mycompany.sistemareforzamiento.igu.PantallaEstudiante;
import com.mycompany.sistemareforzamiento.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    
    ControladoraPersistencia controlPersis;

    public Controladora() {
        controlPersis = new ControladoraPersistencia(); 
    }
    
    

    public String validarUsuario(String usuario, String contraseña) {
        String mensaje = "";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for(Usuario usu : listaUsuarios){
            
            if(usu.getNombre().equals(usuario)){
                
                if(usu.getContrasena().equals(contraseña)){
                    mensaje = "Usuario y contraseña correctos. Bienvenidos";
                    
                    return mensaje;
                }
                else{
                    mensaje = "Contraseña incorrecta.";
                    return mensaje;
                }
                    
                }
            else{
                mensaje = "Usuario no encontrado.";
                //return mensaje;
            }
                    
        }
        return mensaje;
    }
    
    
    public void validarBien(String usuario, String contraseña){
        List<Usuario> listaUsuarios1 = controlPersis.traerUsuarios();
        PantallaEstudiante pe = new PantallaEstudiante();
        PantallaAsesor pa = new PantallaAsesor();
        for(Usuario usu : listaUsuarios1){
            
            if(usu.getNombre().equals(usuario)){
                
                if(usu.getContrasena().equals(contraseña)){
                    
                    if("asesor".equals(usu.getNombre())){
                        pa.setVisible(true);
                        pa.setLocationRelativeTo(null);
                    }
                    else{
                        pe.setVisible(true);
                        pe.setLocationRelativeTo(null);
                        
                    }
                    
                }
                else{
                    
                   
                }
                    
                }
            else{
                
               
            }
                    
        }
    }
    
}
