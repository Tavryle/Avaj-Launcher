package AvajLuncher;

import Methods.Reading;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        if(args.length == 1){
            Reading.scan();
        }
    }
}
