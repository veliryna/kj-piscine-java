package AdventureCatch;

public class DeadCharacterException extends Exception {
    private Character character;

    public DeadCharacterException(Character c){
        this.character = c;
    }

    public Character getCharacter(){
        return this.character;
    }

    @Override
    public String getMessage(){
        String s = "The ";

        if (this.character instanceof Templar) s+="templar";
        else if (this.character instanceof Monster) s+="monster";
        else if (this.character instanceof Sorcerer) s+="sorcerer";
        else s += "character";

        s += String.format(" %s is dead.", character.getName());

        return s;
    }
}
