def calctax(price, tax_rate):
    total = price + (price * tax_rate)
    print my_price
    return total

my_price = float(raw_input ("Enter a price: "))

totalprice = calctax(my_price, 0.06)
print "price = ", my_price, "Total price = ", totalprice
