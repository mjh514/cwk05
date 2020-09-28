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
public double length; //size of the snake






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
}
