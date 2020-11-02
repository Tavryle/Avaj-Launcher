package AvajLauncher;

import Method.reading;

import java.io.FileNotFoundException;

public class main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        reading read = new reading();
        if(args.length == 1){
          read.scan();
        }
    }
}