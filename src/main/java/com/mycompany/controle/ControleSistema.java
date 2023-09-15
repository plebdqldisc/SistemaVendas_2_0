/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle;

import com.mycompany.modelo.VideoGame;
import com.mycompany.visao.VisaoComputador;
import com.mycompany.visao.VisaoMenu;
import com.mycompany.visao.VisaoVideoGame;
import java.util.ArrayList;

/**
 *
 * @author arthur.7923
 */
public class ControleSistema {
    public static ArrayList<Object> produtos = new ArrayList<>();
    
    public static void cadastrar() {
        int opcaoProduto = VisaoMenu.menuEscolhaProduto();
        
        if(opcaoProduto == 1){
            produtos.add(VisaoVideoGame.menuCadastroVideoGame());
        }else if(opcaoProduto == 2){
            produtos.add(VisaoComputador.menuCadastroComputador());
        }
    }
    public static void alterar(int indiceProduto) {
        indiceProduto = indiceProduto - 1;
        
        Object object = produtos.get(indiceProduto);
        
        if(object instanceof VideoGame) {
            VideoGame videoGame = new VideoGame();
            videoGame = (VideoGame) object;
            
            System.out.println("Alterando o produto: " + videoGame.toString());
            
            //videoGame = (VideoGame) VisaoVideoGame.
        }
    }
}
