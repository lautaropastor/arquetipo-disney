package com.alkemy.disney.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "movies")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movie_id;
    @Column (nullable = false)
    private String title;
    @Column
    private String image;
    @Column (nullable = false, name = "realesed_date")
    private Date realasedDate;
    @Column (nullable = false)
    private Integer calification;

    @ManyToOne ()
    @JoinColumn(name = "genre_id", nullable = false)
    private Genre genre;
    @ManyToMany(mappedBy = "movies", cascade = CascadeType.REMOVE)
    private List<Character> characters;

    public MovieEntity(Long movie_id, String title, String image, Date realasedDate, Integer calification, Genre genre, List<Character> characters) {
        this.movie_id = movie_id;
        this.title = title;
        this.image = image;
        this.realasedDate = realasedDate;
        this.calification = calification;
        this.genre = genre;
        this.characters = characters;
    }

    public Long getMovie_id() {
        return movie_id;
    }
    public void setMovie_id(Long movie_id) {
        this.movie_id = movie_id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public Date getRealasedDate() {
        return realasedDate;
    }
    public void setRealasedDate(Date realasedDate) {
        this.realasedDate = realasedDate;
    }
    public Integer getCalification() {
        return calification;
    }
    public void setCalification(Integer calification) {
        this.calification = calification;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public List<Character> getCharacters() {
        return characters;
    }
    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie_id=" + movie_id +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", realasedDate=" + realasedDate +
                ", calification=" + calification +
                ", genre=" + genre +
                ", characters=" + characters +
                '}';
    }
}
