package entity;
import room.*;
/**
 * Defines all the entities
 * @author user
 *
 */
public abstract class Entity {
	// Where the entity currently is
	protected Room currentRoom;	
	
	// Methods
	/**
	 * Allows the entity to move
	 * @param next	The next area she wants to go 
	 * @return True if she moved
	 */
	public boolean move(Room next){
		if (next!=null){currentRoom=next;return true;}
		else{return false;}
	}
	
	// Getters
	public int getType(){return 1;}
	public Room getCurrentRoom(){return currentRoom;}
	
	// Equals override
	@Override
	public boolean equals(Object obj){
		if (this==obj){return true;}
		else if (obj instanceof Entity){
			Entity tmp=(Entity)obj;
			if (this.getCurrentRoom()==tmp.getCurrentRoom()){return true;}
		}
		return false;
	}
}
