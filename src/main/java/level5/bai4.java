package level5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class bai4 {
    public static void main(String[] args) {
        List<CustomObject> input = new ArrayList<>();
        input.add(new CustomObject(1, 2));
        input.add(new CustomObject(2, 1));
        input.add(new CustomObject(1, 2));

        List<CustomObject> result = uniqArrayObject(input);
        for (CustomObject obj : result) {
            System.out.println(obj);
        }
    }

    public static List<CustomObject> uniqArrayObject(List<CustomObject> input) {
        List<CustomObject> result = new ArrayList<>();
        for (CustomObject obj : input) {
            if (!result.contains(obj)) {
                result.add(obj);
            }
        }
        return result;
    }

    static class CustomObject {
        private int x;
        private int y;

        public CustomObject(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CustomObject that = (CustomObject) o;
            return x == that.x && y == that.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "{ 'x': " + x + ", 'y': " + y + " }";
        }
    }
}
