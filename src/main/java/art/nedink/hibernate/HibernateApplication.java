package art.nedink.hibernate;

import art.nedink.hibernate.domain.MyEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateApplication {

    private final MyEntityRepository myEntityRepository;

    public HibernateApplication(MyEntityRepository myEntityRepository) {
        this.myEntityRepository = myEntityRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            MyEntity myEntity1 = new MyEntity(null, "some string");
            myEntityRepository.save(myEntity1);
        };
    }
}

