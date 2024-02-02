import java.util.HashMap;

public class Kolekce {
    public static void main(String[] args) throws Exception {
        
        HashMap<Integer, Film> filmy = new HashMap<>();
        filmy.put(0, new Film("Titanic", 1972, "Romantic"));
        filmy.put(1, new Film("Avengers", 2015, "Action"));
        filmy.put(2, new Film("Finding Nemo", 2000, "For kids"));
        filmy.put(3, new Film("Animals", 2020, "Document"));
        filmy.put(4, new Film("Dumb and Dumber", 2004, "Comedy"));

    

        for (Integer id : filmy.keySet()) {
            Film film = filmy.get(id);
            System.out.println(id + ". Název: " + film.name + ", rok: " + film.yearRelease + ", zanr: " + film.genre);
        }
    }
}
