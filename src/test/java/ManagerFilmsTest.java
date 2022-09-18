import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerFilmsTest {

    Film film1 = new Film(1, "Бладшот", "Боевик");
    Film film2 = new Film(2, "Вперед", "Мультфильм");
    Film film3 = new Film(3, "Отель 'Белград'", "Комедия");
    Film film4 = new Film(4, "Джентельмены", "Боевик");
    Film film5 = new Film(5, "Человек-неведимка", "Ужасы");
    Film film6 = new Film(6, "Тролли. Мировой Тур", "Мультфильм");
    Film film7 = new Film(7, "Номер один", "Комедия");

    @Test
    public void addFilms() {
        ManagerFilms manager = new ManagerFilms();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        Film[] actual = manager.findAll();
        Film[] expected = {film1, film2, film3, film4, film5, film6, film7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsFindLast() {
        ManagerFilms manager = new ManagerFilms();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        Film[] actual = manager.findLast();
        Film[] expected = {film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }
}