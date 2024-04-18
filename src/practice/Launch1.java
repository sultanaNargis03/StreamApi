package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Launch1 
{
	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(4,6,7,2,1,8,3);
		
//		Consumer<Integer> con=new Consumer<>()
//		{
//			@Override
//			public void accept(Integer i) 
//			{
//				
//				System.out.println(i);
//			}
//	
//		};
//		
//		Predicate<Integer> pred=new Predicate<>()
//				{
//
//					@Override
//					public boolean test(Integer i) {
//						return i%2==0;
//					}
//					
//				};
//		Function<Integer,Integer> fun=new Function<>()
//				{
//
//					@Override
//					public Integer apply(Integer i) {
//						// TODO Auto-generated method stub
//						return i*2;
//					}
//			
//				};
//		BinaryOperator<Integer>	bo=new BinaryOperator<>()
//				{
//
//					@Override
//					public Integer apply(Integer c, Integer e) {
//						
//						return c+e;
//					}
//			
//				};
				
				int sum=list.stream()
							.filter(i->i%2==0)		  //returning a stream
							.map(i->i*2)			 //returning a stream
							.reduce(0,(c,e)->c+e);	//not returning a stream
						
				//s.forEach(i->System.out.println(i);
				System.out.println(sum);
		
	}
}
