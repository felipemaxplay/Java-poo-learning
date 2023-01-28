package br.com.felipemaxplay.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate initDate;

    @Deprecated
    public Mentoring() {
    }

    public Mentoring(String title, String description, LocalDate initDate) {
        super(title, description);
        this.initDate = initDate;
    }

    @Override
    public double calculateXp() {
        return XP_DEFAULT + 20d;
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
                "title='" + this.getTitle() + "'" +
                ", description='" + this.getDescription() + "'" +
                ", initDate='" + this.initDate + "'" +
                '}';
    }
}
