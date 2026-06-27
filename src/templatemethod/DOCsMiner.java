package templatemethod;

public class DOCsMiner extends FileMiner {
    @Override
    protected String decodeSpecificFormatFile(String file) {
        System.out.println("Decoding DOCs format file...");
        return "[DECODED DOCs FILE]";
    }

    @Override
    protected String parseSpecificFormatIntoRawData(String file) {
        System.out.println("Parsing DOCs format file into raw data...");
        return "[RAW FILE]";
    }

    @Override
    protected void publishReports(String file) {
        System.out.println("File of DOCs format was successfully processed. Please refer to the X dir for detail info.");
    }

    @Override
    protected void storableFileAnalysisHook(String analysis, String file) {
        System.out.println("Performing additional steps for generated analysis using hook in template method feature...");
    }
}
