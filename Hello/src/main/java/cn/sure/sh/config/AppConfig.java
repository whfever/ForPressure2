package cn.sure.sh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
 @ComponentScan(basePackages = "cn.sure.sh")
public class AppConfig   {
    // Additional configuration can be added here if needed

}
