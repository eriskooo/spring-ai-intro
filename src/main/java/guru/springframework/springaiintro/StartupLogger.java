package guru.springframework.springaiintro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupLogger implements CommandLineRunner {


    @Value("${spring.ai.openai.api-key}")
    private String apiKey;

    @Override
    public void run(String... args) {
        System.out.println("OpenAI API KEY = " + apiKey);
    }
}
