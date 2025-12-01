package Classes;           //package used to group related classes.
import java.lang.*;
import Interfaces.*;
public class Manager
{
	private String name;
	private String Id;
	private String pass;
	
	//using set method and this keyword
	public void setManagerName(String name)
	{
		this.name = name;
	}           
	public void setManagerId(String Id)
	{
		this.Id = Id;
	}           
	public void setPass(String pass)
	{
		this.pass = pass;
	}          
	
	//using get method to return the variable value
	public String getName()
	{
		return name;
	}                         
	public String getManagerId()
	{
		return Id;
	}                         
	public String getPass()
	{
		return pass;
	}                         
}