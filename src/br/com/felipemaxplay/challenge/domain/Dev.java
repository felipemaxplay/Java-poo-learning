package br.com.felipemaxplay.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> ContentsSubscribes = new LinkedHashSet<>();
    private Set<Content> ContentsFinished = new LinkedHashSet<>();

    @Deprecated
    public Dev() {
    }

    public void SubscribeBootCamp(Bootcamp bootcamp) {};

    public void progression() {};

    public void calculateTotalXp() {};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentsSubscribes() {
        return ContentsSubscribes;
    }

    public void setContentsSubscribes(Set<Content> contentsSubscribes) {
        ContentsSubscribes = contentsSubscribes;
    }

    public Set<Content> getContentsFinished() {
        return ContentsFinished;
    }

    public void setContentsFinished(Set<Content> contentsFinished) {
        ContentsFinished = contentsFinished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(ContentsSubscribes, dev.ContentsSubscribes) && Objects.equals(ContentsFinished, dev.ContentsFinished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ContentsSubscribes, ContentsFinished);
    }
}
