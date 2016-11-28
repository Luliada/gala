/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geotbr4;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class verfCPF {
    private String strCPF, strCPFVerf;
    
    //costrutor da classe
    public verfCPF() {
        
        
    }
    
    //metodos
    
    public void setCPF(String cpf) {
        //guardo o cpf que o usuario digitou
        this.strCPF = cpf;
        
        //pego os 9 digitos do cpf que o usuario digitou para fazer a verificacao
        this.strCPFVerf = strCPF.substring(0, 9);
        
        //mostro os numeros que serao verificados
        
        //informar o que está acontecendo
        System.out.println("Valores a verificar: " +strCPFVerf);
        
        
        //chamando a função de verificação do 1 digito
        Dig1();
    }
    
    public void Dig1() {
        int Somatorio = 0, resto = 0 , Total = 0;
        
        Somatorio = Integer.parseInt(strCPFVerf.substring(0, 1)) * 10;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(1, 2)) * 9;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(2, 3)) * 8;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(3, 4)) * 7;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(4, 5)) * 6;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(5, 6)) * 5;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(6, 7)) * 4;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(7, 8)) * 3;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(8, 9)) * 2;
        Total = Total + Somatorio;
        
        System.out.println("TOTAL 1d: " + Total);
        
        resto = Total % 11;
        
        //enquanto o valor for maior que 11 o resto recebe o resto de somatorio
        while (resto >= 11) {
            resto = Total % 11;
        }
        //se o valor de resto for menor que 2 (1 ou 0) ele recebe 0
        if (resto <2 ) {
            resto = 0;
        } else {
            //caso seja maior ele diminui por 11 e o resto recebe o valor
            resto = 11 - resto;
        }
        
        System.out.println("1º digito " + resto);
        //adicionando o primeiro digito
        this.strCPFVerf = strCPFVerf + String.valueOf(resto);
        
        //chamo a proxima função para continuar a verificação do digito 2
        Dig2();
    }
    
    public void Dig2() {
        int Somatorio = 0, resto = 0 , Total = 0;
        
        Somatorio = Integer.parseInt(strCPFVerf.substring(0, 1)) * 11;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(1, 2)) * 10;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(2, 3)) * 9;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(3, 4)) * 8;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(4, 5)) * 7;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(5, 6)) * 6;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(6, 7)) * 5;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(7, 8)) * 4;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(8, 9)) * 3;
        Total = Total + Somatorio;
        Somatorio = Integer.parseInt(strCPFVerf.substring(9, 10)) * 2;
        Total = Total + Somatorio;
        
        System.out.println("TOTAL 2d: " + Total);
        
        resto = Total % 11;
        
        //enquanto o valor for maior que 11 o resto recebe o resto de somatorio
        while (resto >= 11) {
            resto = Total % 11;
        }
        //se o valor de resto for menor que 2 (1 ou 0) ele recebe 0
        if (resto <2 ) {
            resto = 0;
        } else {
            //caso seja maior igual a 2 ele diminui por 11 e o resto recebe o valor
            resto = 11 - resto;
        }
        //adicionando o segundo digito
        
        System.out.println("2º digito " + resto);
        this.strCPFVerf = strCPFVerf + String.valueOf(resto);
        
        System.out.println("CPF verificado: " + strCPFVerf);
        
        //chamando procedimento que informa se o cpf é valido
        Anal();
    }
    
    public void Anal() {
        if (strCPFVerf.equals(this.strCPF)) {
            //informo o usuario que o cpf é válido
            JOptionPane.showMessageDialog(null, "CPF VÁLIDO!");
            System.out.println("CPF válido!!!");
            //envido true para fins de cadastramento positivo (pode cadastrar)s
        } else {
            //informo o usuario que o cpf é inválido
            JOptionPane.showMessageDialog(null, "CPF INVÁLIDO");
            System.out.println("CPF Invalido!!!");
            //envio false para fins de cadastramento negativo (nao pode cadastrar)
        }
    }
}
