package strategy;

public class Gpt5Strategy extends BaseLLMStrategy {

    @Override
    public String generateResponse(String prompt) {
        return "Performing GPT5 LLM specific logic for configuration, sending prompt and handling response...";
    }

    @Override
    public String getArchitectureDocumentation() {
        return "Getting comprehensive documentation of GPT5 transformer architecture...";
    }
}
