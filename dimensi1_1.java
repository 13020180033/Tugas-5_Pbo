import javax.swing.*;
public class dimensi1_1 {
public static void main(String[] args) {
String ulang=JOptionPane.showInputDialog("Jumlah elemen : ");
int jml =Integer.parseInt(ulang);
int [] angka=new int[jml];
for (int i=0; i<jml; i++)
{
String input=JOptionPane.showInputDialog("Masukkan nama : ");
System.out.println("Nama anda : "+input);}
System.exit(0); 
}
}

