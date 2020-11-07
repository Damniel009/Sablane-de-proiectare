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

    public void setAlignStrategy(AlignStrategy a) {
        this.align = a;
    }
}


