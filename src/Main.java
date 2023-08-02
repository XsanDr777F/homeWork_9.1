public class Main {
    public static void main(String[] args) {

        Author norton = new Author("Эндрю","Нортон");
        Author nagosky = new Author("Эмили", "Нагоски");

        Book vugoranie = new Book("Выгорание", nagosky, 2022);
        Book sargassuInSpace = new Book("Саргассы в космосе", norton, 1992);

        printBook(vugoranie);
        printBook(sargassuInSpace);

        vugoranie.setPublishingYear(2023);

        printBook(vugoranie);
    }

    private static void printBook (Book book){
        System.out.println(book.getTitle() +" "+ book.getAutor().getFirstName() +" "+ book.getAutor().getLastName()+" "+ book.getPublishingYear());

    }
}