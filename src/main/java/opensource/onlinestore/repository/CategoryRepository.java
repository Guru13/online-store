package opensource.onlinestore.repository;

import opensource.onlinestore.model.Category;
import opensource.onlinestore.model.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    public CategoryEntity findByName(Category name);
}
