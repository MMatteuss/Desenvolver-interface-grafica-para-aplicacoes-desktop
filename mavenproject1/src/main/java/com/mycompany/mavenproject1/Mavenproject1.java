/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Avantti
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        
        aluno1.nome = "Mateus";
        aluno1.cpf = "123.465.789-99";
        aluno1.matricula = 1;
        
        System.out.println("Nome do Aluno: "+aluno1.nome);
        System.out.println("CPF do Aluno: "+aluno1.cpf);
        System.out.println("Matricula do Aluno: "+aluno1.matricula);
        
        System.out.println(" ");
        System.out.println("------------------------");
        System.out.println(" ");
        System.out.println("Calculadora");
        
        Calcular calcular1 = new Calcular();
        
        calcular1.num1 = 1;
        calcular1.num2 = 2;
        calcular1.sinal = "-";
        
        if(null == calcular1.sinal){
            System.out.println("Erro de sinal.");
        } else switch (calcular1.sinal) {
            case "+" -> System.out.println(calcular1.num1+" + "+calcular1.num2+" = "+(calcular1.num1+calcular1.num2));
            case "-" -> System.out.println(calcular1.num1+" - "+calcular1.num2+" = "+(calcular1.num1-calcular1.num2));
            case "X" -> System.out.println(calcular1.num1+" X "+calcular1.num2+" = "+(calcular1.num1*calcular1.num2));
            case "/" -> System.out.println(calcular1.num1+" / "+calcular1.num2+" = "+(calcular1.num1/calcular1.num2));
            default -> System.out.println("Erro de sinal.");
        }
    }
    
}