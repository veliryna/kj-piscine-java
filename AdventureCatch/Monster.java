package AdventureCatch;

public class Monster extends Character {
    public Monster(String name, int maxHealth, Weapon w) {
        super(name, maxHealth, w);
    }

    @Override
    public String toString() {
        if(this.getCurrentHealth() > 0){
            return String.format("%s is a monster with %d HP.", this.getName(), this.getCurrentHealth()) + (null != this.getWeapon()
                    ? " He has the weapon " + this.getWeapon().toString(): "");
        } else {
            return String.format("%s is a monster and is dead.", this.getName()) + (null != this.getWeapon()
                    ? " He has the weapon " + this.getWeapon().toString(): "");
        }
    }

    @Override
    public void takeDamage(int p) throws  DeadCharacterException {
        if(this.isDead()) {
            throw new DeadCharacterException(this);
        }
        int damage = (int) Math.max(0, Math.floor(p * 0.8));
        this.setCurrentHealth(Math.max(0, this.getCurrentHealth() - damage));
    }

    @Override
    public void attack(Character c) throws DeadCharacterException {
        if(this.isDead()) {
            throw new DeadCharacterException(this);
        }
        if(c.isDead()) {
            throw new DeadCharacterException(c);
        }
        if(null == this.getWeapon()) {
            c.takeDamage(7);
        }else {
            c.takeDamage(this.getWeapon().getDamage());
        }
    }
}
