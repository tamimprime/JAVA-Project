package Classes;
import java.lang.*;
import Interfaces.*;
import java.util.*;
public class Management implements IManagerOperation,IVehicleOperation
{
	  /* This class must have to implement both the abstract methods
    * else we will get compilation error
    */ 
	
	private Manager managers[] = new Manager [50];
	private Vehicle vehicles[] = new Vehicle[500];
	Scanner sc = new Scanner(System.in);                       //scanner used for get inputs.
	
	
	public void insertManager(Manager m)
	{
		int flag = 0;
		for(int i=0; i<managers.length; i++)
		{
			if(managers[i] == null)
			{
				managers[i] = m;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("|||Manager's information is Inserted|||\n");
		}
		else
		{
			System.out.println("|||Manager's information can Not Insert|||\n");
		}
	}
	
	
	public Manager getManager(String Id2 , String pass2)
	{
		Manager m = null;
		int flag = 0;
		
		for(int i=0; i<managers.length; i++)
		{
			for(int j=0; j<managers.length; j++)
			{
				if(managers[j] != null)
				{
					if(managers[j].getManagerId().equals(Id2) && managers[j].getPass().equals(pass2))
					{
						m = managers[i];
						flag = 1;
						break;
					}
				}
			}
			if(flag == 1)
			{
				System.out.println("|||You are logged in.|||\n");
				break;
			}
			if(flag == 0)
			{
				System.out.println("|||Your Id or password is wrong.|||\n");

				System.out.print("Enter Manager's Id: ");
				Id2 = sc.next();
							
				System.out.print("Password :");
				pass2 = sc.next();
			}
		}
		return m;
	}
	
	public void insertVehicle1(Vehicle v)
	{
		for(int i=0; i<vehicles.length; i++)
		{
			if(vehicles[i] == null)
			{
				vehicles[i] = v;
				break;
			}
		}
	}
	
	
	public void insertVehicle2(Vehicle v)
	{
		int flag = 0;
		for(int i=0; i<vehicles.length; i++)
		{
			if(vehicles[i] == null)
			{
				vehicles[i] = v;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("|||Vehicle's information is Inserted|||\n");
		}
		else
		{
			System.out.println("|||Vehicle's information can Not Insert|||\n");
		}
	}
	
	public Vehicle getVehicle(String VTypeName2 , String Model2 , String NumberPlate2 , String TicketNo2)
	{
		Vehicle v = null;
		
		for(int i=0; i<vehicles.length; i++)
		{
			if(vehicles[i] != null)
			{
				if(vehicles[i].getVType().equals(VTypeName2) && vehicles[i].getModel().equals(Model2) && vehicles[i].getNumberPlate().equals(NumberPlate2) && vehicles[i].getTicketNo().equals(TicketNo2));
				{
					v = vehicles[i];
					break;
				}
			}
		}
		if(v != null)
		{
			System.out.println("|||Vehicle Found|||");
		}
		else
		{
			System.out.println("|||Vehicle Not Found|||");
		}
		return v;
	}
	
	public void removeVehicle(Vehicle v)
	{
		int flag = 0;
		for(int i=0; i<vehicles.length; i++)
		{
			if(v != null && vehicles[i] == v)
			{
				vehicles[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("|||Vehicle Removed|||");
		}
		else
		{
			System.out.println("|||Vehicle can Not Removed|||");
		}
	}
}