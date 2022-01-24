import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Third {
    public void workable(Collection<Person> persons) {

        List<Person> list3 = (List) persons;
        Stream<Person> stream_1 = list3.stream()
                .filter(a -> a.getAge() >= 18)
                .filter(a -> a.getAge() < 65)
                .filter(e -> e.getEducation() == Education.HIGHER);
        Stream<Person> stream_2 = stream_1.sorted((f1, f2) -> f1.getFamily().compareToIgnoreCase(f2.getFamily()));
        List<Person> workable = stream_2.collect(Collectors.toList());
        System.out.println("Cписок потенциально работоспособных людей с высшим образованием: \n" + workable);

    }
}
