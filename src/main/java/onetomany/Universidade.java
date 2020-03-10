package onetomany;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@EqualsAndHashCode(exclude = "aluno")
@Entity
public class Universidade {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "universidade", cascade = CascadeType.ALL)
    private Set<Aluno> aluno;

    public Universidade(String name, Aluno... aluno) {
        this.name = name;
        this.aluno = Stream.of(aluno).collect(Collectors.toSet());
        this.aluno.forEach(x -> x.setUniversidade(this));
    }
}
