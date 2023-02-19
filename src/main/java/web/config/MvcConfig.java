package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(value = "web")
public class MvcConfig {
    /**
     * Переопределяем бин для того, чтобы указать свои значения настроек для viewResolver
     * так как стандартные нам не нравятся
     */
    @Bean
    ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/"); //Указываем каталог в котором лежат web страницы
        resolver.setSuffix(".jsp");//указываем формат, в котором сохранены наши страницы
        return resolver;
    }
}
