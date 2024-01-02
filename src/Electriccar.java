import model.AC;
import model.Control;
import model.Engine;

public class Electriccar extends CarTeamplate{

       private Engine engine;
        private AC ac;
        private Control control;

        ElectricVehicle(Engine engine, AC ac, Control control) {
            this.engine = engine;
            this.ac = ac;
            this.control = control;
        }

        public ElectricVehicle () {


        }

        @Override
        void WheelType(String Wheel) {
            System.out.println("Wheel Type: " + Wheel);
        }

        @Override
        void Colour(String color) {
            System.out.println("Color: " + color);
        }


        void displayComponents() {
            System.out.println("Engine: " + engine);
            System.out.println("Ac: " +ac);
            System.out.println("control: "+ control);
        }
    }
}
