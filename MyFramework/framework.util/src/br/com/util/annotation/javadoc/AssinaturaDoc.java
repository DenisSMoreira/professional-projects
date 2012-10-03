package br.com.util.annotation.javadoc;

import java.lang.annotation.Documented;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Inherited
@Documented
@Target(value=ElementType.TYPE)
@Retention(value=RetentionPolicy.CLASS)
public @interface AssinaturaDoc {
	
	String criadorClasse () default "Denis Soares Moreira";
	String desenvolvedores () default "Denis Soares Moreira";
    String dataCriacao();
    String dataModificacao();
	String empresaContratante () default "Luxfacta";
	String software() default "Project";
    float versao () default 1.0f;
    
}
