package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDAO {
    void insert(Seller dp);
    void update(Seller dp);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
