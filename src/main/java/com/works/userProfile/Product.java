package com.works.userProfile;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class Product implements ConfigProfile {

	@Override
	public Map<CEnum, Object> config() {
		
		Map<CEnum, Object> hm  = new HashMap<>();
		hm.put(CEnum.apiKey, "prod923480sfds");
		hm.put(CEnum.dbURL, "prodDBURL");
		hm.put(CEnum.dbUser, "prodDBUser");
		hm.put(CEnum.dbPass, "prodDBPass");
		return hm;			
	}

}