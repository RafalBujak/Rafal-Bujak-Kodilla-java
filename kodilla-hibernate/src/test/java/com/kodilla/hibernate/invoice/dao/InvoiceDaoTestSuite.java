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
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //GIVEN
        Product apple = new Product("apple");
        Item item1 = new Item(new BigDecimal(230.00), 200, new BigDecimal(46000));
        Item item2 = new Item(new BigDecimal(230.00), 100, new BigDecimal(23000));
        Invoice invoice = new Invoice("123");
        apple.getItems().add(item1);
        apple.getItems().add(item2);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setProduct(apple);
        item2.setProduct(apple);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //WHEN
        invoiceDao.save(invoice);
        Invoice vInvoice = invoiceDao.findOne(invoice.getId());
        List<Item> item = vInvoice.getItems();
        System.out.println(item.iterator().next().getProduct().getItems());

        //THEN
        Assert.assertEquals("apple",  item.iterator().next().getProduct().getName());
        Assert.assertEquals(200, item.iterator().next().getQuantity());
        //CLEAN UP
        invoiceDao.delete(invoice);
    }

}
