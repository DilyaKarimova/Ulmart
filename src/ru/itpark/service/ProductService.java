package ru.itpark.service;

import ru.itpark.domain.Product;
import ru.itpark.repository.ProductRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(Product product) {
        repository.add(product);
    }

    public List<Product> getAll() {
        return repository.getAll();
    }

    public List<Product> getSorted(Comparator<Product> comparator) {
        List<Product> result = repository.getAll();
        result.sort(comparator);
        return result;
    }

    public ProductService findAllByName(String name) {
        ProductService service = new ProductService(new ProductRepository());
        for (Product product : repository.getAll()) {
            if (product.getName().contains(name)) {
                service.add(product);
            }
        }
        return service;
    }

    public ProductService findAllByCategory (String category) {
        ProductService service = new ProductService(new ProductRepository());
        for (Product product : repository.getAll()) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                service.add(product);
            }
        }
        return service;
    }

}