package strategy;

public class LLMContextClient {

    public void generateLLMsResponses() {
        String templatePrompt = "template prompt";

        LLMContext context = new LLMContext(new Gpt5Strategy());
        System.out.println(context.generateLLMResponse(templatePrompt));
        System.out.println(context.getLLMArchitectureDocs());

        //Dynamically set another LLM changing strategy at runtime for different behavior.
        //For example, we want to save token traffic using less powerful model for more trivial tasks
        context.setLlmStrategy(new GTP4MiniStrategy());
        System.out.println(context.generateLLMResponse(templatePrompt));
        System.out.println(context.getLLMArchitectureDocs());

    }
}
