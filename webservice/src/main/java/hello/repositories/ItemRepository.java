package hello.repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import hello.models.Item;


// This will be AUTO IMPLEMENTED by Spring into a Bean called itemRepository
// CRUD refers Create, Read, Update, Delete

public interface ItemRepository extends CrudRepository<Item, Integer> {

    List<Item> findByCtgry(String category);

}