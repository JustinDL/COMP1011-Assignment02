
package comp1011.assignment02;

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
    void powers(){
        superPowers[0] = "Super Speed";
        superPowers[1] = "Super Strength";
        superPowers[2] = "Body Armour";
        superPowers[3] = "Flight";
        superPowers[4] = "Fire Generation";
        superPowers[5] = "Weather Control";
    }
    
    //Constructor +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public SuperHero (String name){
        super(name);
        
        generateRandomPowers();
        
    }
    
    //Private methods +++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    private void generateRandomPowers(){
        //loop 3 times, generate a random number and that number is the power they get
        // loops again to see if that power already exists, if it does it makes the main loop re-do its loop
        for (int i = 0; i < 3; i++){
            int ran1 = (int)(Math.random()*6) +1;
            
            switch (ran1){
                case 1: superPowers[i] = "Super Speed";
                        break;
                case 2: superPowers[i] = "Super Strength";
                        break;
                case 3: superPowers[i] = "Body Armour";
                        break;
                case 4: superPowers[i] = "Flight";
                        break;    
                case 5: superPowers[i] = "Flame Creation";
                        break;    
                case 6: superPowers[i] = "Water Control";
                        break;       
            }
            for(int j = 0; j < 3; j++){
                if (superPowers[i].equals(superPowers[j])){
                    i--;
                }    
            }     
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
