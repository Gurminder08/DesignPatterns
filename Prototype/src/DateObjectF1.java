import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author gparmar1
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DateObjectF1 extends DateObject {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>return new DateObjectF1();</p>
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	Calendar cal= Calendar.getInstance();
	public DateObject cloneMe() {
		// begin-user-code
		// TODO Auto-generated method stub
		
		
		return new DateObjectF1();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void printDate() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
		/*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		System.out.println(LocalDate.now().format(formatter));*/
		System.out.println(month+"/"+day+"/"+year);
		
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DateObjectF1() {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
		//super();
		year=cal.get(Calendar.YEAR);
		month=cal.get(Calendar.MONTH);
		day=cal.get(Calendar.DAY_OF_MONTH);
	}
}