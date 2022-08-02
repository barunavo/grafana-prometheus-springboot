package jp.ahaoretama.springbootprometheusgrafanasample;

import io.prometheus.client.hotspot.DefaultExports;
import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import io.prometheus.client.spring.web.EnablePrometheusTiming;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnablePrometheusEndpoint
//@EnableSpringBootMetricsCollector
//@EnablePrometheusTiming
public class SpringBootPrometheusGrafanaSampleApplication {

	public static void main(String[] args) {
		DefaultExports.initialize();
		SpringApplication.run(SpringBootPrometheusGrafanaSampleApplication.class, args);
	}
}
// import org.apache.catalina.Context;
// import org.apache.catalina.connector.Connector;
// import org.apache.tomcat.util.descriptor.web.SecurityCollection;
// import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;
// import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
// import org.springframework.boot.web.servlet.server.ServletWebServerFactory;


// @SpringBootApplication
// public class StartApplication {
//     public static void main(String[] args) {
//         SpringApplication.run(StartApplication.class, args);
//     }

//     // spring boot 2.x
//     @Bean
//     public ServletWebServerFactory servletContainer() {
//         TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
//             @Override
//             protected void postProcessContext(Context context) {
//                 SecurityConstraint securityConstraint = new SecurityConstraint();
//                 securityConstraint.setUserConstraint("CONFIDENTIAL");
//                 SecurityCollection collection = new SecurityCollection();
//                 collection.addPattern("/grafana");
//                 securityConstraint.addCollection(collection);
//                 context.addConstraint(securityConstraint);
//             }
//         };
//         tomcat.addAdditionalTomcatConnectors(redirectConnector());
//         return tomcat;
//     }

//     private Connector redirectConnector() {
//         Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//         connector.setScheme("http");
//         connector.setPort(8080);
//         connector.setSecure(false);
//         connector.setRedirectPort(3000);
//         return connector;
//     }