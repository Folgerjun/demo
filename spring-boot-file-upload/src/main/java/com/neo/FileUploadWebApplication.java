package com.neo;

import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FileUploadWebApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(FileUploadWebApplication.class, args);
	}

	/**
	 * Tomcat large file upload connection reset 注：springboot 1.5写法
	 */
	@Bean
	public TomcatEmbeddedServletContainerFactory tomcatEmbedded() {
		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
		tomcat.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> {
			if ((connector.getProtocolHandler() instanceof AbstractHttp11Protocol<?>)) {
				// -1 means unlimited
				((AbstractHttp11Protocol<?>) connector.getProtocolHandler()).setMaxSwallowSize(-1);
			}
		});
		return tomcat;
	}

	/**
	 * Tomcat large file upload connection reset 注：springboot 2.0写法
	 */

	// @Bean
	// public MultipartConfigElement multipartConfigElement() {
	// MultipartConfigFactory factory = new MultipartConfigFactory();
	// // 单个数据大小
	// factory.setMaxFileSize(MaxFileSize); // KB,MB
	// /// 总上传数据大小
	// factory.setMaxRequestSize(MaxRequestSize);
	// return factory.createMultipartConfig();
	// }
}