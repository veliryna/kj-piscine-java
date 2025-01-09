package Builder;

public class House implements Housing{
    private int size;
    private int price;
    private int rooms;
    private String name;

    public House(){}
    
    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return String.format("House{size=%d, price=%d, rooms=%d, name='%s'}", size, price, rooms, name);
    }
}
