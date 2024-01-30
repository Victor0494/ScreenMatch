package br.com.alura.screenmatch.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SerieDTO(@JsonAlias("Title") String title,
                       @JsonAlias("Year") String year,
                       @JsonAlias("totalSeasons") Integer totalSeasons,
                       @JsonAlias("imdbRating") String rating) {
}

// @JsonAlias, serve para ler o valor de um Json e desserializar, ou seja para ler do Json, e adicionar na nossa variável, no caso do exemplo acima title
// @JsonProperties, serve para desserializar e serrializar um objeto