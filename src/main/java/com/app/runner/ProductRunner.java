package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		//Note:
/** Here Pageable is interface so use its implementation class "PageRequest" for object creation ..**/
	
		Page<Product> page=repo.findByProdCost(5.5, PageRequest.of(2, 3));
		System.out.println(page.isEmpty());
		System.out.println(page.isFirst());
		System.out.println(page.hasNext());
		System.out.println(page.getSize());
		System.out.println(page.getTotalPages());
		System.out.println(page.isLast());
		System.out.println(page.hasPrevious());
		System.out.println(page.getNumber());
		
		page
		.stream()
		.filter(p->p.getProdCode()!= null)
		.sorted((p1,p2)->p2.getProdId()-p1.getProdId())
		.map(p->p.getProdId()+"="+p.getProdCode()+"="+p.getProdCost())
		.forEach(System.out::println);
	}

}
