public class ManagerFilms {
    private Film[] films = new Film[0];
    private int limit;

    public ManagerFilms() {
        this.limit = 5;
    }

    public ManagerFilms(int limit) {
        this.limit = limit;
    }

    public void add(Film quantity) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = quantity;
        films = tmp;
    }

    public Film[] findAll() {
        return films;
    }

    public Film[] findLast() {
        int totalLenght;
        if (films.length < limit) {
            totalLenght = films.length;
        } else {
            totalLenght = limit;
        }
        Film[] tmp = new Film[totalLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
