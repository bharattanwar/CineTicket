package com.bharat.CineTicket.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Cine_Movie")
public class Movie extends BaseModel {
    private String title;
    private String description;
    private String genre;
    private int duration;
}