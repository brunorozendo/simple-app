package com.demo.simpleapp.data.adress;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_adress")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator="adress_seq")
    @SequenceGenerator(
            name="adress_seq",
            sequenceName="adress_sequence",
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
    private String state;
    private String country;
    private String phone;
    private String fax;

}
