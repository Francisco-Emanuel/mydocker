package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users") // Nome da tabela no banco
public class User extends PanacheEntity {
    public String name;

}
