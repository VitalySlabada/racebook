package com.example.racebook.entity;


import com.example.racebook.enums.State;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;
import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@Where(clause = "is_deleted=false")
public class Address extends BaseEntity{

    private String street;
    private String town;
    private State state ;
    private Integer ZIP ;



}
