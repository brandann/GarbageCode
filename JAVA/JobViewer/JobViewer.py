#(c) Brandan Haertel 2014
import sys, datetime, os, time
date_today = datetime.date.today()
def main(job):
  file = open("C:\\Program Files\\JobViewer\\TimeSheetLog.csv", "a")
  file.write(date_today.strftime("%m/%d/%Y,"))
  file.write(time.strftime("%H:%M %p,"))
  file.write(job)
  file.write('\n')
  file.close()

if __name__ == '__main__':
  main(str(sys.argv[1]))
