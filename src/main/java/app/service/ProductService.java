package app.service;

import app.model.Product;
import app.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private transient ProductRepository productRepository;

    /**
     * Gets a list of products.
     * @return A list of products.
     */
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    /**
     * Gets a product by id.
     * @param id - The id of the product.
     * @return The product.
     */
    public Product findById(Integer id) {
        return productRepository.findById(id).orElseThrow();
    }

    /**
     * Creates a product.
     * @param product - The product to insert.
     * @return The inserted product.
     */
    public Product create(Product product) {
        return productRepository.save(product);
    }

    /**
     * Updates a product.
     * @param id - The id of the product.
     * @param Product - The product to update.
     * @return The updated product.
     */
    public Product update(Integer id, Product product) {
        return productRepository.save(product);
    }

    /**
     * Deletes a product by id.
     * @param id - The id of the product to delete.
     */
    public void delete(Integer id) {
        productRepository.deleteById(id);
    }
}
