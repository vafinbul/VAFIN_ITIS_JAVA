package ru.itis;

import com.sun.org.apache.xpath.internal.SourceTree;
import ru.itis.dao.ProductsDao;
import ru.itis.dao.ProductsDaoImpl;
import ru.itis.models.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProductsDao dao = new ProductsDaoImpl();
        List<Product> list = dao.getProductByFactory("Молокозавод 10");
        System.out.println(list);



    }
}
