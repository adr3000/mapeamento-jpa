package onetoone;

import org.springframework.data.jpa.repository.JpaRepository;

import onetoone.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{
}
