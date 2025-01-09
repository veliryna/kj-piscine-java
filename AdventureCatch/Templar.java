package AdventureCatch;

public class Templar extends Character implements Healer, Tank{
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon w) {
        super(name, maxHealth, w);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getShield() {
        return this.shield;
    }

    @Override
    public void heal(Character c) throws DeadCharacterException {
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
        if(0 < this.getCurrentHealth()){
            return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.", this.getName(), this.getCurrentHealth(), this.getHealCapacity(), this.getShield()) + (null != this.getWeapon()
                    ? " He has the weapon " + this.getWeapon().toString(): "");
        } else {
            return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.", this.getName(), this.getShield(), this.getHealCapacity()) + (null != this.getWeapon()
                    ? " He has the weapon " + this.getWeapon().toString(): "");
        }
    }

    @Override
    public void takeDamage(int p) throws DeadCharacterException {
        if(this.isDead()) {
            throw new DeadCharacterException(this);
        }
        int damage = Math.max(0, p - this.shield);
        this.setCurrentHealth(Math.max(0, getCurrentHealth() - damage));
    }

    @Override
    public void attack(Character c) throws DeadCharacterException {
        if(this.isDead()) {
            throw new DeadCharacterException(this);
        }
        heal(this); // If you want to heal this character before attacking, ensure it's intended behavior.
        if(c.isDead()) {
            throw new DeadCharacterException(c);
        }
        if (this.getWeapon() != null) {
            c.takeDamage(this.getWeapon().getDamage());
        } else {
            c.takeDamage(6);
        }
    }
}
