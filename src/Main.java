public class Main {
    public static void main(String[] args) {

        Author norton = new Author("Эндрю","Нортон");
        Author nagosky = new Author("Эмили", "Нагоски");

        Book vugoranie = new Book("Выгорание", nagosky, 2022);
        Book sargassuInSpace = new Book("Саргассы в космосе", norton, 1992);

        System.out.println(vugoranie.getTitle() +" "+ vugoranie.getAutor().getFirstName() +" "+ vugoranie.getAutor().getLastName()+" "+ vugoranie.getPublishingYear());

        System.out.println(sargassuInSpace.getTitle() +" "+ sargassuInSpace.getAutor().getFirstName() +" "+ sargassuInSpace.getAutor().getLastName()+" "+ sargassuInSpace.getPublishingYear());
        

    }
}