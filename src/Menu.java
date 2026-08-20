public class Menu {

    public static Inspector inspector;


    public Menu(){

    }

    public static void selectAction(String[] args){
        try{
            String command = args[0];
            String path = args[1];

            switch(command){
                case "inspect":
                    inspector.generateResumeCsv(path);
            }

        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Falta de argumentos nos parametros");
        }

    }
}
