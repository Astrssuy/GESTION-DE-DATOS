/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import java.util.ArrayList;
import persona.Usuario;
import java.util.List;

/**
 *
 * @author robin
 */
public class UsuarioDAO {
    private List<Usuario> usuarios;
    
    
    public UsuarioDAO(){
     
        usuarios=new ArrayList<>();
        
    }
    
    
    
    public int buscar(String usuario){
        
        int n=-1;
        for(int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getUsuario().equals(usuario)){
                n=i;
                break;
            
            }
        }
        return n;
    }


    
    
    public boolean insertar(Usuario usuario){
        if (buscar(usuario.getUsuario())==-1){
            
            usuarios.add(usuario);
            return true;
        }else{
            
            return false;
    
        }
    }

    
    public boolean modificar(Usuario usuario){
        if (buscar(usuario.getUsuario())!=-1){
            Usuario usuarioaux=obtener(usuario.getUsuario());
            
  
            usuarioaux.setNombre(usuario.getNombre());
            usuarioaux.setApellido(usuario.getApellido());
            usuarioaux.setCorreo(usuario.getCorreo());
             usuarioaux.setTelefono(usuario.getTelefono());
             
            usuarioaux.setContra(usuario.getContra());
            usuarioaux.setUsuario(usuario.getUsuario());
            
            return true;
        }else{
            
            return false;
    
        }
        
    }


    public boolean eliminar(String usuario){
        if (buscar(usuario)!=-1){
            
            usuarios.remove(buscar(usuario));
             
            return true;
        }else{
            
            return false;
    
        }
     
    }

    
    public Usuario obtener(String usuario){
            
            if(buscar(usuario)!=-1){
            return usuarios.get(buscar(usuario));
        
    
    }else{
        return null;

        }   

    }
}