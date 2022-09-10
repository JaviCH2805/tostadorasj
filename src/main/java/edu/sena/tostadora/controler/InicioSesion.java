/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.tostadora.controler;

import edu.sena.tostadora.entity.Users;
import edu.sena.tostadora.facade.RolesFacadeLocal;
import edu.sena.tostadora.facade.UsersFacadeLocal;
import java.io.IOException;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import org.primefaces.PF;

/**
 *
 * @author Aprendiz
 */
@Named(value = "inicioSesion")
@SessionScoped
public class InicioSesion implements Serializable {

    @EJB
    UsersFacadeLocal user;

    @EJB
    RolesFacadeLocal rfl;
    
    private String correo;
    private String clave;
   
    
    private Users usuarioLogin = new Users();
    private Users usuarioRecovery = new Users();
    private Users usuarioRegister = new Users();
    
    

    public InicioSesion() {
    }

    public void inicio() {
        try {
            FacesContext fx = FacesContext.getCurrentInstance();
            
            fx.getExternalContext().redirect("catalogo/index.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearUsuario() {

        try {
            
           
            usuarioRegister.setRoleId(rfl.findRolByName("CLIENTE"));
            user.create(usuarioRegister);
            usuarioRegister = new Users();
            if (usuarioRegister != null) {

                FacesContext fx = FacesContext.getCurrentInstance();
                fx.getExternalContext().redirect("cliente/catalogo.xhtml");
            }

        } catch (Exception e) {
            PF.current().executeScript(
                    "  swal.fire({"
                    + "  position: 'top-end',"
                    + "  icon: 'error',"
                    + "  title: 'Este ususario ya se encuentra registrado',"
                    + "  showConfirmButton: false,"
                    + "  timer: 1500"
                    + "  })");
        }

    }
    
    public void editarPerfil(){
        user.edit(usuarioLogin);
        try{
        PF.current().executeScript(
                    "  swal.fire({"
                    + "  position: 'top-end',"
                    + "  icon: 'success',"
                    + "  title: 'Actualizado',"
                    + "  showConfirmButton: false,"
                    + "  timer: 1500"
                    + "  })");
        } catch (Exception e) {
            PF.current().executeScript(
                    "  swal.fire({"
                    + "  position: 'top-end',"
                    + "  icon: 'error',"
                    + "  title: 'Intente Nuevamente',"
                    + "  showConfirmButton: false,"
                    + "  timer: 1500"
                    + "  })");
        }
    
    }

    public void validarUsuario() {
        try {
            usuarioLogin = user.validarUsuario(correo, clave);
            if (usuarioLogin == null) {
                PF.current().executeScript(
                        "  swal.fire({"
                        + "  position: 'top-end',"
                        + "  icon: 'error',"
                        + "  title: 'Correo y/o Contraseña Incorrecta ',"
                        + "  showConfirmButton: false,"
                        + "  timer: 1500"
                        + "  })");

            } else {
                FacesContext fx = FacesContext.getCurrentInstance();
                if(usuarioLogin.getRoleId().getNameRole().equals("ADMIN")) {
                    fx.getExternalContext().redirect("administrador/index.xhtml");
                } else {
                    fx.getExternalContext().redirect("cliente/catalogo.xhtml");
                }
                
            }
        } catch (Exception e) {
            PF.current().executeScript(
                    "  swal.fire({"
                    + "  position: 'top-end',"
                    + "  icon: 'error',"
                    + "  title: 'Usuario Inexistente',"
                    + "  showConfirmButton: false,"
                    + "  timer: 1500"
                    + "  })");
        }
    }

    public void validarRecovery() {
        try {
            usuarioRecovery = user.validarRecovery(correo);
            if (usuarioRecovery == null) {
                PF.current().executeScript(
                        "  swal.fire({"
                        + "  position: 'top-end',"
                        + "  icon: 'error',"
                        + "  title: 'Verifique su Correo Electronico',"
                        + "  showConfirmButton: false,"
                        + "  timer: 1500"
                        + "  })");
            } else {
                PF.current().executeScript(
                        "  swal.fire({"
                        + "  position: 'top-end',"
                        + "  icon: 'success',"
                        + "  title: 'Recuperacion Exitosa',"
                        + "  showConfirmButton: false,"
                        + "  timer: 1500"
                        + "  })");
            }

        } catch (Exception e) {

        }
    }

    
    
       public void eliminarUsuario(Users usuario) {
        user.remove(usuario);
        
        try {

            PF.current().executeScript(
                    "  swal.fire({"
                            + "  position: 'top-end',"
                            + "  icon: 'success',"
                            + "  title: 'Eliminacion de Usuario Exitoso',"
                            + "  showConfirmButton: false,"
                            + "  timer: 1500"
                            + "  })");

        } catch (Exception e) {
            PF.current().executeScript(
                    "  swal.fire({"
                            + "  position: 'top-end',"
                            + "  icon: 'error',"
                            + "  title: 'Error al eliminar el Usuario',"
                            + "  showConfirmButton: false,"
                            + "  timer: 1500"
                            + "  })");
        }
    }
    public List<Users> leerTodos() {
        return user.leerTodos();
    }

    public void  editarUsuario(Users usuarioLogin){
      
       try {
            user.edit(usuarioLogin);
            usuarioLogin = new Users();
            PF.current().executeScript(
                    "  swal.fire({"
                            + "  position: 'top-end',"
                            + "  icon: 'success',"
                            + "  title: 'Edicion de Usuario Exitoso',"
                            + "  showConfirmButton: false,"
                            + "  timer: 1500"
                            + "  })");

        } catch (Exception e) {
            PF.current().executeScript(
                    "  swal.fire({"
                            + "  position: 'top-end',"
                            + "  icon: 'error',"
                            + "  title: 'Error al editar el Usuario',"
                            + "  showConfirmButton: false,"
                            + "  timer: 1500"
                            + "  })");
        }
    
    }
     public void cargarData(Users usuarioLogin) {
        this.usuarioLogin= usuarioLogin;
        mostrarFormularioEditar();
    }
    
     public void mostrarDatos(Users usuarioLogin ){
        this.usuarioLogin = usuarioLogin;

    }
    
    public void mostrarFormularioEditar() {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("edit_user.xhtml");
        } catch (IOException ex) {
            System.out.println("Error al redireccionar");
        }
        mostrarDatos(usuarioLogin);
    }
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Users getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(Users usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    public Users getUsuarioRecovery() {
        return usuarioRecovery;
    }

    public void setUsuarioRecovery(Users usuarioRecovery) {
        this.usuarioRecovery = usuarioRecovery;
    }

    public Users getUsuarioRegister() {
        return usuarioRegister;
    }

    public void setUsuarioRegister(Users usuarioRegister) {
        this.usuarioRegister = usuarioRegister;
    }

    
}
