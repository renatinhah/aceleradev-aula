package br.com.aceleradev.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.com.aceleradev.domain.Pessoa;

public class MainPessoa {

	public static void main(String[] args) {
		HashMap<String, Pessoa> pessoasMap = new HashMap<>();
		Set<Pessoa> pessoasSet = new TreeSet<>();
		List<Pessoa> pessoas = new ArrayList<>();
		
		
		Pessoa pessoa1 = new Pessoa(1L, "Joao");
		Pessoa pessoa2 = new Pessoa(2L, "Pedor");
		Pessoa pessoa3 = new Pessoa(3L, "Henrique");
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		Pessoa pessoaProcurar = new Pessoa(1L, "Joao");
		
		System.out.println(pessoas.contains(pessoaProcurar));
		
		System.out.println(pessoa1.equals(pessoaProcurar));
		
		
//		Pessoa pessoaProcurar = new Pessoa(1L);
		
//		System.out.println(pessoas.contains(pessoaProcurar));
//		System.out.println(pessoa.equals(pessoa2));

	}

}
