public class Samsung {
    public String color;

    public Samsung(String color) {
        this.color = color;
    }

    @Override   
    public void OS() {
        System.out.println("Mobil pro labužníky " + color);
    }
}
