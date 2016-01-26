package Sorting;

/**
 * Created by jsdsp on 1/20/16.
 */
public class Book extends LibraryItem {

    private String title;
    private String author;
    private int pages;

    private Book() {
        title = "";
        author = "";
        pages = 0;
    }

    public Book(String _title, String _author, int _pages) {
        title = _title;
        author = _author;
        pages = _pages;
    }

    @Override
    public float getValue() {
        return pages;
    }

    @Override
    public String toString() {
        return title;
    }

}
