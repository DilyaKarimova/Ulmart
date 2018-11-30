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

    public List<Product> findAllByName(String name) {
        List<Product> result = new ArrayList<Product>();
        name = name.toLowerCase();

        for (Product product : repository.getAll()) {
            if (product.getName().toLowerCase().contains(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public List<Product> findAllByCategory(String category) {
        List<Product> result = new ArrayList<Product>();
        category = category.toLowerCase();

        for (Product product : repository.getAll()) {
            if (product.getCategory().toLowerCase().contains(category)) {
                result.add(product);
            }
        }
        return result;
    }
}