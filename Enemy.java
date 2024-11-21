 import java.util.Random;
 
public class Enemy {
	private  int health;
	private int attack;
	
	Random dado = new Random();
	
	public Enemy() {
		this.health = dado.nextInt(50, 101);
		this.attack = dado.nextInt(10, 16);
		
	}
	
	public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }
	
	public boolean isAlive() {
       if(health > 0) {
    	   return true;
       }
       return false;
    }
	
	public int getHealth() {
        return health;
    }
	
	public int attack() {
		return attack;
	}
	
}
