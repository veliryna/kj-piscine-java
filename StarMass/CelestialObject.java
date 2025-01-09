package StarMass;
import java.util.Objects;

public class CelestialObject {
    private double x;
    private double y;
    private double z;
    private String name;
    private int mass;
    public static final double KM_IN_ONE_AU  = 150000000.0;

    public CelestialObject(){this.name = "Soleil";}
    public CelestialObject(String name, double x, double y, double z, int mass) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
        this.mass = mass;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() { return mass; }

    public void setMass(int mass) { this.mass = mass; }

    public static double getDistanceBetween(CelestialObject a, CelestialObject b){
        double d = Math.sqrt(
                Math.pow(a.getX() - b.getX(), 2)
                + Math.pow(a.getY() - b.getY(), 2)
                + Math.pow(a.getZ() - b.getZ(), 2)
        );
        return d;
    }

    public static double getDistanceBetweenInKm (CelestialObject a, CelestialObject b){
        double aud = getDistanceBetween(a, b);
        return aud * KM_IN_ONE_AU;
    }

    @Override
    public String toString(){
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", this.getName(), this.getX(), this.getY(), this.getZ());
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;

        if(null == obj || obj.getClass()!= this.getClass())
            return false;

        CelestialObject c = (CelestialObject) obj;

        return (c.getName().equals(this.getName())
                && (this.getX() == c.getX())
                && (this.getY() == c.getY())
                && (this.getZ() == c.getZ())
                && (this.getMass() == c.getMass())
        );
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getX(), this.getY(), this.getZ(), this.getName(), this.getMass());
    }
}