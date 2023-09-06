package com.third;

class invalidageexception extends Exception{

     invalidageexception(String message){

         super(message);

     }

}

public class letscreatecustomizedexception {

 

    

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        

        try {

            validvoterstatus(17);

        }catch(invalidageexception e) {

            System.out.println("exception message is "+ e.getMessage());

 

        }

        System.out.println("pcode will run smoothly afterwards");

 

 

    }

    static void validvoterstatus(int age) throws invalidageexception{

        if (age<18) {

            throw new invalidageexception("user camn not vote!");

        }

    }

 

}