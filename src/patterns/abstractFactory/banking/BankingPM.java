package patterns.abstractFactory.banking;

import patterns.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manage banking project..");
    }
}
