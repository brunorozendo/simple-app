package com.demo.simpleapp.data.user;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator="user_seq")
    @SequenceGenerator(
            name="user_seq",
            sequenceName="user_sequence",
            allocationSize=20
    )
    private Long id;
    private String email;
    private String password;

}