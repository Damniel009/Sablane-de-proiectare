import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author authorName;
    public static List<Chapter> chapterList = new ArrayList<Chapter>();

    public Book(String name) {
        this.title = name;
    }

    public void addAuthor(Author name) {
        this.authorName = name;
    }

    public int createChapter(String s) {
        Chapter cH = new Chapter(s);
        chapterList.add(cH);
        return chapterList.indexOf(cH);
    }

    public Chapter getChapter(int indexOfChapter) {
        return chapterList.get(indexOfChapter);
    }

    public void print(){
        System.out.print("The chapter is "+ this.title);
    }
}
