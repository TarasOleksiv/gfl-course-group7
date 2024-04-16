package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class User {
    private String name;
    private LocalDateTime localDateTime;

    public User() {}

    public User(String name, LocalDateTime localDateTime) {
        this.name = name;
        this.localDateTime = localDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) && localDateTime.equals(user.localDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, localDateTime);
    }
}
