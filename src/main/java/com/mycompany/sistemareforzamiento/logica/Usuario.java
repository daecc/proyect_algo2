
package com.mycompany.sistemareforzamiento.logica;

import com.mycompany.sistemareforzamiento.igu.PantallaAsesor;
import com.mycompany.sistemareforzamiento.igu.PantallaEstudiante;
import com.mycompany.sistemareforzamiento.persistencia.ControladoraPersistencia;
import java.io.Serializable;
import java.util.List;
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
    private boolean flag;
    private transient ControladoraPersistencia controlPersis;

    public Usuario(int id, String nombre, String email, String contrasena,String marca) {
        this.id_usuario = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        
    }

    public Usuario() {
        controlPersis = new ControladoraPersistencia(); 
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
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
        
   
        public void iniciarSesion(String usuario, String contraseña){
        List<Usuario> listaUsuarios1 = controlPersis.traerUsuarios();
        PantallaEstudiante pe = new PantallaEstudiante();
        PantallaAsesor pa = new PantallaAsesor();
        for(Usuario usu : listaUsuarios1){
            
            if(usu.getNombre().equals(usuario)){
                
                if(usu.getContrasena().equals(contraseña)){
                    
                    if(usu.getFlag()){
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

    public void cerrarSesion() {
        // Implementar método
    }
}
