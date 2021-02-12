package com.works.userProfile;

import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public interface ConfigProfile {

	public Map<CEnum, Object> config();
}