package com.micropos.order.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orderitems")
@Data
@Accessors(fluent = true, chain = true)
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Column(name="order_id")
    @Getter
    @Setter
    private Integer orderId;

    @Column(name = "product_id")
    @Getter
    @Setter
    private String productId;

    @Column(name = "product_name")
    @Getter
    @Setter
    private String productName;

    @Column(name = "unit_price")
    @Getter
    @Setter
    private double unitPrice;

    @Column(name = "quantity")
    @Getter
    @Setter
    private int quantity;
}
