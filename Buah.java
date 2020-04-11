.//rizki-java.blogspot.com
//class baru dengan nama ArrFour
Public class ArrFour{
Public static void main(String[ ] args){
String[ ] [ ] entry  = {{“Florence”, “735-1234”, “Manila”},
	{“Joyce”, “983-3333”, “Quezon City”},
	{“BEcca”, “456-3322”, “Manila”}};
int i,j;

for (i=0; i<entry.length; i++) {
for (j=0; j<entry[i].length;) {
System.out.println (“Name  :”entry [ i ] [ j++] ) ;
System.out.println (“Telp# :”entry[ i ] [j++] ) ;
System.out.println (“Address :”entry[ i ] [j++]”+”\n”) ;
}
}
}
}
