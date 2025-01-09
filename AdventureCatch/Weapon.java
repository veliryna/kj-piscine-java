package AdventureCatch;

public class Weapon {
    private final int damage;
    private final String name;

    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public String getName(){
        return this.name;
    }
    public int getDamage(){
        return this.damage;
    }

    @Override
    public String toString(){
        return String.format("%s deals %d damages", this.name, this.damage);
    }
}
