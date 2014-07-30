import time
dur = int(raw_input("How long should I countdown for? ")) #dur = duration of time the timer will count for
for i in range (dur-1,0,-1):
    for star in range(i):
        print "*",
    print
    time.sleep(.001)
print "BLAST OFF!"
