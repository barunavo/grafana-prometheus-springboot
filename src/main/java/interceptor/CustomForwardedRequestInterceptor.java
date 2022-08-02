// package interceptor;

// import com.github.mkopylec.charon.configuration.MappingProperties;
// import com.github.mkopylec.charon.core.http.ForwardedRequestInterceptor;
// import com.github.mkopylec.charon.core.http.RequestData;
// import org.springframework.stereotype.Component;

// @Component
// public class CustomForwardedRequestInterceptor implements ForwardedRequestInterceptor {

//     @Override
//     public void intercept(RequestData data) {
//         data.getHeaders().set("X-WEBAUTH-USER", "admin");

//     }

// }