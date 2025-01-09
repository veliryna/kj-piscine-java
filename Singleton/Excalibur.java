public class Excalibur {
    private String name;
    private static Excalibur INSTANCE = new Excalibur("Sword");;
    private Excalibur(String name) {this.name = name;}
    public String getName() {return name;}
    public static Excalibur getInstance() {return INSTANCE;}
}