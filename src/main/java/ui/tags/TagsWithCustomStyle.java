package ui.tags;

import com.tngtech.jgiven.annotation.IsTag;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IsTag(style = "background-color: darkgreen; color: white; font-weight: bold",
        description = "Tags can be arbitrarily styled with the 'style' attribute of the '@IsTag' annotation. " +
                "This tag shows how to apply such a custom style")
@Retention(RetentionPolicy.RUNTIME)
public @interface TagsWithCustomStyle {
}
