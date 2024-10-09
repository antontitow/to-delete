package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.OffsetDateTime;
import java.util.UUID;

//@MappedSuperclass
@Entity(name = "operation")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
@EqualsAndHashCode
public abstract class OperationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected UUID id;

    protected Status status;

    protected OffsetDateTime createAt;

    public enum Status {
        CREATE,
        START,
        PROCESS,
        STOP,
        REJECT;
    }

    public abstract String getType();
}
