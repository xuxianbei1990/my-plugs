package college.myplugs.spring;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: xuxianbei
 * Date: 2022/11/7
 * Time: 10:40
 * Version:V1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MyMapperScannerRegistrar.class)
public @interface MyMapperScans {
}
