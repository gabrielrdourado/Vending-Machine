package vendingmachine;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Caixa {
    private int moeda1 = 0;
    private int moeda50 = 0;
    private int moeda25 = 0;
    private int moeda10 = 0;
    private int moeda5 = 0;
    private int tmpmoeda1;
    private int tmpmoeda50;
    private int tmpmoeda25;
    private int tmpmoeda10;
    private int tmpmoeda5;
    private double saldoAtual;
    private double valorCaixa;

    public Caixa(int moeda1, int moeda50, int moeda25, int moeda10, int moeda5) {
        this.valorCaixa = moeda1 * 1.00 + moeda50 * 0.50 + moeda25 * 0.25 + moeda10 * 0.10 + moeda5 * 0.05;
        
        this.moeda1 = moeda1;
        this.moeda50 = moeda50;
        this.moeda25 = moeda25;
        this.moeda10 = moeda10;
        this.moeda5 = moeda5;
    }

    public int getMoeda1() {
        return moeda1;
    }

    public void setMoeda1(int moeda1) {
        this.moeda1 = moeda1;
    }

    public int getMoeda50() {
        return moeda50;
    }

    public void setMoeda50(int moeda50) {
        this.moeda50 = moeda50;
    }

    public int getMoeda25() {
        return moeda25;
    }

    public void setMoeda25(int moeda25) {
        this.moeda25 = moeda25;
    }

    public int getMoeda10() {
        return moeda10;
    }

    public void setMoeda10(int moeda10) {
        this.moeda10 = moeda10;
    }

    public int getMoeda5() {
        return moeda5;
    }

    public void setMoeda5(int moeda5) {
        this.moeda5 = moeda5;
    }

    public int getTmpmoeda1() {
        return tmpmoeda1;
    }

    public void setTmpmoeda1(int tmpmoeda1) {
        this.tmpmoeda1 = tmpmoeda1;
    }

    public int getTmpmoeda50() {
        return tmpmoeda50;
    }

    public void setTmpmoeda50(int tmpmoeda50) {
        this.tmpmoeda50 = tmpmoeda50;
    }

    public int getTmpmoeda25() {
        return tmpmoeda25;
    }

    public void setTmpmoeda25(int tmpmoeda25) {
        this.tmpmoeda25 = tmpmoeda25;
    }

    public int getTmpmoeda10() {
        return tmpmoeda10;
    }

    public void setTmpmoeda10(int tmpmoeda10) {
        this.tmpmoeda10 = tmpmoeda10;
    }

    public int getTmpmoeda5() {
        return tmpmoeda5;
    }

    public void setTmpmoeda5(int tmpmoeda5) {
        this.tmpmoeda5 = tmpmoeda5;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual + this.saldoAtual;
        
        if(saldoAtual == 0.05)
            this.tmpmoeda5 = this.tmpmoeda5 + 1;
        
        if(saldoAtual == 0.10)
            this.tmpmoeda10 = this.tmpmoeda10 + 1;
        
        if(saldoAtual == 0.25)
            this.tmpmoeda25 = this.tmpmoeda25 + 1;
        
        if(saldoAtual == 0.50)
            this.tmpmoeda50 = this.tmpmoeda50 + 1;
        
        if(saldoAtual == 1.00)
            this.tmpmoeda1 = this.tmpmoeda1 + 1;
    }

    public double getValorCaixa() {
        this.valorCaixa = moeda1 * 1.00 + moeda50 * 0.50 + moeda25 * 0.25 + moeda10 * 0.10 + moeda5 * 0.05;
        
        //Arredondando o valor
        this.valorCaixa = this.valorCaixa * 100;
        this.valorCaixa = Math.round(this.valorCaixa);
        this.valorCaixa = this.valorCaixa / 100;
        
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
    
    public void cleanerAtual () {
        this.saldoAtual = 0;
        this.tmpmoeda5 = 0;
        this.tmpmoeda10 = 0;
        this.tmpmoeda25 = 0;
        this.tmpmoeda50 = 0;
        this.tmpmoeda1 = 0;
    }
    
    public void comprar(Produto prod) {
        DecimalFormat df = new DecimalFormat("0.00");
        
        int tmpcxmoeda1 = this.moeda1;
        int tmpcxmoeda50 = this.moeda50;
        int tmpcxmoeda25 = this.moeda25;
        int tmpcxmoeda10 = this.moeda10;
        int tmpcxmoeda5 = this.moeda5;
        
        int trocomoeda5 = 0;
        int trocomoeda10 = 0;
        int trocomoeda25 = 0;
        int trocomoeda50 = 0;
        int trocomoeda1 = 0;
        
        
        //Calculando troco e salvando o valor do troco inicial
        this.saldoAtual = this.saldoAtual - prod.getPreco();
        double trocoInicial = this.saldoAtual;
        
        //Arredondando o valor
        this.saldoAtual = this.saldoAtual * 100;
        this.saldoAtual = Math.round(this.saldoAtual);
        this.saldoAtual = this.saldoAtual / 100;
        
        if(this.saldoAtual != 0.00){
            
            while(this.saldoAtual >= 1.00 && tmpcxmoeda1>0){
                trocomoeda1++;
                tmpcxmoeda1--;
                this.saldoAtual = this.saldoAtual - 1.00;
                
                //Arredondando o valor
                this.saldoAtual = this.saldoAtual * 100;
                this.saldoAtual = Math.round(this.saldoAtual);
                this.saldoAtual = this.saldoAtual / 100;
            }
            
            while(this.saldoAtual >= 0.50 && tmpcxmoeda50>0){
                trocomoeda50++;
                tmpcxmoeda50--;
                this.saldoAtual = this.saldoAtual - 0.50;
                
                //Arredondando o valor
                this.saldoAtual = this.saldoAtual * 100;
                this.saldoAtual = Math.round(this.saldoAtual);
                this.saldoAtual = this.saldoAtual / 100;
            }

            while(this.saldoAtual >= 0.25 && tmpcxmoeda25>0){
                trocomoeda25++;
                tmpcxmoeda25--;
                this.saldoAtual = this.saldoAtual - 0.25;
                
                //Arredondando o valor
                this.saldoAtual = this.saldoAtual * 100;
                this.saldoAtual = Math.round(this.saldoAtual);
                this.saldoAtual = this.saldoAtual / 100;
            }
            
            while(this.saldoAtual >= 0.10 && tmpcxmoeda10>0){
                trocomoeda10++;
                tmpcxmoeda10--;
                this.saldoAtual = this.saldoAtual - 0.10;
                
                //Arredondando o valor
                this.saldoAtual = this.saldoAtual * 100;
                this.saldoAtual = Math.round(this.saldoAtual);
                this.saldoAtual = this.saldoAtual / 100;
            }

            while(this.saldoAtual >= 0.05 && tmpcxmoeda5>0){
                trocomoeda5++;
                tmpcxmoeda5--;
                this.saldoAtual = this.saldoAtual - 0.05;
                
                //Arredondando o valor
                this.saldoAtual = this.saldoAtual * 100;
                this.saldoAtual = Math.round(this.saldoAtual);
                this.saldoAtual = this.saldoAtual / 100;
            }
            
            if(this.saldoAtual == 0.00){
                JOptionPane.showMessageDialog(null, "Compra realizada com Sucesso!\n\n\n" + "Valor do Troco: R$ " + df.format(Math.abs(trocoInicial)) + "\n\n Devolvido em:\n " + trocomoeda1 + " moeda(s) de 1 real\n" + trocomoeda50 + " moeda(s) de 50 centavos\n" + trocomoeda25 + " moeda(s) de 25 centavos\n" + trocomoeda10 + " moeda(s) de 10 centavos\n"+ trocomoeda5 + " moeda(s) de 5 centavos\n");
                
                prod.setQuant(-1);
                
                this.moeda1 = tmpcxmoeda1;
                this.moeda50 = tmpcxmoeda50;
                this.moeda25 = tmpcxmoeda25;
                this.moeda10 = tmpcxmoeda10;
                this.moeda5 = tmpcxmoeda5;
                
                this.moeda5 = this.moeda5 + this.tmpmoeda5;
                this.tmpmoeda5 = 0;
                this.moeda10 = this.moeda10 + this.tmpmoeda10;
                this.tmpmoeda10 = 0;
                this.moeda25 = this.moeda25 + this.tmpmoeda25;
                this.tmpmoeda25 = 0;
                this.moeda50 = this.moeda50 + this.tmpmoeda50;
                this.tmpmoeda50 = 0;
                this.moeda1 = this.moeda1 + this.tmpmoeda1;
                this.tmpmoeda1 = 0;
                
                this.saldoAtual = 0;
            }
            else{
                JOptionPane.showMessageDialog(null, "Troco Insuficiente", "Troco Insuficiente", JOptionPane.ERROR_MESSAGE);
                this.saldoAtual = 0;
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Compra realizada com Sucesso!");
            
            prod.setQuant(-1);
            
            this.moeda5 = this.moeda5 + this.tmpmoeda5;
            this.tmpmoeda5 = 0;
            this.moeda10 = this.moeda10 + this.tmpmoeda10;
            this.tmpmoeda10 = 0;
            this.moeda25 = this.moeda25 + this.tmpmoeda25;
            this.tmpmoeda25 = 0;
            this.moeda50 = this.moeda50 + this.tmpmoeda50;
            this.tmpmoeda50 = 0;
            this.moeda1 = this.moeda1 + this.tmpmoeda1;
            this.tmpmoeda1 = 0;
            
            this.moeda1 = tmpcxmoeda1;
            this.moeda50 = tmpcxmoeda50;
            this.moeda25 = tmpcxmoeda25;
            this.moeda10 = tmpcxmoeda10;
            this.moeda5 = tmpcxmoeda5;
            
            this.saldoAtual = 0;
        }
        
    }
}



