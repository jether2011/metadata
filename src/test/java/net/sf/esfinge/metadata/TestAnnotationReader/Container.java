package net.sf.esfinge.metadata.TestAnnotationReader;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import net.sf.esfinge.metadata.annotation.container.AllFieldsWith;
import net.sf.esfinge.metadata.annotation.container.AllMethodsWith;
import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ProcessFields;
import net.sf.esfinge.metadata.annotation.container.ProcessMethods;
import net.sf.esfinge.metadata.container.ContainerTarget;


@ContainerFor(ContainerTarget.TYPE)
public class Container{
	
	@ProcessMethods
	private Map<Method,MethodContainer> methodContainerProcess;
	
	@ProcessFields
	private Map<Field,FieldContainer> fieldContainerProcess;
	
	@AllFieldsWith(FieldLista.class)
	private Map<Field,FieldContainer> allFieldsWithTest;

	@AllMethodsWith(Procesos.class)
	private Map<Method, MethodContainer> methodWithContainer;

	public Map<Field, FieldContainer> getFieldContainerProcess() {
		return fieldContainerProcess;
	}

	public void setFieldContainerProcess(Map<Field, FieldContainer> fieldContainerProcess) {
		this.fieldContainerProcess = fieldContainerProcess;
	}	
	

	public Map<Method, MethodContainer> getMethodWithContainer() {
		return methodWithContainer;
	}

	public void setMethodWithContainer(Map<Method, MethodContainer> methodWithContainer) {
		this.methodWithContainer = methodWithContainer;
	}

	public Map<Method, MethodContainer> getMethodContainerProcess() {
		return methodContainerProcess;
	}

	public void setMethodContainerProcess(Map<Method, MethodContainer> methodContainerProcess) {
		this.methodContainerProcess = methodContainerProcess;
	}

	public Map<Field, FieldContainer> getAllFieldsWithTest() {
		return allFieldsWithTest;
	}

	public void setAllFieldsWithTest(Map<Field, FieldContainer> allFieldsWithTest) {
		this.allFieldsWithTest = allFieldsWithTest;
	}
	
}
