public class Factory {
    public static void main(String[] args) {
        MobileFactory factory = new MobileFactory();

        OS phone = factory.getPhone("Samsung");
        phone.OS();
    }
}
