public class Film {
    public String name;
    public int yearRelease;
    public String genre;

    public Film(String name, int yearRelease, String genre) {
        this.name = name;
        this.yearRelease = yearRelease;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film [name=" + name + ", yearRelease=" + yearRelease + ", genre=" + genre + "]";
    }
}