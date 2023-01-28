import br.com.felipemaxplay.challenge.domain.Content;
import br.com.felipemaxplay.challenge.domain.Course;
import br.com.felipemaxplay.challenge.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("GO Essentials", "Improve your GO career.", 8);
        Course course2 = new Course("Java Essentials", "Improve your Java career.", 8);

        Mentoring mentoring = new Mentoring("Cloud Fullstack Warburg Pincus", "Improve your Developer career",
                LocalDate.now());

        System.out.println(course1.toString());
        System.out.println(course2.toString());

        System.out.println(mentoring.toString());
    }
}
