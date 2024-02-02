public class Interface {
    public static void main(String[] args) throws Exception {
        Car auto = new Car("red", "bmw");
        System.out.println(auto);
        auto.sound();
        auto.horn();
    }
}
