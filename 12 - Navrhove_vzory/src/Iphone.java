public class Iphone implements OS {
    public String color;

    public IPhone(String color) {
        this.color = color;
    }

    @Override
    public void OS() {
        System.out.println("Mobil je pro bohatý " + color);
    }
}
