package cn.chinatelecom.bigdata.delta.opuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dffuture
 */
//
//@SpringBootApplication(scanBasePackages = {
//		"cn.chinatelecom.bigdata.delta.cmdb",
//		"cn.chinatelecom.bigdata.delta.common"},
//		exclude = {MultipartAutoConfiguration.class})
@SpringBootApplication(scanBasePackages = {
		"cn.chinatelecom.bigdata.delta.opuser",
		"cn.chinatelecom.bigdata.delta.common"} )
//@MapperScan("cn.chinatelecom.bigdata.delta.opuser.mapper")
public class DeltaOpuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeltaOpuserApplication.class, args);
	}

}
