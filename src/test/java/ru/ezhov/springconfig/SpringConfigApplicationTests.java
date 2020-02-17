package ru.ezhov.springconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringConfigApplicationTests {

    @Value("${spring.application.name}")
    private String springApplicationName;

    @Value("${spring.db.url}")
    private String springDbUrl;

    @Value("${spring.ldap.url}")
    private String springLdapUrl;

    @Test
    void contextLoads() {
        System.out.println("springApplicationName: " + springApplicationName);
        System.out.println("springDbUrl: " + springDbUrl);
        System.out.println("springLdapUrl: " + springLdapUrl);
    }

}
