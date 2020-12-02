package Services;

import Models.Context;
import Models.Paragraph;

public class AlignCenter implements AlignStrategy{
    public void render(Paragraph p, Context c){
        System.out.println("Printed with AlignCenter: "+ p.getParagraphName());
    }
}
