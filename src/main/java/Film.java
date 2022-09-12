public class Film {
    private int id;
    private String nameFilm;
    private String filmGenre;

    public Film(int id, String nameFilm, String filmGenre) {
        this.id = id;
        this.nameFilm = nameFilm;
        this.filmGenre = filmGenre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }
}
