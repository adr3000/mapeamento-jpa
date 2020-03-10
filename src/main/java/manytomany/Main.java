package manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Main implements CommandLineRunner {
	
    @Autowired
    private CadeiraRepository cadeiraRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
       
        cadeiraRepository.save(new Cadeira("Caderia 1", new Aluno("Aluno A"), new Aluno("Aluno B")));
    }
}
