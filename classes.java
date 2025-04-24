

// public class classes {
//     // Box class
//     class Box {
//         double width;
//         double breadth;
//         double height;

        
//         Box(double width, double breadth, double height) {
//             this.width = width;
//             this.breadth = breadth;
//             this.height = height;
//         }

       
//         double doubleVolume() {
//             return width * breadth * height;
//         }
//     }

//     public static void main(String args[]) {
//         // Create an instance of the classes class
//         classes classes = new classes();

//         // Create an instance of Box class
//         classes.Box box = classes.new Box(3.0, 4.0, 5.0);

//         // Print the volume of the box
//         System.out.println(box.doubleVolume());
//     }
// }
    public class classes {
    
        // Inner class Box
        class Box {
            double width;
            double height;
            double depth;
    
            // Constructor to initialize the Box dimensions
            Box() {
                System.out.println("Constructor Box");
                width = 20;
                height = 10;
                depth = 40;
            }
    
            // Method to calculate and return the volume
            double doubleVolume() {
                return width * height * depth;
            }
        }
    
        public static void main(String[] args) {
            // Create an instance of the outer class
            classes classes = new classes();
    
            // Create an instance of the Box class
            classes.Box box = classes.new Box();
    
            // Print the volume of the box
            System.out.println(box.doubleVolume());
        }
    }
    