import br.com.felipemaxplay.challenge.domain.Course;
import br.com.felipemaxplay.challenge.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Go Essentials", "Improve your career.", 8);
        Course course2 = new Course("Java Essentials", "Improve your career.", 8);

        Mentoring mentoring = new Mentoring("Cloud Fullstack Warburg Pincus", "Improve your career",
                LocalDate.now());

        System.out.println(course1.toString());
        System.out.println(course2.toString());

        System.out.println(mentoring.toString());
    }
}
