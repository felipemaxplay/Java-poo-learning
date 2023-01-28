import br.com.felipemaxplay.challenge.domain.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Content> contents = new LinkedHashSet<>();

        Course course1 = new Course("GO Essentials", "Improve your GO career.", 8);
        Course course2 = new Course("Java Essentials", "Improve your Java career.", 8);
        Mentoring mentoring = new Mentoring("Developer Career", "Improve your Developer career.",
                LocalDate.now());

        contents.add(course1);
        contents.add(course2);
        contents.add(mentoring);

        Dev devCamila = new Dev("Camila");
        Dev devJulia = new Dev("Julia");

        Bootcamp bootcamp = new Bootcamp("Cloud Fullstack Warburg Pincus", "Improve your dev career. ^^", contents);

        System.out.println(devCamila.getName() + ": Contents Subscribes: " + devCamila.getContentsSubscribes());
        System.out.println(devJulia.getName() + ": Contents Subscribes: " + devJulia.getContentsSubscribes());

        devCamila.SubscribeBootCamp(bootcamp);
        devJulia.SubscribeBootCamp(bootcamp);

        System.out.println(devCamila.getName() + ": Contents Subscribes: " + devCamila.getContentsSubscribes());
        System.out.println(devJulia.getName() +  ": Contents Subscribes: " + devJulia.getContentsSubscribes());

        devCamila.progression();
        devCamila.progression();

        devJulia.progression();
        devJulia.progression();
        devJulia.progression();

        System.out.println(devCamila.getName() + ": Contents Finished: " + devCamila.getContentsFinished());
        System.out.println(devJulia.getName() +  ": Contents Finished: " + devJulia.getContentsFinished());

        System.out.println(devCamila.getName() +  ": XP: " + devCamila.calculateTotalXp());
        System.out.println(devJulia.getName() +  ": XP: " + devJulia.calculateTotalXp());
    }
}
