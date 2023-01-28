package br.com.felipemaxplay.challenge.domain;

import java.time.LocalDate;

public class Mentoring {
    private String title;
    private String description;
    private LocalDate initDate;

    public Mentoring(String title, String description,LocalDate initDate) {
        this.title = title;
        this.description = description;
        this.initDate = initDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitDate() {
        return initDate;
    }

    public void setInitDate(LocalDate initDate) {
        this.initDate = initDate;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", initDate=" + initDate +
                '}';
    }
}
