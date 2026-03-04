nkpackage stream;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
@FunctionalInterface
interface Consumers{
	
	void accept(int i);
	
}

public class ForEach {
	public static void main(String[] args) {
		//Consumer<Integer> c=(n)->System.out.println(n);
		//Consumer<Integer> c=(n)->System.out.println(n);
		//l.forEach(System.out::println);
//		Consumers c2=i->{
//				System.out.println(i);
//				System.out.println("Consumers");
//				
//		
//		};
		

		List<Integer> l=Arrays.asList(1,4,3,2,5);
		Stream<Integer> s=l.stream();
		//s.filter(i->i%2==0).sorted().count();
		//List<Integer> l2=s.filter(i->i%2==0).sorted().collect(Collectors.to()	);
		Set<Integer> l2=s.filter(i->i%2==0).sorted().collect(Collectors.toSet()	);
		l2.forEach(System.out::println);
				
		
		
		
		
	}
}
