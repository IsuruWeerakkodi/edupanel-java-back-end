package lk.ijse.dep11.edupanal;

import org.springframework.web.filter.FormContentFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(new MultipartConfigElement("/tmp"));
    }

    @Override
    protected Filter[] getServletFilters() {
        return new Filter[] {new FormContentFilter()};
    }
}













/*
WEB SERVICES
                                                                   status codes  ->   success/error     consume             produce
Create a new lecturer               POST        /lecturers                            201   400         multipart/formdata  application/json
Update lecturer details             PATCH       /lecturers/{id}                       204   400,404     multipart/formdata
Delete lecturer                     DELETE      /lecturers/{id}                       204   400,404
Get all lecturers                   GET         /lecturers                            200                                   application/json
Arrange full time lecturer order    PATCH       /lecturers/ful-time/ranks             204   400         multipart/formdata
                                                (or /lecturers/ranks?filter=full-time)
Get all full time lecturers         GET         /lecturers/full-time                  200                                   application/json
                                                (or /lecturers?filter=full-time)
Arrange part time lecturer's order  PATCH       /lecturers/part-time/ranks            204   400         multipart/formdata
                                                (or /lecturers/ranks?filter=part-time)
Get all part time lecturers         GET         /lecturers/part-time                  200                                   application/json
                                                (or /lecturers?filter=part-time)
*/


