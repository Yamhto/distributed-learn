package com.yamhto.sharingsphere.Conf;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author yamhto
 * @className: JdbcConf.java
 * @package com.yamhto.sharingsphere.Conf
 * @description:
 * @date 2020/6/2 14:16
 */
@PropertySource(value = {"classpath:jdbc.properties"})
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Component
public class JdbcConf {
    @Value("${jdbc.className1}")
    private String className1;
    @Value("${jdbc.url1}")
    private String url1;

    @Value("${jdbc.user1}")
    private String user1;

    @Value("${jdbc.password1}")
    private String password1;

    @Value("${jdbc.className2}")
    private String className2;

    @Value("${jdbc.url2}")
    private String url2;

    @Value("${jdbc.user2}")
    private String user2;

    @Value("${jdbc.password2}")
    private String password2;


}
