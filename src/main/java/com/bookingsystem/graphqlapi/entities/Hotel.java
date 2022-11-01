package com.bookingsystem.graphqlapi.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@Table(name = "hotels")
@Data
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer status;
    @Column
    private String explanation;
    @Column
    private Date created_at;
    @Column
    private Date updated_at;
}
