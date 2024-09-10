package com.bharat.CineTicket.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Cine_Seat")
@Getter
@Setter
public class Seat extends BaseModel {
    private int number;
    private String seatType;
    private int rowNo;
    private int colNo;

    @ManyToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;
}
