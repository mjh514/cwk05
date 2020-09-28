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
public class Hawk {
  
    
  // INSTANCE VARIABLES
	public String name1;
	public boolean hungry;

	
	
	// METHODS
	
	// make a noise
	public void play() {
		/* here we use the name and hungry variables 
		 for whatever Cat we called the method for
		 so if we called mrWhiskers.miaow() then
		 we will use mrWhiskers.name and mrWhiskers.hungry
		*/
		System.out.print("I'm playing with my pet " + name1 + "he is a snake");
                // conditional . . . we haven't talked about this yet
		// only print this part if the hungry
		// boolean is currently true
		if (hungry) {
			System.out.print(" and I'm hungry.");
		}
		System.out.println();  // newline
	}
	

	// eat a Bunny
	public void eat(Snake food) {
		System.out.println(name1 + " is eating " 
			+ food.name + ". YUM!");
		hungry = false;
		food.name = "Dinner";
	}


	// toString method creates String representing the Cat
        @Override
	public String toString() {
		String str = name1 + " the ";
		if (hungry) {
			str += "hungry ";
		}
		return str + "cat";
    
    
    
}

     //To change body of generated methods, choose Tools | Templates.
    }
