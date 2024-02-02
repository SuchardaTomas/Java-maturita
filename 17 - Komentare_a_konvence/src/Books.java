/**
 * @author Sucharda Tomas
 */

public class Books {
    public String name;
    public int yearReleased;
    public String author;

    /**
     * Konstruktor pro atributy třídy Books
     * @param name - nazev knihy
     * @param yearReleased - rok vydani knihy
     * @param author - autor knihy
     */
    public Books(String name, int yearReleased, String author) {
        this.name = name;
        this.yearReleased = yearReleased;
        this.author = author;
    }

    /**
     * Metoda GET pro ziskani nazvu knihy
     * @return - nazev knihy
     */
    public String getName() {
        return name;
    }

    /**
     * Metoda SET pro nastaveni nazvu knihy
     * @param - nazev knihy
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metoda GET pro ziskani roku vydani knihy
     * @return - roku vydani knihy
     */
    public int getYearReleased() {
        return yearReleased;
    }

    /**
     * Metoda SET pro nastaveni roku vydani knihy
     * @param - roku vydani knihy
     */
    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    /**
     * Metoda GET pro ziskani jmena autora knihy
     * @return - jmeno autora knihy
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Metoda SET pro nastaveni jmena autora knihy
     * @param author - jmeno autora knihy
     */
    public void setAuthor(String author) {
        this.author = author;
    }

/**
 * Metoda toString pro vypsání atributů vytvořeného objektu ze třídy Books
 */
    @Override
    public String toString() {
        return "Books [name=" + name + ", yearReleased=" + yearReleased + ", author=" + author + "]";
    }
}