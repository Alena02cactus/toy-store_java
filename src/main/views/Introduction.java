package main.views;

import main.presenters.Views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Introduction{
    public String introHello() {
            Scanner scanner = new Scanner(System.in);
            String text = null;
            System.out.println("Привет! Как тебя зовут? (не оставляей этот вопрос без ответа, мы хотим подарить тебе подарок)");
            while(((text = scanner.nextLine()).isEmpty()||(text.equals(" ")))){
                System.out.println("Привет! Как тебя зовут? (не оставляей этот вопрос без ответа, это нужно чтобы подарить тебе игрушку)");
            }
            return text;
    }
}
