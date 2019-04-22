package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;

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
    }
}