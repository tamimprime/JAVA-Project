package Interfaces;					//package used to group related classes.
import Classes.*;
public interface IVehicleOperation
{
	 /* All the methods are public abstract by default
    * As you see they have no body
    */
	
	void insertVehicle1();
	void insertVehicle2();
	void removeVehicle();
	Vehicle getVehicle();
}