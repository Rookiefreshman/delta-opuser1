package cn.chinatelecom.bigdata.delta.opuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 石祥
 * @CreateDate 2020/04/28
 */

@SpringBootApplication(scanBasePackages = {
		"cn.chinatelecom.bigdata.delta.opuser",
		"cn.chinatelecom.bigdata.delta.common"} )
public class DeltaOpuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeltaOpuserApplication.class, args);
	}

}
