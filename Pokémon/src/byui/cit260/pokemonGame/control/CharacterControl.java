/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.control;

import byui.cit260.pokemonGame.model.Pokemon;
import byui.cit260.pokemonGame.model.Item;
import java.util.ArrayList;

/**
 *
 * @author jacegummersall
 */
public class CharacterControl {

    public ArrayList<Item> removeUsedItemList(){
        
        System.out.println("*** called removeUsedItemList stub function***");
        return null;
}
    
    
    public ArrayList<Pokemon> addPokemon() {
        
        //Create the arraylist
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        
        //adding pokemon to the list
        Pokemon Pikachu = new Pokemon("Pikachu", 40, 25, 50, 1);
        pokemons.add(Pikachu);
        pokemons.add(new Pokemon("Rattata", 30, 20, 40, 1));
        pokemons.add(new Pokemon("Charizard", 50, 30, 70, 1));
        pokemons.add(new Pokemon("Spearow", 35, 15, 50, 1));
        pokemons.add(new Pokemon("Gyarados", 60, 20, 70, 1));
        pokemons.add(new Pokemon("Mewtwo", 70, 30, 100, 1));
        
        return pokemons;
        
    }
}
