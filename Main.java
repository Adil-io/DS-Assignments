package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter No of LinkedList : ");
        int n=sc.nextInt();
        List[] arr=new List[n];

        System.out.println("Enter LinkedLists (press ENTER to seperate them!) :-");

        try{
            for(int i=0;i<n;i++){
                LinkedList<Integer> li = new LinkedList<>();

                while(true){
                    String str = sc.nextLine();
                    String[] el = str.split(" ");
                    if(str.endsWith("")){
                        if(!str.equals("")){
                            for(int j=0;j<el.length;j++){
                                li.add(Integer.parseInt(el[j]));
                            }
                            arr[i]=li;
                            break;
                        }
                    }
                }
            }
            LinkedList<Integer> list = new LinkedList<>();
            for(int i=0;i<n;i++){
                list.addAll(arr[i]);
            }
            Collections.sort(list);
            //System.out.println(list);
            System.out.println("Sorted Merged LinkedList :-");
            for(int i=0;i<list.size();i++){
                if(i==list.size()-1)
                    System.out.print(list.get(i));
                else
                    System.out.print(list.get(i)+"-->");
            }

        }catch (Exception e){
            System.out.println("INVALID INPUT JAVA ERROR : "+e);
        }
	// write your code here
    }
}
