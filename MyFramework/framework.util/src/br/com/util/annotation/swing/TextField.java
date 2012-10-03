package br.com.util.annotation.swing;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import br.com.util.annotation.enums.FormatacaoType;
import br.com.util.annotation.enums.Restricoes;


@Target(value=ElementType.FIELD)
@Retention(value=RetentionPolicy.RUNTIME)
public @interface TextField {
	
	boolean obrigatorio()  default false;
	int tamanhoMinimo()  default 0;
	int tamanhoMaximo()  default 999999999;
	FormatacaoType formatar() default FormatacaoType.NULL;
	int valorInicial() default 0;
	String valor() default "";
	String regex() default "";
	Restricoes[] restricoes();
	
	
}
