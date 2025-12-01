package Classes;
import java.lang.*;
import Interfaces.*;
public class Vehicle
{
	protected String VTypeName;
	protected String Model;
	protected String NumberPlate;
	protected String TicketNo;
	
	public Vehicle()
	{
		
	}
	public Vehicle(String VTypeName, String Model, String NumberPlate, String TicketNo)
	{
		this.VTypeName = VTypeName;                          //this keyword references the class attribute VTypeName 
		this.Model = Model;              // this keyword references to the class attribute Model.
		this.NumberPlate =NumberPlate; //this keyword references the class attribute NumberPlate
        this.TicketNo=TicketNo;		//this keyword references the class attribute ticketNo
	}
	
	//using set mathod to set the values.
	public void setVType(String VTypeName)
	{
		this.VTypeName = VTypeName;
	}                              //using set mathod to set the values.
	public void setModel(String Model)
	{
		this.Model = Model;
	}      
	public void setNumberPlate(String NumberPlate)
	{
		this.NumberPlate = NumberPlate;
	}
	public void setTicketNo(String TicketNo)
	{
		this.TicketNo = TicketNo;
	}
	
	

	//using get method to return the variable value
	public String getVType()
	{
		return VTypeName;
	}                                 
	public String getModel()
	{
		return Model;
	}                     
	public String getNumberPlate()
	{
		return NumberPlate;
	} 
    public String getTicketNo()
	{
		return TicketNo;
	} 	
}