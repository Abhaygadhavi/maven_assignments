package com.phoenix.optional;

import java.util.Optional;
import java.util.function.Consumer;

import com.phoenix.models.Product;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<Integer> op=Optional.empty();
		if(op.isPresent())
			System.out.println(op.get());
		else
			System.out.println("no value");
		
		Optional<Integer> opi=Optional.of(100);
		if(opi.isPresent())
			System.out.println(opi.get());
		else
			System.out.println("no value");
		
		Consumer<Integer> c = n->System.out.println(n);
		opi.ifPresent(c);
		opi.ifPresent(n->System.out.println(n));
		
		Optional<String> ops=Optional.ofNullable("hello");
		System.out.println(ops.get());
		
		System.out.println(op.orElse(200));
		System.out.println(opi.orElse(200));
		
		System.out.println(op.orElseGet(()->300));
		System.out.println(op.orElseGet(()->300));

		System.out.println(op.orElseThrow(()->new ArithmeticException("No value")));
		
		Optional<Product> opp= Optional.of(new Product(1234, "Speaker", "Boat", 1000));
		if(opp.isPresent())
			System.out.println(opp.get());
		else
			System.out.println("no value");
		

	}

}