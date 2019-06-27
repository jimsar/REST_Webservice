package hello.repositories;

import org.springframework.data.repository.CrudRepository;

import hello.models.Trapezi;

// This will be AUTO IMPLEMENTED by Spring into a Bean called trapeziRepository
// CRUD refers Create, Read, Update, Delete

public interface TrapeziRepository extends CrudRepository<Trapezi, String> {

}
