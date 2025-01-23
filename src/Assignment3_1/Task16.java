package Assignment3_1;
import java.awt.Color;
public class Task16 {
    public static void main(String[] args) throws Exception {
}
    public interface Animal {
        Color getColor();
        Integer getAge();
    }
    public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }

        @Override
        public Color getColor() {
            return null;
        }

        @Override
        public Integer getAge() {
            return 0;
        }
    }
}
