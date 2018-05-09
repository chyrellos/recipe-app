package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

     Recipe findByDescription(String description);

}
