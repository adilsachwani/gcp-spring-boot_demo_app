package com.bootstrappers.floodmanager.domain.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "states")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "state_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "population")
    private Long population;

}
