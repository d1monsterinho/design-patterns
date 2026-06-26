package strategy;

public class GTP4Strategy extends BaseLLMStrategy {
    @Override
    public String generateResponse(String prompt) {
        return "Performing GPT4 LLM specific logic for configuration, sending prompt and handling response...";
    }

    @Override
    public String getArchitectureDocumentation() {
        return "Getting comprehensive documentation of GPT4 transformer architecture...";
    }
}
