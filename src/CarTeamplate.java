import model.AC;
import model.Control;
import model.Engine;

public class CarTeamplate {
    public abstract class CarTemplate {
        public abstract void weight();
        public abstract void colout();

        public Engine getEngine(){
            return new Engine(550,20);
        }
        public AC getAc(){
            return new AC(3,"samsung");
        }
        public Control getControl(){
            return new Control(6,2);
        }
        public CarTemplate getCarTeamplate(Engine engine, AC ac, Control control){
            return getCarTeamplate(getEngine(),getAc(),getControl());

        }


    }
}
