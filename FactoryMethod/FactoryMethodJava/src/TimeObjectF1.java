import java.time.LocalDate;
import java.time.LocalTime;
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
public class TimeObjectF1 extends TimeObject {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void printTime() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println(LocalTime.now().format(formatter));
	}
}