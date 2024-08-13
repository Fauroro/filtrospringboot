package com.fauroro.filtrospringboot.domain.services.Administration;

public class AdministrationImpl {
}


//
////domain.services
//
//@Service
//public class ProductImpl implements IProduct {
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Autowired
//    private GammaRepository gammaRepository;
//
//    @Override
//    public List<Product> findAll() {
//        return (List<Product>) productRepository.findAll();
//    }
//    @Override
//    public List<Product> findAllWithGamma() {
//        return (List<Product>) productRepository.findAllWithGamma();
//    }
//
//    @Override
//    public List<Product> findByGamma(Gamma gamma){
//        return productRepository.findByGamma(gamma);
//    }
//
//    @Override
//    public List<Product> findByLessStockThan(int maxStock){
//        return productRepository.findByStockLessThan(maxStock);
//    }
//
//    @Override
//    public Optional<Product> findById(String productCode) {
//        return productRepository.findById(productCode);
//    }
//
//    @Override
//    public Product save(Product product, String gammaCode) {
//        Optional<Gamma> optionalGamma = gammaRepository.findById(gammaCode);
//        product.setGamma(optionalGamma.get());
//        return productRepository.save(product);
//    }
//
//    @Override
//    public Optional<Product> update(String productCode, Product updatedProduct, String gammaCode) {
//        Optional<Product> optionalProduct = productRepository.findById(productCode);
//        optionalProduct.ifPresentOrElse(
//                product -> {
//                    product.setName(updatedProduct.getName());
//                    Optional<Gamma> optionalGamma = gammaRepository.findById(gammaCode);
//                    product.setGamma(optionalGamma.get());
//                    product.setStock(updatedProduct.getStock());
//                    product.setPrice(updatedProduct.getPrice());
//                    product.setDescription(updatedProduct.getDescription());
//                    product.setDepth(updatedProduct.getDepth());
//                    product.setHeight(updatedProduct.getHeight());
//                    product.setWidth(updatedProduct.getWidth());
//                    if (updatedProduct.getOrdersDetails() != null) {
//                        product.getOrdersDetails().clear();
//                        if (!updatedProduct.getOrdersDetails().isEmpty()) {
//                            product.getOrdersDetails().addAll(updatedProduct.getOrdersDetails());
//                        }
//                    }
//                    productRepository.save(product);
//                }, () -> {
//                    System.out.println("product not registered");
//                });
//        return optionalProduct;
//    }
//
//    @Override
//    public Optional<Product> delete(String productCode) {
//        Optional<Product> optProduct = productRepository.findById(productCode);
//        if (optProduct.isEmpty()) {
//            return Optional.empty();
//        }
//        productRepository.delete(optProduct.get());
//        return optProduct;
//    }
//}
//
//package com.nasefa.springfinalproject.domain.services.gamma;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.nasefa.springfinalproject.domain.repositories.GammaRepository;
//import com.nasefa.springfinalproject.persistence.entities.Gamma;
//
//@Service
//public class GammaImpl implements IGamma {
//
//    @Autowired
//    private GammaRepository repository;
//
//    @Transactional(readOnly = true)
//    @Override
//    public List<Gamma> findAll() {
//        return (List<Gamma>) repository.findAll();
//    }
//
//    @Transactional(readOnly = true)
//    @Override
//    public Optional<Gamma> findById(String gammaCode) {
//        return repository.findById(gammaCode);
//    }
//
//    @Transactional
//    @Override
//    public Gamma save(Gamma gamma) {
//        return repository.save(gamma);
//    }
//
//    @Transactional
//    @Override
//    public Optional<Gamma> update(String gammaCode, Gamma updatedGamma) {
//        Optional<Gamma> optionalGamma = repository.findById(gammaCode);
//        optionalGamma.ifPresentOrElse(
//                Gamma -> {
//                    Gamma.setName(updatedGamma.getName());
//                    Gamma.setDescription(updatedGamma.getDescription());
//                    if (updatedGamma.getProducts() != null) {
//                        Gamma.getProducts().clear();
//                        if (!updatedGamma.getProducts().isEmpty()) {
//                            Gamma.getProducts().addAll(updatedGamma.getProducts());
//                        }
//                    }
//                    repository.save(Gamma);
//                },
//                () -> {
//                    System.out.println("owo");
//                });
//        return optionalGamma;
//    }
//
//    @Transactional
//    @Override
//    public Optional<Gamma> delete(String gammaCode) {
//        Optional<Gamma> optionalGamma = repository.findById(gammaCode);
//        optionalGamma.ifPresentOrElse(
//                Gamma -> {
//                    repository.delete(optionalGamma.get());
//                    ;
//                },
//                () -> {
//                    System.out.println("Gamma not registered");
//                });
//        return optionalGamma;
//    }
//
//    @Override
//    public List<Gamma> findAllWithProducts(String gammaCode) {
//        return repository.findAllWithProducts(gammaCode);
//    }
//}
