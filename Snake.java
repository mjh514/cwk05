/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk05;

/**
 *
 * @author matth
 */
public class Snake {
public String name;    //name of the snake
private double length; //size of the snake






// METHODS
	// actions every Snake can do
	
	// increase size of snake
	public void grow() {
		length++;
		System.out.println("I am now " + length + " feet long, I will eat you!");
	}

	// the snake moves
	public void slither() {
		System.out.println(name + " slithers down the hole");
	}
        
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hawk myHawk = new Hawk();
        
        
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
