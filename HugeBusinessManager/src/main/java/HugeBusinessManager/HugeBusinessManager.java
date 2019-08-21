package HugeBusinessManager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("HugeBusinessManager/BusinessManagerDao")
@EnableSwagger2
public class HugeBusinessManager {

    public static void main(String[] args) {
        SpringApplication.run(HugeBusinessManager.class, args);
    }

    @Bean
    public Docket petApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .select()
//                .apis(RequestHandlerSelectors.any())//添加所有Controller
//               添加指定包下的Controller文件
                .apis(RequestHandlerSelectors.basePackage("HugeBusinessManager.BusinessManagerController"))
                .paths(PathSelectors.any())
                .build();

//    Api的一些描述信息
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("测试api")
                .description("对Api的描述")
                .contact(new Contact("wkk", "https://blog.yayuanzi.com/author/knight", "test@.com"))
                .version("v1.0")
                .build();
        docket.apiInfo(apiInfo);

        return docket;
    }
}
