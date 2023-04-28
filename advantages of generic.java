//advantages of generic

-> provide type safety
Integer arr[]=new Integer[10];
arr[0]=1;
arr[1]=4;
arr[3]="HELLO";  //GIVING ERROR

ArrayList list=new ArrayList();
list.add(10);
list.add("abh");
list.add(5.5);

ArrayList<Integer> list=new ArrayList<Integer>();
list.add(10);
list.add("abh");  //error
list.add(5.5);