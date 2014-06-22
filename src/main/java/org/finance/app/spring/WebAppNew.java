package org.finance.app.spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletRegistration.Dynamic;

/**
 * <b>Further reading</b>: <br/>
 * - http://static.springsource.org/spring/docs/3.2.x/spring-framework-reference/html/mvc.html#mvc-container-config <br/>
 * - http://geowarin.wordpress.com/2013/01/23/complete-example-of-a-spring-mvc-3-2-project/ <br/>
 * - http://www.objectpartners.com/2012/01/16/introduction-to-servlet-3-0/ <br/>
 */
public class WebAppNew extends AbstractAnnotationConfigDispatcherServletInitializer {

    public WebAppNew() {
        super();
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected void customizeRegistration(final Dynamic registration) {
        super.customizeRegistration(registration);
    }


}
