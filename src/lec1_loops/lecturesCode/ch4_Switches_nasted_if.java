package lec1_loops.lecturesCode;

import java.util.Scanner;

public class ch4_Switches_nasted_if {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();;
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("shantanu pawar");
                break;
            case 2:
                System.out.println("scammer dada");
                break;

            case 3:
                System.out.println("empoyee no 3-");
                switch (department) {
                    case "mechanical":
                        System.out.println("mechanical department ");
                        break;
                    case "IT":
                        System.out.println("IT department ");
                        break;
                    case "elex":
                        System.out.println("elex department ");
                        break;
                    default:
                        System.out.println("no departmennt enter ");
                }
                break;
            default:System.out.println("enter correct EmpID");
        }


        }
    }

