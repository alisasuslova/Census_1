import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Second {

    public void conscript(Collection<Person> persons) {
        List<Person> list1 = (List) persons;
        List<String> conscript = list1.stream()
                .filter(s -> s.getSex() == Sex.MAN)
                .filter(a -> a.getAge() >= 18)
                .filter(a -> a.getAge() < 27)
                .map(f -> f.getFamily())
                .collect(Collectors.toList());
        System.out.println("Cписок призывников: \n" + conscript + "\n");
    }
}
