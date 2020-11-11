package Models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private ArrayList<Author> authorName = new ArrayList<Author>();
    public static List<Element> elements = new ArrayList<Element>();

    public Book(String name) {
        this.title = name;
    }

    public void addAuthor(Author name) {
        this.authorName.add(name);
    }

    public void print(){
        System.out.println("Book: "+ this.title);
        System.out.println();
        System.out.println("Authors: ");
        for(Author a : authorName){
            a.print();
            System.out.println();
        }
        System.out.println();
        for(Element e: elements){
            e.print();
        }
    }

    public int addContent(Element e) {
        elements.add(e);
        return elements.indexOf(e);
    }


}
