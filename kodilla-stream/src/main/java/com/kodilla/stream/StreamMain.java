package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("This is my beautiful text!", poem ->
                ".:ABC:. " + poem + " .:ABC:.");
        poemBeautifier.beautify("This is my beautiful text!", poem ->
                poem.toUpperCase());
        poemBeautifier.beautify("This is my beautiful text!", poem ->
                poem.concat(" :)"));
        poemBeautifier.beautify("This is my beautiful text!", poem ->
                poem.replaceAll(" ", "-"));
        poemBeautifier.beautify("This is my beautiful text!", poem ->
                "*||* " + poem.toUpperCase().replace("BEAUTIFUL TEXT!", "BEST TEXT! :)") + " *||*" );

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}