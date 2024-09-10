package com.bharat.CineTicket.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeatType extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    private String seatType;
    private Long price;
}