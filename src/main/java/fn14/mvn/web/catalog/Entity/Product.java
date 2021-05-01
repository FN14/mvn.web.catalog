/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fn14.mvn.web.catalog.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author FN14
 */
@Entity @Data
public class Product {
    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name="product_id")
    private String productId;
    
    @NotNull @NotEmpty
    @Column(name="product_code")
    private String productCode;
    
    @NotNull @NotEmpty
    @Column(name="product_name")
    private String productName; 
}
