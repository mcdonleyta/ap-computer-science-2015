package Sorting;

import java.time.Period;

/**
 * Created by jsdsp on 1/20/16.
 */
public class Periodical extends LibraryItem {
    private String articleName;
    private String volumeName;
    private int pages;

    private Periodical() {
        articleName = "";
        volumeName = "";
        pages = 0;
    }

    public Periodical(String _articleName, String _volumeName, int _pages) {
        articleName = _articleName;
        volumeName = _volumeName;
        pages = _pages;
    }

    @Override
    public float getValue() {
        return pages;
    }

    @Override
    public String toString() {
        return articleName + ": " + volumeName;
    }
}