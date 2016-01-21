package Sorting;

/**
 * Created by jsdsp on 1/20/16.
 */
public class Video extends LibraryItem {
    private String title;
    private String director;
    private float runtime;

    private Video() {
        title = "";
        director = "";
        runtime = 0;
    }

    public Video(String _title, String _director, float _runtime) {
        title = _title;
        director = _director;
        runtime = _runtime;
    }

    @Override
    public float getValue() {
        return runtime;
    }

    @Override
    public String toString() {
        return title;
    }
}
