package com.company;

public class Main {

    public static void main(String[] args) {
	Stack stack = new Stack(10);
	String s = "{{}}]]]]]]]]";
	boolean OK = true;
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            String stringBracket = String.valueOf(symbol);
            if (stringBracket.equals("(")||
                    stringBracket.equals("{")||
                    stringBracket.equals("[") ){
            stack.push(stringBracket);}
            else {
                if(!stack.isEmpty()){
                    String bracket = stack.pop();
                    if (!(bracket.equals("(") & stringBracket.equals(")") |
                            bracket.equals("{") & stringBracket.equals("}") |
                            bracket.equals("[") & stringBracket.equals("]")))
                    {
                        OK = false;
                    }
                }else{
                    OK = false;
                }
            }
            }
            if(OK){
                System.out.println("valid");
            }
            else{
                System.out.println("invalid");
            }
            //TODO проверка на заполненность
        }
    }


