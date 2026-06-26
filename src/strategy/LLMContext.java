package strategy;

public class LLMContext {
    private BaseLLMStrategy llmStrategy;

    public LLMContext(BaseLLMStrategy llmStrategy) {
        this.llmStrategy = llmStrategy;
    }

    public void setLlmStrategy(BaseLLMStrategy llmStrategy) {
        this.llmStrategy = llmStrategy;
    }

    public String generateLLMResponse(String prompt) {
        return llmStrategy.generateResponse(prompt);
    }

    public String getLLMArchitectureDocs() {
        return llmStrategy.getArchitectureDocumentation();
    }
}
