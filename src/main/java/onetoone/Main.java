package onetoone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@SpringBootApplication
public class Main implements CommandLineRunner {
	
    private final AlunoRepository alunoRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
       
        alunoRepository.save(new Aluno("Aluno 1", new Address("Street 1", "city 1", "state 1", 54789, "country 1" )));
        alunoRepository.save(new Aluno("Aluno 2", new Address("Street 2", "city 2", "state 2", 70000, "country 2" )));
    }
}
