package com.springboot.rest.swagger.task.invoice.swagger;

import io.swagger.annotations.*;

@SwaggerDefinition(
        info = @Info(
                description = "Training Tasks",
                version = "V12.0.12",
                title = "Training Resource API",
                contact = @Contact(
                   name = "Krishna",
                   email = "krishan@theegiants.com",
                   url = "http://www.theegiants.com"
                ),
                license = @License(
                   name = "Apache 2.0", 
                   url = "http://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        consumes = {"application/json", "application/xml"},
        produces = {"application/json", "application/xml"},
        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS},
        externalDocs = @ExternalDocs(value = "Note this", url = "http://theegiants.com")
)
public interface ApiDocumentationConfig {

}