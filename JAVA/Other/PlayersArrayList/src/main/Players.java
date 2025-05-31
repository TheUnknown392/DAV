package main;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class Players {
    public List<String> players = new ArrayList<>();
    public static void main(String arg[]){
        // making objects
        Players play = new Players();
        
        // adding the players
        play.players.add("Player one");
        play.players.add("Player Two");
        play.players.add("Player Three");
        play.players.add("Player Four");
        play.players.add("Messi");
        play.players.add("Player Five");
        play.players.add("Player Six");
        play.players.add("Ramos");
        play.players.add("Player Seven");
        play.players.add("Player Eight");
        
        // removing the specific element in list according to index
        play.players.remove(5);
        play.players.remove(7);
       
        // updating Ramos if there is ramos
        if(play.players.contains("Ramos")){
            play.players.set(play.players.indexOf("Ramos"), "Ramos Ramos");
        }
        
        // displaying contains messi if it contains messi or doesn't contain messi
        if(play.players.contains("Messi")){
            System.out.println("Contains messi");
        }else{
            System.out.println("Does not contain messi");
            
        }
        
        // prints the even indexed element in the list
        for(int i=2;i<(play.players.size());i+=2){
            System.out.println(play.players.get(i));
        }
        
    }
}

































