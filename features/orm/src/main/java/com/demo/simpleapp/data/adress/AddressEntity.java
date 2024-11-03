package com.demo.simpleapp.data.adress;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_address")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator="address_seq")
    @SequenceGenerator(
            name="address_seq",
            sequenceName="address_sequence",
            allocationSize=20
    )
    private Long id;

    private String title;
    private String firstName;
    private String lastName;
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String postcode;
    @Column(name = "state_cuntry")
    private String state;
    private String country;
    private String phone;
    private String fax;

}
