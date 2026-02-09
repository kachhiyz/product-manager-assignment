/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productmanagerassignment;

/**
 *
 * @author Zeel
 */
public class ProductManager {
    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    public double calculateDiscount(double price, double discountRate) {
        return price - (price * discountRate);
    }
}
