package org.esfinge.metadata.validate.needsToHave;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.esfinge.metadata.annotation.NeedsToHave;

@NeedsToHave(Transaction01.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Logging01 {

}
