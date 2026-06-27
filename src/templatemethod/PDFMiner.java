package templatemethod;

public class PDFMiner extends FileMiner {
    @Override
    protected String decodeSpecificFormatFile(String file) {
        System.out.println("Decoding PDF format file...");
        return "[DECODED PDF FILE]";
    }

    @Override
    protected String parseSpecificFormatIntoRawData(String file) {
        System.out.println("Parsing PDF format file into raw data...");
        return "[RAW FILE]";
    }
}
