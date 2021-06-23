##### Delete dead code
- 1 delete LineItem& OrderRecept useless code
- 2 delete OrderRecipt useless annotation

##### Naming
- 1 rename LineItem magic char p -> price
- 2 rename OrderReceipt magic variable o -> order
- 3 Use abbreviations: rename OrderReceipt totSalesTx -> totalSalesTax
- 4 Use abbreviations: rename OrderReceipt tot -> totalAmount

##### Extract magic number/string
- 1 extract OrderReceipt string

```.10 -> double sales_tax_rate_10_percent = .10;```

- 2 extract OrderReceipt constant

```
"Sales Tax" -> String sales_tax_printer = "Sales Tax";
"Total Amount" -> String total_amount_printer = "Total Amount";
'\t' -> char spacing = '\t';
'\n' -> char line_break = '\n';
```
- 3 

##### Idea tip - variable field type
- 1 fix the LineItem field to final type
- 2 fix the OrderReceipt field to final type

##### Extract method
- 1 extract method generateLineItemList in OrderReceipt
- 2 extract method appendCustomerInfo in OrderReceipt
- 3 extract method appendOrderItems in OrderReceipt
- 4 extract method appendTaxAndTotalAmount in OrderReceipt
- 5 extract getSalesTax method from OrderReceipt to LineItem

##### Extract Class
- 1 introduce parameter object Customer
- 2 introduce field Customer
- 3 inline field Customer
