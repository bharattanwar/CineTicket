package com.bharat.CineTicket.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "Cine_Screen")
@Getter
@Setter
public class Screen extends BaseModel {
    private String name;

    @OneToMany(mappedBy = "screen")
    private List<Seat> seats;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Feature> features;

    @ManyToOne
    @JoinColumn(name = "theatre_id")
    private Theatre theatre;
}