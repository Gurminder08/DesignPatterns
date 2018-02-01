import java.util.Scanner;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <p>DateTimeDisplayer displayer= new DateTimeDisplayer()</p><p></p><p>DateTimeFactory factory= new DateTimeFactoryF1()</p><p></p><p>loop</p><p></p><p>ask user to enter</p><p>"d" displayer.displayDate(factory) break;</p><p>"t" displayer.displayTime(factory) break;</p><p>"f1" factory= new DateTimeFactoryF1(); break</p><p>"f2"  factory= new DateTimeFactoryF2() break;</p><p>"q" exit loop</p><p>end loop</p><p></p>
 * <!-- end-UML-doc -->
 * @author gparmar1
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class mainApp {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String args[]) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
		System.out.println("Choose your option----->");
		System.out.println("Enter t to display the current time");
		System.out.println("Enter d to display current date");
		System.out.println("Enter f1 for datetime format, Date: MM/DD/YYYY Time: HH:MM:SS");
		System.out.println("Enter f2 for datetime format, Date: DD-MM-YYYY Time: SS,MM,HH");
		System.out.println("Enter q to exit");
		Scanner sc=new Scanner(System.in);
		String choice = sc.next();
		DateTimeFactory dateTimeFactory;
		DateTimeDisplayer dateTimeDisplayer= new DateTimeDisplayer();
		DateTimeFactory dateTimeFactoryF1= new DateTimeFactoryF1();
		DateTimeFactory dateTimeFactoryF2= new DateTimeFactoryF2(); 
		String prev="f1";
		while(choice!="q")
		{	
			
			switch(choice)
			{
				
				case "d":  if(prev.equals("f1"))
						dateTimeDisplayer.displayDate(dateTimeFactoryF1);
						else
						  dateTimeDisplayer.displayDate(dateTimeFactoryF2);
					       break;
					
				case "t":  if(prev.equals("f1"))
						dateTimeDisplayer.displayTime(dateTimeFactoryF1);
						else
						dateTimeDisplayer.displayTime(dateTimeFactoryF2);  
						   break;
						   
				case "f1": System.out.println("format changed successfully to f1");
					       break;
					
				case "f2": System.out.println("Format changed successfully f2");
					       break;
					
				case "z": System.exit(0);	
				
				default: System.out.println("Invalid Entry");
		
			}
			System.out.println("Enter t to display the current time");
			System.out.println("Enter d to display current date");
			System.out.println("Enter f1 for datetime format, Date: MM/DD/YYYY Time: HH:MM:SS");
			System.out.println("Enter f2 for datetime format, Date: DD-MM-YYYY Time: SS,MM,HH");
			System.out.println("Enter q to exit");
			choice=sc.next();
			
			if(choice.equals("f1"))
				prev="f1";
			else if(choice.equals("f2"))
				prev="f2";
		}
	}
}