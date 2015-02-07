
package comp1011.assignment02;
import java.util.*;
/**
 *
 * @author Justin
 * February 6th 2015
 * Description: Superhero subclass of the Hero superclass
 */
public class SuperHero extends Hero {
    // super power array
    private String[] superPowers = new String[3];
    // populates the array since it will only ever have these 6 powers...?
    ArrayList<String> powerNames = new ArrayList<String>();
    
    //Constructor +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public SuperHero (String name){
        super(name);
        
        generateRandomPowers();
        
    }
    
    //Private methods +++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    private void generateRandomPowers(){
        powerNames.add("Super Strength");
        powerNames.add("Super Speed");
        powerNames.add("Body Armour");
        powerNames.add("Flight");
        powerNames.add("Fire Generation");
        powerNames.add("Water Control");
        
        
        for (int i = 0; i < 3; i++){
            int size = powerNames.size();
            int ran1 = (int)(Math.random()*(size - 1) + 1);
            
            superPowers[i] = powerNames.get(ran1);
            powerNames.remove(ran1);
        }
        
    }
    
    public void showPowers(){
        String message = (this.name + "'s Powers:");
        for (int k = 0; k < 3; k++){
            message += ("\n"+ superPowers[k]);
        }
                
        System.out.println(message);
        
        
    }
    
    
    
    
}
