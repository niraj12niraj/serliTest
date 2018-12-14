package col.map.custom.key;

import java.util.HashMap;
import java.util.Map;

public class MyCustomKey {
	
	@SuppressWarnings("unlikely-arg-type")
	public static  void createRecords()
	{
		Map<X_Key, X_Value>map=new HashMap<>();
		X_Key x_key=new X_Key(11, "x11");
		X_Key x_key1=new X_Key(12, "x12");
		X_Key x_key3=new X_Key(13, "x13");
		X_Value x_value=new X_Value(23, "x23");
		map.put(x_key, new X_Value(21, "x21"));
		map.put(x_key1, new X_Value(22, "x22"));
		map.put(x_key3, x_value);
		System.out.println(map.keySet()+" "+map.values());
		
		
		
	}
	public static void main(String[] args) {
		createRecords();
	}
}

class X_Key{
	int id;
	String key;
	X_Key(int id,String msg){
		this.id=id;
		this.key=msg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String msg) {
		this.key = msg;
	}
	public String toString()
	{
		return "X_Key-id -"+id+", X_Key-Key -"+key;
	}
	
}

class X_Value{
	int id;
	String value;
	X_Value(int id,String value){
		this.id=id;
		this.value=value;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public String toString()
	{
		return "X_Value-id -"+id+", X_Value-Value -"+value;
	}
	
}
