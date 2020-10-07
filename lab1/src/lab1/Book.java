package lab1;

import java.util.ArrayList;
import java.util.List;

public class Book {
    public String title;
    public static List<String> paragraph = new ArrayList<>();
    public static List<String> image = new ArrayList<>();
    public static List<String> table = new ArrayList<>();
    public  List<String> theBook = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void createNewParagraph(String paragraphTitle){

        paragraph.add(paragraphTitle);
        theBook.add(paragraphTitle);
    }

    public void createNewImage(String imageTitle){

        image.add(imageTitle);
        theBook.add(imageTitle);
    }

    public void createNewTable(String tableTitle)
    {
        table.add(tableTitle);
        theBook.add(tableTitle);
    }

    public void print() {
        String printBook = String.join("\n", theBook);
        System.out.println(title+"\n\n"+printBook);
    }
}
