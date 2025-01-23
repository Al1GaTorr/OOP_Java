package Assignment3_1;
import java.util.List;
import java.util.ArrayList;

public class Task18 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Repka", "Repka"));
        plot.add(new Person("Dedka", "Dedku"));
        plot.add(new Person("Babka", "Babka"));
        plot.add(new Person("Vnuchka", "Vnuchku"));
        RepkaStory.tell(plot);
    }

    public static class Person implements RepkaItem {
        private String name;
        private String namePadezh;

        public Person(String name, String namePadezh) {
            this.name = name;
            this.namePadezh = namePadezh;
        }

        @Override
        public String getNamePadezh() {
            return namePadezh;
        }

        public void pull(Person person) {
            System.out.println(this.name + " for " + person.getNamePadezh());
        }
    }

    public interface RepkaItem {
        String getNamePadezh();
    }

    public static class RepkaStory {
        static void tell(List<Person> items) {
            for (int i = items.size() - 1; i > 0; i--) {
                Person first = items.get(i);
                Person second = items.get(i - 1);
                second.pull(first);
            }
        }
    }
}
