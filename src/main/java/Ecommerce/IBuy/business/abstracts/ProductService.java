package Ecommerce.IBuy.business.abstracts;

import Ecommerce.IBuy.core.utilities.results.DataResult;
import Ecommerce.IBuy.core.utilities.results.Result;
import Ecommerce.IBuy.entities.concretes.Product;
import Ecommerce.IBuy.entities.dtos.ProductWithCategoryDto;

import java.util.List;

public interface ProductService {
        DataResult<List<Product>>  getAll();

        DataResult<List<Product>> getAll(int pageNo, int pageSize);

        DataResult<List<Product>>  getAllSorted();

        DataResult<List<Product>>  getAllSortedGrowing();

        Result add(Product product);

        DataResult<Product> getByProductName(String productName);

        DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);

        DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);

        DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);

        DataResult<List<Product>> getByProductNameContains(String productName);

        DataResult<List<Product>> getByProductNameStartsWith(String productName);

        DataResult<List<Product>> getProductsByCategoryId(int categoryId);

        DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

        DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();


    }

