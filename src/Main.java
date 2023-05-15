public class Main {
    public static void division() {
        System.out.println("______________________________");
    }
    public static void main(String[] args) {
        Author lermontov = new Author("Михаил", "Лермонтов");
        Author pushkin = new Author("Александр", "Пушкин");
        Book maskarad = new Book("Маскарад", lermontov, 1835);
        Book borisGodunov = new Book("Борис Годунов", pushkin, 1831);
        division();
        System.out.println(maskarad);
        division();
        System.out.println(maskarad);
        division();
        maskarad.setYear(1834);
        System.out.println("Внесены изменения:");
        System.out.println(maskarad);
        division();
        Author lermontov1 = new Author("Михаил", "Лермонтов");
        Book maskarad1 = new Book("Маскарад", lermontov1, 1834);
        System.out.println(lermontov.equals(lermontov1));
        System.out.println(maskarad.equals(maskarad1));
        System.out.println(lermontov.hashCode());
        System.out.println(lermontov1.hashCode());
        System.out.println(maskarad.hashCode());
        System.out.println(maskarad1.hashCode());
    }
}
