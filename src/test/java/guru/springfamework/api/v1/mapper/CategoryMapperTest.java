package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;
import junit.framework.TestCase;
import org.junit.Test;

public class CategoryMapperTest extends TestCase {

    private static final String NAME = "Joe";
    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    public void testCategoryToCategoryDTO() {
        //given
        Category category= new Category();
        category.setName(NAME);
        category.setId(1L);

        // when
        CategoryDTO dto= categoryMapper.categoryToCategoryDTO(category);

        assertEquals(1L, dto.getId().longValue());
        assertEquals(NAME, dto.getName());
    }
}