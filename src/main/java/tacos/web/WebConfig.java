package tacos.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
    //SE USA PARA VISTAS QUE NO CONTROLAN MODELOS NI FORMULARIOS
    //TAMBIEN PUEDE IMPLEMENTARSE EN LA CLASE TACOCLOUDAPPLICATION
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        //PARA LA RUTA "/" SETEA LA VISTA HOME
        registry.addViewController("/").setViewName("home");
    }
}
