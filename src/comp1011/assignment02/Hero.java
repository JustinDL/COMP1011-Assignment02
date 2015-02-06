

package comp1011.assignment02;

/**
 *
 * @author Justin
 * Hero Class to use as a superclass for all other hero subclasses
 */
public class Hero {
    private int strength;
    private int speed;
    private int health;
    public String name;
    
    // constructor
    public Hero(String name){
        
        this.name = name;
        generateAbilities();

    }
    
    
    // public methods
    public void show(){
        String message = (this.name + "\nHealth: " + this.health + "\nStrength: " + this.strength + "\nSpeed: "+ this.speed );
        System.out.println(message);
    }
    
    public void fight(){
        
        if(hitAttempt()){
            
            System.out.println("The hero dealt: " + hitDamage() + " damage!");
        }
        else{
            System.out.println("The hero missed!!");
        }
        
    }
    
    
    
    
    //private methods
    private void generateAbilities(){
        // random numbers for health/speed/strength
        this.strength = (int)(Math.random() * 100) + 1;
        this.speed = (int)(Math.random() * 100) + 1;
        this.health = (int)(Math.random() * 100) + 1;
        
    }
    
    private boolean hitAttempt(){
        // 1/5 chance to hit
        int hitChance = (int)(Math.random()*5) + 1;
        if (hitChance == 1){
            return true;
        }
        else{ 
            return false;
        }
    }
    private int hitDamage(){
        // multiplies str by 1-6 to determine damage (worst game ever 6x damage? roll this instant win man...)
        int dmg = 0;
        int dmgMultiplier = (int)(Math.random()*6) + 1;
        
        dmg = this.strength * dmgMultiplier;
        
        return dmg;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}

