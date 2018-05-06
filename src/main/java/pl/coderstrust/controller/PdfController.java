package pl.coderstrust.controller;


import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.coderstrust.processing.InvoiceBook;
import pl.coderstrust.processing.PdfService;

import java.io.FileNotFoundException;

@RestController
public class PdfController {

    @Autowired
    private InvoiceBook invoices;


    @RequestMapping(value = "/InvoiceToPdf" , method = RequestMethod.GET)
    public String savePdf(@RequestParam Integer id) throws FileNotFoundException, DocumentException {
        PdfService service = new PdfService();
        String path = service.savePdf(invoices.getInvoiceById(id));
        return "File saved in: " + path;
    }

}
