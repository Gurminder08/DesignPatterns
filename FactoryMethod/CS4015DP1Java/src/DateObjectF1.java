import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void printDate() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		System.out.println(LocalDate.now().format(formatter));
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
	}
}