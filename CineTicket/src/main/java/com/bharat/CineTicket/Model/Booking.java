package com.bharat.CineTicket.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "Cine_Booking")
@Getter
@Setter
public class Booking extends BaseModel {
    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    @OneToMany(mappedBy = "booking")
    private List<ShowSeat> showSeats;

    private int amount;

    @OneToMany(mappedBy = "booking")
    private List<Payment> payments;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

