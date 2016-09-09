package net.sf.esfinge.containerProcessosrsTest;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationReader;


public class ContainerProcessorsTest {

	@Test
	public void test() throws Exception {
		Container container = new Container();
		AnnotationReader a1 = new AnnotationReader();
		container = a1.readingAnnotationsTo(Dominio.class, container.getClass());
		
		for ( ProcessorInterface iterable_element : container.getList()) {
			assertTrue(iterable_element.getClass().equals(DominioSegundo.class));
		}
		assertNotNull(container.getList().size());
		
		//assert();			
	}

}
