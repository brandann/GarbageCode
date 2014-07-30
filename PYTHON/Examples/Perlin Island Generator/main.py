###########  Island Generator  ############
###########################################
###########################################
## Created by Christopher Breinholt      ##
## Breiny Games (c) 2011                 ##
## http://breinygames.blogspot.com/      ##
##                                       ##
## To Use: Run the main.py file.         ##
## Press spacebar to generate a new      ##
## Island.                               ##
###########################################
###########################################





import cProfile
import pygame
import map
from perlin_noise import *
from island_generator import *



def main():

    pygame.init()
    pygame.display.set_caption("Perlin Noise Terrain Generator")

    resolution = (400, 320)
    
    FPS = 60
    clock = pygame.time.Clock()

    screen = pygame.display.set_mode(resolution)

    noise_w = 100
    noise_h = 80
    noise_f = 1
    noise_o = 16

    world = map.Map('Island', IslandGenerator().generate_island(noise_w,
                                                                noise_h,
                                                                noise_f,
                                                                noise_o))
    
    #IslandGenerator().generate_island(noise_w, noise_h, noise_f, noise_o)
    #is the function that generates the random "island" style map in the
    #form of a 2d array, map.Map() is a class that just stores that 2d array
    #and can hold other information about the map, such as type. That way if
    #I add another kind of map generator (dungeons?), I can use the same map
    #class to store them. It could also store multiple 2d arrays ("maps") like
    #a world would. So for a game you could have several 2d arrays all generated
    #from this and other generators so you can have forrests, mountains, island,
    #dungeons, etc all stored in a single "world".

    running = True
    while running:

        clock.tick(FPS)

        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
            elif event.type == pygame.KEYDOWN:
                if event.key == pygame.K_ESCAPE:
                    running = False
                elif event.key == pygame.K_SPACE:
                    world.map = IslandGenerator().generate_island(noise_w,
                                                                  noise_h,
                                                                  noise_f,
                                                                  noise_o)
                    world.draw_minimap()


        screen.blit(world.minimap, (0,0))
        pygame.display.flip()






if __name__ == "__main__":
    main()
    #cProfile.run("main()")
    pygame.quit()
