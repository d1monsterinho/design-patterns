package templatemethod;

public abstract class FileMiner {
    public final void processFile(String file) {
        System.out.println(decodeSpecificFormatFile(file));
        System.out.println(parseSpecificFormatIntoRawData(file));
        System.out.println(convertRawFileIntoStorable(file));

        String storableFileAnalysis = analyzeStorableFile(file);
        System.out.println(storableFileAnalysis);
        storableFileAnalysisHook(storableFileAnalysis, file);

        publishReports(file);
    }

    protected abstract String decodeSpecificFormatFile(String file);
    protected abstract String parseSpecificFormatIntoRawData(String file);

    protected String convertRawFileIntoStorable(String file) {
        System.out.println("Converting parsed raw data file into format which is able to store...");
        return "[STORABLE FILE]";
    }

    protected String analyzeStorableFile(String file) {
        System.out.println("Analyzing storable file...");
        return "[STORABLE ANALYSIS]";
    }

    protected void publishReports(String file) {
        System.out.println("File of generic format was successfully processed. Please refer to the X dir for detail info.");
    }

    protected void storableFileAnalysisHook(String analysis, String file) {}
}
