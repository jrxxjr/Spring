package br.com.tidicas.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.tidicas.bean.TesteBean;

/**
 * Classe principal para testar a aplicação Spring  
 *
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TesteBean teste1 = (TesteBean) context.getBean("testeBean");
		teste1.setDescricao("Teste Olá");
				
		TesteBean teste2 = (TesteBean) context.getBean("testeBean");
		System.out.println("imprime:" + teste2.getDescricao());
	}
}