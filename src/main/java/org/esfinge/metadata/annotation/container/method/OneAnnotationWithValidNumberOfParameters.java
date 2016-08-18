package org.esfinge.metadata.annotation.container.method;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.esfinge.metadata.annotation.validator.method.ValidNumberOfParameters;

@ValidNumberOfParameters(numberOfParameters = 2)
@Retention(RetentionPolicy.RUNTIME)
public @interface OneAnnotationWithValidNumberOfParameters {
}