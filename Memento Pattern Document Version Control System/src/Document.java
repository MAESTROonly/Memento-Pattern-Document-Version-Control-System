public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void editContent(String newContent) {
        System.out.println("Editing document...");
        this.content = newContent;
    }

    public String getContent() {
        return content;
    }

    public DocumentVersion save() {
        System.out.println("Saving document version...");
        return new DocumentVersion(content);
    }

    public void restore(DocumentVersion version) {
        System.out.println("Restoring document version...");
        this.content = version.getContent();
    }
}
