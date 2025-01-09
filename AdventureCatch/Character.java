package AdventureCatch;

import java.util.ArrayList;
import java.util.List;

public abstract class Character{
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();
    private Weapon weapon;

    public Character(String name, int maxHealth, Weapon weapon) {
        this.maxHealth = maxHealth;
        this.name = name;
        this.currentHealth = maxHealth;
        Character.allCharacters.add(this);
        this.weapon = weapon;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }
    public int getCurrentHealth() {
        return this.currentHealth;
    }
    public String getName() {
        return this.name;
    }
    protected void setCurrentHealth(int health) {
        this.currentHealth = health;
    }
    public Weapon getWeapon() {
        return this.weapon;
    }

    @Override
    public String toString() {
        if(this.currentHealth > 0){
            return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
        } else {
            return String.format("%s : KO", this.name);
        }
    }

    public abstract void takeDamage(int p) throws DeadCharacterException;

    public abstract void attack(Character c) throws DeadCharacterException;

    public boolean isDead() {
        return currentHealth <= 0;
    }

    public static String printStatus(){
        if(Character.allCharacters.isEmpty()){
            return """
                    ------------------------------------------
                    Nobody's fighting right now !
                    ------------------------------------------
                    """;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("------------------------------------------\n" +
                    "Characters currently fighting :\n");
            for(Character c : Character.allCharacters){
                sb.append(" - "+c.toString()+"\n");
            }
            sb.append("------------------------------------------\n");
            return sb.toString();
        }
    }

    public static Character fight(Character a, Character b){
        while(true){
            try {
                a.attack(b);
                if (0 == b.getCurrentHealth()) return a;
                b.attack(a);
                if (0 == a.getCurrentHealth()) return b;
            } catch (DeadCharacterException e) {
                System.out.println(e.getMessage());
                return null;
            }
        }
    }

}