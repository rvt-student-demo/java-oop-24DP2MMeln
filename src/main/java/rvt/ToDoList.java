package rvt;

import java.util.*;
import java.util.regex.Pattern;

   
    public class ToDoList {

        private ArrayList<String> tasks;
        private final String filePath = "";


        public ToDoList() {
            this.tasks = new ArrayList<>();
        }

        private int getLastId() {
            return 0;
        }

        public void add(String task) {
            this.tasks.add(task);
        }

        public void print() {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }

        public void remove(int number) {
            if (number > 0 && number <= tasks.size()) {
                tasks.remove(number - 1);
            }

           
        }

        public boolean checkEventString(String value) {
            boolean match = Pattern.matches("^[A-Za-z0-\\p{Punct}]+$", value);
            return match;
        }

        private void loadFromFile() {

        }

        public static void main(String[] args) { 
          ToDoList list = new ToDoList(); 
          list.add("read book"); 
          list.print(); 
        }

        
        
    }

  

