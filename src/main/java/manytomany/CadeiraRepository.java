package manytomany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CadeiraRepository extends JpaRepository<Cadeira, Integer> {
	
}
