import java.util.*;
class Rc4{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of S-Array:");
int nS=sc.nextInt();
System.out.println("enter the size of T-Array:");
int nT=sc.nextInt();
int[]S=new int[nS];
int[]T=new int[nT];
for(int i=0;i<nS;i++){
S[i]=i;
}
System.out.println("enter the key:");
for(int i=0;i<nT;i++){
T[i]=sc.nextInt();
}
System.out.println(" ");
System.out.println("S-Array");
for(int i=0;i<nS;i++){
System.out.print(S[i]+" ");
}
System.out.println(" ");
System.out.println("T-Array");
for(int i=0;i<nT;i++){
System.out.print(T[i]+" ");
}
System.out.println(" ");
int i=0,j=0;
for(i=0;i<nS;i++){
j=(j+S[i]+T[i%nT])%nS;
int temp=S[i];
S[i]=S[j];
S[j]=temp;
}
 i=0;j=0;
int index=0;
int[]key=new int[nS];
while(index<nS){
i=(i+1)%nS;;
j=(j+S[i])%nS;
int temp=S[i];
S[i]=S[j];
S[j]=temp;
int t=(S[i]+S[j])%nS;
int k=S[t];
key[index]=k;
index++;
}
String pt;
System.out.println("enter the plain text: ");
pt=sc.next();
System.out.print("cipher text: ");
for(i=0;i<pt.length();i++){
char ch=(char)(pt.charAt(i)^key[i]);
System.out.println(ch);
}
System.out.print(" ");
System.out.println(" enter the cipher text:");
String ct=sc.next();
System.out.print("plain text:");
for(i=0;i<ct.length();i++){
char ph=(char)(ct.charAt(i)^key[i]);
System.out.println(ph);
}
System.out.print(" ");
}
}