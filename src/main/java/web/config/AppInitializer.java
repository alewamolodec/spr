package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * Конфиги приложения - указываем классы с конфигурациями
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{HibernateConfig.class};
    }

    /**
     * Конфигурации для сервлета - указываем классы с конфигурациями
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }

    /**
     *  Рут контекст приложения т.е. localhost:8080, ранее он был localhost:8080/authors и потом надо было ещё раз
     *  писать /authors чтобы добраться до контролеера, так как урл для контролеера мапится после рут контекста
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
