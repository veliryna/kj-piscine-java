package StarMass;

import java.util.Objects;

public class Planet extends CelestialObject{
    private Star centerStar;
    public Planet() {this.centerStar = new Star();}
    public Planet(String name, double x, double y, double z, Star centerStar, int mass) {
        super(name, x, y, z, mass);
        this.centerStar = centerStar;
    }

    public Star getCenterStar() {
        return centerStar;
    }
    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    @Override
    public String toString(){
        return String.format("%s circles around %s at the %.3f AU", this.getName(), this.getCenterStar().getName(), getDistanceBetween(this, this.getCenterStar()));
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getX(), this.getY(), this.getZ(), this.getName(), this.getCenterStar(), this.getMass());
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(null == obj || obj.getClass()!= this.getClass())
            return false;
        Planet c = (Planet) obj;
        return (c.getName().equals(this.getName())
                && (this.getX() == c.getX())
                && (this.getY() == c.getY())
                && (this.getZ() == c.getZ())
                && (this.getCenterStar() == c.getCenterStar())
                && (this.getMass() == c.getMass())
        );
    }
}
