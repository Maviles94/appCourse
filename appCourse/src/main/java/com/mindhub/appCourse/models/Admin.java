package com.mindhub.appCourse.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
// TABLE_PER_CLASS = 2 tablas, Una por cada clase hija
// SINGLE_TABLE = 1 tabla
// JOINED = 1 todos los datos que son en comun estan unidos en una tabla, despues tenemos tablas que muestran los datos particulares
// o individuales de otras entidades.
public class Admin extends Person{


    public Admin() {
    }

    public Admin(String name, String email, String password) {
        super(name, email, password);
    }


}
