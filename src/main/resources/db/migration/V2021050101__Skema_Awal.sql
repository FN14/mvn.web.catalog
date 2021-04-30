/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  FN14
 * Created: May 1, 2021
 */

create table product(
    product_id varchar(36),
    product_code varchar(50) NOT NULL,
    product_name varchar(100) NOT NULL,
    PRIMARY KEY(product_id),
    UNIQUE (product_code)
);