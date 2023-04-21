package OOP_Lecture002.Ex006.Interface;

import OOP_Lecture002.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
