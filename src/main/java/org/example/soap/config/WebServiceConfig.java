package org.example.soap.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig implements WebMvcConfigurer {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }


//
//    @Bean(name = "mti")
//    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema mtiSchema) {
//        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
//        wsdl11Definition.setPortTypeName("MtiPort");
//        wsdl11Definition.setLocationUri("/ws");
//        wsdl11Definition.setTargetNamespace("http://example.com/soap");
//        wsdl11Definition.setSchema(mtiSchema);
//        return wsdl11Definition;
//    }

//    @Bean
//    public XsdSchema mtiSchema() {
//        return new SimpleXsdSchema(new ClassPathResource("wsdl/mti.xsd"));
//    }


    @Bean(name = "auth")
    public DefaultWsdl11Definition authWsdlDefinition(XsdSchema authSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("AuthPort");
        wsdl11Definition.setLocationUri("/ws/auth");
        wsdl11Definition.setTargetNamespace("http://example.com/soap/auth");
        wsdl11Definition.setSchema(authSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema authSchema() {
        return new SimpleXsdSchema(new ClassPathResource("wsdl/mti-auth.xsd"));
    }

    @Bean(name = "financial")
    public DefaultWsdl11Definition financialWsdlDefinition(XsdSchema financialSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("FinancialPort");
        wsdl11Definition.setLocationUri("/ws/financial");
        wsdl11Definition.setTargetNamespace("http://example.com/soap/financial");
        wsdl11Definition.setSchema(financialSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema financialSchema() {
        return new SimpleXsdSchema(new ClassPathResource("wsdl/mti-financial.xsd"));
    }

    @Bean(name = "network")
    public DefaultWsdl11Definition networkWsdlDefinition(XsdSchema networkSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("NetworkPort");
        wsdl11Definition.setLocationUri("/ws/network");
        wsdl11Definition.setTargetNamespace("http://example.com/soap/network");
        wsdl11Definition.setSchema(networkSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema networkSchema() {
        return new SimpleXsdSchema(new ClassPathResource("wsdl/mti-network.xsd"));
    }
}
