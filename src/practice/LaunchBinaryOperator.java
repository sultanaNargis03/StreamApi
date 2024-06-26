package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class LaunchBinaryOperator {

	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList();
		
		list.add(20);
		list.add(10);
		list.add(4);
		list.add(44);
		list.add(8);
		list.add(50);
		
		int sum=list.stream()
			.reduce(0,(c,e)->c+e);
			
		System.out.println(sum);
		
		BinaryOperator<Integer> bo= new BinaryOperator<>()
				{

					@Override
					public Integer apply(Integer t, Integer u) {
						
						return t+u;
					}
			
			
				};
		
			int s=list.stream()
			.reduce(bo)
			.orElse(0);
			System.out.print(s);				

	}

}
