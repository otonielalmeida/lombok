package com.calculadora.Calculadora.modelo;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
public class Calculadora {
    @Getter @Setter
   public double valor1;
    @Getter @Setter
    public double valor2;
    public double calcularAdicao(){
        return (valor1+valor2);
    }
    public double calcularSub(){
        return (valor1-valor2);
    }
    public double calcularMul(){
        return (valor1*valor2);
    }
    public double calcularDiv(){
        return (valor1/valor2);
    }
public String mostrarDados(){
        return "Calculadora"+ "Resultados: "+
                "\nAdicao: "+calcularAdicao()+
                "\nSubtracao: "+calcularSub()+
                "\nDivisao: "+ calcularDiv()+
                "\nMultiplicacao: "+calcularMul();
}
}
