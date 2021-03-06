package de.hska.userRoleService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient("userroleservice")
public class UserRoleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRoleServiceApplication.class, args);
	}
	
//	@Primary
//	@Bean
//	public RemoteTokenServices tokenService() {
//	    RemoteTokenServices tokenService = new RemoteTokenServices();
//	    tokenService.setCheckTokenEndpointUrl(
//	      "http://localhost:8092/oauth/check_token");
//	    tokenService.setClientId("userroleId");
//	    tokenService.setClientSecret("userroleSecret");
//	    return tokenService;
//	}
	
}
