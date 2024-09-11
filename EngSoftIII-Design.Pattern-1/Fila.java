public class Fila {

    private static Fila instance;

    private Fila(){
    }

    private static void ImprimeDocumento(){
    }

    private static void RemoveDocumento(){
    }
    
    private static void RemoveTodosDocumentos(){
    }

    public static Fila getInstance() {
        if(instance == null){
            instance = new Fila();
        }
        return instance;
    }
}