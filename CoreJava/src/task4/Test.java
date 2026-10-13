package task4;

import java.util.Set;
import java.util.TreeSet;

public class Test {
public Set<Bank> setDetails()
{
	Person per=new Person();
	per.setPname("ABC");
	per.setPaddr("Karvenagar");
	per.setPmob(12345);
	
	Account a=new Account();
	a.setAccno(54321);
	a.setAcctype("Savings");
	a.setP(per);
	
	Bank b=new Bank();
	b.setBname("SBI");
	b.setBranch("Kothrud");
	b.setAddr("XYZ Road");
	b.setAcc(a);
	
	Set<Bank>s=new TreeSet();
	s.add(b);
	
	return s;
}
public void getDeatails(Set<Bank> x)
{
	for(Bank b:x)
	{
		System.out.println(b.getBname());
		System.out.println(b.getAcc().getP().getPname());
	}
}
public static void main(String[] args) {
	Test t=new Test();
	Set<Bank> x =t.setDetails();
	t.getDeatails(x);
}
}
