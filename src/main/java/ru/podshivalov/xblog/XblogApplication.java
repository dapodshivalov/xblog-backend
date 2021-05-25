package ru.podshivalov.xblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.podshivalov.xblog.repositories.TaskRepository;

@EnableJpaRepositories("ru.podshivalov.xblog.repositories")
@SpringBootApplication
public class XblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(XblogApplication.class, args);
    }

}
