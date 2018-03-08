/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class IMC {
    private double peso;
    private double altura;
    
    public IMC(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
        }
    public double getValor(){
        return this.peso / (this.altura * this. altura);
    }
    
    public String getEstadoNutricional(){
        double imc = getValor();
        if (imc < 18.5){
            return "peso bajo";
        }
        else if (imc < 25.0){
            return "Peso normal";
        }
        else if (imc < 30.0){
            return "Sobrepeso";
        }
        else if (imc < 40.0){
            return "Obesidad";
        }
        else {
            return "Obesidad extrema";
        }
    }
}
