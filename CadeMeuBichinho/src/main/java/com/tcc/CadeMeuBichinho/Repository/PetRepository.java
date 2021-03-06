package com.tcc.CadeMeuBichinho.Repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.tcc.CadeMeuBichinho.model.Pet;
import com.tcc.CadeMeuBichinho.model.User;

public interface PetRepository extends CrudRepository<Pet, Long>,PetRepositoryCustom {
	public List<Pet> findByLostPet(Boolean lostPet);
	public Pet findByUser(User user);
}
