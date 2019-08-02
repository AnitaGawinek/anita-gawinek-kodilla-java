package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        // Given
        Product product = new Product("Oatmeal");
        Product product2 = new Product("Coconut milk");
        Product product3 = new Product("Peanuts");

        Item item = new Item(product, new BigDecimal(2.99), 5, new BigDecimal(0.5));
        Item item2 = new Item(product2, new BigDecimal(6.99), 10, new BigDecimal(0.250));
        Item item3 = new Item(product3, new BigDecimal(12.99), 2, new BigDecimal(1.0));

        Invoice invoice = new Invoice("Inv_7/2019");

        product.getItems().add(item);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);


        // When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        // Then
        Assert.assertNotEquals(0, invoiceId);

        // CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
