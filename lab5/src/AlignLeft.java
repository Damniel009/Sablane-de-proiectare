public class AlignLeft implements AlignStrategy{
    public void render(Paragraph p, Context c){
        System.out.println("Printed with AlignLeft: "+ p.getParagraphName());
    }
}
