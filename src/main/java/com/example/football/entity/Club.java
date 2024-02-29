package com.example.football.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Club {

    @Id
    private int clubId;

    private String clubName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "leagues_id")
    private Leagues leagues;

    private int trophy;

    private String logoUrl;

}
