package org.superbiz.struts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.singletonList;

@SpringBootApplication
public class Application {

    public static void main(String... args) {

        SpringApplication.run(Application.class, args);
    }

//
//    @Bean
//    public FilterRegistrationBean filterDispatcher() {
//
//        return buildFilterRegistration(0, new FilterDispatcher());
//    }
//
//    @Bean
//    public FilterRegistrationBean actionContextCleanup() {
//        return buildFilterRegistration(1, new ActionContextCleanUp());
//    }
//
//    @Bean
//    public FilterRegistrationBean sitemeshPageFilter() {
//
//        return buildFilterRegistration(2, new PageFilter());
//    }
//
//
//    private FilterRegistrationBean buildFilterRegistration(int order, Filter filter) {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//
//        registration.setFilter(filter);
//        registration.setUrlPatterns(
//                Arrays.asList(
//                "/decorators/layout.jsp",
//                "/displayUser.jsp",
//                "/displayUsers.jsp"));
//        registration.setOrder(order);
//        return registration;
//    }
}