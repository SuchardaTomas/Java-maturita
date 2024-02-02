public class Car implements ICars {

    public String color;
    public String type;

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return "Car [color=" + color + ", type=" + type + "]";
    }

    @Override
    public void sound() {
        System.out.println("Brm Brm");
    }

    @Override
    public void horn() {
        System.out.println("Hon honk");
    }

    

    
    
}
