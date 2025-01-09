package AdventureCatch;

public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon w) {
        super(name, maxHealth, w);
        this.healCapacity = healCapacity;
    }

    @Override
    public void heal(Character c) throws DeadCharacterException{
        if(this.isDead()) {
            throw new DeadCharacterException(this);
        }
        if(c.isDead()) {
            throw new DeadCharacterException(c);
        }
        int h = c.getCurrentHealth() + this.healCapacity;
        c.setCurrentHealth(Math.min(h, c.getMaxHealth()));
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public String toString() {
        if(this.getCurrentHealth() > 0){
            return String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(), this.getCurrentHealth(), this.healCapacity) + (null != this.getWeapon()
                    ? " He has the weapon " + this.getWeapon().toString(): "");
        } else {
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(), this.healCapacity) + (null != this.getWeapon()
                    ? " He has the weapon " + this.getWeapon().toString(): "");
        }
    }

    @Override
    public void takeDamage(int p) throws DeadCharacterException {
        if(this.isDead()) {
            throw new DeadCharacterException(this);
        }
        this.setCurrentHealth(Math.max(0, this.getCurrentHealth() - p));
    }

    @Override
    public void attack(Character c) throws DeadCharacterException {
        if(this.isDead()) {
            throw new DeadCharacterException(this);
        }
        heal(this);
        if(c.isDead()) {
            throw new DeadCharacterException(c);
        }
        if(null == this.getWeapon()) {
            c.takeDamage(10);
        } else {
            c.takeDamage(this.getWeapon().getDamage());
        }
    }
}
