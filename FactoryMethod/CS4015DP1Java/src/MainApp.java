import java.util.Scanner;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author gparmar1
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class MainApp {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String args[]) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
		
		System.out.println("Choose your  format style");
		System.out.println("Enter 1 for datetime format, Date: MM/DD/YYYY Time: HH:MM:SS");
		System.out.println("Enter 2 for datetime format, Date: DD-MM-YYYY Time: SS,MM,HH");
		System.out.println("Enter 3 to exit");
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		DateTimeDisplayer dateTimeDisp;
		while(choice!=3)
		{	
			
			switch(choice)
			{
				case 1:dateTimeDisp=new DateTimeDisplayerF1();
				dateTimeDisp.doWork();
					break;
					
				case 2:dateTimeDisp=new DateTimeDisplayerF2();
				dateTimeDisp.doWork();
					break;
					
				case 3: System.exit(0);	
		
			}
			System.out.println("Enter 1 for datetime format, Date: MM/DD/YYYY Time: HH:MM:SS");
			System.out.println("Enter 2 for datetime format, Date: DD-MM-YYYY Time: SS,MM,HH");
			System.out.println("Enter 3 to exit");
			choice=sc.nextInt();
		}
	}
}