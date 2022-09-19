package com.care.team_cafe.file;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class FileConfiguration {
	@Bean							//메소드 이름은 반드시 요걸로해야 사용가능
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver mr = new CommonsMultipartResolver();
		mr.setMaxUploadSize(52428800);//50MB , 1KB(1024BYTE) - > 1MB(1024KB)
		mr.setDefaultEncoding("utf-8");
		return mr;
	}
}