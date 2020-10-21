public class Paragraph implements Element{
    private String paragraphName;

    public Paragraph(String name){
        this.paragraphName = name;
    }

    public void print(){
        System.out.print("Paragraph: "+ this.paragraphName+ "\n");

    }
}
