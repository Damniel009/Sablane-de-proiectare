package Services;

import Models.*;

public class BookStatistics implements Visitor {
    private int paragraph = 0;
    private int sections = 0;
    private int imageproxy = 0;
    private int images = 0;
    private int tables = 0;

    @Override
    public void visit(Section s) {
        sections++;
    }

    @Override
    public void visit(Paragraph p) {
        paragraph++;
    }

    @Override
    public void visit(ImageProxy ip) {
        imageproxy++;
    }

    @Override
    public void visit(Image i) {
        images++;
    }

    @Override
    public void visit(Table t) {
        tables++;
    }

    public void printStatistics(){
        System.out.println("Section: " + sections + "\n paragraphs: " + paragraph + "\n images: " + images + "\n image proxy: " + imageproxy + "\n tables: " + tables );
    }
}
