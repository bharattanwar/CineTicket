package com.bharat.CineTicket.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity(name = "Cine_User")
@Getter
@Setter
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;
}