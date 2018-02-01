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
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private DateObject datePrototype;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private TimeObject timePrototype;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	
	public void setDatePrototype(DateObject dateObject) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
		this.datePrototype=dateObject;
	
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param timeObject
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setTimePrototype(TimeObject timeObject) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
		this.timePrototype=timeObject;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>DateObject dateObject=datePrototype.cloneMe();</p><p>dateObject.printDate();</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void displayDate() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
		datePrototype =datePrototype.cloneMe();
		datePrototype.printDate();
		
	}
	public void displayTime()
	{
		timePrototype =timePrototype.cloneMe();
		timePrototype.printTime();

	}
}