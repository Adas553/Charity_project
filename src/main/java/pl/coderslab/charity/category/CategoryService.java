package pl.coderslab.charity.category;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CategoryService {
    Optional<Category> findByCategoryName(String name);
}
