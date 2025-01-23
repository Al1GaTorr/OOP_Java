package Assignment3_1;
import java.awt.Color;
public class Task17 {
    public static void main(String[] args) throws Exception {
    Fox bigFox = new Fox();
    System.out.println(bigFox.getName());
    System.out.println(bigFox.getColor());
}
    public interface Animal {
        Color getColor();
    }
    public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }

        @Override
        public Color getColor() {
            return null;
        }
    }
    public abstract static class BigFox extends Fox{
        @Override
        public Color getColor() {
            return null;
        }
    }
}
