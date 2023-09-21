package edu.escuelaing.arep;

/**
 * @author Brayan Camilo Castiblanco
 * @version 1.0 9/20/2023
 * @project EciSpringboot
 * Main class that start our EciSpringBoot
 */
public class RunMyServer {

    /**
     * Main method that starts our framework
     * @param args
     */
    public static void main(String[] args) {
        ECISpringBoot.getInstance().startServer();
    }
}
