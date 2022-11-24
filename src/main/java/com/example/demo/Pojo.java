package com.example.demo;

import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
public class Pojo {
    private int a;
    private int b;
    private List<Pojo2> pojo2;
    // getters and setters
    // equals and hashCode
    // toString


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pojo pojo = (Pojo) o;
        return a == pojo.a && b == pojo.b && Objects.equals(pojo2, pojo.pojo2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, pojo2);
    }
}