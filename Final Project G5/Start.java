import java.lang.*;
import Classes.*;
import Interfaces.*;
import FileReadWrite.*;
import java.util.*;
import java.util.Calendar; 
class Start										//Main Class Holding the main method
{
	public static void main(String[] args)		//Main Method
	{	
		System.out.println("*****Welcome to Our Parking Lot***** ");
		System.out.println("-------------------------------------- ");
		Scanner sc = new Scanner(System.in);
		boolean repeat = true;
		Management mt = new Management();	//Creates a new management object
		Calendar calndr = Calendar.getInstance();
		FileReadWrite frw= new FileReadWrite();
		
		//Creating new vehicle objects
		Vehicle v1 = new Vehicle("Car", "BMW", "1111" , "101");
		Vehicle v2 = new Vehicle("Bike", "R15", "2222" , "102");
		Vehicle v3 = new Vehicle("Truck", "Mahendra", "3333", "103");
	    
		mt.insertVehicle1(v1);	//using insertVehicle1 method to insert the vehicle objects
		mt.insertVehicle1(v2);
		mt.insertVehicle1(v3);
		
		Records records[] = new Records[500];
			
		//Creating instances of records
		Records r1 = new Records("Simon", "20202021", "Car", "BMW", "1111" , "101" ,"Thu Sep 17 22:45:11 BDT 2020");
		Records r2 = new Records("Sherlock", "1234521", "Bike", "R15", "2222" , "102", "Thu Sep 10 10:45:11 BDT 2020");
		Records r3 = new Records("Robert", "20213031", "Truck", "Mahendra", "3333" , "103", "Thu Sep 24 12:45:11 BDT 2020");
		
		records[0] = r1;
		records[1] = r2;
		records[2] = r3;
		
		
		do
		{
			System.out.println("///Choose an option:/// \n");
			System.out.println("	1. Manager");
			System.out.println("	2. Take your Vehicle");
			System.out.println("	3. Exit\n");
			
			System.out.print("Your option : ");
			int option1 = sc.nextInt();				//takes user input for displaying options
			
			switch(option1)
			{
				case 1:
				
					System.out.println("You have selected Manager");
					System.out.println("Select any Option\n");
					System.out.println("	1.Registration");
					System.out.println("	2.LogIn");
					System.out.println("	3. Go Back\n");
						
					System.out.print("Your Option :");
					int option2 = sc.nextInt();			//takes user input for displaying options
						
					switch(option2)
					{
						case 1:
						
							System.out.println("You have selected Registrstion as a Manager.");
							System.out.print("Manager's User Name :");
							String userName = sc.next();
							System.out.print("Manager's Id :");
							String Id = sc.next();
							System.out.print("Password :");
							String pass = sc.next();
							System.out.print("Confirm Password :");
							String conPass = sc.next();
							System.out.println(" ");
							
							if(pass.equals(conPass))
							{
								Manager m = new Manager();				//creates a new Manager obj
								m.setManagerName(userName);
								m.setManagerId(Id);
								m.setPass(pass);
							
								mt.insertManager(m);				//calling insertManager method from Management class
							}
							else
							{
							do{
								System.out.println("Password didn't match.Try again \n");
								System.out.print("Password :");
								pass = sc.next();
								System.out.print("Confirm Password :");
								conPass = sc.next();
								System.out.println(" ");
								System.out.println(" ");
								}
							while(!pass.equals(conPass));
								
								Manager m = new Manager();
								m.setManagerName(userName);
								m.setManagerId(Id);
								m.setPass(pass);
							
								mt.insertManager(m);
							}
							
							System.out.println("Your Registration is Successful");
							System.out.println(" ");
							break;
						
						case 2:						//Login Option
						
							System.out.println("You have selected Login");
							
							System.out.print("Enter Manager Id: ");
							String Id2 = sc.next();
							
							System.out.print("Password :");
							String pass2 = sc.next();
							
							mt.getManager(Id2 , pass2); //To compare Manager ID and Password
														
							System.out.println("*****How Can I Help You?****\n**What do you want?**\n");
							System.out.println("	1.Manage Vehicle");
							System.out.println("	2.Check records of Vehicls");
							System.out.println("	3.Search for Vehicles");
							System.out.println("	4.Go back\n");
							
							System.out.print("Your Option :");
							int option3 = sc.nextInt();					////takes user input for displaying options
							
							switch(option3)
							{
								case 1:
									
									System.out.println("You have selected Manage Vehicles.");
									System.out.println("Select any Option\n");
									System.out.println("	1.Add Vehicles");
									System.out.println("	2.Remove Vehicles");
									System.out.println("	3.Go Back");
									
									System.out.print("Your Option :");
									int option4 = sc.nextInt();
									
									switch(option4)
									{
										case 1:
										
											System.out.println("You have selected Add Vehicles\n");
											
											System.out.print("Enter Vehicle type  : ");
											String VTypeName = sc.next();
											System.out.print("Enter Vehicle model name : ");
											String Model = sc.next();
											System.out.print("Enter NumberPlate name : ");
											String NumberPlate = sc.next();
											System.out.print("Enter Ticket No : ");
											String TicketNo = sc.next();
											
											Vehicle v = new Vehicle(VTypeName, Model, NumberPlate, TicketNo);		//Creates new Vehicle object
							
											mt.insertVehicle2(v);
											break;			//Breaks the statements
											
										case 2:
										
											System.out.println("You have selected remove Vehicle \n");
											
											System.out.print("Enter Vehicle type  : ");
											String VTypeName2 = sc.next();
											System.out.print("Enter Vehicle model name : ");
											String Model2 = sc.next();
											System.out.print("Enter NumberPlate name : ");
											String NumberPlate2 = sc.next();
											System.out.print("Enter Ticket No : ");
											String TicketNo2 = sc.next();
											
											mt.removeVehicle(mt.getVehicle(VTypeName2, Model2, NumberPlate2, TicketNo2)); //Calling the removebVehicle method from Management class
											break;			//Breaks the statements
											
										case 3:
										
											System.out.println("You have Selected to Go Back");
											break;			//Breaks the statements
											
										default:
				
											System.out.println("Your Input Is Invalid");
											break;			//Breaks the statements
									}
									break;
									
								case 2:
								
									System.out.println("You have selected Check records of parked Vehicle");
									
									int flag=0;
									for(int i=0; i<records.length; i++)
									{
										if(records[i] != null)
										{
											System.out.println("-------------------------------------------------");
											System.out.println("Name :"+records[i].getOwnerName());							//Getting the return values of the method getOwnerName to print it to the console			
											System.out.println("Id :"+records[i].getOwnerId());								//Getting the return values of the method getOwnerId to print it to the console
											System.out.println("Vehicle Type  :"+records[i].getVehicleType());					//Getting the return values of the method getVehicleType to print it to the console
											System.out.println("Vehicle Model :"+records[i].getVehicleModel());		//Getting the return values of the method getVehicleModel to print it to the console
											System.out.println("NumberPlate No :"+records[i].getVehicleNumberPlate());		//Getting the return values of the method getVehicleNumberPlate to print it to the console
											System.out.println("TicketNo :"+records[i].getVehicleTicketNo());				//Getting the return values of the method getVehicleTicketNo to print it to the console
										    System.out.println("--------------------------------------------------");					
											System.out.println(" ");
											flag=1;
										}
										else
										{
											break;			//Breaks the statements
										}
									}
									if(flag == 0)
									{
										System.out.println("There are no records.");
									}
									break;			//Breaks the statements
								
								case 3:
								
									System.out.println("You have search for Vehicle\n");
									
									System.out.print("Enter your Vehicle type : ");
									String VTypeName2 = sc.next();							//taking user input for Vehicle Type 
									System.out.print("Enter Model name : ");
									String Model2 = sc.next();					//taking user input Model name
									System.out.print("Enter NumberPlate No : ");
									String NumberPlate2 = sc.next();				//taking user input for NumberPlate No 
									System.out.print("Enter Ticket No : ");   
									String TicketNo2 = sc.next();   //taking user input for TicketNo No
									
									mt.getVehicle(VTypeName2, Model2, NumberPlate2, TicketNo2); 		//returns the specified Vehicle
									
									break;			//Breaks the statements
									
								case 4:
								
									System.out.println("You have Selected to Go Back");
									break;			//Breaks the statements
									
								default:
				
									System.out.println("Your Input Is Invalid");
									break;			//Breaks the statements
							}
							break;
							
						case 3:
						
							System.out.println("You have Selected to Go Back");
									break;			//Breaks the statements
									
								default:
				
									System.out.println("Your Input Is Invalid ");
									break;			//Breaks the statements
					}
					break;
				
				case 2:
					
					System.out.println("You have selected To Take Your Vehicle");
					
					System.out.println("Select any Option\n");
					System.out.println("	1.Registration for Taking Your Vehicle");
					System.out.println("	2.Go BAck");
					
					System.out.print("Your Option :");
					int option5 = sc.nextInt();					//taking Owner input
					
					switch(option5)
					{
						case 1:
						
							System.out.println("You have selected Registration for Taking Your Vehicle. Please provide the following information");
							System.out.print("Owner/Your Name :");
							String OName = sc.next();
							System.out.print("Owner/Your NID No :");
							String Oid = sc.next();
							System.out.print("Enter vehicle type : ");
							String VehicleType = sc.next();
							System.out.print("Enter the Model of your vehicle : ");
							String Model = sc.next();
							System.out.print("Enter Your Vehicle NumberPlate No : ");
							String NumberPlate = sc.next();
							System.out.print("Enter Your Entering Ticket No : ");
							String TicketNo = sc.next();
							
							Date c1 = calndr.getTime();				//To get the present date
							
							if(mt.getVehicle(VehicleType , Model , NumberPlate , TicketNo ) != null) 			
							{
								Records r4 = new Records(OName , Oid , VehicleType , Model , NumberPlate , TicketNo , c1.toString());
							
							
								int flag = 0;
								for(int i=0; i<records.length; i++)
								{
									if(records[i] == null)
									{
										records[i] = r4;			//Stores the Records type object into records array
										flag = 1;
										break; 			//Breaks the statements
									}
								}
								if(flag == 1)
								{
									System.out.println("Owner's information is Inserted. Let Him/Her Go\n");
								}
								else
								{
									System.out.println("Owner's information can Not Insert. Dont Let Him/Her Go\n");				//Error message
								}
								
								
								System.out.println("----------------------");
		                        frw.writeInFile(" "+OName+Oid+VehicleType+Model+NumberPlate+TicketNo+c1);	//calling writeInFile method to write in the file
		                        frw.readFromFile();   //calling readFromFile method to read from the the file
									
								break; 			//Breaks the statements
							}
							break; 			//Breaks the statements
							
						case 2:

							System.out.println("You have Selected to Go Back");
							break;			//Breaks the statements
							
						default:
				
							System.out.println("Your Input Is Invalid ");
							break;			//Breaks the statements
					}
					break;
					
				case 3:
				
					System.out.println("|||||||||||You have selected to exit the Our Parking Lot|||||||||||");
					System.out.println("////////////////////////////////////////////////");
					System.out.println("//////Thank you for using Our Parking lot//////");
					System.out.println("//////Have a Safe Journey. Take Care //////");
					System.out.println("////////////////////////////////////////////////");
					repeat = false;
					break;			//Breaks the statements
					
				default:
				
					System.out.println("Your Input Is Invalid");	
					break;			//Breaks the statements
			}
			
			
		}
		while(repeat);			//Repeats the loop until repeat == false
    }
}
