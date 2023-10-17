package com.alansales.sorteador.springdoc;

import com.alansales.sorteador.trataexception.Erro;
import io.swagger.v3.core.converter.ModelConverters;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Gerador de números")
                        .description("Gera números aleatórios")
                        .version("V1")
                ).tags(Arrays.asList(
                        new Tag().name("Sorteador").description("Gerencia os geradores de números")
                )).components(new Components().schemas(
                        gerarSchemas()
                ));
    }

    private Map<String, Schema> gerarSchemas(){
        final Map<String, Schema> schemaMap = new HashMap<>();

        Map<String, Schema> erroSchema = ModelConverters.getInstance().read(Erro.class);

        schemaMap.putAll(erroSchema);

        return schemaMap;
    }

}
