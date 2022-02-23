package com.jose.movieserver.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    @Column(nullable = false)
    public Long id;
    public String title;
    public Date publicationDate;
    public String director;
    public String synopsis;

    public Movie(String title, Date publicationDate, String director, String synopsis) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.director = director;
        this.synopsis = synopsis;
    }
}
