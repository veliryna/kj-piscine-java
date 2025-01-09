package StarMass;
import java.util.Objects;

public class Star extends CelestialObject{
    private double magnitude;

    public Star() {}
    public Star(String name, double x, double y, double z, double magnitude, int mass) {
        super(name, x, y, z, mass);
        this.magnitude = magnitude;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public String toString(){
        return String.format("%s shines at the %.3f magnitude", this.getName(), this.getMagnitude());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getX(), this.getY(), this.getZ(), this.getName(), this.getMagnitude(), this.getMass());
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;

        if(null == obj || obj.getClass()!= this.getClass())
            return false;

        Star c = (Star) obj;

        return (c.getName().equals(this.getName())
                && (this.getX() == c.getX())
                && (this.getY() == c.getY())
                && (this.getZ() == c.getZ())
                && (this.getMagnitude() == c.getMagnitude())
                && (this.getMass() == c.getMass())
        );
    }
}
