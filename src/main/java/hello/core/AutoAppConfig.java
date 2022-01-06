package hello.core;

import hello.core.member.MemoryMemberResository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        basePackages =  "hello.core.member",
//        basePackageClasses = AutoAppConfig.class,
//        default는 AutoAppConfig 기준으로 시작해서 하위 패키지를 다 뒤진다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
//    @Bean(name = "memoryMemberRepository")
//    MemoryMemberResository memberResository(){
//        return new MemoryMemberResository();
//    }

}
