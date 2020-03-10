package onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @ToString(exclude = "library")
public class Address {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String street;

    private String city;
    private String state;
    private int postalcode; 
    private String country;

    @OneToOne(mappedBy = "address")
    private Aluno library;

    public Address(String street, String city, String state, int postalcode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalcode= postalcode;
        this.country= country;
    }
}
