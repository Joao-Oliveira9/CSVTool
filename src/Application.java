public class Application {

    public static Menu menu;

    static void main(String[] args){
        for(String arg : args){
            System.out.println(arg);
        }
        menu.selectAction(args);
    }


}


//java -jar csvtool.jar inspect vendas.csv