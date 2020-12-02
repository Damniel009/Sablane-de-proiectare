package Services;

import Models.Context;
import Models.Paragraph;

public interface AlignStrategy {
    public void render(Paragraph p, Context c);
}

