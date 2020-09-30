package org.superbiz.struts;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;
import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {
    @Bean
    public FilterRegistrationBean siteMesh(){
    FilterRegistrationBean<SiteMeshFilter> filterRegistrationBean = new FilterRegistrationBean<>(new SiteMeshFilter());
    filterRegistrationBean.addUrlPatterns("/*");
    filterRegistrationBean.setOrder(1);
    return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean strutsPrepareAndExecuteFilter() {
        FilterRegistrationBean<StrutsPrepareAndExecuteFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>(new StrutsPrepareAndExecuteFilter());
        filterFilterRegistrationBean.addUrlPatterns("/",
            "/addUserForm.action",
            "/addUser.action",
            "/findUserForm.action",
            "/findUser.action",
            "/listAllUsers.action");
        filterFilterRegistrationBean.setOrder(2);
        return filterFilterRegistrationBean;
    }
}
