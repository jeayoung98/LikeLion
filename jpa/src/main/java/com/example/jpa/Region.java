package com.example.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "regions")
@Getter @Setter
@NoArgsConstructor
public class Region {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id")
    private Integer regionId;

    @Column(name = "region_name")
    private String regionName;

    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Country> countries = new HashSet<>();

    public Region(String regionName) {
        this.regionName = regionName;
    }
}
