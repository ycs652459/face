package com.itboyst.facedemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorPageConfig {
/*    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer(){
            return new EmbeddedServletContainerCustomizer() {
                @Override
                public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
                    ErrorPage errorPage404 = new ErrorPage(
                            HttpStatus.NOT_FOUND,"404.html");
                    ErrorPage errorPage500 = new ErrorPage(
                            HttpStatus.INTERNAL_SERVER_ERROR,"500.html");
                    configurableEmbeddedServletContainer.addErrorPages(errorPage404,errorPage500);
                }
            };
    }*/
}
