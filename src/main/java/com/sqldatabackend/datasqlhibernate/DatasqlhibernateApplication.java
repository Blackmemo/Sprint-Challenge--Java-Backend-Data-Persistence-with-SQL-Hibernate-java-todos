package com.sqldatabackend.datasqlhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DatasqlhibernateApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(DatasqlhibernateApplication.class, args);
    }

}
