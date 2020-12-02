package Models;

import Services.AlignCenter;
import Services.AlignStrategy;

public class Paragraph implements Element{
    private String paragraphName;
    private AlignStrategy align = new AlignCenter();

    public Paragraph(String name){
        this.paragraphName = name;
    }

    public void print(){
        align.render(this, new Context());
    }

    public String getParagraphName(){
        return this.paragraphName;
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    public void setAlignStrategy(AlignStrategy a) {
        this.align = a;
    }
}
