/*
 * Category Service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: bhb127@outlook.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package hska.microServiceWebShop.api;

import hska.microServiceWebShop.ApiException;
import hska.microServiceWebShop.models.Category;
import hska.microServiceWebShop.models.CategoryQuery;
import hska.microServiceWebShop.models.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CategoriesApi
 */
@Ignore
public class CategoriesApiTest {

    private final CategoriesApi api = new CategoriesApi();

    
    /**
     * Adds a new category
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCategoryTest() throws ApiException {
        Category name = null;
        Category response = api.addCategory(name);

        // TODO: test validations
    }
    
    /**
     * Deletes a category
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCategoryTest() throws ApiException {
        Long id = null;
        api.deleteCategory(id);

        // TODO: test validations
    }
    
    /**
     * Retrieves a category
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCategoryTest() throws ApiException {
        Long id = null;
        Category response = api.getCategory(id);

        // TODO: test validations
    }
    
    /**
     * Queries categories. If no name is provided all categories will be returned
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryCategoriesTest() throws ApiException {
        CategoryQuery query = null;
        List<Category> response = api.queryCategories(query);

        // TODO: test validations
    }
    
}
