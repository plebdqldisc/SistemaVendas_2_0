/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.modelo.Televisao;
import java.util.Scanner;

/**
 *
 * @author arthur.7923
 */
public class VisaoTelevisao {
    public static Televisao menuCadastroTelevisao(){
        Televisao televisao = new Televisao();
        
        System.out.println("Marca: ");
        televisao.setNome(new Scanner(System.in).nextLine());
        
        System.out.println("Preço: ");
        televisao.setPreco(new Scanner(System.in).nextDouble());
        
        System.out.println("Quantas polegadas: ");
        televisao.setPolegadas(new Scanner(System.in).nextDouble());
        
        System.out.println("Qual Resolucao: ");
        televisao.setResolucao(new Scanner(System.in).nextDouble());
        System.out.println("===============================================");
        
        return televisao;
    }
}
