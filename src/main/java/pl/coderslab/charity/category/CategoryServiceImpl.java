package pl.coderslab.charity.category;

import java.util.Optional;

public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Optional<Category> findByCategoryName(String name) {
        return categoryRepository.findCategoryByName(name);
    }
}
