/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.tostadora.controler;

import edu.sena.tostadora.entity.Carts;
import edu.sena.tostadora.entity.Products;
import edu.sena.tostadora.facade.CartsFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import org.primefaces.PF;

/**
 *
 * @author SENA
 */
@Named(value = "carrito")
@SessionScoped
public class Carrito implements Serializable {

    @EJB
    CartsFacadeLocal cfl;

    private Carts carrito = new Carts();
    private Integer cantidad = 1;
    private List<Carts> car = new ArrayList<>();
    private int total;
  

    public Carrito() {

    }
    
    public void vaciarCarrito(){
       cfl.remove(carrito);
    }

    public void agregarCarrito(Products p) {
        try {
            if (cantidad > 0) {
                carrito.setProductId(p);

                carrito.setQuantity(cantidad);
                cfl.create(getCarrito());
                cantidad = cantidad;
                cantidad = 1;
                PF.current().executeScript(
                        "  swal.fire({"
                        + "  position: 'top-end',"
                        + "  icon: 'success',"
                        + "  title: 'Se pado al carrito',"
                        + "  showConfirmButton: false,"
                        + "  timer: 1500"
                        + "  })");
            }

        } catch (Exception e) {
            PF.current().executeScript(
                    "  swal.fire({"
                    + "  position: 'top-end',"
                    + "  icon: 'error',"
                    + "  title: 'Error al editar el producto',"
                    + "  showConfirmButton: false,"
                    + "  timer: 1500"
                    + "  })");
        }

    }


public int calcularTotal(Carts c){
        int total = c.getProductId().getPrice() * c.getQuantity();
        return total;
    }
   
    public void comprarProducto(Carts car) {
        try {
            
            cfl.findAll();
            

        } catch (Exception e) {
        }

    }

    public void eliminarProducto(Carts car) {
        cfl.remove(car);
        
    }

    public List<Carts> leerTodos() {
        return cfl.leerTodos();
    }

    public Carts getCarrito() {
        return carrito;
    }

    public void setCarrito(Carts carrito) {
        this.carrito = carrito;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public List<Carts> getCar() {
        return car;
    }

    public void setCar(List<Carts> car) {
        this.car = car;
    }

}
