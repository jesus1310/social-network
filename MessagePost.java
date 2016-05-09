import java.util.ArrayList;

/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;
    
    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        username = author;
        message = text;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }
    
    /**
     * Método para incrementar los likes
     */
    public void like(){
        likes++;
    }
    
    /**
     * Método para decrementar los likes
     */
    public void unlike(){
        likes--;
    }
    
    /**
     * Método para añadir un comentario
     */
    public void addComment(String text){
        comments.add(text);
    }
    
    /**
     * Método que devuelve el texto de un mensaje o comentario
     */
    public String getText(){
        return message;
    }
    
    /**
     * Método que devuelve el tiempo desde que se crea el mensaje
     */
    public long getTimeStamp(){
        return timestamp;
    }
    
    /**
     * Método que muestra todas las caracteristicas de las entradas
     */
    public void display(){
        System.out.println("\nAutor: " + username + "\nMensaje: " + message
                            + "\nEnviado hace " + timeString(System.currentTimeMillis()) +
                            "\nHa recibido " + likes + " me gusta");
        if(comments.size() > 0){
            for(int i = 0; i < comments.size(); i++)
            {
                System.out.println("\n" + comments.get(i));
            }
        }
        else{
            System.out.println("No hay comentarios");
        }
    }
    
    /**
     * Método que devuelve la cantidad de milisegundos trasncurridos entre
     * el momento en el que se crea el post y la medianoche del 1 de enero de 1970
     */
    private String timeString(long time){
        long diferencia = (time - timestamp);
        int seg = (int)(diferencia / 1000);
        int min = seg / 60;
        seg -= min * 60;
        return min + " minutos y " + seg + " segundos";
    }
}
