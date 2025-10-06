public class Book {
    String title;
    String author;
    int pages;
    String genre;

    public Book(String title, String author, int pages, String genre){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    void titleAndAuthor() {
        System.out.println("Titel: " + title);
        System.out.println("Författare: " + author);
    }

    void howLong(int pagesPerDay) {
        System.out.println("Det kommer ta: " + (pages / pagesPerDay) + " dagar.");
    }

    boolean isGenre(String booksGenre) {
        if(booksGenre == genre) {
            return true;
        } else {
            return false;
        }
    }


}
