package pl.lymek.springbootapidocker;

import org.springframework.data.repository.CrudRepository;

public interface AnimalRepo  extends CrudRepository<Animal,Long> {

}
