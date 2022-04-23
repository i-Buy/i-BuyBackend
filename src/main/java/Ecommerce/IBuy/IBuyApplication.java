package Ecommerce.IBuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class IBuyApplication {

	public static void main(String[] args) {
		SpringApplication.run(IBuyApplication.class, args);
	}
	@Bean //java derlerken bean i görünce belleğe yerleştiriyo, docket denilen nesne ile controllerımızı requestleri buluyo dökumantasyon halıne getırıyo
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("Ecommerce.IBuy"))
				.build();
	}

}
