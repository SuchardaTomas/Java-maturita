public class MobileFactory {
    public OS getPhone(String str) {
        switch (str) {
            case "Samsung" -> {
                return new Samsung("red");
            }

            case "iPhone" -> {
                return new IPhone("black");
            }
        }
        return null;
    }
}
