package net.sf.esfinge.container.processor.Field;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ProcessorPerField;
import net.sf.esfinge.metadata.annotation.container.ProcessFields;
import net.sf.esfinge.metadata.annotation.container.ProcessorType;
import net.sf.esfinge.metadata.container.ContainerTarget;
@ContainerFor(value = ContainerTarget.TYPE)

public class ContainerMapField{
	
	//1-Procura anotações com ProcessorAnnotation dentro ok
	//2-Pega a classe do value ok
	//2.1-verifica se essa classe é do tipo que está na lista ok
	//3-Instancia a classe que está no value ok 
	//4-chama o método init no objeto criado
	//5-adiciona na lista
	
	@ProcessorPerField(configAnnotation = ProcessorAnnotation.class, type= ProcessorType.READER_IS_PROCESSOR)
	Map<Field,ProcessorInterface> map;

	public Map<Field, ProcessorInterface> getMap() {
		return map;
	}

	public void setMap(Map<Field, ProcessorInterface> map) {
		this.map = map;
	}
	
}
