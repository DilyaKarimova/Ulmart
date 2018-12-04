package ru.itpark;

import ru.itpark.comparator.NameAscComparator;
import ru.itpark.comparator.PriceAscComparator;
import ru.itpark.domain.Computer;
import ru.itpark.domain.Smartphone;
import ru.itpark.domain.TShirt;
import ru.itpark.repository.ProductRepository;
import ru.itpark.service.ProductService;


public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService(new ProductRepository());

        service.add(new Smartphone(1, "smartphone", "iPhone 8", 40_000, "...", "Apple", "Red"));
        service.add(new Smartphone(2, "smartphone", "Samsung A7", 28_000, "...", "Samsung", "Grey"));
        service.add(new Computer(3, "computer", "Asus ZenBook", 100_000, "...", "Asus", "Blue"));
        service.add(new Computer(4, "computer", "Lenovo  0760", 80_000, "...", "Lenovo", "Black"));
        service.add(new TShirt(5, "TShirt", "Nike", 2_500, "...", 50, "Male"));
        service.add(new TShirt(6, "TShirt", "Zara", 3_999, "...", 34, "Female"));
        service.add(new Smartphone(1, "smartphone", "iPhone 8 Plus", 49_000, "...", "Apple", "Space Grey"));

        System.out.println(service.getSorted(new PriceAscComparator()));
        System.out.println();


        System.out.println(service.findAllByName("iPhone 8").getSorted(new NameAscComparator()));
        System.out.println(service.findAllByCategory("computer").getSorted(new NameAscComparator()));


    }
}

