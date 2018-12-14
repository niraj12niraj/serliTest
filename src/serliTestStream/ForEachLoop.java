package serliTestStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ForEachLoop {
	
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("ab");
		list.add("ac");
		list.add("ad");
		list.add("ae");
		list.add("af");
		//list.forEach(System.out::println);
		//list.forEach(s->System.out.append('s'));
		list.forEach(a->System.out.println(a));
		//Stream.Builder<String>builder=Stream.builder();
		//Stream<String>stream=builder.add("qwe").build();
		list.stream().forEach(a->ss(a));
		//stream.forEach(System.out::println);
		//list.forEach(System.out::println);
		//list.add("ww");
		//list.forEach(a->System.out.println(a));
		//list.add("wrd");
		//List<String>list1=null;
		//Map<String, String>map=null;
		
	}
	
	public static void ss(String s) {
		System.out.println(s);
	}

}
