// voting management system 
// add candiates
//caste vote
// display result
//declare winners

import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<candidate> candidates = new ArrayList<>();
      
        while (true) {
              System.out.println("Welcome to the Voting Management System");
              System.out.println("-------------------------------------------");
            System.out.println("1. Add Candidates");
            System.out.println("2. Cast Vote");
            System.out.println("3. Display Result");
            System.out.println("4. Declare Winners");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // add candidates here 
                    System.out.println("Enter candidate name: ");
                    String name = sc.next();
                    candidates.add(new candidate(name));
                    System.out.println("Candidate " + name + " added successfully");
                    break;
                case 2:
                    // cast vote
                    // display all the candidtes with their index number 
                    System.out.println("Candidates:");
                    for (int i = 0; i < candidates.size(); i++) {
                        System.out.println((i + 1) + ". " + candidates.get(i).getName());
                    }
                    System.out.print("Enter candidate number to vote: ");
                    int candidateNumber = sc.nextInt();
                    if (candidateNumber > 0 && candidateNumber <= candidates.size()) {
                        candidates.get(candidateNumber - 1).incrementVoteCount();
                        System.out.println("Vote casted for " + candidates.get(candidateNumber - 1).getName());
                        System.out.println("Thank you for voting!");
                        System.out.println("-----------------------------------");
                    } else {
                        System.out.println("Invalid candidate number");
                    }

                    break;
                case 3:

                    // display result 
                    System.out.println("Results:");
                    for (candidate c : candidates) {
                        System.out.println(c.getName() + ": " + c.getVoteCount() + " votes");
                    }
                    System.out.println("-----------------------------------");

                    break;
                case 4:
                    // declare winners here
                    int maxVotes = 0;
                    String winners = "";
                    for (candidate c : candidates) {
                        if (c.getVoteCount() > maxVotes) {
                            maxVotes = c.getVoteCount();
                            winners = c.getName();
                        }
                    }
                    System.out.println("Winner:" + winners + " with " + maxVotes + " votes");

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}