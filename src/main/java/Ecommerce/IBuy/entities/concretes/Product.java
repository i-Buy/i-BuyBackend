package Ecommerce.IBuy.entities.concretes;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private int id;

    //@Column(name="category_id")
    //private int categoryId; // category numarası

    @Column(name="product_name")
    private String productName; // ürün ismi

    @Column(name="unit_price")
    private double unitPrice; // birim fiyatı

    @Column(name="units_in_stock")
    private short unitsInStock; //Stoktaki birim

    @Column(name="quantity_per_unit")
    private String quantityPerUnit; // bir birimde kaç tane var 6 lı kola da kac tane var gibi

    //İlişkisi olan tabloyla kodladık
    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;






}
