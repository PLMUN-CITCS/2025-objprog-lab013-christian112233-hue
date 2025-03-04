public class ParametersAndArguments {
    
    // Method to calculate the area of a rectangle
    public static int calculateArea(int width, int height) {
        int area = width * height;
        return area;
    }

    public static void main(String[] args) {
        // Declare width and height of the room
        int roomWidth = 10;
        int roomHeight = 15;

        // Calculate the area using the calculateArea method
        int area = calculateArea(roomWidth, roomHeight);

        // Print the calculated area
        System.out.println("The calculated area is: " + area);
    }
}
