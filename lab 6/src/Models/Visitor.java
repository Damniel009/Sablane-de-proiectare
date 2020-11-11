package Models;

import Models.*;

public interface Visitor{
    public void visit(Section s);
    public void visit(Paragraph p);
    public void visit(ImageProxy ip);
    public void visit(Image i);
    public void visit(Table t);
}
