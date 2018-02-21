package persistence;

import domain.Invoice;
import java.util.List;

import java.util.List;

public interface Database {

  void saveInvoice(Invoice invoice);

  List<Invoice> getInvoices();

  Invoice getInvoiceById(int id);

  void updateInvoice(Invoice invoice);

  void removeInvoice(Invoice invoice);
}