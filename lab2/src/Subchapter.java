import java.util.ArrayList;
import java.util.List;

public class Subchapter {
    private String subchapterName;
    private List<Element> elementList = new ArrayList<Element>();

    public Subchapter(String name){
        this.subchapterName = name;
    }


    public void createNewParagraph(String name) {
        Paragraph paragraph = new Paragraph(name);
        elementList.add(paragraph);
    }

    public void createNewImage(String name) {
        Image image = new Image(name);
        elementList.add(image);
    }

    public void createNewTable(String name) {
        Table table = new Table(name);
        elementList.add(table);
    }

    public void print() {
        System.out.println("The name of the subchapter is: " + this.subchapterName);
        for (Element element: elementList)
        {
            element.print();
        }
    }
}
