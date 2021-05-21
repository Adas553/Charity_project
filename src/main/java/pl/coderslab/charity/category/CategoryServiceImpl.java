package pl.coderslab.charity.category;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Optional<CategoryDto> findByCategoryName(String name) {
        return categoryRepository.findCategoryByName(name)
                .map(this::convertToCategoryDto);
    }

    public CategoryDto convertToCategoryDto(Category category) {
        CategoryDto categoryDto = new CategoryDto(
                category.getName()
        );

        return categoryDto;
    }


}
