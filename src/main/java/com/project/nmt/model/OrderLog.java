package com.project.nmt.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class OrderLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime boughtDate;
    private LocalDateTime soldDate;
    private int boughtPrice;
    private int soldPrice;
    private int soldQuantity;

    @ManyToOne
    private User user;

    @ManyToOne
    private Stock stock;
}
