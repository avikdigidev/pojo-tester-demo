package com.example.demo;

import lombok.Data;

import java.util.Objects;

@Data
public class Pojo2 {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pojo2 pojo2 = (Pojo2) o;
        return Objects.equals(name, pojo2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
