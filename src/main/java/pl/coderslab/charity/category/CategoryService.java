package pl.coderslab.charity.category;

import java.util.Optional;

public interface CategoryService {
    Optional<Category> findByCategoryName(String name);
}
