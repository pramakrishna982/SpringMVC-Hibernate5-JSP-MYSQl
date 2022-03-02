package com.config;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.web.servlet.config.annotation.EnableWebMvc;
	import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
	import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
	import org.springframework.web.servlet.view.InternalResourceViewResolver;
	import org.springframework.web.servlet.view.JstlView;


	@Configuration
	@EnableWebMvc
	@ComponentScan(basePackages = {
	    "com"
	})
	public class WebMvcConfig implements WebMvcConfigurer {

	    @Bean
	    public InternalResourceViewResolver resolver() {
	    	System.out.println("InternalResourceViewResolver webmvc ");
	        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	        resolver.setViewClass(JstlView.class);
	        resolver.setPrefix("/WEB-INF/");
	        resolver.setSuffix(".jsp");
	        return resolver;
	    }

	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    	System.out.println("addResourceHandlers webmvc ");
	        registry
	            .addResourceHandler("/resources/**")
	            .addResourceLocations("/resources/");
	    }
	}

