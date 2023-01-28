package br.com.felipemaxplay.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> contentsSubscribes = new LinkedHashSet<>();
    private Set<Content> contentsFinished = new LinkedHashSet<>();

    @Deprecated
    public Dev() {
    }

    public void SubscribeBootCamp(Bootcamp bootcamp) {
        this.getContentsSubscribes().addAll(bootcamp.getContents());
        bootcamp.getDevs().add(this);
    };

    public void progression() {
        Optional<Content> content = this.contentsSubscribes.stream().findFirst();
        if(content.isPresent()) {
            this.contentsFinished.add(content.get());
            this.contentsSubscribes.remove(content.get());
        } else {
            System.err.println("You are not subscribed to any content.");
        }
    };

    public double calculateTotalXp() {
        return this.contentsFinished.stream().mapToDouble(Content::calculateXp).sum();
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentsSubscribes() {
        return contentsSubscribes;
    }

    public void setContentsSubscribes(Set<Content> contentsSubscribes) {
        contentsSubscribes = contentsSubscribes;
    }

    public Set<Content> getContentsFinished() {
        return contentsFinished;
    }

    public void setContentsFinished(Set<Content> contentsFinished) {
        contentsFinished = contentsFinished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentsSubscribes, dev.contentsSubscribes) && Objects.equals(contentsFinished, dev.contentsFinished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentsSubscribes, contentsFinished);
    }
}
