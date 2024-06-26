package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LaunchPredicate {

	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList();
		
		list.add(20);
		list.add(10);
		list.add(4);
		list.add(44);
		list.add(8);
		list.add(50);
		
		list.stream()
			.filter(i->i%5==0)
			.forEach(i->System.out.print(i+" "));
		System.out.println();
		Predicate<Integer> pred=new Predicate<>()
				{

					@Override
					public boolean test(Integer t) {
						if(t%5==0)
						{
							return true;
						}
						else
						return false;
					}
			
				};
			list.stream()
			.filter(pred)
			.forEach(i->System.out.print(i+" "));				

	}

}
