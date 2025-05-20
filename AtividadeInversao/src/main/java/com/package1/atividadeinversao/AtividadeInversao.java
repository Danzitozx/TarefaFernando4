/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.package1.atividadeinversao;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author okmen
 */
public class AtividadeInversao {

    public static void main(String[] args) {
        String test = " ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";
        
        Stack <Character> pilha = new Stack<>();
        for(char elementos : test.toCharArray()){
            pilha.push(elementos);
        }
        
        while(!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }
    }
}


