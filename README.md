# WTM-System-using-Abstraction
Assignment: Water Tank Monitoring System (with Abstraction)

Abstract Class: WaterTank is an abstract base class that defines the capacity, current water level, and declares abstract methods for filling the tank, using water, and checking the tank’s status.

Subclass: HomeTank extends WaterTank to represent a small household tank with a 200-liter capacity, implementing the behavior for filling, using, and status checking.

Subclass: BuildingTank extends WaterTank to represent a large tank with a 1000-liter capacity, implementing the same methods with rules specific to its size.

User Interaction: The program uses JOptionPane to let the user choose a tank, perform actions like filling, using, or checking the status, and displays the updated water level after each operation.

Program Flow: The loop continues until the tank becomes completely full or empty, after which the program ends with a final status message.
<img width="1052" height="911" alt="tank 1" src="https://github.com/user-attachments/assets/30e4f730-9bd2-4f66-8c04-8ca884e37afd" />
<img width="1142" height="875" alt="tank 2" src="https://github.com/user-attachments/assets/91b65d98-6cf1-45cc-817c-39ea0d0177b4" />
<img width="1862" height="918" alt="tank 3" src="https://github.com/user-attachments/assets/9d9a4a8b-2970-4975-bdce-c596ce163942" />
<img width="1452" height="365" alt="tank 4" src="https://github.com/user-attachments/assets/849e38af-39d5-4ea5-afaf-aa2b52f30425" />

The program demonstrates the concept of abstraction in Java by modeling water tanks with a common abstract class and specialized subclasses. WaterTank defines shared properties and behaviors, while HomeTank and BuildingTank implement the actual logic for different capacities. User interaction is handled through JOptionPane, allowing users to select a tank, fill or use water, and check its status. The program ensures that water levels never exceed the tank’s capacity or drop below zero, and it ends once the tank is either full or empty.

RUNNING CODE --->
<p>
<img width="381" height="237" alt="frame 1" src="https://github.com/user-attachments/assets/68b4e1de-dd41-4842-b0b0-2e5a0dfea5c7" ><br>
<img width="382" height="278" alt="frame 2" src="https://github.com/user-attachments/assets/a993d6e2-7716-4bca-a33b-96ec7742339b" ><br>
<img width="358" height="198" alt="frame 3" src="https://github.com/user-attachments/assets/e71f281e-4749-4872-97b7-054f7a28b6c2" ><br>
<img width="430" height="182" alt="frame 4" src="https://github.com/user-attachments/assets/13b97e1b-7318-4919-8c32-bbce4c6e847f" ><br>
<img width="380" height="220" alt="frame 5" src="https://github.com/user-attachments/assets/bb725e35-eab9-446d-9f2e-4665bb916638" ><br>
<img width="452" height="167" alt="frame 6" src="https://github.com/user-attachments/assets/65f12976-50ee-40f3-b4ed-7b2675477a44" >
</p>
