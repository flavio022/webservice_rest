/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.back_sistemabancario;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author flavio
 */
public class Configuracao extends io.dropwizard.Configuration {
    @JsonProperty
    private String atributo1;
    @JsonProperty
    private String atributo2;
    
    public void setAtributo1(String att1){
        this.atributo1 = att1;
    }
    public void setAtributo2(String att2){
        this.atributo2 = att2;
    }
    public String getAtributo1(){
        return this.atributo1;
    }
    public String getAtributo2(){
        return this.atributo2;
    }
}
