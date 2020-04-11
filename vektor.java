import java.util.Enumeration;
import java.util.Vector;
public class vektor {
public static void main(String[] args) {
// TODO Auto-generated method stub
Vector<Object> vector = new Vector<Object>();
int primitiveType = 10;
Integer wrapperType = new Integer(20);
String str = "beny";
vector.add(primitiveType);
vector.add(wrapperType);
vector.add(str);
vector.add(2, new Integer(30));
System.out.println("elemen vektor :  "+ vector);
System.out.println("banyak vektor :  "+ vector.size());
System.out.println("elemen posisi kedua yang di hapus : "+ vector.elementAt(2));
System.out.println("elemen pertama vektor : "+ vector.firstElement());
System.out.println("elemen terakhir vektor: "+ vector.lastElement());
vector.removeElementAt(2);
Enumeration<Object> e=vector.elements();
System.out.println("elemen vektor: " + vector);
while(e.hasMoreElements()){
System.out.println("elemen vektor : " + e.nextElement());
}
}
}
