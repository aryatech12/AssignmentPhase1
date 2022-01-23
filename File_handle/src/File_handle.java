
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class File_handle{

	public static void main(String[] args) {
		 Scanner strInput = new Scanner(System.in);
	        String choice,cont = "y";        
	        
	        while( cont.equalsIgnoreCase("y") ) {        	
	        	   System.out.println("\t\t Employee Information System\n\n");
	        
		        System.out.println("1 ===> Add New Employee Record ");
		        System.out.println("2 ===> View All Employee Record ");	
		        System.out.println("3 ===> Delete Employee Record ");
		        System.out.println("4 ===> Search Specific Record ");
		        System.out.println("5 ===> Update Specific Record ");	        
		    
		        System.out.print("\n\n");
		        System.out.println("Enter your choice: ");
		        choice = strInput.nextLine();
		        
		        if( choice.equals("1") ) {
		        		try {
							AddRecord();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		        } else if( choice.equals("2") ) {
		        		ViewAllRecord();
		        } else if( choice.equals("3") ) {
		        		updateRecordbyID();
		        }	else if( choice.equals("4") ) {
		        		SearchRecordbyID();
		        }	else if( choice.equals("5") ) {
		        		updateRecordbyID();
		        }	
			        	
		        System.out.println("Do you want to continue? Y/N");
		        cont = strInput.nextLine();
		       	
	        }

	}
	
	  private static void ViewAllRecord() {
		// TODO Auto-generated method stub
		
	}

	private static void SearchRecordbyID() {
		// TODO Auto-generated method stub
		
	}

	private static void updateRecordbyID() {
		// TODO Auto-generated method stub
		
	}

	public static void AddRecord() throws IOException {
  		
  		BufferedWriter bw = new BufferedWriter( new FileWriter("records.txt",true) );
  		Scanner strInput = new Scanner(System.in);
  		
  		String ID, name, age, addr;
  		
  		System.out.print("Enter the Employee ID: ");
  		ID = strInput.nextLine();
  		System.out.print("Enter the Employee Name: ");
  		name = strInput.nextLine();
  		System.out.print("Enter the Employee Age: ");
  		age = strInput.nextLine();
  		System.out.print("Enter the Employee Address: ");
  		addr = strInput.nextLine();    		
  		   		
  		bw.write(ID+","+name+","+age+","+addr);
  		bw.flush();
  		bw.newLine();
  		bw.close();		
  	
  }
}