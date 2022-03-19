package com.kadyrbekov.reservationservices.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "RESERVATION")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESERVATION_ID")
    private Long id;

    @Column(name = "GUEST_ID", nullable = false)
    private Long guestId;

    @Column(name = "ROOM_ID", nullable = false)
    private Long roomId;

    @Column(name = "RES_DATE")
    private Date date;

}
