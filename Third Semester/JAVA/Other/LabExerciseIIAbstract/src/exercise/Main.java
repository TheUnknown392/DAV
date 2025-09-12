package exercise;

public class Main {
    public static void main(String args[]){
        // testing by making object
        Enemy en = new Enemy();
        Friend fr = new Friend();
        
        Player e = new Enemy();
        Player f = new Friend();
        
        
        // Abstract object
        e.team();
        f.team();
        
        // nonAbstract object
        en.team();
        fr.team();
    }
}
