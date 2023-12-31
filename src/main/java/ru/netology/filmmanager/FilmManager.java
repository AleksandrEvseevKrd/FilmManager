package ru.netology.filmmanager;

public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public FilmManager() {
        this.limit = 10;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = movie;
        films = tmp;

    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = films[films.length - i - 1];
        }
        return tmp;
    }


}