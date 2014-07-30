class Point:
	'Represents a point in two-dimensional geometric coordinates'
	def __init__(self, x=1, y=3):
		'''Initilies the position of...'''
		self.move(x, y)
	def move(self, x, y):
		"Move the point to a new location in 2D space."
		self.x = x
		self.y = y
	def reset(self):
		"""Resets the points to 0,0"""
		self.move(0, 0)
p = Point(3,1)
again = True
while(again):
	print(p.x, p.y)
	p.move(p.x+1, p.y-3)
	if p.x > 100:
		again = False
a = raw_input("Press Return Key To Exit...")
