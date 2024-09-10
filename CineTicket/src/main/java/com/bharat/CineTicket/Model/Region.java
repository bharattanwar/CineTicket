package com.bharat.CineTicket.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "Cine_Region")
@Getter
@Setter
public class Region extends BaseModel {
    private String name;

    @OneToMany(mappedBy = "region")
    private List<Theatre> theatres;
}