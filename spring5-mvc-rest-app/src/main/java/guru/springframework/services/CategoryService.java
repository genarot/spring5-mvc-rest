/* Copyright (C) PublicRelay, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * The work belongs to the author's employer under work made for hire principles.
 */
package guru.springframework.services;

import guru.springframework.api.v1.model.CategoryDTO;

import java.util.List;

/**
 * @author gtinoco
 * @since 12/17/21
 */
public interface CategoryService {
    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
