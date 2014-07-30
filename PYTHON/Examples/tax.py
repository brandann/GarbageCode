def calctax(price, taxrate):
    taxtotal = price + (price * taxrate)
    return taxtotal

myprice = float(raw_input("Enter a price: "))

totalprice = calctax(myprice, .06)
print "price =", myprice, " Total price = ", totalprice
