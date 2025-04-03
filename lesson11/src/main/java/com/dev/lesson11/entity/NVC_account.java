package com.dev.lesson11.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "NVC_account")
public class NVC_account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NVC_id")
    private Long id;

    @Column(name = "NVC_user", nullable = false, unique = true)
    private String user;

    @Column(name = "NVC_pass", nullable = false)
    private String password;

    @Column(name = "NVC_name")
    private String name;

    @Column(name = "NVC_email", unique = true)
    private String email;

    @Column(name = "NVC_phone")
    private String phone;

    @Column(name = "NVC_address")
    private String address;

    @Column(name = "NVC_status")
    private Boolean status;
}
