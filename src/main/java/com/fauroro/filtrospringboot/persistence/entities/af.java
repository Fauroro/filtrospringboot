package com.fauroro.filtrospringboot.persistence.entities;

public class af {
}

//
//@Entity
//@Table(name = "orders_details")
//public class OrdersDetail {
//
//    @EmbeddedId
//    private OrdersDetailId id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId("orderCode")
//    @JsonIgnore
//    @JoinColumn(name = "order_code")
//    private Order order;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId("productCode")
//    @JsonIgnore
//    @JoinColumn(name = "product_code")
//    private Product product;
//
//    private int quantity;
//    private double price;
//
//


//package com.nasefa.springfinalproject.persistence.entities;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Embeddable;
//
//@Embeddable
//public class OrdersDetailId {
//    @Column(name = "order_code")
//    private String orderCode;
//
//    @Column(name = "product_code")
//    private String productCode;
//
//    public OrdersDetailId() {}
//
//    public OrdersDetailId(String orderCode, String productCode) {
//        this.orderCode = orderCode;
//        this.productCode = productCode;
//    }
//
//    public String getOrderCode() {
//        return orderCode;
//    }
//
//    public void setOrderCode(String orderCode) {
//        this.orderCode = orderCode;
//    }
//
//    public String getProductCode() {
//        return productCode;
//    }
//
//    public void setProductCode(String productCode) {
//        this.productCode = productCode;
//    }
//}





//
//package com.nasefa.springfinalproject.persistence.entities;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//// import com.fasterxml.jackson.annotation.JsonManagedReference;
//
//import com.nasefa.springfinalproject.persistence.entities.product.Product;
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "gammas")
//public class Gamma {
//
//    @Id
//    @JoinColumn(name="gamma_code")
//    private String gammaCode;
//
//    private String name;
//
//    private String description;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gamma", orphanRemoval = true)
//    @JsonIgnore
//    private List<Product> products;
//
//    public Gamma() {
//        products = new ArrayList<>();
//    }
//
//    public Gamma(String gammaCode, String name, String description, List<Product> products) {
//        this.gammaCode = gammaCode;
//        this.name = name;
//        this.description = description;
//        this.products = products;
//    }
//
//    public String getGammaCode() {
//        return gammaCode;
//    }
//
//    public void setGammaCode(String gammaCode) {
//        this.gammaCode = gammaCode;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public List<Product> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }
//
//    @Override
//    public String toString() {
//        return "Gamma [gammaCode=" + gammaCode + ", name=" + name + ", description=" + description + ", products="
//                + products + "]";
//    }
//
//
//
//}
