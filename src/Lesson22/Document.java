package Lesson22;

public class Document {

    private String numDocument;
    private String nameDocument;
    private String data;
    private String docAuthor;


    public String getNumDocument() { return numDocument; }
    public void setNumDocument(String numDocument) { this.numDocument = numDocument; }

    public String getNameDocument() { return nameDocument; }

    public void setNameDocument(String nameDocument) { this.nameDocument = nameDocument; }

    public String getData(String s) { return data; }

    public void setData(String data) { this.data = data; }

    public String getDocAuthor() { return docAuthor; }

    public void setDocAuthor(String docAuthor) { this.docAuthor = docAuthor; }

    @Override
    public String toString() {
        return "Document{" +
                "numDocument='" + numDocument + '\'' +
                ", nameDocument='" + nameDocument + '\'' +
                ", data=" + data +
                ", docAuthor='" + docAuthor + '\'' +
                '}';
    }
}
