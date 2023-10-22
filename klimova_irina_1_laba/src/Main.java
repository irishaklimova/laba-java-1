public class Main {
    public static void main(String[] args) {
        Container<String> container = new Container<>();

        container.add("one");
        container.add("two");
        container.add("three");

        System.out.println(container.get(1)); // Выводит "two"

        container.remove(0);
        System.out.println(container.size()); // Выводит 2
    }
}