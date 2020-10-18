package ru.netology.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Movie {
    private int Id;
    private String movieName;
    private String posterUrl;
    private String movieGenre;
}
