package com.demo.simpleapp.data.client;


import com.demo.simpleapp.data.adress.AddressEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_client")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator="client_seq")
    @SequenceGenerator(
            name="client_seq",
            sequenceName="client_sequence",
            allocationSize=20
    )
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private String number;
    private String expiryMonth;
    private String expiryYear;
    private String startMonth;
    private String startYear;
    private Integer issueNumber;
    private String email;
    private String birthday;
    private String gender;

    @ManyToOne
    private AddressEntity billingAddress;
    @ManyToOne
    private AddressEntity shippingAddress;

}