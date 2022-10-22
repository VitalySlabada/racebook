package com.example.racebook.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@Entity
@NoArgsConstructor
@Where(clause = "is_deleted=false")
public class ContactInfo extends BaseEntity {
    public String email;
    public Long phone;
    @OneToOne
    public Address address;




}
