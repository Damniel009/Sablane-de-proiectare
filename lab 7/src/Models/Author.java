package Models;

public class Author {
    private String authorName;

    public Author(String name) {
        this.authorName = name;
    }

    public void print(){
        System.out.print("The author is "+ this.authorName);
    }
}
