package com.naren.model;

import com.naren.dto.CustomerDTO;
import com.naren.dto.ItemDTO;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("sales")
public class Sales {
  @Id private ObjectId id;
  private Date saleDate = new Date();
  private List<Item> items;
  private String storeLocation;
  private Customer customer;
  private boolean couponUsed;
  private String purchaseMethod;

  public Sales() {}

  public Sales(
      ObjectId id,
      Date saleDate,
      List<Item> items,
      String storeLocation,
      Customer customer,
      boolean couponUsed,
      String purchaseMethod) {
    this.id = id;
    this.saleDate = saleDate;
    this.items = items;
    this.storeLocation = storeLocation;
    this.customer = customer;
    this.couponUsed = couponUsed;
    this.purchaseMethod = purchaseMethod;
  }

  public Sales(
      String id,
      Date saleDate,
      String storeLocation,
      Boolean couponUsed,
      CustomerDTO customer,
      List<ItemDTO> items) {}

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public Date getSaleDate() {
    return saleDate;
  }

  public void setSaleDate(Date saleDate) {
    this.saleDate = saleDate;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public String getStoreLocation() {
    return storeLocation;
  }

  public void setStoreLocation(String storeLocation) {
    this.storeLocation = storeLocation;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public boolean isCouponUsed() {
    return couponUsed;
  }

  public void setCouponUsed(boolean couponUsed) {
    this.couponUsed = couponUsed;
  }

  public String getPurchaseMethod() {
    return purchaseMethod;
  }

  public void setPurchaseMethod(String purchaseMethod) {
    this.purchaseMethod = purchaseMethod;
  }
}
