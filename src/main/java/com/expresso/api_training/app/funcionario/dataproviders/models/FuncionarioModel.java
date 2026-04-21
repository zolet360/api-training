package com.expresso.api_training.app.funcionario.dataproviders.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "funcionario")
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String cpf;

    private BigDecimal salario;

    private LocalDateTime createdAt = LocalDateTime.now();

}
