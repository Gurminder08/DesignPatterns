/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <p>DateTimeDisplayer displayer= new DateTimeDisplayer</p>
 * <!-- end-UML-doc -->
 * @author gparmar1
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DateTimeDisplayer {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>DateObject dateObject=dateTimeFactory.createDateObject()</p><p>dateObject.printDate()</p>
	 * <!-- end-UML-doc -->
	 * @param dateTimeFactory
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void displayDate(DateTimeFactory dateTimeFactory) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
		DateObject dateObject=dateTimeFactory.createDateObject();
		dateObject.printDate();
		
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param dateTimeFactory
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void displayTime(DateTimeFactory dateTimeFactory) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
		TimeObject timeObject=dateTimeFactory.createTimeObject();
		timeObject.printTime();
	}
}