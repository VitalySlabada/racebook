package com.example.racebook.entity;


import com.example.racebook.enums.BikeModel;
import com.example.racebook.enums.District;
import com.example.racebook.enums.Gender;
import com.example.racebook.enums.RaceClass;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@Entity
@NoArgsConstructor
@Where(clause = "is_deleted=false")
public class Racer extends BaseEntity {
    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String userName;

    private String password;
    private boolean isEnabled;




    @OneToOne
    @JoinColumn(name = "contact_info_id")
    private ContactInfo contactInfo;

    private Integer age;
    private Gender gender;
    private District district;
    private RaceClass raceClass;
    private BikeModel bikeModel;
    private Integer displacement;


}
