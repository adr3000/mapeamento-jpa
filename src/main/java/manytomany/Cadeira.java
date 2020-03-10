package manytomany;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data @EqualsAndHashCode(exclude = "aluno") @Entity
public class Cadeira {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "cadeira_aluno",
        joinColumns = @JoinColumn(name = "cadeira_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "aluno_id", referencedColumnName = "id"))
    private Set<Aluno> aluno;

    public Cadeira(String name, Aluno... aluno) {
        this.name = name;
        this.aluno = Stream.of(aluno).collect(Collectors.toSet());
        this.aluno.forEach(x -> x.getBooks().add(this));
    }
}
