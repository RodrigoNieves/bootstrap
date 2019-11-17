package me.rrsn.bootstrap.repository;

import me.rrsn.bootstrap.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog,Long> {
    @Query("SELECT breed FROM Dog")
    List<String> findAllBreed();

    @Query("SELECT breed FROM Dog WHERE id = ?1")
    String findBreedById(Long id);

    @Query("SELECT name FROM Dog")
    List<String> findAllName();
}
