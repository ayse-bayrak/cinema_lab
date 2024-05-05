package com.cydeo.entity;


import com.cydeo.enums.State;
import com.cydeo.enums.Type;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Movie")
@Data
@NoArgsConstructor
public class Movie extends BaseEntity{

    private String name;
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Enumerated(EnumType.STRING)
    private State state;

    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;

    private int duration;
    private String summary;

    public Movie(String name, BigDecimal price, Type type, State state, LocalDate releaseDate, int duration, String summary, List<Genre> genreList) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.state = state;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.summary = summary;
        this.genreList = genreList;
    }

    @ManyToMany
    @JoinTable(name="MovieGenreRel",
                    joinColumns =@JoinColumn(name="movie_id"),
                    inverseJoinColumns =@JoinColumn(name="genre_id"))
    private List<Genre>genreList;

}
