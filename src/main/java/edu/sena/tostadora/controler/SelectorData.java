/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.tostadora.controler;

import edu.sena.tostadora.entity.Products;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author SENA
 */
@Named(value = "selectorData")
@SessionScoped
public class SelectorData implements Serializable {

    private Products productSelect = new Products();
    
    /**
     * Creates a new instance of SelectorData
     */
    public SelectorData() {
    }

    /**
     * @return the productSelect
     */
    public Products getProductSelect() {
        return productSelect;
    }

    /**
     * @param productSelect the productSelect to set
     */
    public void setProductSelect(Products productSelect) {
        this.productSelect = productSelect;
    }
    
    
    
}
