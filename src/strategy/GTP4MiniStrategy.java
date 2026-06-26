package strategy;

public class GTP4MiniStrategy extends BaseLLMStrategy {

    @Override
    public String generateResponse(String prompt) {
        return "Performing GPT4-mini LLM specific logic for configuration, sending prompt and handling response...";
    }

    @Override
    public String getArchitectureDocumentation() {
        return "Getting comprehensive documentation of GPT4-mini transformer architecture...";
    }
}
