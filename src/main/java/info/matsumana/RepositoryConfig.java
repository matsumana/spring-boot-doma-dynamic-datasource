package info.matsumana;

import org.seasar.doma.AnnotateWith;
import org.seasar.doma.Annotation;
import org.seasar.doma.AnnotationTarget;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

@AnnotateWith(annotations = {
        @Annotation(target = AnnotationTarget.CLASS, type = Repository.class),
        @Annotation(target = AnnotationTarget.CONSTRUCTOR, type = Inject.class)})
public @interface RepositoryConfig {
}
