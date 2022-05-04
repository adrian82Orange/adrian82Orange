package es.orange.bank.domain;

import io.micronaut.core.annotation.Introspected;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Introspected
@Entity
public class Transaction {
    @Id
    UUID uuid;

}
