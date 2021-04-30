/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fn14.mvn.web.catalog.Dao;

import fn14.mvn.web.catalog.Entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author FN14
 */
public interface ProductDao extends PagingAndSortingRepository<Product,String> {
    
}
