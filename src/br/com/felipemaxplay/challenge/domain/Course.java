package br.com.felipemaxplay.challenge.domain;

public class Course extends Content {
    private int workload;

    @Deprecated
    public Course() {
    }

    public Course(String title, String description, int workload) {
        super(title, description);
        this.workload = workload;
    }

    @Override
    public double calculateXp() {

        return XP_DEFAULT * workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + this.getTitle() + "'" +
                ", description='" + this.getDescription() + "'" +
                ", workload=" + this.workload +
                '}';
    }
}
