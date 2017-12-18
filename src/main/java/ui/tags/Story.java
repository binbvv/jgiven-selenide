package ui.tags;

import com.tngtech.jgiven.annotation.IsTag;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IsTag( prependType = false )
@Retention( RetentionPolicy.RUNTIME )
public @interface Story {
    String value();
}
