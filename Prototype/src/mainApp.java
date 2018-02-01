import java.util.Scanner;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <p>DateTimeDisplayer displayer= new DateTimeDisplayer()</p><p>DateObject dateObjectF1= new DateObjectF1();</p><p>DateObject dateObjectF2= new DateObjectF2();</p><p >TimeObject F1= new DateObjectF1();</p><p >TimeObject dateObjectF2= new DateObjectF2();</p><p>displayer.setDatePrototype(dateObejctF1);</p><p>displayer.setTimePrototype(timeObjectF1); </p><p>loop</p><p>ask user to enter</p><p>"d" displayer.displayDate(factory) break;</p><p>"t" displayer.displayTime(factory) break;</p><p >"fd1" displayer.setDatePrototype(dateObjectF1); break;</p><p >"ft1" displayer.setTimePrototype(timeObjectF1) break;</p><p >"fd2" displayer.setDatePrototype(dateObjectF2); break;</p><p >"ft2" displayer.setTimePrototype(timeObjectF2) break;</p><p>"q" exit loop</p><p>end loop</p><p></p>
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
		System.out.println("Enter fd1 for date format, Date: MM/DD/YYYY");
		System.out.println("Enter fd2 for date format, Date: DD-MM-YYYY");
		System.out.println("Enter ft1 for time format, Time: HH:MM:SS");
		System.out.println("Enter ft2 for time format, Time: SS,MM,HH");
		System.out.println("Enter q to exit");
		Scanner sc=new Scanner(System.in);
		String choice = sc.next();
		DateTimeDisplayer dateTimeDislplayer= new DateTimeDisplayer();
		DateObjectF1 dateObjectF1= new DateObjectF1();
		DateObjectF2 dateObjectF2= new DateObjectF2();
		TimeObjectF1 timeObjectF1= new TimeObjectF1();
		TimeObjectF2 timeObjectF2= new TimeObjectF2();
		String prev="";
		while(choice!="q")
		{
			switch(choice){
			  
			case"t": if(prev.equals("ft2")){
				dateTimeDislplayer.setTimePrototype(timeObjectF2);
			 dateTimeDislplayer.displayTime();}
			else{
				dateTimeDislplayer.setTimePrototype(timeObjectF1);
				dateTimeDislplayer.displayTime();
			}
				break;
			case"d":if(prev.equals("fd2")) {
				dateTimeDislplayer.setDatePrototype(dateObjectF2);
				dateTimeDislplayer.displayDate();
			}
			else{
				dateTimeDislplayer.setDatePrototype(dateObjectF1);	
				dateTimeDislplayer.displayDate();
			}
				break;
			case"fd1":System.out.println("Format changed to default date ");
				break;
			case"fd2": System.out.println("Date Format changed");
				break;
			case"ft1":System.out.println("Format changed to default time ");
				break;
			case"ft2":System.out.println("Time Format changed");
				break;
			case"q": System.exit(0);
			break;
			default:System.out.println("Wrong Input");
			}
			
			System.out.println("Choose your option----->");
			System.out.println("Enter t to display the current time");
			System.out.println("Enter d to display current date");
			System.out.println("Enter fd1 for date format, Date: MM/DD/YYYY");
			System.out.println("Enter fd2 for date format, Date: DD-MM-YYYY");
			System.out.println("Enter ft1 for time format, Time: HH:MM:SS");
			System.out.println("Enter ft2 for time format, Time: SS,MM,HH");
			System.out.println("Enter q to exit");
			choice=sc.next();
			if(choice.equals("fd1"))
				prev="fd1";
			else if(choice.equals("fd2"))
				prev="fd2";
			else if(choice.equals("ft1"))
				prev="ft1";
			else if(choice.equals("ft2"))
				prev="ft2";
		}	
	}
}