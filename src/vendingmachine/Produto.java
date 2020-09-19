/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.text.DecimalFormat;

/**
 *
 * @author aluno
 */
public class Produto {
    private String codigo;
    private String nomeProd;
    private double preco;
    private int quant;

    public Produto(String codigo, String nomeProd, double preco, int quant) {
        this.codigo = codigo;
        this.nomeProd = nomeProd;
        this.preco = preco;
        this.quant = quant;
    }
    
    public Produto() {
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        if(quant == -1 || quant == +1){
            if(quant == -1)
                this.quant--;
            if(quant == +1)
                this.quant++;
        }
        else{
            this.quant = quant;
        }
    }
    
}
