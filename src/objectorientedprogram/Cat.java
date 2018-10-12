package objectorientedprogram;

public class Cat {
private int age;
private int sleephours;

public Cat(){
 age=16;
 sleephours=7;
}

public int birthday(){
	return age+1;
}
public int sleepMore(){
return sleephours +1;
}
public int sleepLess(){
return sleephours-1;
}
}
