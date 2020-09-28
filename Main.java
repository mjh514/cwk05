package cwk05;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hawk myHawk = new Hawk();
        myHawk.name1 = "Spiros";
        myHawk.hungry = true;
        
        Snake mySnake = new Snake();
        mySnake.name = "Sammy";
        mySnake.length = 12.5;
        
        
        System.out.println("Hi my name is " + mySnake.name );
        mySnake.grow();
        mySnake.slither();
        
        myHawk.play();
        
        // TODO code application logic here
    }
}
