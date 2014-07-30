namelist = []
print "Enter 5 names (press enter key after each name):"
for i in range(5):
    name = raw_input()
    namelist.append(name)
namelist2 = namelist [:]
namelistsort = namelist2.sort ()
print "The names are:", namelist
print "The names sorted are:", namelist2
print "The third name is:", namelist [2]

replace = int(raw_input("Replace one name, which one? (1-5): "))
new = raw_input("New Name: ")
namelist2[replace - 1] = new
print "The names are:", namelist2
