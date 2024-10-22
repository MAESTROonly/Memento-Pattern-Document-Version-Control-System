public class Main {
    public static void main(String[] args) {
        Document document = new Document("Initial content.");
        VersionControl versionControl = new VersionControl();
        versionControl.saveVersion(document.save());
        document.editContent("First edit.");
        versionControl.saveVersion(document.save());
        document.editContent("Second edit.");
        versionControl.saveVersion(document.save());
        versionControl.listVersions();
        DocumentVersion versionToRestore = versionControl.getVersion(1); // Restore to first edit
        if (versionToRestore != null) {
            document.restore(versionToRestore);
            System.out.println("Document after restoration: " + document.getContent());
        }
    }
}

