package domain;

import java.time.LocalDate;

public class Invoice {


  private Buyer buyer;
  private Seller seller;
  private int id;
  private LocalDate date;

  public Buyer getBuyer() {
    return buyer;
  }

  public void setBuyer(Buyer buyer) {
    this.buyer = buyer;
  }

  public Seller getSeller() {
    return seller;
  }

  public void setSeller(Seller seller) {
    this.seller = seller;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Invoice(Buyer buyer, Seller seller, int id, LocalDate date) {
    this.buyer = buyer;
    this.seller = seller;
    this.id = id;
    this.date = date;
  }

  public Invoice() {
  }
}