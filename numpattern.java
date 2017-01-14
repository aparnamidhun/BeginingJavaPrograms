class pattern
{
public void display()
{
int i,j,k;
k=0;
{
for(i=1; i<=5; i++)
{
System.out.println("\n");
}

for(j=1; j<=i; j++)
{
System.out.println("" +(++k));
}
}
public static void main(String[] args)
{
pattern p=new pattern();
p.dispaly();
}
}


