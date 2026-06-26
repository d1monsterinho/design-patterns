package strategy;

public abstract class BaseLLMStrategy {
    public abstract String generateResponse(String prompt);
    public abstract String getArchitectureDocumentation();
}
