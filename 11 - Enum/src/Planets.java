public enum Planets {
    Mercury(1),
    Venus(2),
    Earth(3),
    Mars(4),
    Jupiter(5),
    Saturn(6),
    Uranus(7),
    Neptune(8);

    public int size;

    public int getSize() {
        return size;
    }

    private Planets(int size) {
        this.size = size;
    }
    
    
}
