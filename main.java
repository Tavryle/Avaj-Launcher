package AvajLuncher;

import Method.reading;

import java.io.FileNotFoundException;

public class main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        if(args.length == 1){
          reading.scan();
        }
    }
}