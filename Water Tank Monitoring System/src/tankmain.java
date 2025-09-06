
import javax.swing.JOptionPane;

 // defining the class for watertank (work on capacity and water level)
abstract class WaterTank {
    int capacity;
    int currentLevel;

    public WaterTank(int capacity) {
        this.capacity = capacity;
        this.currentLevel = 0;
    }
 // declaration for abstract methods
    public abstract void fillTank(int liters);
    public abstract void useWater(int liters);
    public abstract String checkstat();
}

// HomeTank class -> capacity
class HomeTank extends WaterTank {
    public HomeTank() {
        super(200); // capacity line
    }
     // prevents overflowing
    public void fillTank(int liters) {
        if (currentLevel + liters > capacity) {
            liters = capacity - currentLevel;  
        }
        currentLevel+=liters;
        JOptionPane.showMessageDialog(null, liters + " liters added. Current level: " 
                                       + currentLevel + "  out of  " + capacity);
    }
    // preventive action against neg. value
    public void useWater(int liters) {
        if (currentLevel - liters < 0) {
            liters = currentLevel; 
        }
        currentLevel-=liters;
        JOptionPane.showMessageDialog(null, liters + " liters used. Current level: " 
                                       + currentLevel + "  out of  " + capacity);
    }

    
    public String checkstat() {
        if (currentLevel == 0) return "Tank is Empty!";
        else if (currentLevel == capacity) return "Tank is Full!";
        else return "Tank is In Use.";
    }
}

// BuildingTank subclass
class BuildingTank extends WaterTank {
    public BuildingTank() {
        super(1000); // Building tank capacity = 1000 liters
    }

 
    public void fillTank(int liters) {
        if (currentLevel + liters > capacity) {
            liters = capacity - currentLevel;
        }
        currentLevel+=liters;
        JOptionPane.showMessageDialog(null, liters + " liters added. Current level: " 
                                       + currentLevel + " out of " + capacity);
    }

    
    public void useWater(int liters) {
        if (currentLevel - liters < 0) {
            liters = currentLevel;
        }
        currentLevel-=liters;
        JOptionPane.showMessageDialog(null, liters + " liters used. Current level: " 
                                       + currentLevel + " out of " + capacity);
    }
    
    public String checkstat() {
        if (currentLevel == 0) return "Tank is Empty!";
        else if (currentLevel == capacity) return "Tank is Full!";
        else return "Tank is In Use.";
    }
}
 				
			// Main class  >>>>>>>>>>>

public class tankmain {
    public static void main(String[] args) {
        WaterTank tank = null;
        String choice = "";

        // Ask user to choose tank (repeats if nothing is entered)
        while (choice == null || choice.trim().isEmpty()) {
            choice = JOptionPane.showInputDialog(
                "Enter type of tank:\n1. HomeTank (200 liters)\n2. BuildingTank (1000 liters)"
            );
        }

        if (choice.equals("1")) {
            tank = new HomeTank();
        } else if (choice.equals("2")) {
            tank = new BuildingTank();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid choice. Program exiting.");
            System.exit(0);
        }

        
        while (true) {
            String action = "";

            
            while (action == null || action.trim().isEmpty()) {
                action = JOptionPane.showInputDialog(
                    "Choose action:\n1. Fill Tank\n2. Use Water\n3. Check status\n"
                );
            }
        

            switch (action) {
            
            // Fill
                case "1" -> { 
                    int fillLiters = Integer.parseInt(JOptionPane.showInputDialog("Enter liters to fill:"));
                    tank.fillTank(fillLiters);
                }
                
             // Use
                case "2" -> { 
                    int useLiters = Integer.parseInt(JOptionPane.showInputDialog("Enter liters to use:"));
                    tank.useWater(useLiters);
                }
                
             // Check stat
                case "3" -> { 
                    JOptionPane.showMessageDialog(null, tank.checkstat());
                }
                default ->
                    JOptionPane.showMessageDialog(null, "Invalid action.");
            }

            // End if empty or full
            String stat = tank.checkstat();
            if (stat.contains("Empty") || stat.contains("Full")) {
                JOptionPane.showMessageDialog(null, stat + " Program ended due to its condition.");
                break;
                
                /**  Extra syntax to loop back to the selection menu rather than just locking it after a selection of tank.
                 	while (true) { 
            WaterTank tank = null;

        
            String choice = JOptionPane.showInputDialog(
                    "Enter type of tank:\n(1) HomeTank (200 liters)\n(2) BuildingTank (1000 liters)\n(3) Exit Program"
            );

            if (choice == null || choice.equals("3")) {
                JOptionPane.showMessageDialog(null, "Exiting Program..");
                break; 
            }

            if (choice.equals("1")) {
                tank = new HomeTank();
            } else if (choice.equals("2")) {
                tank = new BuildingTank();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid option.");
                continue; 
            }

          
            while (true) {
                String action = JOptionPane.showInputDialog(
                        "Choose action:\n1. Fill Tank\n2. Use Water\n3. Check stat\n4. Back to Tank Selection"
                );

                if (action == null || action.equals("4")) break; // go back to tank selection

                switch (action) {
                    case "1": // Fill
                        int fillLiters = Integer.parseInt(JOptionPane.showInputDialog("Enter liters to fill:"));
                        tank.fillTank(fillLiters);
                        break;
                    case "2": // Use
                        int useLiters = Integer.parseInt(JOptionPane.showInputDialog("Enter liters to use:"));
                        tank.useWater(useLiters);
                        break;
                    case "3": // Check stat
                        JOptionPane.showMessageDialog(null, tank.checkstat());
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid action.");
                }

               
                String stat = tank.checkstat();
                if (stat.contains("Empty") || stat.contains("Full")) {
                    JOptionPane.showMessageDialog(null, stat + " Returning to tank selection...");
                    break; // line that allows to go back to menu
                }
            }
        }
                 * 
                 */
            }
        }
    }
}
