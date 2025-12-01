package Classes;
import java.lang.*;
import Interfaces.*;
public class Records extends Vehicle
{
//to inherit from a class, use the extends keyword
 
 
		private String OName;
		private String Oid;
		private String Date;
	
		public Records()
		{
			
		}
		public Records(String OName, String Oid, String VTypeName, String Model, String NumberPlate, String TicketNo, String issueDate)
		{
			super(VTypeName, Model, NumberPlate, TicketNo);        //super keyword used to the class being inherited from
			this.OName = OName;
			this.Oid = Oid;
			this.Date = Date;
			//this.lastDate = lastDate;
			
		}
		
		public void setOwnerName(String OName)            //take name by the set method
		{
			this.OName = OName;                      //use this keyword
		}
		public void setOwnerId(String Oid)              //take id by the set method
		{
			this.Oid = Oid;                          //use this keyword
		}
		public void setVehicleType(String VTypeName)     // take VTypeName  by the set method
		{
			this.VTypeName = VTypeName;                     //use this keyword
		}
		public void setVehicleModel(String Model)  //take Model name by the set method
		{
			this.Model = Model;            //use this keyword
		}
		public void setVehicleNumberPlate(String NumberPlate)  //take NumberPlate by the set method
		{
			this.NumberPlate = NumberPlate;        //use this keyword
		}
		public void setVehicleTicketNo(String TicketNo)        //take TicketNo by the set method
		{
			this.TicketNo = TicketNo;                  //use this keyword
		}
		public void setDate(String Date)        //by using set method ,taken Date
		{
			this.Date = Date;                  //use this keyword
		}
		
		
		
	public String getOwnerName()
	{
		return OName;
	}             		//use get method and return type to take OwnerName
	public String getOwnerId()
	{
		return Oid;
	}						//use get method and return type to take OwnerId
	public String getVehicleType()
	{
		return VTypeName;
	}				//use get method and return type to take Vehicle Type 
	public String getVehicleModel()
	{
		return Model;
	}		//use get method and return type to take Model
	public String getVehicleNumberPlate()
	{
		return NumberPlate;
	}	//use get method and return type to take NumberPlate No
	public String getVehicleTicketNo()
	{
		return TicketNo;
	}			//use get method and return type to take TicketNo
	public String getDate()
	{
		return Date;
	}			//use get method and return type to take Date
}