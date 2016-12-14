package net.sf.esfinge.container.processor.clazz.ct01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import net.sf.esfinge.metadata.annotation.validator.SearchInsideAnnotations;
import net.sf.esfinge.metadata.annotation.validator.SearchOnEnclosingElements;

@Retention(RetentionPolicy.RUNTIME)
@SearchInsideAnnotations
@SearchOnEnclosingElements
public @interface ProcessorAnnotation {
	Class<? extends ProcessorInterface> value();
}
