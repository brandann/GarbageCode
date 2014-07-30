package javagame;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{

	public String mouse = "No input yet!";
	Image squirtle;
	int xpos = 200;
	int ypos = 100;
	int dist = 1;
	
    public Menu(int state){
        
    }
    
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) 
            throws SlickException {
        squirtle = new Image("res/007Squirtle.png");
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) 
            throws SlickException {
    	g.drawString("This is the MENU state", 50, 50);
    	g.fillOval(75,100,100,100);
    	g.drawString("Play Now!", 80, 70);
    	
    	//g.drawImage(squirtle, xpos, ypos);
    	
    	//g.drawString(mouse, 50, 25);
        //g.drawString("Are you ready to blast some ham!?!?", 50, 50);
        //g.drawRect(50, 100, 60, 120); //x,y,w,h
        //g.drawOval(200,130,130,80); //x,y,w,h
        //Image squirtle = new Image("res/007Squirtle.png");
        //g.drawImage(squirtle, 200, 130);
    }
    
    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) 
            throws SlickException {
    	Input input = gc.getInput();
    	int xposition = Mouse.getX();
    	int yposition = Mouse.getY();
    	if((xposition>75 && xposition<175) && (yposition>160 && yposition<260)){
    		//this runs then they are inside the circle
    		if(input.isMouseButtonDown(0)){
    			sbg.enterState(1);
    		}
    	}
    	/*
        Input input = gc.getInput();
        if(input.isKeyDown(Input.KEY_UP)) ypos -= dist;
        if(input.isKeyDown(Input.KEY_DOWN)) ypos += dist;
        if(input.isKeyDown(Input.KEY_RIGHT)) xpos += dist;
        if(input.isKeyDown(Input.KEY_LEFT)) xpos -= dist;
    	*/
    	//int xpos = Mouse.getX();
        //int ypos = Mouse.getY();
        //mouse = "Mouse position x: " + xpos + " y: " + ypos; 
    }
    
    @Override
    public int getID() {
        return 0;
    }
}
