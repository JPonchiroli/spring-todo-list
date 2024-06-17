package dio_bootcamp_todo_list.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spring CRUD API")
                        .version("1.0")
                        .description("A CRUD using the rest API")
                        .contact(new Contact()
                                .name("João Ponchiroli")
                                .url("http://www.github.com/JPonchiroli.com.br")
                                .email("joaopedroponqueroli@gmail.com.br")));
    }
}
