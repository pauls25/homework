package io.codelex.oop.summary;

import java.math.BigDecimal;
import java.util.List;

public class Invoice {
    private InvoiceStatus invoiceStatus;
    private final Order order;
    private final List<SellableItem> itemList;
    private final String invoiceNumber;
    private final int totalInvoiceLineLength;

    public Invoice(Order order, String invoiceNumber) throws WrongOrderException {
        this.invoiceStatus = InvoiceStatus.APPROVED;
        this.order = order;
        this.invoiceNumber = invoiceNumber;
        this.itemList = order.getItems();

        if (itemList.isEmpty()) {
            throw new WrongOrderException();
        }
        totalInvoiceLineLength = 51;
    }

    public void send() {
        invoiceStatus = InvoiceStatus.SENT;
    }

    public void toText() {
        //todo finish invoice to string
        int totalLineLength = 51;
        String topLine = "=".repeat(totalLineLength);

        String invoiceNumber = "INVOICE NUMBER: " + getInvoiceNumber();
        String invoiceStatusLine = "STATUS: " + getInvoiceStatus();
        String itemSum = "SUM: " + String.format("%.2f", order.getOrderItemSum());
        String vat = "VAT (" + String.format("%s", order.getVAT().multiply(BigDecimal.valueOf(100.0)).stripTrailingZeros()) + "%) " + order.getOrderVATSum();
        String orderTotal = "TOTAL: " + String.format("%.2f", order.getOrderTotal());

        String bottomLine = "=".repeat(totalLineLength);

        System.out.println(topLine);
        System.out.println(formatInvoiceLines(invoiceNumber));
        System.out.println(formatInvoiceLines(invoiceStatusLine));

        for (int i = 0; i < itemList.size(); i++) {

            String itemLine = (i + 1) + ". " + itemList.get(i).fullInfo();
            System.out.println(formatInvoiceLines(itemLine));
        }

        System.out.println(formatInvoiceLines(itemSum));
        System.out.println(formatInvoiceLines(vat));
        System.out.println(formatInvoiceLines(orderTotal));
        System.out.println(bottomLine);
    }

    private String formatInvoiceLines(String invoiceLine) {
        int invoiceLineLenght = getTotalInvoiceLineLength();
        return "= " + invoiceLine + " ".repeat(invoiceLineLenght - invoiceLine.length() - 3) + "=";
    }

    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }


    private String getInvoiceNumber() {
        return invoiceNumber;
    }

    public int getTotalInvoiceLineLength() {
        return totalInvoiceLineLength;
    }
}
