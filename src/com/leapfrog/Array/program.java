/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Array;

import java.util.Scanner;


public class program {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int[] a={12,8,45,89,54,69,2,65,17};
       while(true){
        System.out.println("Enter your choice");
        System.out.println("1.Search");
        System.out.println("2.Sort");
        System.out.println("3.Exit");
        int in=input.nextInt();
        switch(in){
            
            case 1:
                System.out.println("Enter the no. you want to serach");
                int b=input.nextInt();
                int index=-1;
                boolean found=false;
                for(int i=0;i<a.length;i++){
                   if(b==a[i]){
                        index=i;
                        found=true;
                      break;}}
                      if(found==true)
                            System.out.println("index no="+index);
                    else
                        System.out.println("number not found");//index is -ve
                     break;
              
            case 2:
                System.out.println("Enter 1 for ascending and 2 for descending");
                int c=input.nextInt();
                if(c==1){
                    for(int i=0;i<a.length;i++){
                        for(int j=i+1;j<a.length;j++){//j=1 hale mildaina
                           if(a[i]>a[j]){
                                int temp=a[i];//a[i] khali banako
                                a[i]=a[j];
                                a[j]=temp;}
                           }}}
                else
                     for(int i=0;i<a.length;i++){
                        for(int j=i+1;j<a.length;j++){
                            if(a[i]<a[j]){
                                int temp=a[i];
                                a[i]=a[j];
                                a[j]=temp;}
                        } }
                   System.out.println("Printing array");
                for(int i=0;i<a.length;i++){
                 System.out.println(a[i]);  }
                 break;
            
            case 3:
                System.exit(0);
                break;
          }}}}
       
    
    

