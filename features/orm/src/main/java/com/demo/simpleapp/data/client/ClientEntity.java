package com.demo.simpleapp.data.client;


import com.demo.simpleapp.data.adress.AddressEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_customer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator="customer_seq")
    @SequenceGenerator(
            name="customer_seq",
            sequenceName="customer_sequence",
            allocationSize=20
    )
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    @Column(name = "number_code")
    private String number;
    private String expiryMonth;
    private String expiryYear;
    private String startMonth;
    private String startYear;
    private Integer issueNumber;
    private String email;
    @Column(name = "birth_day")
    private String birthday;
    private String gender;

    @ManyToOne
    @JoinColumn(name = "billing_id")
    private AddressEntity billingAddress;
    @ManyToOne
    @JoinColumn(name = "shipping_id")
    private AddressEntity shippingAddress;

}