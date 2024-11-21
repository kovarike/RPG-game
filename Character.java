// File: Character.java
public abstract class Character {
    private String name;
    private int health;
    private int attack;

    public Character(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
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

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public abstract int attack();
    
}
