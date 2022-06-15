package ru.yandex.practicum.filmorate.storage.film;

import ru.yandex.practicum.filmorate.model.Film;

import java.util.Collection;
import java.util.Map;

public interface FilmStorage {
    public Collection<Film> findAll();

    public Film add(Film film);

    public Film update(Film film);

    public Map<Long, Film> getFilms();
}