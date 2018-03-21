/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.util.Scanner;
 

/**
 *
 * @author akeen.bese15seecs
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [][] data=new String[6][3];
       Scanner u=new Scanner(System.in);
       for(int i=0;i<6;i++){
          
           System.out.println("Enter name of student");
           String n = u.next(); 
           data[i][0]=n;
          
           
           boolean p=false;
         
          String n1;
          do{
          System.out.println("Enter CMS ID of student");
            n1 = u.next();
           for (int k=0;k<i;k++){
           if(Integer.parseInt(data[k][1])==Integer.parseInt(n1)){
            p=true;
           }
           else{p=false;}
           }
          }while(p);
            data[i][1]=n1;
           
           
            
                 
       
           System.out.println("Enter GPA of student");
           String n2 = u.next(); 
           while(Float.parseFloat(n2)>4.0 || Float.parseFloat(n2)<0.0){
           data[i][2]=n2;
           System.out.println("Enter GPA of student");
           n2 = u.next();
           }
           data[i][2]=n2;
           
         
       }
       
       
        
       
       float sum=0.0f;
       float min=4.0f;
       float max=0.0f;
       for(int i=0;i<6;i++){
       for (int j=2;j<3;j++){
       sum+=Float.parseFloat(data[i][j]);
       if(Float.parseFloat(data[i][j])<min){
          min=Float.parseFloat(data[i][j]);
       }
       if(Float.parseFloat(data[i][j])>max){
          max=Float.parseFloat(data[i][j]);
       }
       }
    }
       sum=sum/6;
      System.out.println(sum);
      System.out.println(min);
      System.out.println(max);
      for(int i=0;i<6;i++){
       for (int j=2;j<3;j++){
       if(Float.parseFloat(data[i][j])<sum){
          System.out.println(data[i][0]);
       }
       
    }
    }
      String name=u.next();
      int rank=1;
      float o=0.0f;
      for(int i=0;i<6;i++){
       for (int j=0;j<2;j++){
       if(data[i][j].equals(name)){
          System.out.println(data[i][2]);
          for(int l=0;l<3;l++){
          o=Float.parseFloat(data[l][2]);
          if(Float.parseFloat(data[i][2])<o){
             rank++;
          }
          

          }
       }
       
    }
    }
      System.out.println(rank);
      u.close();
      
    }
    
    }

