package strategy;

public class Gemini3Strategy extends BaseLLMStrategy {

    @Override
    public String generateResponse(String prompt) {
        return "Performing Gemini LLM specific logic for configuration, sending prompt and handling response...";
    }

    @Override
    public String getArchitectureDocumentation() {
        return "Getting comprehensive documentation of Gemini transformer architecture...";
    }
}
