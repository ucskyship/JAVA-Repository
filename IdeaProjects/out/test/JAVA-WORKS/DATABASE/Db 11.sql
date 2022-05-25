-- USE qacs_ch02;
-- amount spent
-- sale ID
-- customer name
-- date

Select SALE.SaleID, Total AS AmountSpent, FirstName, LastName, SaleDate AS Date
from CUSTOMER, SALE
where CUSTOMER.CustomerID = SALE.CustomerID
ORDER BY AmountSpent DESC;