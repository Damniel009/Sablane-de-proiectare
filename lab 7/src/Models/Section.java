package Models;

import java.util.ArrayList;

public class Section implements Element{
    private String title;
    ArrayList<Element> elements = new ArrayList<>();

    public Section(String s){
        this.title = s;
    }

    public int add(Element e) {
        elements.add(e);
        return elements.indexOf(e);
    }

    public void remove(Element e) {
        elements.remove(e);
    }

    public Element getElement(int i){
        return elements.get(i);
    }

    public void print(){
        System.out.println(this.title);
        for(Element i : elements) {
            i.print();

        }
    }

    public void accept(Visitor v) {
        v.visit(this);
        for(Element i:elements){
            i.accept(v);
        }
    }
}
