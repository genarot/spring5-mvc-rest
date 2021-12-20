/* Copyright (C) PublicRelay, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * The work belongs to the author's employer under work made for hire principles.
 */
package guru.springframework.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gtinoco
 * @since 12/20/21
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {

        Contact contact = new Contact();
        contact.setEmail("gtinocopalacios@gmail.com");
        contact.setName("Genaro Tinoco");
        contact.setUrl("https://www.github.com/genarot");

        return new OpenAPI()
                .info(new Info().title("RestAPI Demo")
                        .description("Demo of RESTful web services with Spring")
                        .version("v0.0.1")
                        .termsOfService("Terms of Service URL goes here")
                        .contact(contact)
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("More about SpringDoc and OpenAPI 3")
                        .url("https://springdoc.org/"));
    }
}
