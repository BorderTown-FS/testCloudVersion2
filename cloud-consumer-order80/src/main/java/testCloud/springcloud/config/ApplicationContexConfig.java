package testCloud.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：fengshuo
 * @date ：Created in 2021/3/14 12:56
 * @description：rest接口封装配置
 * @version: 1
 */
@Configuration
public class ApplicationContexConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
