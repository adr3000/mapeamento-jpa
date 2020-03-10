package onetoone;

import org.springframework.data.jpa.repository.JpaRepository;

import onetoone.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
}
