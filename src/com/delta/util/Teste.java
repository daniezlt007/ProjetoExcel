/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.delta.util;

/**
 *
 * @author 01332
 */
public class Teste {
    public static void main(String[] args) {
        String a = Util.configurarValor("17.8");
        System.out.println("Valor:" + a.replace("R$ ", ""));
    }
    
}
