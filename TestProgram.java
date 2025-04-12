package solidDesignPattern;

public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Mark Lorenz Alejandro");

        LibraryResource book = new Book("'Mathematics in the Modern World'");
        LibraryResource journal = new Journal("'What a Journal it has been'");
        LibraryResource audioBook = new AudioBook("'Podcast with Paul George'");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(audioBook);
    }
}

