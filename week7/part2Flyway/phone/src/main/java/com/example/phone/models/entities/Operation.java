package com.example.phone.models.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "operation")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDate date_sale;

    @ManyToOne
    @JoinColumn(name = "phone_id")
    Phone phone;

    @ManyToOne
    @JoinColumn(name = "client_id")
    Clientt client;

    @ManyToOne
    @JoinColumn(name = "employees_id")
    Employees employees;
}
