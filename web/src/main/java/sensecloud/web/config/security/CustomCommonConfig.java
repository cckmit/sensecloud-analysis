package sensecloud.web.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author zhangqiang
 * @since 2020/12/14 17:20
 */
@Configuration
public class CustomCommonConfig {
    /**
     * Spring Security 中提供了 BCryptPasswordEncoder 密码编码工具，可以非常方便的
     * 实现密码的加密加盐，相同明文加密出来的结果总是不同，这样就不需要用户去额外保存盐
     * 的字段了，这一点比 Shiro 要方便很多。
     *
     * @return
     */
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
