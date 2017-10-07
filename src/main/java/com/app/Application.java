package com.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private PRepository pRepo;
	
	@Autowired
	private ERepository eRepo;
	
	@Autowired
	private CRepository cRepo;
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		P p1=new P(1, "test");
		E e=new E(1, "test");
		C c=new C(1, "test",p1);
		e.setC(c);
	
		pRepo.save(p1);
		cRepo.save(c);
		eRepo.save(e);
		
		List<P> records=pRepo.findAll();
		records.forEach(System.out::println);
		List<C> cRecords=records.stream().map(P::getClist).flatMap(List::stream).collect(Collectors.toList());
		
		cRecords.forEach(System.out::println);
		List<E> eRecords=cRecords.stream().map(C::getElist).flatMap(List::stream).collect(Collectors.toList());
		
		eRecords.forEach(System.out::println);
		
	}
}
