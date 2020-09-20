package enumproject;
public class Year {
public static void main(String[] args) {
Month[]months=Month.values();
for(Month month:months)
{
System.out.print(month.getNum()+" ");
System.out.println(month.name());
}

}
}
