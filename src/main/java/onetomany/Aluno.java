package onetomany;

import lombok.*;

import javax.persistence.*;

@Data @Entity @NoArgsConstructor
public class Aluno {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn
    private Universidade universidade;

    public Aluno(String name) {
        this.name = name;
    }
}