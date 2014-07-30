import pygame, sys, random

skier_images = ["skier_down.png", "skier_right1.png", "skier_right2.png", "skier_left2.png", "skier_left1"]

class Skierclass(pygame.sprite.Sprite):                    #
    def _init_(self):                                      #
        pygame.sprite.Spirte._init_(self)                  #
        self.image = pygame.image.load("skier_down.png")   # Creates Skier
        self.rect = self.image.load("skier_down.png")      #
        self.rect.center = [320, 100]                      #
        self.angle = 0                                     #
    def turn(self, direction):                  #
        
