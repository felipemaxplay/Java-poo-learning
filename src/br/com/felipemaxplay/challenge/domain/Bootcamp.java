package br.com.felipemaxplay.challenge.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate dateInit = LocalDate.now();
    private final LocalDate dateFinished = dateInit.plusDays(14);
    private Set<Dev> devs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    @Deprecated
    public Bootcamp() {
    }

    public Bootcamp(String name, String description, Set<Content> contents) {
        this.name = name;
        this.description = description;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateInit() {
        return dateInit;
    }

    public LocalDate getDateFinished() {
        return dateFinished;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(dateInit, bootcamp.dateInit) && Objects.equals(dateFinished, bootcamp.dateFinished) && Objects.equals(devs, bootcamp.devs) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, dateInit, dateFinished, devs, contents);
    }
}
