package com.works.userProfile;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class Development implements ConfigProfile {

	@Override
	public Map<CEnum, Object> config() {
		Map<CEnum, Object> hm  = new HashMap<>();
		hm.put(CEnum.apiKey, "dev923480sfds");
		hm.put(CEnum.dbURL, "devDBURL");
		hm.put(CEnum.dbUser, "devDBUser");
		hm.put(CEnum.dbPass, "devDBPass");
		return hm;
	}

}