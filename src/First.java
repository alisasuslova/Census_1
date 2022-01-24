import java.util.Collection;
import java.util.List;

public class First {

    public void underage (Collection<Person> persons) {
        List<Person> list = (List) persons;
        long count = list.stream()
                .filter(a -> a.getAge() < 18)
                .count();
        System.out.println("Количество несовершеннолетних : " + count + "\n");
    }
}
