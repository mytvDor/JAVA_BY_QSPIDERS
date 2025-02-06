class LoopEx {
   public static void main (String [] args){


System.out.println("1 TO 10");

for(int i=0 ;i<=10 ;i++ ){

System.out.println(i);

}

System.out.println();


System.out.println("UPPER CASE");


for(char i='A' ;i<='Z' ;i++ ){

System.out.println(i);

}

System.out.println();


System.out.println("LOWER CASE");

for(char i='z' ;i>='a' ;i-- ){

System.out.println(i);

}

System.out.println();

System.out.println("DIGIT");


for(char i='0' ;i<='9' ;i++ ){

System.out.println(i);

}

System.out.println();

System.out.println("ASCII");


for(int i=0 ;i<=127 ;i++ ){

System.out.println(i+" : "+(char)i);

}
}
}